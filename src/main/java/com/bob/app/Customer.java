package com.bob.app;

public class Customer {

	private int customerId;
	private String customerName;
	private long customerContact;
	private Address customerAddress;
	
	

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public void printCustomerDetails()
	{
		System.out.println("Customer Details\n-------------------------\nCustomer Id : "+getCustomerId()+"\nCustomer Name : "+getCustomerName()+"\nCustomer Contact : "+getCustomerContact()+"\nCustomer Address : "+getCustomerAddress().getStreet()+","+getCustomerAddress().getCity()+","+getCustomerAddress().getZip()+","+getCustomerAddress().getState()+","+getCustomerAddress().getCountry());
	}
	
	
}
