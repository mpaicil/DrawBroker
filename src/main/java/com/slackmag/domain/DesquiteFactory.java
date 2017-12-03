package com.slackmag.domain;

import com.slackmag.domain.almanaque.drawtype.Desquite;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DesquiteFactory {

    Integer validSize;

    public DesquiteFactory(@Value("desquite.validSize") Integer sizeNumber) {
        this.validSize = sizeNumber;
    }

    public Desquite createDesquite(Integer[] values) {
        if(sizeOfArrayIsCorrect(values)){
            return new Desquite(values);
        }
        return null;
    }

    public Boolean sizeOfArrayIsCorrect(Integer[] values) {
        return validSize.equals(values.length);
    }
}
