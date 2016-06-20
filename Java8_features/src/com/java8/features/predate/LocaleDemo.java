package com.java8.features.predate;
import java.util.Locale;

public class LocaleDemo {

   public static void main(String[] args) {

   // create a new locale
   Locale locale = new Locale("ENGLISH", "EP");

   // print this locale
   System.out.println("Locale1:" + locale);

   // print the country of this locale
   System.out.println("Country:" + locale.getCountry());

   }
}