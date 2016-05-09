package managers;

import java.util.ArrayList;

import threads.Client_Thread;
import entities.Client;

public class Client_Manager {

	private static Client_Manager self = null;
	private ArrayList<Client_Thread> clientList;
	
	public Client_Manager() {
		self = this;
		this.clientList = new ArrayList<>();
	}
	
	
	
	public static Client_Manager getInstance()
	{
		if(self == null)
			self = new Client_Manager();
		
		return self;
	}
	
	public void addClientThread(Client_Thread client)
	{
		this.clientList.add(client);
	}
	
	public Client getClientAt(int index)
	{
		return this.clientList.get(index).getOwner();
	}
	
	public void removeClient(int index)
	{
		this.clientList.remove(index);
	}
	
	public ArrayList<Client> getClientList() {
		ArrayList<Client> ar = new ArrayList<>();
		for(int count1 = 0; count1 < clientList.size(); count1++)
		{
			ar.add(clientList.get(count1).getOwner());
		}
		
		return ar;
	}
}
