package com.hcl.movie;
import java.util.*;
class Main
{
   public static void main(String[] args)
   {
      ArrayList<Movie> list = new ArrayList<Movie>();
      
      list.add(new Movie("Force Awakens", 8.3, 2015));
      list.add(new Movie("Star Wars", 8.7, 1977));
      list.add(new Movie("Empire Strikes Back", 8.8, 1980));
      list.add(new Movie("Return of the Jedi", 8.4, 1983));
   
      System.out.println("Sorted by Rating");
      Comparator c = Collections.reverseOrder(new RatingComparator());
      Collections.sort(list,c);
      for (Movie movie: list)
         System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
    
      
      System.out.println("\nSorted by Name");
      Collections.sort(list, new NameComparator());
      for (Movie movie: list)
         System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
      
      
      System.out.println("\nSorted by Year");
      
      Collections.sort(list, new YearComparator());
      for (Movie movie: list)
         System.out.println(movie.getYear() + " " + movie.getRating() + " " + movie.getName());
   }
}