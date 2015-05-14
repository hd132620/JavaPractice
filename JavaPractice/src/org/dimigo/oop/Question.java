/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *	 	|_ Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 * 
 * @author		: 이은찬
 * @version		: 1.0
 */
public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가장 좋아하는 가수는?");
		String singerAnswer = scanner.nextLine();
		if(singerAnswer.equals("빅뱅")) 
			System.out.println("정답입니다!!");
		else
			System.out.println("틀렸습니다!!");
		
		System.out.println("가장 좋아하는 배우는?");
		String actorAnswer = scanner.nextLine();
		if(actorAnswer.equals("조인성")) 
			System.out.println("정답입니다!!");
		else
			System.out.println("틀렸습니다!!");
		
		
		System.out.println("가장 좋아하는 과목은?");
		String subjectAnswer = scanner.nextLine();
		if(subjectAnswer.equals("자바")) 
			System.out.println("정답입니다!!");
		else
			System.out.println("틀렸습니다!!");
		
		

	}

}
