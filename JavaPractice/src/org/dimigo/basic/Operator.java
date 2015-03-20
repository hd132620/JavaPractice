package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int upLength = 9;
		int downLength = 10;
		double sHeight = 5.8;
		
		int length = 9;
		double height = 5.4;
		
		double sS = (upLength + downLength) * sHeight * 0.5;
		double pS = length * height;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + sS);
		System.out.println("평행사변형 넓이 : " + pS + "\n\n");
		
		if(sS > pS)
			System.out.println("사다리꼴이 평행사변형 보다 " + (sS - pS) + " 더 큽니다.");
		else if(pS > sS)
			System.out.println("평행사변형이 사다리꼴 보다 " + (pS - sS) + " 더 큽니다.");
		else
			System.out.println("사다리꼴과 평행사변형의 넓이는 같습니다.");

	}

}
