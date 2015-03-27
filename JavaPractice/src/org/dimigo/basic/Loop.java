package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {
		for(int i =1; i<=10; i++) {
			
			for(int j=1; j<i; j++)
				System.out.print(j);
			
			System.out.print("*");
			
			for(int k=i+1; k<=10; k++)
				System.out.print(k);
			
			System.out.println("");
		}

	}

}
