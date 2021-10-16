package com.darshantandel.bookseller.model.idgenerator.repository;

import com.darshantandel.bookseller.model.idgenerator.model.DefaultOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDefaultOneRepository extends JpaRepository<DefaultOne, Long> {
}
