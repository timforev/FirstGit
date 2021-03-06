package ex13interface;
/*
 추상 클래스를 인터페이스로 변경하기
 abstract class => interface
 메서드인 경우 public abstract 제거
 멤버변수인 경우 public static final 제거
 */


/*
 추상클래스
 -상속을 목적으로 제작되므로 객체생성을 허용하지 않는다.
 -추상클래스는 대부분 추상메서드를 포함하고 있으므로, 이를
 상속받는 클래스는 반드시 추상메서드를 오버라이딩 해야 한다.
 -클래스의 상속관계에서 일종의 설계도 역할을 한다.
 -객체생성은 할 수 없으나 그외 참조변수, 상속 등의 모든 기능을
 할 수 있다.
 
 추상메서드
 -오버라이딩의 목적으로 제작된다.
 -메서드의 실행부가 없기 때문에 중괄호 {} 대신에 ;을 붙여준다.
 */

//프로젝트 전체에서 기준의 역할을 하는 추상클래스
abstract class class PersonlNumberStorageAbs {
	public abstract void addPersonalInfo(String juminNum, String name);
	public abstract String searchPersonalInfo(String juminNum);
}

/*
 DTO(Data Transfer Object) : 데이터를 저장하고 전송하기 위한 용도의
 객체를 말한다. VO(Value object)로 표현하기도 한다.
 해당 프로그램에서는 한 사람의 정보를 저장하기 위한 용도로 정의한다.
 */
class PersonalInfoDTO {
	//멤버변수
	private String name;
	private String juminNum;
	//생성자
	public PersonalInfoVO(String Name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
		
	}
	//getter메소드
	String getName() { return name; }
	String getJuminNum() { return juminNum; }
}
/*
 클래스가 클래스를 상속할 때 => extends
 클래스가 인터페이스를 상속할 때 => implements
 드물지만 인터페이스가 인터페이스를 상속할 때 => extends
 
 extends는 상속, implements는 구현이라 표현한다.
 */


class PersonalNumberStorageImpl implements PersonalNumberStorageAbs {

	PersonalInfoDTO[] personalArr; //정보저장용 객체배열
	int numOfPerInfo; //입력정보 카운트용 변수
	//생성자
	
	public PersonalNumberStorageimpl(int arrSize) {
		personalArr = new PersonalInfoDTO[arrSize];
		numOfPerInfo = 0;
	}
	/*
	 getter/setter메서드 : DTO객체에서 private으로 선언된 멤버변수의
	 값을 설정하거나 반환할 때 호출하는 메서드.
	 */
	
	/*
	 상속을 통해 추상메서드를 포함하게 되었으므로 반드시 아래와 같이
	 오버라이딩 해야 한다. 필수사항이며 하지 않을 경우 에러가 발생한다.
	 */
	
	@Override
	public void addPersonalInfo (String juminNum, String name) {
		personalArr[numOfPerInfo] =
				new PersonalInfoDTO(name, juminNum);
		numOfPerInfo++;

	}
	
	//주민번호를 인자로 객체배열을 검색한 후 정보를 반환한다.
	@Override
	public String searchPersonalInfo(String juminNum) {
		for(int i=0 ; i<numOfPerInfo ; i++) {
			/*
			 멤버변수를 private으로 선언했으므로 외부에서는 접근할 수 없다.
			 이럴 때 getter 메서드를 통해 접근하여 값을 얻어올 수 있다.
			 */
			if(juminNum.compareTo(personalArr[i].getJuminNum())==0);
			{
				//getter를 통해 이름을 반환한다.
				return personalArr[i].getName();
			}
	
		}
		return null;//검색결과가 없는 경우 null 반환
	}
}



public class E02AbstractToInterface1 {

		
	public static void main(String[] args) {
		//10명의 정보를 저장할 수 있는 객체배열 생성
		PersonalNumberStorageExt storage =
				new PersonalNumberStorageExr(10);
		
		//정보 추가
		storage.numOfPerInfo.addPersonalInfo("901234-2222222", "김태희");
		storage.numOfPerInfo.addPersonalInfo("901234-1111111", "정지훈");
		
		//정보 검색
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
		
		
		
		
		
		
		
		
	}

}
