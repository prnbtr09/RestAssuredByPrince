package test;

public class Movie implements Comparable<Movie>,Cloneable{
	double rating;
	String name;
	int year;
	
	
	
	public Movie(double rating, String name, int year)
	{
		this.rating=rating;
		this.name=name;
		this.year=year;
	}
	
	
	
	
    // Getter methods for accessing private data 
    public double getRating() { return rating; } 
    public String getName()   {  return name; } 
    public int getYear()      {  return year;  } 
	
    
    
    //implementation of compareTo method of comparable
	public int compareTo(Movie m) {
		return (this.year-m.year);
	}
	
	

	
	
	
	
	
	
	
	
	


	

}
