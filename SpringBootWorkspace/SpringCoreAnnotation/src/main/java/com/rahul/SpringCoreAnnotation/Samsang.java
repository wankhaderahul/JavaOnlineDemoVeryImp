
//Spring Core Annotations


/**
 * Annotation │ Meaning                                             │
├────────────┼─────────────────────────────────────────────────────┤
│ @Component │ generic stereotype for any Spring-managed component │
│ @Repository│ stereotype for persistence layer (use database activity)                   │
│ @Service   │ stereotype for service layer (use businnes login)                       │
│ @Controller│ stereotype for presentation layer (spring-mvc) 
 * 
 * 
 * 
 * Difference between Autowired and Qualifier


@Qualifier

->The @Qualifier annotation is used to resolve the autowiring conflict or bean if ambiguous , when there are multiple beans of same type.
 
-> @Qualifier to autowire(or search) by-name -> throw NoUniqueBeanDefinitionException.
 
 @Autowired
 ->@Autowired to autowire(or search) by-type
 ->search object it self
 
 @Controller: where your request mapping from presentation page done i.e. Presentation layer won't go to any other file it goes directly to @Controller class and checks for requested path in @RequestMapping annotation which written before method calls if necessary.

@Service: All business logic is here i.e. Data related calculations and all.This annotation of business layer in which our user not directly call persistence method so it will call this method using this annotation. It will request @Repository as per user request

@Repository: This is Persistence layer(Data Access Layer) of application which used to get data from the database. i.e. all the Database related operations are done by the repository.

@Component - Annotate your other components (for example REST resource classes) with a component stereotype.
 
 * */

package com.rahul.SpringCoreAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("samsang") //by default name --> or u wreite u r name(Mysansung)


@Component       //Searching by name -> non qualified and de capitalized  -->use which for object(getting for object) -->spring managed component
public class Samsang {
    
	@Autowired //Searching by type --> use search object it self
	//@Qualifier("mobileProcessorImpl")
	@Qualifier("mediaTek") //Searching by name--> use to match the name
	
	MobileProcessor mobP;
	
	/*@Autowired
	MobileProcessorImpl mp;*/

	public MobileProcessor getMobP() {
		return mobP;
	}

	public void setMobP(MobileProcessor mobP) {
		this.mobP = mobP;
	}

	public void config() {

		System.out.println("Samsang Octa core 5 process ");
		mobP.process();
		//mp.process();
	}

}
