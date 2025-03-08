import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import model.LifeCycleBean;

public class LifeCycleMain {

	public static void main(String[] args) {
<<<<<<< HEAD
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(LifeCycleBean.class);
=======
		ApplicationContext ctx = new AnnotationConfigApplicationContext(LifeCycleBean.class);
>>>>>>> 557507d453c157cbc19f54c8dc38aab2f7b64b8c
		
		String[] beans = ctx.getBeanDefinitionNames();
		for (String name : beans) {
			System.out.println(name);
		}
<<<<<<< HEAD

		System.out.println("容器要被關了~~~");
		ctx.close();
=======
>>>>>>> 557507d453c157cbc19f54c8dc38aab2f7b64b8c
	}

}
