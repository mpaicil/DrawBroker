package com.slackmag.domain;

import com.slackmag.domain.almanaque.drawtype.Loto;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class LotoFactoryTest {

    private LotoFactory lotoFactory;
    private static final Integer[] VALUES = {4, 6, 8, 12, 23, 41, 33};

    @Test
    public void getACorrectLotoFromAnArrayValues(){
        Loto loto = lotoFactory.createLoto(VALUES);
        assertNotNull(loto);
    }
}
