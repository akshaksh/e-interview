package hackereath;

import java.util.ArrayList;

public class StringNullCheck {
	static String check="";
	public static void main(String[] args) {
		System.out.println(check.length());
		System.out.println(check.isEmpty());
		ArrayList<Customer> al=new ArrayList<Customer>();
		Customer cust=new Customer();
		cust.setColumn_name("CUSTOMER_REF");
		cust.setDatatype("VARCHAR2");
		cust.setLength(10);
		al.add(cust);
		 cust=new Customer();
		 cust.setColumn_name("dfgdf");
		 cust.setDatatype("VARCdfgdsHAR2");
		 cust.setLength(100);
		 al.add(cust);
		 Customer[] array = al.toArray(new Customer[al.size()]);
		 for(Customer custm:array){
			 System.out.println(custm);
		 }

	}

}
