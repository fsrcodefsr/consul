package com.example.consul_client.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consul_client.OrganizationService;
import com.example.consul_client.model.OrganizationInfo;
import com.example.consul_client.model.ServicesInfo;

@RestController
@RequestMapping("/services")
public class ServicesController {
    private OrganizationService service;

    public ServicesController(OrganizationService service) {
        this.service = service;
    }

    @GetMapping("/list")
    public ResponseEntity<ServicesInfo> getServicesList() {
        OrganizationInfo organizationInfo = service.getOrganization();
        if (organizationInfo == null) {
            return ResponseEntity.internalServerError().build();
        } else {
            List<String> services = new LinkedList<>();
            services.add("Настройка серверов");
            services.add("Обслуживание серверов");
            services.add("Прокладка кабеля");
            services.add("Администрирование сетевого оборудования");

            ServicesInfo info = new ServicesInfo();
            info.setOrg(organizationInfo);
            info.setServices(services);
            return ResponseEntity.ok(info);
        }
    }
}