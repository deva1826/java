package day2;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		Customer c2=new Customer();
		Customer c3=new Customer();
		Customer c4=new Customer();
		
		c1.setCid(5);
		c1.setAddress("12 kumaran str");
		c1.setCity("villupuram");
		
		c2.setCid(4);
		c2.setAddress("pillaiyar kovil str");
		c2.setCity("villupuram");
		
		c3.setCid(6);
		c3.setAddress("3rd street");
		c3.setCity("villupuram");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}

}
