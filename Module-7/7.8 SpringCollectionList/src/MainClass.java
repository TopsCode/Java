import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Bean.CustomerBean;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext a = new ClassPathXmlApplicationContext("Bean.xml");
		CustomerBean c = (CustomerBean) a.getBean("customer");
		System.out.println(c);
	}
}
