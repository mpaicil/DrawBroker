package com.slackmag.service;

import com.slackmag.client.PollaClient;
import com.slackmag.domain.polla.SorteoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SorteoService {

    @Autowired
    private PollaClient pollaClient;

    @RequestMapping(value = "/llamar")
    public SorteoDTO callPolla(){
        return pollaClient.fetch();
    }
}
