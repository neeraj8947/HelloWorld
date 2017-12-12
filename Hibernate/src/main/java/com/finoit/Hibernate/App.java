package com.finoit.Hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Session session = HibernateUtil.getSessionFactory().openSession();
    	
    	  User user = (User)session.load(User.class, 2);
    	  
    	  Transaction tx = session.beginTransaction();
          user.setUsername("ABC");
          System.out.println("Object updated successfully.....!!");
          tx.commit();
    	  
    
    	 
       
    	 
    }
}
