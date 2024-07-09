package com.example.consul_client.model;

import java.util.List;

public class ServicesInfo {
    private OrganizationInfo org;
    private List<String> services;

    public OrganizationInfo getOtg() {
        return org;
    }

    public void setOrg(OrganizationInfo org) {
        this.org = org;
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }
}
