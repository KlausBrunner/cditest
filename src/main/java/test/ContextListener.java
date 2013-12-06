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
        if(bean != null) {
            bean.addMessage("context initialized");
        } else {
            System.out.println("ugh! injection into " + this.getClass().getName() + " failed!");
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        if(bean != null) {
            bean.addMessage("context destroyed");
        } else {
            System.out.println("ugh! injection into " + this.getClass().getName() + " failed!");
        }
    }
}
