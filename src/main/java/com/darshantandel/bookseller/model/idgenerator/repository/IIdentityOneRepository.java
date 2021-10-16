package com.darshantandel.bookseller.model.idgenerator.repository;

import com.darshantandel.bookseller.model.idgenerator.model.IdentityOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIdentityOneRepository extends JpaRepository<IdentityOne, Long> {
}
