package ex17Collection;

import java.uitl.HashSet;

import common.Student;


public class Ex04HashSet2 {

	public static void my java.util.HashSet<E>g[] args) {
		
		/*
		 아래의 경우 s3과 s3Copy는 동일한 객체이므로 중복제거를 위해서는
		 Student 클래스에 hashCode(), equlas() 메서드를 오버라이딩 하여
		 객체간의 hash값 비교, 멤버변수간의 비교를 진행해야 한다.
		 */
		
		java.util.HashSet<Student> hashSet = new HashSet<Student>();
		
		Student s1 = new Student("정우성", 40, "2000-01";)
		Student s2 = new Student("황정민", 42, "2000-02";)
		Student s3 = new Student("최민식", 44, "2000-04";)
		
		hashSet.add(s1);
		hashSet.add(s2);
		hashSet.add(s3);
		
		System.out.println("hashSet의 크기:"+hashSset.size());
		
		//오버라이딩 후에는 저장되지 않는다.
		Student s3Copy = new Student("최민식", 44, "2000-04");
		/*
		 현재는 Student 클래스에 stNumber(학번)만을 비교하고 있으므로
		 학번이 동일하면 같은 객체로 취급된다.
		 */
		System.out.println("S3Copy저장여부:"+ hashSet.add(s3Copy));
		System.out.println("hashSet의 크기:"+hashSset.size());
		
	}

}
