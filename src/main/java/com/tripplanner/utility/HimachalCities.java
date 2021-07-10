package com.tripplanner.utility;

import java.util.Arrays;

public class HimachalCities {
   private String []cities = {"Shimla","Dharamsala","Kangra","Solan","Mandi","Palampur","Baddi","Nahan","Paonta","Sundarnagar","Chamba",
   		 "Kullu","Santokhgarh","Mehatpur","Shamshi","Parwanoo","Manali","Tira Sujanpur", "Ghumarwin","Dalhousie", "Rohru",
   		 "Nagrota Bagwan","Kumarsain","Jawalamukhi","Jogindernagar","Dera Gopipur","Indora","Bhuntar","Nadaun","Theog","Kasauli",
   		 "Chuari Khas","Sabathu","Dagshai","Talai","Jutogh","Chaupal","Bakloh","Jubbal","Banjar","Naina Devi","Kotkhai","Narkanda"};
   
   public String[] getListOfCities() {
	   Arrays.sort(cities);
	   return cities;
   }
   
}
