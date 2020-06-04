package com.example.VolunteerApplication;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VolunteerController {
	 @RequestMapping("/")
	 public String home() {
	  return "Hello World from Volunteer application";
	 }
	 

@RequestMapping(value = "/volunteers/{servicename}", method = RequestMethod.GET)
public List < String > listVolunteers(@PathVariable("servicename") String servicename) {
 VolunteerService service = new VolunteerService();
 return service.findVolunteers(servicename);
}
}
