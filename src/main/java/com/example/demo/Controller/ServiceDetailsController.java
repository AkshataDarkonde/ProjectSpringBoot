package com.example.demo.Controller;

import com.example.demo.Bean.Servicedetails;
import com.example.demo.service.ServiceDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceDetailsController {
    @Autowired
    ServiceDetailsService serviceDetailsService;

    @GetMapping("/getallserviceDetails")
    List<Servicedetails> getAllServiceDetails()
    {
        System.out.println("From GetAllServiceDetails Method.");
        List<Servicedetails> serviceList= serviceDetailsService.getAllServiceDetails();
        return serviceList;
    }

    @GetMapping("/getServiceDetails/{ServiceId}")
    Servicedetails getServiceDetails(@PathVariable("ServiceId") int ServiceId)
    {
        System.out.println("From Get ServiceId Method.");
        return serviceDetailsService.getServiceDetails(ServiceId);
    }

    @PostMapping("/addServiceDetails")
    Servicedetails addServiceDetails(@RequestBody Servicedetails servicedetails)
    {
        System.out.println("From Add ServiceDetails Method.");
        return serviceDetailsService.addServiceDetails(servicedetails);
    }

    @PutMapping("/updateServiceDetails")
    Servicedetails updateServiceDetails(@RequestBody Servicedetails servicedetails)
    {
        System.out.println("From Update ServiceDetails Method.");
        return serviceDetailsService.updateServiceDetails(servicedetails);
    }

    @DeleteMapping("/deleteServiceDetails/{ServiceId}")
    void deleteServiceDetails(@PathVariable("ServiceId") int ServiceId)
    {
        System.out.println("From Delete ServiceDetails Method.");
         serviceDetailsService.deleteServiceDetails(ServiceId);
    }
}
