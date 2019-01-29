package gC_Lab11;

import java.util.ArrayList;

public class Lab11_01 {

// two private fields, one for each String

	private String movieTitle;
	private String movieGenre;

// getter1

	public String getTitle() {
		return movieTitle;
	}

// setter 1

	public void setTitle(String movieTitle) {
		this.movieTitle = movieTitle;

	}

// getter2

	public String getGenre() {
		return movieGenre;
	}

// setter2

	public void setGenre(String movieGenre) {
		this.movieGenre = movieGenre;

	}
// constructor with no argument

	public Lab11_01() {

	}

// constructor with two arguments

	public Lab11_01(String movieTitle, String movieGenre) {

		this.movieGenre = movieGenre;
		this.movieTitle = movieTitle;
	}

	@Override
	public String toString() {
		return movieTitle + "\t" + "\t" + "\t" + "\t" + movieGenre;
	}

	public static void printHeader() {

		System.out.println("Welcome to Blockbuster.com");
		System.out.println("...we have very few movies left in stock. ");
		System.out.println("\n");
		System.out.println("=TITLE==================================GENRE=");

	}
}