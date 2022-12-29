package com.project.movie;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.project.entity.Movie;

public class App 
{
    public static void main( String[] args )
    {
    	Movie m=new Movie();
    	m.setId(1);
    	m.setName("Avatar 2");
    	m.setDate("3/1/2022");
    	m.setTime("6pm to 9pm");
    	m.setTheatre("ArsMultiplex");
    	m.setTicketprice(200);
    	m.setLocation("Salem");
    	
    	Movie m1=new Movie();
    	m1.setId(2);
    	m1.setName("Black adam");
    	m1.setDate("3/1/2022");
    	m1.setTime("10pm to 1am");
    	m1.setTheatre("ArsMultiplex");
    	m1.setTicketprice(200);
    	m1.setLocation("Salem");
    	
Configuration cf=new Configuration().configure().addAnnotatedClass(Movie.class);
    	
    	SessionFactory sf=cf.buildSessionFactory();
    	
    	Session s=sf.openSession();
    	
    	Transaction txn=s.beginTransaction();
    	
    	s.save(m);
    	s.save(m1);
    	
    	txn.commit();
        
    }
}
