package carManagmentSystem;

import java.util.Iterator;

public class mainCarFleet {

	public static void main(String[] args) {
		CarFleet fleet=new CarFleet ("Avis");
		fleet.Add(new Vehicle(240000,5079930,"אבירם כוהן"));
		fleet.Add(new Vehicle(98000,3049377,"אביבה לוי;"));
		fleet.Add(new Vehicle(56000,5079930,"חדווה קדרון"));
		fleet.Add(new Vehicle(89000,20230786,"אלי קופטר"));
		fleet.Add(new Vehicle(310000,9599,"אבי רון"));
		Iterator<Vehicle> it=fleet.iterator();
		Vehicle v=null;
		while (it.hasNext()) {
		System.out.println(it.next());
		}
		System.out.println();
		it=fleet.iterator();
		while (it.hasNext()) {
		v=it.next();
		if(v.getOwnerName().contains("אבי"))
		System.out.format("Car Licence %d costs %d%n",v.getLicencePlate(), v.getTotalValue());
		}
	}

}
