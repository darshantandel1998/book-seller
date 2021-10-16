package com.darshantandel.bookseller;

import com.darshantandel.bookseller.model.idgenerator.model.DefaultOne;
import com.darshantandel.bookseller.model.idgenerator.model.IdentityOne;
import com.darshantandel.bookseller.model.idgenerator.model.SequenceOne;
import com.darshantandel.bookseller.model.idgenerator.model.TableOne;
import com.darshantandel.bookseller.model.idgenerator.repository.IDefaultOneRepository;
import com.darshantandel.bookseller.model.idgenerator.repository.IIdentityOneRepository;
import com.darshantandel.bookseller.model.idgenerator.repository.ISequenceOneRepository;
import com.darshantandel.bookseller.model.idgenerator.repository.ITableOneRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IdGeneratorTest {

    @Autowired
    private IDefaultOneRepository defaultOneRepository;

    @Autowired
    private IIdentityOneRepository identityOneRepository;

    @Autowired
    private ISequenceOneRepository sequenceOneRepository;

    @Autowired
    private ITableOneRepository tableOneRepository;

    @Test
    public void saveAutoTest() {
        DefaultOne defaultOne = new DefaultOne();
        defaultOne.setName("Test");
        defaultOneRepository.save(defaultOne);
    }

    @Test
    public void saveIdentityTest() {
        IdentityOne identityOne = new IdentityOne();
        identityOne.setName("Test");
        identityOneRepository.save(identityOne);
    }

    @Test
    public void saveSequenceTest() {
        SequenceOne sequenceOne = new SequenceOne();
        sequenceOne.setName("Test");
        sequenceOneRepository.save(sequenceOne);
    }

    @Test
    public void saveTableTest() {
        TableOne tableOne = new TableOne();
        tableOne.setName("Test");
        tableOneRepository.save(tableOne);
    }
}
