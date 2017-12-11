package com.slackmag.domain;

import com.slackmag.domain.almanaque.drawtype.AhoraSi;
import org.springframework.beans.factory.annotation.Value;

public class AhoraSiFactory {

    private Integer validSize;

    public AhoraSiFactory(@Value("AhoraSi.validSize") Integer sizeNumber) {
        this.validSize = sizeNumber;
    }


    public boolean sizeOfArrayIsCorrect(Integer[] values) {
        return validSize.equals(values.length);
    }

    public AhoraSi createAhoraSi(Integer[] values) {
        if(sizeOfArrayIsCorrect(values)){
            return new AhoraSi(values);
        }
        return null;
    }
}
