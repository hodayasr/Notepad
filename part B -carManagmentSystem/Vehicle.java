package carManagmentSystem;

// 
public class Vehicle implements Comparable<Vehicle>{
	private int totalValue; // שווי רכב
	private int licencePlate ; // מספר רישוי רכב
	 private String ownerName; // שם בעלים

	 public Vehicle(int totalValue,int licencePlate,String ownerName)
	 {
	 this.totalValue=totalValue;
	 this.licencePlate = licencePlate;
	 this.ownerName=ownerName;
	 }
	 
	 public int compareTo(Vehicle v)
	 {
		if(this.totalValue>v.totalValue) return 1;
		if(this.totalValue<v.totalValue) return -1;
		return 0;
	 }
	 
	public int getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}


	public int getLicencePlate() {
		return licencePlate;
	}

	public void setLicencePlate(int licencePlate) {
		this.licencePlate = licencePlate;
	}
	

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}



	@Override
	public String toString() {
		return "Vehicle [totalValue=" + totalValue + ", licencePlate=" + licencePlate + ", ownerName=" + ownerName
				+ "]";
	}
	 
	 
	 
}
