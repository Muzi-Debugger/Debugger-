package com.arraylist.shopping.debugger;
import java.util.*;

public class Product_Main {
	private static Scanner sc = new Scanner(System.in);
	private static AddToCart shoppingCart = new AddToCart();
	public static void main(String[] args) {
		boolean loggedOut = false;
		int productChoice = 0;
		
		mainMenu();
		while (!loggedOut) {
			System.out.println("Add items to your cart: ");
			productChoice = sc.nextInt();
			sc.nextLine();
			
			switch(productChoice) {
			case 0:
				mainMenu();
				break;
				
			case 1:
				shoppingCart.displayCart();
				break;
			case 2:
				addProduct();
				break;
				
			case 3:
				modifyCart();
				break;
				
			case 4:
				removeProduct();
				break;
				
			case 5:
				searchForProduct();
				break;
			case 6:
				loggedOut = true;
			}
		}
	}
			
			public static void mainMenu() {
				System.out.println("\nPress ");
				System.out.println("\t 0 - For menu options, ");
				System.out.println("\t 1 - For a list of products added to your cart, ");
				System.out.println("\t 2 - To add a product to your cart, ");
				System.out.println("\t 3 - To modify your cart, ");
				System.out.println("\t 4 - To remove a product from your cart, ");
				System.out.println("\t 5 - To search for a product on your cart, ");
				System.out.println("\t 6 - Return to main menu");
			}
			public static void addProduct() {
				System.out.println("Please enter a product: ");
				shoppingCart.addToCart(sc.nextLine());
			}
			public static void modifyCart() {
				System.out.println("Enter product name: ");
				String productKey = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter replacement product: ");
				String newProduct = sc.nextLine();
				shoppingCart.modifyShoppingCart(productKey, newProduct);
			}
			public static void removeProduct() {
				System.out.println("Enter product name: ");
				String productName = sc.nextLine();
				shoppingCart.removeProduct(productName);
			}
			public static void searchForProduct() {
				System.out.println("Can't find what you're looking for? Enter the product name to search: ");
				String searchProduct = sc.nextLine();
				if(shoppingCart.onCart(searchProduct)) {
					System.out.println(searchProduct + " has been found on your cart");
				} else {
					System.out.println("We couldn't find "+ searchProduct + " on your cart");
				}
			}
        }