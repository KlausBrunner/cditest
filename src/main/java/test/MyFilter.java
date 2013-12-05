package test;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(servletNames = {"other"})
public class MyFilter implements Filter {
    @Inject
    private MessagesBean bean;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        bean.addMessage("filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        bean.addMessage("doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
    }
}
