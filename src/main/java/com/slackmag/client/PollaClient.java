package com.slackmag.client;

import com.slackmag.domain.polla.SorteoDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PollaClient {

    private PollaRequest pollaRequest;

    public void setPageSize( Integer number ){
        pollaRequest = new PollaRequest(number);
    }

    public SorteoDTO fetch(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type","application/json; charset=utf-8");

        //pollaRequest = new PollaRequest(3);

        HttpEntity<PollaRequest> pollaRequestHttpEntity = new HttpEntity<PollaRequest>(pollaRequest,headers);

        ResponseEntity<SorteoDTO> dtoResponseEntity = restTemplate.exchange("https://www.polla.cl/es/get/draw/by/time", HttpMethod.POST,pollaRequestHttpEntity,SorteoDTO.class);
        return dtoResponseEntity.getBody();
    }
}
