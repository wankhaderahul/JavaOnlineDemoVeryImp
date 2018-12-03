/*Hibernate is ORM
 * 
 * Advantages -->ORM -->Hibernate caching -->
 * 
 * 
 * Hibernate cache --> Session 1st level cache --> SessionFactory 2nd level cache -->EH cache(IMp most use) -->OS cache -->SWAM cache
 * 
 * */

package com.rahul.DemoHibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//use for Simple save Alien
    	
    	/*AlienName aname=new AlienName();
    	aname.setFname("Rahul");
    	aname.setMname("Uttamrao");
    	aname.setLname("Wankhade");
    	
    	
        Alien a1=new Alien();
        a1.setAid(101);
       a1.setAname(aname);
        a1.setTech("JAVA");*/
    	
    	Laptop laptops=new Laptop();
    	
    	Laptop laptop=new Laptop();
    	laptop.setLid(101);
    	laptop.setLname("Dell");
    	
    	Laptop laptop1=new Laptop();
    	laptop1.setLid(102);
    	laptop1.setLname("HP");
    	
    	
    	List<Laptop> laptopList=new ArrayList<Laptop>();
    	laptopList.add(laptop);
    	laptopList.add(laptop1);
    	
    	Student students=new Student();
    
    	Student student=new Student();
    	student.setRollno(1);
    	student.setName("rahul");
    	student.setMarks(50);
    	
    	
    	Student student1=new Student();
    	student1.setRollno(2);
    	student1.setName("Gaurao");
    	student1.setMarks(100);
    	
    	
    	List<Student> studentList=new ArrayList<Student>();
    	studentList.add(student);
    	studentList.add(student1);
    	
    	//use for one to one mapping
    	
    	//student.setLaptop(laptop); 
  
    	
    	//use for one to many mapping
    	
    	/*student.getLaptopList().add(laptop);
    	//student.setLaptopList(laptopList);
    	laptop.setStudent(student);
       	laptop1.setStudent(student);*/
    	
    	/*student.setLaptopList(laptopList);
    	for(Laptop lp:laptopList) {
    		lp.setStudent(student);
    	}
    	*/
    	
    	//use for many to many mapping
    	
    
    	
    	
    	student.getLaptopListManyToMany().add(laptop);
    	laptop.getStudentList().add(student);
    	
    	
        
        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class).addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        
      //java above 4.1  --> if not use this ServiceRegistry then con.buildSessionFactory() is deprecated method
        ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        //SessionFactory sf=con.buildSessionFactory();// deprecated method blue line
        SessionFactory sf=con.buildSessionFactory(sr);
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        //session.save(a1);
        
        //get Alien by ID
        
       /* Alien getAlienById=new Alien();
        
        getAlienById=(Alien) session.get(Alien.class, 101);
        getAlienById=(Alien) session.load(Alien.class, 101);
        System.out.println(getAlienById);
        */
        
      //use for one to one mapping
    	
      /*  session.save(student);
        session.save(laptop);*/
       
      
        
      //use for one to many mapping
        
        /*session.save(student);
        session.save(laptop);
        session.save(laptop1);*/
        
        
      //use for many to many mapping
        
        /*session.save(student);
        session.save(laptop);
        */
        
        //get student LAZY or EAGER loading
       /* Student s=null;
        s=(Student) session.get(Student.class, 1);
        System.out.println(s.getName());
        System.out.println(s.getLaptopListManyToMany().size());
        */
        
        //cascade type( if the parent entity is (P,M,D,RF,RM,) then all its related entity will also be (P,M,D,RF,RM,).)-->PERSIST -> MERGE -> DETACH -> REFRESH -> REMOVE -> ALL
        
        session.delete(student);
        
        tx.commit();
        
     
    }
}
