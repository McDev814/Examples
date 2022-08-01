import java.util.ArrayList;

public class Droid {
	
	private String name;
	private String greeting;
	private double price;
	private String[] droidTypes;

	public Droid(String name, String greeting, double price, String[] droidTypes) {
		this.name = name;
		this.greeting = greeting;
		this.price = price;
		this.droidTypes = droidTypes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else {
			this.price = 0;
		}
	}

	public String[] getDroidTypes() {
		return droidTypes;
	}

	public void setDroidTypes(String[] droidTypes) {
		this.droidTypes = droidTypes;
	}
}
