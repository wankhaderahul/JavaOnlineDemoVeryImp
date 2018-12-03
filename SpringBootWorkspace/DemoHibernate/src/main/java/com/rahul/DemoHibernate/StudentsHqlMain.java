package com.rahul.DemoHibernate;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



public class StudentsHqlMain {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(StudentsHql.class);
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(sr);
		Session session = sf.openSession();
		session.beginTransaction();
		
		
		/*Random rd=new Random();
		for(int i=1;i<=50;i++) {
			StudentsHql sh=new StudentsHql();
			sh.setRollno(i);
			sh.setName("name "+i);
			sh.setMarks(rd.nextInt(100));
			session.save(sh);
		}*/
		
		//Query q1=session.createQuery("from StudentsHql");
		Query q1=session.createQuery("from StudentsHql where marks > 50");
		
		List<StudentsHql> studentsHqls=q1.list();
		
		for(StudentsHql sh:studentsHqls) {
			System.out.println(sh);
		}
		
		Query q2=session.createQuery("from StudentsHql where rollno=7");
		
		StudentsHql sh=(StudentsHql) q2.uniqueResult();
		System.out.println(sh);
		
		
		Query q3=session.createQuery("select rollno,name,marks from StudentsHql where rollno=7");
		
		Object []student=(Object[]) q3.uniqueResult();
		System.out.println(student[0]+ ": "+student[1] +" : "+student[2]);
		
		for(Object s:student) {
			System.out.println(s);
		}
		
		
		Query q4=session.createQuery("select rollno,name,marks from StudentsHql ");
		
		List<Object[]> stu=(List<Object[]>) q4.list();
		
		for(Object [] s:stu) {
			System.out.println(s[0]+ ": "+s[1] +" : "+s[2]);
		}
		
		
		Query q5=session.createQuery("select sum(marks) from StudentsHql ");
		Long sumMarks= (Long) q5.uniqueResult();
		System.out.println(sumMarks);
		
		
		int b=60;
		Query q6=session.createQuery("select sum(marks) from StudentsHql where marks > :b ");
		q6.setParameter("b", b);
		Long sumMark= (Long) q6.uniqueResult();
		System.out.println(sumMark);
		
		
		//Native Query
		
		SQLQuery sqlQ=session.createSQLQuery("select * from StudentsHql where marks > 50 ");
		sqlQ.addEntity(StudentsHql.class);
		List<StudentsHql> st=sqlQ.list();
	for(StudentsHql s:st) {
		System.out.println(s);
	}
		
	
	
	SQLQuery sqlQ1=(SQLQuery) session.createSQLQuery("select name,marks from StudentsHql where marks > 50 ");
	sqlQ1.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
	
	List stud=sqlQ1.list();
	for(Object o:stud) {
		Map m=(Map) o;
		System.out.println(m.get("name") + " : "+m.get("marks"));
	}
	
	
		session.getTransaction().commit();
	}
}
