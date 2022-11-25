package com.hibernatedemo1.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatedemo1.entity.Cars;

public class HibernateAPIClass {
	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------");
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Cars c1=new Cars("AudiQ8",7885545,"RED");
		Cars c2=new Cars("BMW",9865549,"WHITE");
		Cars c3=new Cars("Mercediz Benz",5885547,"BLACK");
		session.save(c1);
		session.save(c2);
		session.save(c3);
		tx.commit();
		System.out.println("-----------------------------------------------------------");
		
	}

}
