package com.cg.core;
public class Customer { 
private Integer customerId;
private String customerName;
private Long customerContact;
private Address customerAddress; public Customer(Integer customerId, String customerName, Long customerContact, Address customerAddress) {
this.customerId = customerId;
this.customerName = customerName;
this.customerContact = customerContact;
this.customerAddress = customerAddress;
}
public Customer() {
} public void setCustomerId(Integer customerId) {
this.customerId = customerId;
} public void setCustomerName(String customerName) {
this.customerName = customerName;
} public void setCustomerContact(Long customerContact) {
this.customerContact = customerContact;
} public void setCustomerAddress(Address customerAddress) {
this.customerAddress = customerAddress;
} public void displayCustomerInfo() {
System.out.println("Customer Details: Name=" + customerName + " Id= " + customerId + " Contact No= " + customerContact);
System.out.println("Customer Address: " + customerAddress);
}
}

