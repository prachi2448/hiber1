package PracticeHiber.com.pack;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class fetching {
	
	public static void main(String[]args)
	{
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		org.hibernate.Session session = factory.openSession();
		
		employee e1= session.get(employee.class, 201);
		System.out.println(e1.getEmpname());
		
		address1 a1= session.load(address1.class, 4);
		System.out.println(a1.getCity()+" "+a1.getStreet());
		
		session.close();
				
		
	}

}
