package com.java8.features.predate;
import java.util.EnumMap;

public class EnumMapDemo {

   // create an enum
   public enum Numbers {

   ONE, TWO, THREE, FOUR, FIVE
   };

   public static void main(String[] args) {
   EnumMap<Numbers, String> map =
   new EnumMap<Numbers, String>(Numbers.class);

   // associate values in map1
   map.put(Numbers.ONE, "1");
   map.put(Numbers.TWO, "2");
   map.put(Numbers.THREE, "3");
   map.put(Numbers.FOUR, "4");


   // print the map
   System.out.println(map);

   // get the value for Numbers.ONE
   String value = map.get(Numbers.ONE);

   // print the result
   System.out.println("Numbers.ONE value:" + value);
   System.out.println("Numbers.FIVE value:" + map.get(Numbers.FIVE));


   }
}