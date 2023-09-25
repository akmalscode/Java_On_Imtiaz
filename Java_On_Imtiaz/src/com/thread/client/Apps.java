package com.thread.client;

import com.thread.SaftyWithCollections.InventoryManager;

public class Apps {

	public static void main(String[] args) throws InterruptedException {
		InventoryManager manager = new InventoryManager();

		Thread inventoryTask = new Thread(new Runnable() {

			@Override
			public void run() {
				manager.populateSoldProduct();

			}
		});

		Thread displayTask = new Thread(new Runnable() {

			@Override
			public void run() {
				manager.displayProductList();

			}
		});
		inventoryTask.start();
		Thread.sleep(5000);// inventoryTask.join(); this is for one after another thread but not
							// multithread
		displayTask.start();
	}

}
