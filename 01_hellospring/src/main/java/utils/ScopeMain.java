package utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.CarConfig;
import model.ProtoTypeBean;
import model.SingletonBean;

public class ScopeMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CarConfig.class);
		
		String[] beans = ctx.getBeanDefinitionNames();
		for (String name : beans) {
			System.out.println(name);
		}
		
		SingletonBean bean1 = (SingletonBean)ctx.getBean("singletonBean");
		System.out.println(bean1);
		
		SingletonBean bean1 = (SingletonBean)ctx.getBean("singletonBean");
		System.out.println(bean2);
			
		SingletonBean bean1 = (SingletonBean)ctx.getBean("singletonBean");
		System.out.println(pBean1);
			
		SingletonBean bean1 = (SingletonBean)ctx.getBean("singletonBean");
		System.out.println(pBean2);
		
	}

}
