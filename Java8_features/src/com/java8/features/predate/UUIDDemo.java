package com.java8.features.predate;
import java.util.UUID;

public class UUIDDemo {
   public static void main(String[] args) {
   // creating UUIDs      
   UUID u1 = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
   UUID u2 = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
   System.out.println(UUID.randomUUID());
        
   // comparing uuids
   System.out.println("Comparing two UUIDs: "+u1.compareTo(u2));   
   
   // creating UUID      
   UUID x = UUID.fromString("38400000-8cf0-11bd-b3e-10b96e4ef00d");
        
   // getting clock sequence value
   System.out.println("Clock sequence value: "+x.clockSequence());   
   }    
}