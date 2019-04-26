package cn.xml.other;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import cn.xm.model.Product;
import cn.xm.service.ProductService;
import cn.xm.service.impl.ProductServiceImpl;

class PsInvocationHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("代理类为:" + proxy.getClass());
		System.out.println("调用方法名称为:" + method.getName());
		System.out.println("调用方法参数为:" + Arrays.toString(args));
		return null;
	}

}

public class JDKProxyDemo {

	public static void main(String[] args) {
		ClassLoader classLoader = ProductServiceImpl.class.getClassLoader();
		ProductService proxy1 = (ProductService) Proxy.newProxyInstance(classLoader,
				ProductServiceImpl.class.getInterfaces(), new PsInvocationHandler());
		proxy1.save(new Product());
	}
}
