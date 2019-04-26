package cn.xm.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class InitDataContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {

	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("InitDataContextListener contextInitialized..................");
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(event.getServletContext());
		System.out.println(context.getBean("productService"));
	}

}
