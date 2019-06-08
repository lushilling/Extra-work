package com.qa.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.domain.Account;

@Transactional(value = TxType.SUPPORTS)
public class AccountRepositoryDB implements AccountRepository {

	@PersistenceContext(unitName = "myPU")
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public Account create(Account account) {
		System.out.println("hi 1");
		em.persist(account);
		System.out.println("hi 1");
		return account;
	}
	// @Override
	// public Account read(int id) {
	// Account account = manager.find(Account.class, id);
	// return account;
	// }
	//
	// @Override
	// public Account update(int id, Account account) {
	// Account account = read(id);
	// account.setName(newInfo.getName());
	// System.out.println(read(account.getId()).getName());
	// return account;
	// return null;
	// }

	// EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
	//
	//// EntityManager manager = emf.createEntityManager();
	//
	// EntityTransaction transaction = manager.getTransaction();
	//
	// public Account create(Account account) {
	//
	// transaction.begin();
	// manager.persist(account);
	// transaction.commit();
	//
	// return account;
	//
	// }
	//
	// public Account update(int id) {
	//
	// transaction.begin();
	// Account returned = manager.find(Account.class, id);
	// returned.setName("Lucy");
	// transaction.commit();
	//
	// return null;
	//
	// }
}
