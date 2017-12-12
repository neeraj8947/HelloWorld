package com.finoit.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.SessionImpl;

import com.mysql.jdbc.Connection;

public class MyClass {
	public static void main(String[] args) 
	  {
	   B b = new C();
	   
	   Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file 
	  //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	 // Way3 - using Session Impl
        SessionImpl sessionImpl = (SessionImpl) session;
        Connection connection = (Connection) sessionImpl.connection();
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	    A a = b;
		   if (a instanceof A) System.out.println("A");
		   if (a instanceof B) System.out.println("B");
		   if (a instanceof C) System.out.println("C");
		   if (a instanceof D) System.out.println("D");
	  }
}


class A {}
class B extends A {}
class C extends B {}
class D extends C {}