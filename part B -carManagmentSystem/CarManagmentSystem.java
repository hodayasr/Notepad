package carManagmentSystem;

import java.util.ArrayList;
import java.util.List;

public class CarManagmentSystem {

	public static void checkA(List<Vehicle> lv)
	{
		Collections.sort(lv);
		System.out.println(lv); 
	}

	public static void main(String[] args)
	{
		List<Vehicle> cars=new ArrayList<>();
		cars.add(new Vehicle(240000,5079930,"אבירם כוהן"));
		cars.add(new Vehicle(98000,3049377,"אביבה לוי"));
		cars.add(new Vehicle(56000,5079930,"חדווה קדרון"));
		cars.add(new Vehicle(89000,20230786,"אלי קופטר"));
		cars.add(new Vehicle(310000,9599,"אבי רון"));
		Collections.sort(cars);
		for (Vehicle v : cars) {
			System.out.println(v);
		}
		//checkA(cars);
	}

}
