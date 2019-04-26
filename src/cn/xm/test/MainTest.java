package cn.xm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.xm.model.Product;
import cn.xm.service.ProductService;

public class MainTest {

	public static void main(String[] args) {
		/*
		 * 1: 思考new对象的三大缺点? Spring Bean对象何时创建 ?
		 * 
		 * 2: SqlSessionFactoryBean源码分析
		 * 
		 * 3: MyBatis配置文件加载流程与包扫描源码分析
		 * 
		 * 4: 测试Spring面向接口编程
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
		ProductService ps = context.getBean("productService", ProductService.class);
		Product product = new Product("vivo手机2", 2999.00, "这里是vivo手机的详细介绍");
		ps.save(product);
	}
}
