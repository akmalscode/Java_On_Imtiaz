package com.thread.SaftyWithCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

	List<Product> soldProductsList = new CopyOnWriteArrayList<Product>(); // t
	List<Product> purchaseProductsList = new ArrayList<Product>();

	public void populateSoldProduct() {
		for (int i = 0; i < 1000; i++) {
			Product pord = new Product(i, "test_product_ " + i);
			soldProductsList.add(pord);
			System.out.println("Added... " + pord);

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void displayProductList() {
		for (Product product : soldProductsList) {
			System.out.println("sold...." + product);

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
