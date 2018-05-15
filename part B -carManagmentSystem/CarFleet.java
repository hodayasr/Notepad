package carManagmentSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

// מחלקת צי רכב
public class CarFleet {
	private String OrganizationName; // שם האירגון
	private List<Vehicle> Cars; // רשימת כלי רכב
	
	public CarFleet(String organizationName)
	{
		OrganizationName = organizationName;
		Cars=new ArrayList<>();
	}
	
	public void Add(Vehicle v)
	{
		this.Cars.add(v);
	}
	
	public Iterator<Vehicle> iterator() {
		 return java.util.Collections.unmodifiableList(Cars).iterator();
	}
	
	public class CarIterator implements Iterator<Vehicle>
	{
		private Iterator<Vehicle> currentIterator;
		
		@Override
		public boolean hasNext() {
			return currentIterator.hasNext();
		}

		@Override
		public Vehicle next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			return currentIterator.next();

		}

	}

	
}



