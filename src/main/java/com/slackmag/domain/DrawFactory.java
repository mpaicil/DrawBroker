package com.slackmag.domain;

import com.slackmag.domain.almanaque.Draw;
import com.slackmag.domain.almanaque.drawtype.Loto;
import com.slackmag.domain.polla.SorteoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

@Slf4j
public class DrawFactory {

    private Integer validSize;

    public DrawFactory(@Value("draw.results.validSize") Integer resultSize){
        this.validSize = resultSize;
    }

    public Draw createDraw(SorteoDTO sorteo) {
        return null;
    }

    public Boolean hasCorrectSize(Integer incomingResultsSize) {
        return incomingResultsSize.equals(validSize);
    }

    public Loto retrieveLoto() {
        return null;//LotoFactory.createLoto();
    }

    public Integer[] extractLotoNumbers() {
        return new Integer[0];
    }
}
