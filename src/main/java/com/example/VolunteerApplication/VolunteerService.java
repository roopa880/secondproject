
package com.example.VolunteerApplication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class VolunteerService {
 @Autowired
 DataInitializer initializer;
 public VolunteerService() {
  super();
 }
 public List < String > findVolunteers(String servicename) {
  List < String > volnames = new ArrayList < String > ();
  List < Volunteer > vols = initializer.vols;
  for (Volunteer vol: vols) {
   System.out.println(vol.getServices() + ":" + vol.getFirstname());
   if (vol.getServices().contains(servicename)) {
    volnames.add(vol.getFirstname() + " " + vol.getLastname());
   }
  }
  return volnames;
 }
}