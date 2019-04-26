package cn.xm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.xm.model.Product;
import cn.xm.service.ProductService;

@Controller // 没必须取名称,http是通过请求的路径来访问
@RequestMapping("/product")
public class ProductController {

	// 此处MVC支持自动注入内置对象：
	@Resource
	private HttpServletRequest request;

	@Resource // 没有指定name,则会先按属性名注入
	private ProductService productService;

	@RequestMapping("/save")
	public String save(Product product) {
		// 调用业务逻辑
		productService.save(product);
		System.out.println("插入成功...............");
		return "redirect:/index.jsp";
	}
}
