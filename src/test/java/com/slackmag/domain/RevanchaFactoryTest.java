package com.slackmag.domain;

import com.slackmag.domain.almanaque.drawtype.Revancha;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class RevanchaFactoryTest {

    private RevanchaFactory revanchaFactory;
    private static final Integer[] VALUES = {4, 6, 8, 12, 23, 41};
    private static final Integer VALID_SIZE = 6;

    @Before
    public void setup(){
        revanchaFactory = new RevanchaFactory(VALID_SIZE);
    }

    @Test
    public void verifyTheCorrectSizeOfArrayNumbers(){
        assertTrue( revanchaFactory.sizeOfArrayIsCorrect(VALUES) );
    }

    @Test
    public void verifyTheSecondValue(){
        Revancha revancha = revanchaFactory.createRevancha(VALUES);
        Integer testNumber = revancha.getSecondNumber();
        assertThat(testNumber,is(6));
    }
}