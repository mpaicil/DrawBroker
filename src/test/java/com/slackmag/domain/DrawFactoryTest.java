package com.slackmag.domain;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DrawFactoryTest {


    private DrawFactory drawFactory;
    private static final Integer VALID_SIZE = 50;
    private static final String RESULT = "3,17,35,14,25,13,12,34,28,2,17,9,3,20,19,25,9,14,35,3,10,32,5,14,11,22,13,21,32,26,18,30,8,25,35,11,29,40,38,37,30,2,36,29,7,15,30,23,6,6";

    @Before
    public void setup() {
        drawFactory = new DrawFactory(VALID_SIZE);
    }

    @Test
    public void verifyTheCorrectSizeOfTheResults() {
        String[] splitResults = RESULT.split(",");
        assertThat(drawFactory.hasCorrectSize( splitResults.length ), is(true));
    }

    @Ignore
    @Test
    public void verifyTheCorrectExtractionOfTheLoto(){

    }

}
