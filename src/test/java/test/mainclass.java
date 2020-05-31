package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.junit.Assert;

public class mainclass {
	public void test()
	{
		System.out.println("practicing");
	}
	
	
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		
		
		//wrapper class practice
		
		List<Integer> list=new ArrayList<Integer>();
		
		Integer in=new Integer(4);
		list.add(5);
		list.add(in);
		in=null;
		
		list.add(in);
		
		System.out.println(list);
		
		
//		ArrayList<Movie> list=new ArrayList<Movie>();
//		list.add(new Movie(4,"Dangal",2019));
//		list.add(new Movie(4.0,"Pagalpanti",2020));
//		list.add(new Movie(4.1,"Bombay Walvet",2020));
//		list.add(new Movie(4.2,"princeton",2021));
//		list.add(new Movie(4.3,"contagion",2020));
//		list.add(new Movie(4.4,"inception",2013));
//		
//		
//		Collections.sort(list);
//		
//		for(Movie movie:list)
//		{
//			
//			 System.out.println("Movies after sorting : ");
//			System.out.println(movie.getName() + " " + 
//                    movie.getRating() + " " + 
//                    movie.getYear());
//		}
		

		TreeSet<Character> ts=new TreeSet<Character>();
		
		ts.add('a');
		ts.add('p');
		ts.add('d');
		ts.add('c');
		ts.add('d');
		
		System.out.println(ts);
	
		Connection conn=null;
		
		try {
			conn=DriverManager.getConnection("DB URL", "user", "password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Class.forName("DB Driver name").newInstance();
		
		conn.setAutoCommit(false);
		
		Statement st=conn.createStatement();
		ResultSet rs=	st.executeQuery("SQl Query");
		
		
		
	}

	
}
