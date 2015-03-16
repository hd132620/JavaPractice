package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "아이유";
		boolean ismale = false;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		//출력부
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : " + name);
		System.out.print("성별 : ");
		
		if(ismale)
			System.out.println("남자");
		else
			System.out.println("여자");
		
		System.out.println("나이 : "+ age + "세");
		System.out.println("키 : " + height + " cm");
		System.out.println("몸무게 : " + weight + " kg");
		System.out.println("혈액형 : " + bloodType + " 형");
	}

}
