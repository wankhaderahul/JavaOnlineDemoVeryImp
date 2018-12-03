package com.rahul.SpringCoreAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext factory=new ClassPathXmlApplicationContext("springContext.xml"); 
    	
    	/*In xml need specify bean 
    	 <beans>
    	 <bean id="class" class="Samsang"/>
    	 
    	 </beans> 

*
*/
    	
       /* Samsang s7=new Samsang();
        s7.config();*/
    	
    	ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
    	Samsang s7=factory.getBean(Samsang.class);
    	s7.config();
    }
}
