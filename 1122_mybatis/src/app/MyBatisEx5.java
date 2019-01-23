package app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.IdolsService;
import vo.Idol;

public class MyBatisEx5 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		IdolsService service = (IdolsService)context.getBean("idolsService");
		
		List<Idol> list = service.list();
		for(Idol idol : list) {
			System.out.println(idol.getName());
		}
	}

}
