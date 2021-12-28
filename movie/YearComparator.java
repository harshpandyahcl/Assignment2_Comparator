package com.hcl.movie;

import java.util.Comparator;

public class YearComparator  implements Comparator<Movie> {
	public int compare(Movie yr1, Movie yr2)
	   {
	      if (yr1.getYear() < yr2.getYear()) 
	      {
	    	  
	    	  return -1;
	      }
	      else if (yr1.getYear() > yr2.getYear()) 
	      {
	    	  return 1;
	      }
	      else 
	      {
	    	  return 0;
	      }
	   }
}
