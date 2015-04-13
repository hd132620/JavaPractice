/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	 	|_ Car
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 * 
 * @author		: 이은찬
 * @version		: 1.0
 */
public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setCompany(String Company) {
		company = Company;
	}
	
	public void setModel(String Model) {
		model = Model;
	}
	
	public void setColor(String Color) {
		color = Color;
	}
	
	public void setMaxSpeed(int MaxSpeed) {
		maxSpeed = MaxSpeed;
	}
	
	public void setPrice(int Price) {
		price = Price;
	}
	
}
