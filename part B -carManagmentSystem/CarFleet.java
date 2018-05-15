package carManagmentSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

// ����� �� ���
public class CarFleet {
	private String OrganizationName; // �� �������
	private List<Vehicle> Cars; // ����� ��� ���
	
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



