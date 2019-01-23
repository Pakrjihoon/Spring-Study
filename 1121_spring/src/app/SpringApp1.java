package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vo.Idol;


public class SpringApp1 {

	public static void main(String[] args) {
		/*
		 * 스프링 프레임워크는 한 마디로 얘기하면
		 * 빈팩토리 입니다.
		 * 
		 * - 빈이란? : 자바의 객체(웹에서)
		 * - 빈에서는 멤버필드를 프로퍼티라고 함
		 * 
		 */
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("config/applicationContext.xml");
		Idol idol1 = (Idol)factory.getBean("idol3");
		System.out.println(idol1.getAge());
		
	} //main() end

} // SpringApp1 end
