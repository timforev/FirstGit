package common;






public class Person {

	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//gerrer/setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//멤버메서드
	public String getInfo() {
		//해당 객체의 정보를 문자열로 반환
		return String.format("이름:%s, 나이:%d", name, age);
		
	}
		public void showInfo() {
			//문자열로 반환된 정보를 출력
			System.out.println(getInfo());
	}
	
}
