package com.slackmag.domain;

import com.slackmag.domain.almanaque.drawtype.Loto;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class LotoFactoryTest {

    private LotoFactory lotoFactory;
    private static final Integer[] VALUES = {4, 6, 8, 12, 23, 41, 33};
    private static final Integer VALID_SIZE = 7;

    @Before
    public void setup(){
        lotoFactory = new LotoFactory(VALID_SIZE);
    }

    @Test
    public void verifyTheCorrectSizeOfArrayNumbers(){
        assertTrue( lotoFactory.sizeOfArrayIsCorrect(VALUES) );
    }

    @Test
    public void getACorrectLotoFromAnArrayValues(){
        Loto loto = lotoFactory.createLoto(VALUES);
        assertNotNull(loto);
    }

    @Test
    public void verifyTheFouthValue(){
        Loto loto = lotoFactory.createLoto(VALUES);
        Integer testNumber = loto.getFourthNumber();
        assertThat(testNumber, is(12));
    }

    @Test
    public void verifyTheValueOfJoker(){
        Loto loto = lotoFactory.createLoto(VALUES);
        Integer testNumber = loto.getJokerNumber();
        assertThat(testNumber, is(33));
    }
}
