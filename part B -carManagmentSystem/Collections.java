package carManagmentSystem;

import java.util.List;

public class Collections {

	static void sort(List<Vehicle> cars)
	{
		for(int i=0 ; i < cars.size()-1; i++)
		{
			for(int j=0; j < cars.size()-i-1 ;j++)
			{
				if(cars.get(j).compareTo(cars.get(j+1))==-1) swap(cars,j,j+1);
			}
		}
	}
	
	public static void swap(List<Vehicle> cars,int i , int j)
	{
		Vehicle t=cars.get(i);
		cars.set(i,cars.get(j));
		cars.set(j,t);
	}
}
