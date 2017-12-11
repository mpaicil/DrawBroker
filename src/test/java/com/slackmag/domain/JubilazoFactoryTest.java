package com.slackmag.domain;

import com.slackmag.domain.almanaque.drawtype.Desquite;
import com.slackmag.domain.almanaque.drawtype.Jubilazo;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class JubilazoFactoryTest {

    private JubilazoFactory jubilazoFactory;
    private static final Integer[] VALUES = {4, 6, 8, 12, 23, 41};
    private static final Integer VALID_SIZE = 6;

    @Before
    public void setup(){
        jubilazoFactory = new JubilazoFactory(VALID_SIZE);
    }

    @Test
    public void verifyTheCorrectSizeOfArrayNumbers(){
        assertTrue( jubilazoFactory.sizeOfArrayIsCorrect(VALUES) );
    }

    @Test
    public void verifyTheSixthValue(){
        Jubilazo jubilazo = jubilazoFactory.createDesquite(VALUES);
        Integer testNumber = jubilazo.getSixthNumber();
        assertThat(testNumber,is(41));
    }
}
