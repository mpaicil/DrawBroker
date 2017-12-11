package com.slackmag.domain;

import com.slackmag.domain.almanaque.drawtype.AhoraSi;
import com.slackmag.domain.almanaque.drawtype.Desquite;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class AhoraSiFactoryTest {

    private AhoraSiFactory ahoraSiFactory;
    private static final Integer[] VALUES = {4, 6, 8, 12, 23, 41};
    private static final Integer VALID_SIZE = 6;

    @Before
    public void setup(){
        ahoraSiFactory = new AhoraSiFactory(VALID_SIZE);
    }

    @Test
    public void verifyTheCorrectSizeOfArrayNumbers(){
        assertTrue( ahoraSiFactory.sizeOfArrayIsCorrect(VALUES) );
    }

    @Test
    public void verifyTheSixthValue(){
        AhoraSi ahoraSi = ahoraSiFactory.createAhoraSi(VALUES);
        Integer testNumber = ahoraSi.getSixthNumber();
        assertThat(testNumber,is(41));
    }
}
