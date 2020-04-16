package cf;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CustList {

	public static Customer createCustomer(String str)throws Exception
	{
		Customer c=new Customer();
		Address a=new Address();
		String str1[]=str.split(",");
		c.setCustId(Integer.parseInt(str1[0]));
		c.setCustname(str1[1]);
		c.setEmail(str1[2]);
		c.setMobile(str1[3]);
		c.setAddress(a);
		a.setCity(str1[5]);
		a.setState(str1[6]);
		a.setCountry(str1[7]);
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		c.setDob(dateformat.parse(str1[4]));
		return c;
	}
	public static  List<Customer> allCustomers() throws Exception 
	{
		List<Customer>  cust = new ArrayList<Customer>();
		File file = new File("E:\\sir\\rivisionhandson\\customer.txt");
		FileReader fin=new FileReader(file);
		BufferedReader br=new BufferedReader(fin);
		String st=br.readLine();
		while(st!=null)
		{
			Customer customer=createCustomer(st);
			cust.add(customer);
			st=br.readLine();
		}
		return cust;
	}

	public static void displayCustomers(String sortkey) throws Exception
	{
		List<Customer> list = allCustomers();
		 if(sortkey.equalsIgnoreCase("custid"))
		 {
		Collections.sort(list);
		 }else if(sortkey.equalsIgnoreCase("custname"))
		 {
			 Comparator<Customer> comparator=(e1,e2)->{ 
				 return e1.getCustname().compareTo(e2.getCustname());
			 };
			 Collections.sort(list,comparator);
		 }
		 else
		 {
			 
		 }
		for(Customer c: list)
		{
			System.out.println(c);
		}
	}
	
	public static int calculateAge(Date dob)
	{
		int age=2020-(dob.getYear()+1900);
		return age;
	}
public static void displaybyage(int age) throws Exception
{
	List<Customer> list=allCustomers();
	List<Customer> l2=new ArrayList();
	for(Customer cus:list)
	{
		int age1=calculateAge(cus.getDob());
		if(age1<age)
		{
			l2.add(cus);
		}
	}
	for(Customer c:l2)
	{
		System.out.println(c);
	}
}
public static void displaybycity(String cityname) throws Exception
{
	List<Customer> list=allCustomers();
	System.out.println(cityname);
	List<Customer> customersInCityName= new ArrayList<Customer>();
 	
	for(Customer cus:list)
	{
		if(cus.getAddress().getCity().equalsIgnoreCase(cityname))
		{
		customersInCityName.add(cus);
	}
	}
	for(Customer c:customersInCityName)
	{
		System.out.println(c);
	}
}

	public static void main(String[] args) throws Exception {		
		
	
		Scanner sc=new Scanner(System.in);
	while(true)
		{
		System.out.println("Select \n 1. Display Customers \n 2.display by age \n 3 Display by city  \n 4. Exit");
		
		int option= sc.nextInt();
		if(option ==1)
		{
			System.out.println("Enter Sort Key");
			String sk = sc.next();
			
		displayCustomers(sk);	
		}
		else if(option ==2)
		{
			System.out.println("enter age");
			int age=sc.nextInt();
			displaybyage(age);
		}
		else if(option ==3)
		{
			System.out.println("enter name of the city");
			String cityname=sc.next();
			displaybycity(cityname);
		}
		else
		{
			System.out.println("bye");
			System.exit(0);
		}
		
	}
}
}
