package career2;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eq.service.UserService;

public class Test2 {
	private static UserService userService;
	@BeforeClass
	public static void init() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		userService = (UserService) context.getBean("userService");
	}
	@Test
	public void testUnit() {
		userService.add();
	}
	
	
}
