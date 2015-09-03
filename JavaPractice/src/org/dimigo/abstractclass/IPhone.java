/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *	 	|_ IPhone
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 * 
 * @author		: 이은찬
 * @version		: 1.0
 */
public class IPhone extends SmartPhone {

	public IPhone() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param model
	 * @param company
	 * @param price
	 */
	public IPhone(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}
	
	public void pay() {
		System.out.println("애플 페이로 결제합니다.");
	}
	
	public void useAirDrop() {
		System.out.println("AirDrop 기능을 사용합니다.");
	}

}
