package test;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {

    @Inject
    private MessagesBean bean;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        bean.addMessage("context initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        bean.addMessage("context destroyed");
    }
}
