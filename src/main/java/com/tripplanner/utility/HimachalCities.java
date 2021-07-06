package com.tripplanner.utility;

import java.util.Arrays;

public class HimachalCities {
   private String []cities = {"Shimla","Dharamsala","Kangra","Solan","Mandi","Palampur","Baddi","Nahan","Paonta","Sundarnagar","Chamba",
   		 "Una","Kullu","Hamirpur","Bilaspur","Yol","Nalagarh","Nurpur","Kangra","Santokhgarh","Mehatpur Basdehra",
   		 "Shamshi","Parwanoo","Manali","Tira Sujanpur", "Ghumarwin","Dalhousie", "Rohru", "Nagrota Bagwan","Rampur","Kumarsain",
   		 "Jawalamukhi","Jogindernagar","Dera Gopipur","Sarkaghat","Jhakhri","Indora","Bhuntar","Nadaun",
   		 "Theog","Kasauli","Gagret","Chuari Khas","Daulatpur","Sabathu","Rajgarh","Arki","Dagshai","Seoni","Talai","Jutogh","Chaupal",
   		 "Rewalsar","Bakloh","Jubbal","Bhota","Banjar","Naina Devi","Kotkhai","Narkanda"};
   
   String[] getListOfCities() {
	   Arrays.sort(cities);
	   return cities;
   }
   
}
