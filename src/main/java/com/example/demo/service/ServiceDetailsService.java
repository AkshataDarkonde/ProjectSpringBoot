package com.example.demo.service;

import com.example.demo.Bean.Servicedetails;
import com.example.demo.Repository.ServiceDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceDetailsService {
    @Autowired
    ServiceDetailsRepository serviceDetailsRepository;

    public List<Servicedetails> getAllServiceDetails(){
        List<Servicedetails> serviceList = new ArrayList<>();
        serviceDetailsRepository.findAll().forEach(x -> serviceList.add(x));
        return serviceList;
    }

    public Servicedetails getServiceDetails(int ServiceId)
    {
        List<Servicedetails> serviceList = new ArrayList<>();
        Servicedetails servicedetails=new Servicedetails();
        serviceDetailsRepository.findById(ServiceId).get();
        return serviceDetailsRepository.findById(ServiceId).get();
    }

    public Servicedetails addServiceDetails(Servicedetails servicedetails){
        Servicedetails s1 = serviceDetailsRepository.save(servicedetails);
        return s1;
    }

    public Servicedetails updateServiceDetails(Servicedetails servicedetails){
       Servicedetails s2= serviceDetailsRepository.save(servicedetails);
        return s2;
    }

    public void deleteServiceDetails(int serviceId)
    {
        serviceDetailsRepository.deleteById(serviceId);
    }
}
