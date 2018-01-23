package com.schronisko.jpa;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.*;

import com.schronisko.login.Konto;
import com.schronisko.status.Zwierze;

@SuppressWarnings("deprecation")
public class DBActions {
	  
	protected static SessionFactory sessionFactory;
	  
	    public void setup() {
	    	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
	    	        .configure()
	    	        .build();
	    	try {
	    	    sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	    	} catch (Exception ex) {
	    	    StandardServiceRegistryBuilder.destroy(registry);
	    	}
	    }
	 
	    public void exit() {
	    	sessionFactory.close();
	    }
	 
	    public void create(String imie, String plec, int waga, int wiek, String opiekun) {
	    	{
	    	    Zwierze zwierze = new Zwierze();
	    	    zwierze.setImie(imie);
	    	    zwierze.setPlec(plec);
	    	    zwierze.setWiek(wiek);
	    	    zwierze.setWaga(waga);
	    	    zwierze.setOpiekun(opiekun);
	    	  
	    	    
	    	 
	    	    Session session = sessionFactory.openSession();
	    	    session.beginTransaction();
	    	 
	    	    session.save(zwierze);
	    	 
	    	    session.getTransaction().commit();
	    	    session.close();
	    	}
	    }
	 
	    public void read() {
	      //todo
	    }
	 
	    public void update() {
	    	  //todo
	    }
	 
	    public void delete(int id) {
	    	
	    	    Zwierze zwierze = new Zwierze();
	    	    zwierze.setId(id);
	    	 
	    	    Session session = sessionFactory.openSession();
	    	    session.beginTransaction();
	    	 
	    	    session.delete(zwierze);
	    	 
	    	    session.getTransaction().commit();
	    	    session.close();
	    	}
	    
	 

	    public static boolean KontoLogin(String user, String pass) {
	    	boolean logintest = false;
	
	    	DBActions ifvalid=new DBActions();
	        ifvalid.setup();
	    	Session session = sessionFactory.openSession();
	    	session.beginTransaction();
	    	Konto k= new Konto();
	    	 Query<Konto> q=session.createQuery("from Konto k  where username=:username and password=:password");
	    	 q.setParameter("username",user);
	    	 q.setParameter("password",pass);
	    	 session.getTransaction().commit();
	    	 List<Konto> konta=q.getResultList();
	    	 
	    	 if(konta.size()==0) {
	    		 logintest=false;}
	    		 else {
	    			logintest= true;
	    		 }
	    	 ifvalid.exit();
	    
	    	 return logintest;
	    	 }
	    
	    public long numberOfRows() {
	    	
			 
			 setup();
			 Session session = sessionFactory.openSession();
			 long count =   (long) session.createQuery("select count(*) from Zwierze").iterate().next() ;
			exit();
	    	
	    	
	    	return count;
	    	
	    }
	    @SuppressWarnings("unchecked")
		public  List<Zwierze> wypisz2() {
		

	Session session = sessionFactory.openSession();
	   
	 Query<Zwierze> q=session.createQuery("From Zwierze");
	 List<Zwierze> zwierzeta=q.getResultList();
	 
	 
		
		return zwierzeta; 
		}
	    public static List<Zwierze> wypisz() {

			DBActions statusdisp= new DBActions();
			statusdisp.setup();
			return statusdisp.wypisz2();
		}

	}

