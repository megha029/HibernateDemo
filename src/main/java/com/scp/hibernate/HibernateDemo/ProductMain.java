package com.scp.hibernate.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductMain {

	public static void main(String[] args) {

		// Using xml

		/*
		 * Product1 p1 =new Product1(1,"product1"); Product1 p2 =new
		 * Product1(2,"product2");
		 * 
		 * Configuration cfg = new Configuration(); SessionFactory sf =
		 * cfg.configure().buildSessionFactory(); Session s =sf.openSession();
		 * Transaction tr = s.beginTransaction(); s.save(p1); s.save(p2);
		 * tr.commit(); s.close();
		 */

		// Using Annotation

		AnnotationDemo ad1 = new AnnotationDemo(1, "Product1", 15000);
		AnnotationDemo ad2 = new AnnotationDemo(2, "Product2", 15000);

		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		s.save(ad1);
		s.save(ad2);
		tr.commit();
		s.close();
	}

}
