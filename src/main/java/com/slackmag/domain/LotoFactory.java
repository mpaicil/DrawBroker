package com.slackmag.domain;

import com.slackmag.domain.almanaque.drawtype.Loto;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public abstract class LotoFactory {

    public Loto createLoto(Integer[] values){
        Integer[] numbers = Arrays.copyOfRange(values,0,5);
        Integer joker = values[6];
        return new Loto(numbers,joker);
    }
}
