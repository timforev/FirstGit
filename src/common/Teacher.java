package common;

public class Teacher extends Person
{
	private String subject

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
@Override
public String getInfo() {
	// TODO Auto-generated method stub
	return String.format("%s, 과목:%s",super.get info(), subject);
}
@Override
public void showInfo() {
	
	System.out.println(getInfo());
}

}
