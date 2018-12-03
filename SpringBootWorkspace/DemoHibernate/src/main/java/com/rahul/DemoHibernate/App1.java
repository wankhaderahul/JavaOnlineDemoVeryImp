package com.rahul.DemoHibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App1 {

	public static void main(String[] args) {

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(sr);
		Session session = sf.openSession();
		session.beginTransaction();

		// using cache --> 2nd level -->ehcache

		// using method

		/*Alien a = null;

		a = (Alien) session.get(Alien.class, 1);
		System.out.println(a);

		session.getTransaction().commit();

		session.close();

		Session session1 = sf.openSession();
		session1.beginTransaction();
		a = (Alien) session1.get(Alien.class, 1);
		System.out.println(a);
		session1.close();
*/
		// using query
		Alien a1 = null;

		Query q1 = session.createQuery("from Alien where aid=1");
              q1.setCacheable(true);
		a1=(Alien) q1.uniqueResult();
		System.out.println(a1);

		session.getTransaction().commit();

		session.close();

		Session session1 = sf.openSession();
		session1.beginTransaction();
		Query q2 = session1.createQuery("from Alien where aid=1");
		 q2.setCacheable(true);
		a1 = (Alien) q2.uniqueResult();
		System.out.println(a1);
		session1.getTransaction().commit();
		session1.close();

	}

}
