package vo;

public class Idol {
	private int no, age;
	private String name;
	
	public Idol() {
		
	}
	public Idol(int no, int age, String name) {
		this.no = no;
		this.age = age;
		this.name = name;
	}
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
