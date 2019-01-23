package ver1;

import vo.Idol;

public class App {
	public static void main(String[] args) {
		Idol idol = new Idol(1, 26, "송민호");
		Idol idol2 = new Idol();
		
		idol2.setNo(2);
		idol2.setAge(28);
		idol2.setName("김진Woo");
		
		System.out.println(idol.getNo()+idol.getName()+idol.getAge());
		System.out.println(idol2.getNo()+idol2.getName()+idol2.getAge());

	}
}
