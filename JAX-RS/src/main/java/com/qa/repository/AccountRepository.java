package com.qa.repository;

import com.qa.domain.Account;

public interface AccountRepository {

	// public Account read(int id);
	// public Account update(int id, Account account);

	Account create(Account account);

}
