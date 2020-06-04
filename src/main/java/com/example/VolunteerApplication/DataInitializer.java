package com.example.VolunteerApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class DataInitializer {
 public static List < Volunteer > vols = new ArrayList < Volunteer > ();
 public DataInitializer() {
  super();
  System.out.println("Initializing data...");
  initializeData();
 }
 public void initializeData() {
	 Set<String> h1 = new HashSet<String>();
	 h1.add("droptoschool");
	 Set<String> h2 = new HashSet<String>();
	 h1.add("donateblood");
  Volunteer vol1 = new Volunteer();
  Volunteer vol2 = new Volunteer();
  Volunteer vol3 = new Volunteer();
  vol1.setFirstname("Jason");
  vol1.setLastname("Brenner");
  vol1.setServices(h1);
 vol1.setServices(h2);
  //vol1.setService("droptoschool");
  //vol1.addService("donateblood");
  vol2.setFirstname("David");
  vol2.setLastname("Kelly");
  vol2.setServices(h1);
  vol1.setServices(h2);
  vol3.setFirstname("John");
  vol3.setLastname("Lebannon");
  vol1.setServices(h2);
  //vol3.addService("donateblood");
  vols.add(vol1);
  vols.add(vol2);
  vols.add(vol3);
  System.out.println("Number of Volunteers:" + vols.size());
 }
}