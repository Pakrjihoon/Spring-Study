package app;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.IdolsService;
import vo.Idol;

public class MyBatisEx6 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		IdolsService service = (IdolsService)context.getBean("idolsService");
		
		Scanner scan = new Scanner(System.in);
		Idol idol = new Idol();
		
		System.out.println("이름은 ? ");
		String name = scan.next();
		System.out.println("키는 ?");
		String heightStr = scan.next();
		double height = Double.parseDouble(heightStr);
		System.out.println("몸무게는 ?");
		String weightStr = scan.next();
		double weight = Double.parseDouble(weightStr);
		System.out.println("생년월일은 ? ex) 입력형식 : '1992-02-23'");
		String birthDateStr = scan.next();
		Date birthDate = Date.valueOf(birthDateStr);
		
		System.out.println("소속사 이름은 ?");
		String agentName = scan.next();
		System.out.println("성별은 ? ex)M(남),W(여)");
		String gender=scan.next();
		System.out.println("그룹 번호는? ");
		String groupIdStr=scan.next();
		int groupId = Integer.parseInt(groupIdStr);
		
		idol.setName(name);
		idol.setHeight(height);		
		idol.setWeight(weight);
		idol.setGender(gender);
		idol.setAgentName(agentName);
		idol.setBirthDate(birthDate);
		idol.setGroupId(groupId);
		int result = service.add(idol);
		
		System.out.println(result+" 개 완료");
	}

}
