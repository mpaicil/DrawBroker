package com.slackmag.domain;

import com.slackmag.domain.almanaque.drawtype.Desquite;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class DesquiteFactoryTest {

    private DesquiteFactory desquiteFactory;
    private static final Integer[] VALUES = {4, 6, 8, 12, 23, 41};
    private static final Integer VALID_SIZE = 6;

    @Before
    public void setup(){
        desquiteFactory = new DesquiteFactory(VALID_SIZE);
    }

    @Test
    public void verifyTheCorrectSizeOfArrayNumbers(){
        assertTrue( desquiteFactory.sizeOfArrayIsCorrect(VALUES) );
    }

    @Test
    public void verifyTheSixthValue(){
        Desquite desquite = desquiteFactory.createDesquite(VALUES);
        Integer testNumber = desquite.getSixthNumber();
        assertThat(testNumber,is(41));
    }

}