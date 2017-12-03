package com.slackmag.domain;

import com.slackmag.domain.almanaque.drawtype.Loto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LotoFactory {

    Integer validSize;

    public LotoFactory(@Value("loto.validSize") Integer sizeNumber) {
        this.validSize = sizeNumber;
    }

    public Loto createLoto(Integer[] values){
        Integer[] numbers = Arrays.copyOfRange(values,0,5);
        Integer joker = values[6];

        return new Loto(numbers,joker);
    }

    public Boolean sizeOfArrayIsCorrect(Integer[] values) {
        return validSize.equals( values.length );
    }
}
