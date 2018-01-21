package com.schronisko.jpa;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.schronisko.status.Zwierze;

public class DBActions {
	  protected SessionFactory sessionFactory;
	  
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
	    
	 

	    public void KontoLogin(String user, String pass) {
	    	//to do	       
	    }
	}

