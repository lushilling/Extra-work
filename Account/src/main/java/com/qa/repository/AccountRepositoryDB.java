package com.qa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qa.domain.Account;

public class AccountRepositoryDB {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");

	EntityManager manager = emf.createEntityManager();

	EntityTransaction transaction = manager.getTransaction();

	public Account create(Account account) {

		transaction.begin();
		manager.persist(account);
		transaction.commit();

		return account;

	}

	public Account update(int id) {

		transaction.begin();
		Account returned = manager.find(Account.class, id);
		returned.setName("Lucy");
		transaction.commit();

		return null;

	}
}
