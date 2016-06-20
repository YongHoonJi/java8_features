package com.java8.features.predate;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.PropertyResourceBundle;

public class PropertyResourceBundleDemo {
   public static void main(String[] args) {
   // Prepare content for simulating property files
   String fileContent = 
   "# Integer value 1\n" +
   "s1=1\n" +
   "# String value PropertyResourceBundleDemo\n" +
   "s2=PropertyResourceBundleDemo\n" +
   "# Date value Fri Jan 31 00:00:00 IST 3913\n" +
   "s3=Fri Jan 31 00:00:00 IST 3913";
   InputStream propStream = new StringBufferInputStream(fileContent);
      
   try {
   // Create property resource bundle
   PropertyResourceBundle bundle = 
   new PropertyResourceBundle(propStream);
         
   // Get resources
   Object res1 = bundle.handleGetObject("s1");
   Object res2 = bundle.handleGetObject("s2");
   Object res3 = bundle.handleGetObject("s3");
         
   // Print resource contents
   System.out.println("[Resource1] "+res1);
   System.out.println("[Resource2] "+res2);
   System.out.println("[Resource3] "+res3);
   } catch (IOException e) {
   e.printStackTrace();
   }
   }
}