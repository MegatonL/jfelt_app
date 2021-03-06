package entities;

import java.io.Serializable;

public class Client extends Entity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String phoneNumber;
	private String pickUpAddress;
	private String dropOffAddress;
	private int numberOfClients;
	private boolean hasDriver;
	private Driver assignedDriver;
	private String otherComments;
	private boolean hasID;
	private boolean pickWithin10;
	private boolean dropWithin10;
	private boolean requestMade = false;
	//REMOVE LATER
	private String ADflag; // using it to test the button to press once 
	
	public Client(String name, String id, String phoneNumber ,String pickUpAddress, String dropOffAddress,int numberOfClients,
			String otherCom, boolean hasID, boolean pickWithin10, boolean dropWithin10 ) {
		super(id, name);
		this.phoneNumber = phoneNumber;
		this.pickUpAddress = pickUpAddress;
		this.dropOffAddress = dropOffAddress;
		this.numberOfClients = numberOfClients;
		this.otherComments = otherCom;
		this.hasID = hasID;
		this.pickWithin10 = pickWithin10;
		this.dropWithin10 = dropWithin10;
		this.hasDriver = false;
	}
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getDropOffAddress() {
		return dropOffAddress;
	}
	
	public String getPickUpAddress() {
		return pickUpAddress;
	}
	
	public int getNumberOfClients() {
		return numberOfClients;
	}
	
	public String getADflag() {
		return ADflag;
	}
	
	public void setADflag(String aDflag) {
		ADflag = aDflag;
	}


	public void assignDriver(Driver driver) {
		this.assignedDriver = driver;
		this.hasDriver = true;
		
	}
	
	public Driver getAssignedDriver() {
		return assignedDriver;
	}
	
	public boolean hasDriver() {
		return hasDriver;
	}
	
	public boolean hasID() {
		return hasID;
	}
	
	public boolean isDropWithin10() {
		return dropWithin10;
	}
	
	public boolean isPickWithin10() {
		return pickWithin10;
	}
	
	public String getOtherComments() {
		return otherComments;
	}
	
	public boolean isRequestMade() {
		return requestMade;
	}
	
	public void hasRequested(){
        requestMade = true;
    }
}
