package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		int salary = 1700000;
		int empNum = 3;
		int placeNum = 1500;
		long result;
		
		System.out.println("<< 디미베네 연간 인건비 >> ");
		System.out.println("월 평균 급여 : " + String.format("%,d", salary));
		System.out.println("점포 내 직원 수 : " + String.format("%,d", empNum));
		System.out.println("점포 수 : " + String.format("%,d", placeNum));
		
		result = (long)salary * 12 * empNum * placeNum;
		
		System.out.println("\n\n연간 인건비 : " + String.format("%,d원", result));
		
	}

}
