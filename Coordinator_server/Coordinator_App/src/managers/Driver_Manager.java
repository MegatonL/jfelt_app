package managers;

import java.util.ArrayList;


import threads.Driver_Thread;
import entities.Driver;

public class Driver_Manager {

	private static Driver_Manager self = null;
	private ArrayList<Driver_Thread> driverList;
	
	public Driver_Manager() {
		self = this;
		this.driverList = new ArrayList<>();
	}
	
	
	
	public static Driver_Manager getInstance()
	{
		if(self == null)
			self = new Driver_Manager();
		
		return self;
	}
	
	public void addClientThread(Driver_Thread driver)
	{
		this.driverList.add(driver);
	}
	
	public Driver getDriverAt(int index)
	{
		return this.driverList.get(index).getOwner();
	}
	
	public void removeDriver(int index)
	{
		this.driverList.remove(index);
	}
	
	public ArrayList<Driver> getClientList() {
		ArrayList<Driver> ar = new ArrayList<>();
		for(int count1 = 0; count1 < driverList.size(); count1++)
		{
			ar.add(driverList.get(count1).getOwner());
		}
		
		return ar;
	}
}
