package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 10;
		int carType = 1;
		//고속버스 : 1, 경차 : 2, 그 외 : 3
		int fee = 0;
		
		switch(carType) {
		case 1:
			if(distance%10 != 0)
				fee = 850 + 300 * (distance/10);
			else
				fee = 850 + 300 * (distance/10-1);
			break;
		case 2:
			if(distance%10 != 0)
				fee = 300 + 200 * (distance/10);
			else
				fee = 300 + 200 * (distance/10-1);
			break;
		case 3:
			if(distance%10 != 0)
				fee = 600 + 200 * (distance/10);
			else
				fee = 600 + 200 * (distance/10-1);
			break;
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.print("차종 : ");
		switch(carType) {
		case 1:
			System.out.println("고속버스");
			break;
		case 2:
			System.out.println("경차");
			break;
		case 3:
			System.out.println("그 외");
			break;
		}
		
		System.out.println("통행료 : " + fee + "원");

	}

}
