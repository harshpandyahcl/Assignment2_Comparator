package com.hcl.movie;

class Movie 
{
   private double rating;
   private String name;
   private int year;
   
   

   public Movie(String nm, double rt, int yr)
   {
      this.name = nm;
      this.rating = rt;
      this.year = yr;
   }
 
   public double getRating() 
   { 
	   return rating;
   }
   public String getName() 
   { 
	   return name; 
   }
   public int getYear() 
   { 
	   return year; 
   }
   
 
}


