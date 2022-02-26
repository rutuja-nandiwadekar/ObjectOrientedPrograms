package com.blz.stocks;

import java.util.ArrayList;
import java.util.Scanner;

class Stock {
	Scanner sc = new Scanner(System.in);
	// creation of arraylist for each user input
	ArrayList<String> stockName = new ArrayList<String>();
	ArrayList<Integer> numberOfShares = new ArrayList<Integer>();
	ArrayList<Integer> sharePrice = new ArrayList<Integer>();

	// method to add stock details
	public void addStocks() {
		System.out.print("Enter the stock name: ");
		stockName.add(sc.next());

		System.out.print("Enter number of shares: ");
		numberOfShares.add(sc.nextInt());

		System.out.print("Enter share price: ");
		sharePrice.add(sc.nextInt());
	}
}

class StockPortfolio extends Stock {
	// method to print stock report
	public void stockReport() {
		System.out.println("****************STOCK REPORT****************");
		for (int i = 0; i < stockName.size(); i++) {
			int total = (numberOfShares.get(i) * sharePrice.get(i));
			System.out.println("Stock name= " + stockName.get(i) + "\nValue of each share= " + sharePrice.get(i)
					+ "\nTotal value of share= " + total);
		}
	}
}
