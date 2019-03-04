/**
 * @author Anjali
 *Dec 13, 2018
 *
 */
package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie mv1 = new Movie();
		Movie mv2 = new Movie();
		
		mv1.setGenre("inpiring");
		mv1.setLeadActor("Aamir Khan");
		mv1.setTitle("Taare Zameen Par");
		
		mv2.setGenre("true story");
		mv2.setLeadActor("Aamir Khan");
		mv2.setTitle("Dangal");

		List<Movie> movieList = new ArrayList<>();
		
		movieList.add(mv1);
		movieList.add(mv2);
		System.out.println("Movie List: ");
		System.out.println(movieList);
		System.out.println("");
		System.out.println("Movie sorting on the basis of title: ");
		
		TitleCompare title = new TitleCompare();
		Collections.sort(movieList, title);
		System.out.println(movieList);
		
		GenreCompare genre = new GenreCompare();
		Collections.sort(movieList, genre);
		System.out.println("Movie sorting on the basis of genre: ");
		System.out.println(movieList);

	}

}


class Movie{
	String title;
	String genre;
	String leadActor;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DVDInfo [title=" + title + ", genre=" + genre + ", leadActor=" + leadActor + "]";
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @return the leadActor
	 */
	public String getLeadActor() {
		return leadActor;
	}

	/**
	 * @param leadActor the leadActor to set
	 */
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	
	
}

class TitleCompare implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.getTitle().compareTo(o2.getTitle());
	}
	
	
}

class GenreCompare implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.getGenre().compareTo(o2.getGenre());
	}
	
	
}
