package com.arraylist.shopping.debugger;
import java.util.*;
public class AddToCart {
	
	private ArrayList<String> shoppingCart = new ArrayList<>();
	
	public void addToCart(String product) {
		shoppingCart.add(product);
	}
	
	public void displayCart() {
		System.out.println("Total items added to cart: " + shoppingCart.size());
		for(int i = 0; i<shoppingCart.size(); i++) {
			System.out.println(i + 1 + " " + shoppingCart.get(i));
		}
	}
		public void modifyShoppingCart(String currentProduct, String newProduct) {
			int position = findProduct(currentProduct);
			if(position >= 0) {
				modifyShoppingCart(position, newProduct);
			}
		}
		private void modifyShoppingCart(int position, String newProduct) {
				shoppingCart.set(position, newProduct);
				System.out.println("Product " + (position + 1) + " has been modified");
		}
		public void removeProduct(String product) {
			int position = findProduct(product);
			if(position >= 0) {
				removeProduct(position);
			}
		}
		private void removeProduct(int position) {
			shoppingCart.remove(position);
		}
		private int findProduct(String searchProduct) {
			return shoppingCart.indexOf(searchProduct);
		}
		public boolean onCart(String searchProduct) {
			int position = findProduct(searchProduct);
			if(position >= 0) {
			return true;
		}
		return false;
	}
}