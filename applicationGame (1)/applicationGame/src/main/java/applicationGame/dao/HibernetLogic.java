package applicationGame.dao;
import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import applicationGame.dto.player1;



public class HibernetLogic {

		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("Player");
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		
	

	public void addObject(player1 p) 
	{
		transaction.begin();
		manager.persist(p);
		transaction.commit();
	
		}
	public void fetchObject(String email) {

		player1 player = manager.find(player1.class, email);

		System.out.println(player);

	}

	public void deleteObject(String email) {

		player1 player = manager.find(player1.class, email);

		transaction.begin();

		manager.remove(player);

		transaction.commit();

	}

	public void updateObject(String email, String newname) {

		player1 player = manager.find(player1.class, email);

		player.setName(newname);

		transaction.begin();

		manager.merge(player);

		transaction.commit();

	}
	

}




