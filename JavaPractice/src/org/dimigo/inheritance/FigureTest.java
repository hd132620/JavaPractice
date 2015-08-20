/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *	 	|_ FigureTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 20.
 * </pre>
 * 
 * @author		: 이은찬
 * @version		: 1.0
 */
public class FigureTest {
	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r= new Rectangle(20, 20, 5, 8);
		
		System.out.println("Circle의 넓이 : " + c.calcArea());
		System.out.println("Triangle의 넓이 : " + t.calcArea());
		System.out.println("Rectangle의 넓이 : " + r.calcArea());

	}
}
