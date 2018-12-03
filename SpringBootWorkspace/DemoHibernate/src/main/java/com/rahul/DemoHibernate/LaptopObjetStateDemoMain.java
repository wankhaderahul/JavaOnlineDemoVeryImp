/*Hibernate Object State or Persistance Life cycle
 * 
 * 1)Transient state
 * 2)Persistence state
 * 3)Detached state
 * 4)remove state
 * 
 * object --> new (A a=new A()) --->Transient -----save(),persist(); --> perstatance state -->after save obj is in detached state
 * 
 * 
 * 
 * 
*/
package com.rahul.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LaptopObjetStateDemoMain {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(LaptopObjetStateDemo.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		session.beginTransaction();
		
		// hibernate object state
		
		/*
		LaptopObjetStateDemo l=new LaptopObjetStateDemo();
		l.setLid(102);
		l.setBrand("Sony");
		l.setPrice(700);
		
		
		session.save(l);
		
		l.setPrice(800); //update this price (800) -->because in persistence state
		
        //session.remove(l);
*/		
		
		//get() and load() difference
		
		LaptopObjetStateDemo l1=(LaptopObjetStateDemo) session.get(LaptopObjetStateDemo.class, 101); //get object -->every time heat DB --> Nullpointer exception
		
		LaptopObjetStateDemo l2=(LaptopObjetStateDemo) session.load(LaptopObjetStateDemo.class, 102);//load proxcy object -->not heat DB --> ObjectNotFound exception
		System.out.println(" get() -> "+l1);
		System.out.println("load() -> "+l2);
		
		session.getTransaction().commit();
	   
		//session.detached(l); //after detached not able to update value
		//l.setPrice(900); //not update this price  -->because in detached state
	}
	
	
	

}
