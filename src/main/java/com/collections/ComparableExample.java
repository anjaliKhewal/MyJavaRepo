/**
 * @author Anjali
 *Dec 13, 2018
 *
 */
package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DVDInfo dvd1 = new DVDInfo();
		DVDInfo dvd2 = new DVDInfo();
		
		dvd1.setGenre("inpiring");
		dvd1.setLeadActor("Aamir Khan");
		dvd1.setTitle("Taare Zameen Par");
		
		dvd2.setGenre("true story");
		dvd2.setLeadActor("Aamir Khan");
		dvd2.setTitle("Dangal");
		
		List<DVDInfo> movieList = new ArrayList<>();
		
		movieList.add(dvd1);
		movieList.add(dvd2);
		System.out.println("Movie List: ");
		System.out.println(movieList);
		System.out.println("");
		System.out.println("Sorted Movie List: ");
		Collections.sort(movieList);
		System.out.println(movieList);
	}

}

class DVDInfo implements Comparable<DVDInfo>{
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

	
	
	@Override
	public int compareTo(DVDInfo arg0) {
		// TODO Auto-generated method stub
		return title.compareTo(arg0.getTitle());
	}
	
	
}