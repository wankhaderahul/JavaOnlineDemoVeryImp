package com.rahul.SpringFrameWrokDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /*Car c=new Car();
       
       Bike b=new Bike();
       */
    	/* <!--  1 ts way to configure u r bean with bean tag xml configuration -->
    	*/
       //BeanFactory context=new ClassPathXmlApplicationContext("spring.xml");//use for small application
           	
      /* ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");//super set of BeanFactory
       
       Vehical v=(Vehical) context.getBean("vehical");
       v.drive();*/
    	
    	
    	
    	
    /*	<!--  2 nd way to configure u r bean with @ annotation configuration -->*/
    	
    	/*ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	 Vehical v=(Vehical) context.getBean("car");
    	 //Vehical v=(Vehical) context.getBean("bike");
         v.drive();*/
    	
    	
    	
    	
    /*	<!--  3 rd way to configure u r bean with bean tag xml configuration with parameter -->*/
    	
    	/*ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	Tyre t=(Tyre) context.getBean("tyre");
    	System.out.println(t);*/
    	
    	
    /*	<!-- 4 th way to configure u r bean with @annotation configuration @Autowired, @Component -->*/
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	Car c=(Car) context.getBean("car");
    	c.drive();
    	
    }
}
