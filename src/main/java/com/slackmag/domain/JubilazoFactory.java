package com.slackmag.domain;

import com.slackmag.domain.almanaque.drawtype.Desquite;
import com.slackmag.domain.almanaque.drawtype.Jubilazo;
import org.springframework.beans.factory.annotation.Value;

public class JubilazoFactory {

    private Integer validSize;

    public JubilazoFactory(@Value("jubilazo.validSize") Integer validSize) {
        this.validSize = validSize;
    }

    public Jubilazo createDesquite(Integer[] values) {
        if(sizeOfArrayIsCorrect(values)){
            return new Jubilazo(values);
        }
        return null;
    }

    public Boolean sizeOfArrayIsCorrect(Integer[] values) {
        return validSize.equals(values.length);
    }
}
