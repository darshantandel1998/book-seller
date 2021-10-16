package com.darshantandel.bookseller.model.idgenerator.repository;

import com.darshantandel.bookseller.model.idgenerator.model.SequenceOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISequenceOneRepository extends JpaRepository<SequenceOne, Long> {
}
