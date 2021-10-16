package com.darshantandel.bookseller.model.idgenerator.repository;

import com.darshantandel.bookseller.model.idgenerator.model.TableOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITableOneRepository extends JpaRepository<TableOne, Long> {
}
