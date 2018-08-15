package com.xuzhu.fmsfinanceproductservice.DAO;

import com.xuzhu.fmsfinanceproductservice.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDAO extends CrudRepository<Account, String> {

}
