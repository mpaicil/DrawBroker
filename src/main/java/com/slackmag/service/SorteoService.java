package com.slackmag.service;

import com.slackmag.client.PollaClient;
import com.slackmag.domain.polla.SorteoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SorteoService {

    @Autowired
    private PollaClient pollaClient;

    @RequestMapping(value = "/pagesize/{value}")
    public SorteoDTO callPolla(@PathVariable(value = "value") Integer pageSize) {
        pollaClient.setPageSize(pageSize);
        return pollaClient.fetch();
    }

    @RequestMapping(value = "/")
    public SorteoDTO callPolla() {
        pollaClient.setPageSize(10);
        return pollaClient.fetch();
    }
}
