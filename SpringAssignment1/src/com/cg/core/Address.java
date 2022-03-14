package com.cg.core;
public class Address { 
private String street;
private String city;
private String state;
private Integer zip;
private String country; public Address(String street, String city, String state, Integer zip, String country) {
this.street = street;
this.city = city;
this.state = state;
this.zip = zip;
this.country = country;
} public Address() { } public void setStreet(String street) {
this.street = street;
} public void setCity(String city) {
this.city = city;
} public void setState(String state) {
this.state = state;
} public void setZip(Integer zip) {
this.zip = zip;
} public void setCountry(String country) {
this.country = country;
} @Override
public String toString() {
return "[street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country="
+ country + "]";
}
}


