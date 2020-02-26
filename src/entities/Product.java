package entities;

public class Product {
	
	public String name;
	public double value;
	public int quantity;
	
	public double totalValueInStock() {
		return value * quantity;	
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "Product data: " 
			+ name
			+ ", R$ "
			+ String.format("%.2f", value)
			+ ", "
			+ quantity
			+ " units, Total: R$ "
			+ String.format("%.2f", totalValueInStock());
		
	} 









}
