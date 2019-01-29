package gC_Lab11;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab11_01B {

	public static void main(String[] args) {

		String userInput;
		String userContinue = "y";

		Lab11_01.printHeader();

		ArrayList<Lab11_01> movieList = new ArrayList<>();

		movieList.add(new Lab11_01("Goldeneye", "Drama"));
		movieList.add(new Lab11_01("Startrek III", "Scifi"));
		movieList.add(new Lab11_01("Castaway", "Scifi"));
		movieList.add(new Lab11_01("Love Actually", "Drama"));
		movieList.add(new Lab11_01("Cotton Candy", "Drama"));
		movieList.add(new Lab11_01("Das Boot", "Drama"));
		movieList.add(new Lab11_01("Cinderella", "Horror"));
		movieList.add(new Lab11_01("The Ring", "Horror"));
		movieList.add(new Lab11_01("Peter Pan", "Animated"));
		movieList.add(new Lab11_01("Candyland", "Animated"));
		movieList.add(new Lab11_01("Videodrome", "Scifi"));
		movieList.add(new Lab11_01("War Games", "Scifi"));
		movieList.add(new Lab11_01("Pirate Dad", "Animated"));

		for (Lab11_01 Lab11_01 : movieList)
			System.out.println(Lab11_01);
// give user the option to keep going forever because they might want to do that since this program is amzng

		do {
			Scanner scnr = new Scanner(System.in);
			System.out.println("\n");
			System.out.println("Enter DRAMA, SCIFI, HORROR or ANIMATED to filter by category.");
			userInput = scnr.next();

			while (!(userInput.equalsIgnoreCase("Scifi") || userInput.equalsIgnoreCase("Drama")
					|| userInput.equalsIgnoreCase("Horror") || userInput.equalsIgnoreCase("Animated"))) {

				System.err.println("Remember, we don't have many movies left.");
				System.err.println("Your choices are Drama, Scifi, Animated or Horror.");
				userInput = scnr.next();
			}

			if (userInput.equalsIgnoreCase("Drama")) {

				Lab11_01.printHeader();

				for (Lab11_01 movie : movieList) {

					if (movie.getGenre().equals("Drama")) {

						System.out.println(movie);

					}

				}
				System.out.println("\n");
				System.out.println("Do you want to Continue? (Y/N)");
				scnr.nextLine();
				userContinue = scnr.nextLine();

			}

			else if (userInput.equalsIgnoreCase("Scifi")) {
				Lab11_01.printHeader();

				for (Lab11_01 movie : movieList) {

					if (movie.getGenre().equals("Scifi")) {

						System.out.println(movie);

					}
				}
				System.out.println("\n");
				System.out.println("Do you want to Continue? (Y/N)");
				scnr.nextLine();
				userContinue = scnr.nextLine();

			} else if (userInput.equalsIgnoreCase("Horror")) {
				Lab11_01.printHeader();

				for (Lab11_01 movie : movieList) {

					if (movie.getGenre().equals("Horror")) {

						System.out.println(movie);

					}
				}

				System.out.println("\n");
				System.out.println("Do you want to Continue? (Y/N)");
				scnr.nextLine();
				userContinue = scnr.nextLine();

			} else if (userInput.equalsIgnoreCase("Animated")) {
				Lab11_01.printHeader();

				for (Lab11_01 movie : movieList) {

					if (movie.getGenre().equals("Animated")) {

						System.out.println(movie);

					}
				}

				System.out.println("\n");
				System.out.println("Do you want to Continue? (Y/N)");
				scnr.nextLine();
				userContinue = scnr.nextLine();

			}
		} while (userContinue.equals("y") == true);

		System.out.println("Goodbye! Remember to checkout your local Blockbuster store.");
		System.out.println("LAST UPDATED DECEMBER 2009");
	}
}
