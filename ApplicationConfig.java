package com.aws.codestar.projecttemplates.configuration;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.aws.codestar.projecttemplates.controller.HelloWorldController;
import com.aws.codestar.projecttemplates.model.Alien;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * Spring configuration for sample application.
 */
@Configuration
@ComponentScan({ "com.aws.codestar.projecttemplates.configuration","com.aws.codestar.projecttemplates.dao" })
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
public class ApplicationConfig {

    /**
     * Retrieved from properties file.
     */
    @Value("${HelloWorld.SiteName}")
    private String siteName;

    @Bean
    public HelloWorldController helloWorld() {
        return new HelloWorldController(this.siteName);
    }

    /**
     * Required to inject properties using the 'Value' annotation.
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    
    @Bean(name="dataSource")
    public DataSource dataSource() {
    	//ComboPooledDataSource dataSource=new ComboPooledDataSource();
    	DriverManagerDataSource dataSource=new DriverManagerDataSource();
    	try {
			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	jdbc:mysql://"+url+":"+port+"/"+database?autoReconnect=true&useSSL=false, username, password
    	//dataSource.setUrl("jdbc:mysql://localhost:3306/springdemodb?createDatabaseIfNotExist=true");
        dataSource.setUrl("jdbc:mysql://localhost:3306/springdemodb?autoReconnect=true&useSSL=false, root, root");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
       return dataSource;
    }
    
    private Properties getHibernateProperty() {
    	 Properties hibernateProperties = new Properties();
         hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
         hibernateProperties.put("hibernate.show_sql","true");
         hibernateProperties.put("hibernate.hbm2ddl.auto","create");
		return hibernateProperties;
        
    }

   /* @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setPackagesToScan("com");
        Properties hibernateProperties = new Properties();
        hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        hibernateProperties.put("hibernate.show_sql","true");
        hibernateProperties.put("hibernate.hbm2ddl.auto","create");
        sessionFactoryBean.setHibernateProperties(hibernateProperties);

        return sessionFactoryBean;
    }*/

   /* @Bean
    public HibernateTransactionManager transactionManager() {
        HibernateTransactionManager transactionManager =
                new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }*/
    
    @Autowired
    @Bean(name="sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) {
    	
    	LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(dataSource);
    	sessionBuilder.addProperties(getHibernateProperty());
    	sessionBuilder.addAnnotatedClasses(Alien.class);
		return sessionBuilder.buildSessionFactory();
    	
    }
    @Autowired
    @Bean(name="transactionManager")
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory);
        return transactionManager;
}

}