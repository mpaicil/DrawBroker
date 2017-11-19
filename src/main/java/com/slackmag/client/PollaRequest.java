package com.slackmag.client;

public class PollaRequest {

    public Integer gameId;
    public String start;
    public String end;
    public ExtraArgs extraArgs;

    public PollaRequest(){
        gameId = 5271;
        start = "2017-11-10";
        end = "2017-11-10";
        extraArgs = new ExtraArgs();
    }

}
