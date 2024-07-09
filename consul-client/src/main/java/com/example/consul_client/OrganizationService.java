package com.example.consul_client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.consul_client.model.OrganizationInfo;

@Service
public class OrganizationService {
    private final static Logger log = LoggerFactory.getLogger(OrganizationService.class);
    private final RestTemplate restTemplate;
    private final String serviceUrl;

    public OrganizationService(RestTemplate restTemplate, @Value("${app.consul.client.org.url}") String serviceUrl) {
        this.restTemplate = restTemplate;
        this.serviceUrl = serviceUrl;
    }

    public OrganizationInfo getOrganization() {
        try {
            return restTemplate.getForObject(serviceUrl, OrganizationInfo.class);
        } catch (Exception e) {
            log.error("Can't get organization info.", e);
            return null;
        }
    }
}
