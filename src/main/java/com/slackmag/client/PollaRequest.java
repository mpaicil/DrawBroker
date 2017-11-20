package com.slackmag.client;

import java.time.LocalDate;

public class PollaRequest {

    public Integer gameId;
    public String start;
    public String end;
    public ExtraArgs extraArgs;

    public PollaRequest(Integer pageSize){
        gameId = 5271;
        start = LocalDate.now().toString();
        end = LocalDate.now().toString();
        extraArgs = new ExtraArgs(pageSize);
    }

}
