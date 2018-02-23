package test;

public class Coupons {
	
	private String name;
	private int discount_percentage;
	private String shop;
	public Coupons(String name, int discount_percentage, String shop) {
		super();
		this.name = name;
		this.discount_percentage = discount_percentage;
		this.shop = shop;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiscount_percentage() {
		return discount_percentage;
	}
	public void setDiscount_percentage(int discount_percentage) {
		this.discount_percentage = discount_percentage;
	}
	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
	@Override
	public String toString() {
		return "Coupons [name=" + name + ", discount_percentage=" + discount_percentage + ", shop=" + shop + "]";
	}
	

}
