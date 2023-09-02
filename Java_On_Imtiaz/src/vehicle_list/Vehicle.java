package vehicle_list;

import java.util.Objects;

public class Vehicle {

	String make;
	String model;
	int price;
	boolean FWD;

	public Vehicle(String make, String model, int price, boolean fWD) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		FWD = fWD;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isFWD() {
		return FWD;
	}

	public void setFWD(boolean fWD) {
		FWD = fWD;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", FWD=" + FWD + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(FWD, make, model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return FWD == other.FWD && Objects.equals(make, other.make) && Objects.equals(model, other.model)
				&& price == other.price;
	}

}
