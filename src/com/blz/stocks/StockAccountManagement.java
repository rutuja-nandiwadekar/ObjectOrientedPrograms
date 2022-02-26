/*
* Create Stock and Stock Portfolio Class holding the list of Stocks read from the input file. 
* Have functions in the Class to calculate the value of each
* stock and the value of total stocks.
*/
package com.blz.stocks;

import java.util.Scanner;

public class StockAccountManagement {

	public static void chooseOption() {
		Scanner sc = new Scanner(System.in);
		StockPortfolio stockPortfolio = new StockPortfolio();
		while (true) {
			System.out.println("1-Enter new stock \n2-Display Stock Report \n3-Exit");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				stockPortfolio.addStocks();
			}
				break;
			case 2: {
				stockPortfolio.stockReport();
			}
				break;
			case 3: {
				System.out.println("Exited the Program");
				System.exit(0);
			}
			default:
				System.out.println("Invalid Input");
				sc.close();
			}
		}
	}

	public static void main(String[] args) {
		// calling method
		chooseOption();
	}
}