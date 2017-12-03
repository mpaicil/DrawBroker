package com.slackmag.domain;

import com.slackmag.domain.almanaque.drawtype.Revancha;
import org.springframework.beans.factory.annotation.Value;

public class RevanchaFactory {

    private Integer validSize;

    public RevanchaFactory(@Value("revancha.validSize") Integer sizeNumber){
        this.validSize = sizeNumber;
    }

    public Revancha createRevancha(Integer[] values) {
        if(sizeOfArrayIsCorrect(values)){
            return new Revancha(values);
        }
        return null;
    }

    public Boolean sizeOfArrayIsCorrect(Integer[] values) {
        return validSize.equals( values.length );
    }
}
