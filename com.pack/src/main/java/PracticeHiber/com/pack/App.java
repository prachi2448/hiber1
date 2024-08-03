package PracticeHiber.com.pack;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import java.util.Date;
import javax.transaction.Transaction;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Start!" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        employee e1=new employee();
        e1.setEmpid(201);
        e1.setEmpname("Prachi");
        e1.setPosition("developer");
        e1.setCity("Nagpur");
        
        address1 a1= new address1();
        a1.setAddressId(107);
        a1.setStreet(" Chhota Gondia");
        a1.setCity("Gondia");
        a1.setZ(11.2);
        a1.setAddDate(new Date());
        
        org.hibernate.Session session=factory.openSession();
        org.hibernate.Transaction tx1=session.beginTransaction();
//        session.save(e1);
        session.save(a1);
        
        
        tx1.commit();
        session.close();
        
        }
}
