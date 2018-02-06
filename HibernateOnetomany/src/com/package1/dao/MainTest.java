package com.package1.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {

	
	
	public static void main(String[] args) {
		
		
		
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	    SessionFactory factory=cfg.buildSessionFactory();  
	    Session session=factory.openSession();  
	    Transaction t=session.beginTransaction();
	    t.begin();
	    Query query=session.createQuery("from Package_sightseen");
	    List list = query.list();
	    int size=list.size();
	    System.out.println("size is" +size);
	    String sight_seen[] = new String[size];
	    String sub_sightseen[]=new String[size];
	 Iterator itr=list.iterator();
	 int i=0;
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}
	
	 t.commit();
	 session.close();
	}
}
