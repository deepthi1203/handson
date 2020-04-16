package cf;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Comparable<Customer>,Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int custId;
String custname;
String email;
String mobile;
Date dob;
Address address;
@Override
public String toString() {
	return "Customer [custId=" + custId + ", custname=" + custname + ", email=" + email + ", mobile=" + mobile
			+ ", dob=" + dob + ", address=" + address + "]";
}
public Customer() {
	super();
}
public Customer(int custId, String custname, String email, String mobile, Date dob, Address address) {
	super();
	this.custId = custId;
	this.custname = custname;
	this.email = email;
	this.mobile = mobile;
	this.dob = dob;
	this.address = address;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public int compareTo(Customer o) {
	if(this.custId > o.custId)
	{
		return 1;
	}
	else if(this.custId < o.custId)
	{
		return -1;
		
	}
	else
	{
	return 0;
	}
}
}
