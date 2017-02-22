package com.nearsoft.upiita.api.repository;

import com.nearsoft.upiita.api.model.Loan;
import org.springframework.data.repository.CrudRepository;

public interface LoanRepository extends CrudRepository<Loan, Long> {
}
