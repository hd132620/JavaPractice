package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 10;
		int carType = 1;
		//고속버스 : 1, 경차 : 2, 그 외 : 3
		int fee = 0;
		
		switch(carType) {
		case 1:
			if(distance <=10)
				fee = 850;
			else if(distance <=20)
				fee = 1150;
			else if(distance <= 30)
				fee = 1450;
			break;
		case 2:
			if(distance <=10)
				fee = 300;
			else if(distance <=20)
				fee = 500;
			else if(distance <= 30)
				fee = 700;
			break;
		case 3:
			if(distance <=10)
				fee = 600;
			else if(distance <=20)
				fee = 800;
			else if(distance <= 30)
				fee = 1000;
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
