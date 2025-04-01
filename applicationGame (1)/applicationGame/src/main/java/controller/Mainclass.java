package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import applicationGame.dao.HibernetLogic;
import applicationGame.dao.RandomNumberGenerator;
import applicationGame.dto.player1;

public class Mainclass {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		HibernetLogic logic=new HibernetLogic();
		player1 p=new player1();
		boolean flag=true;
		while (flag) {
			
			
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("1.Play the Game\n2.Fetch Object\n3.Delete Object\n4.update Object name\n5.Exit\nEnter the valid option......");
		switch (scanner.nextInt()) {
		case 1:{
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter Name");
		p.setName(sc3.nextLine());
		System.out.println("Enter Age");
		int age=sc.nextInt();
		if (age<18) {
			System.out.println("ur not allow to play the game");
			break;
		}
		else {
		p.setAge(age);
		}
		System.out.println("Enter Mail Id");
		p.setEmail(sc.next());
		System.out.println("Enter Password");
		p.setPassword(sc.next());
	    System.out.println("Enter image path");
		Scanner sc2=new Scanner(System.in);
		FileInputStream stream = new FileInputStream(sc2.nextLine());
		byte[] arr = new byte[stream.available()];
		stream.read(arr);
		p.setImage(arr);
		System.out.println("Enter Phone number");
		p.setPhnumber(sc.nextLong());
		
		System.out.println("Enter the amount to Deposit");
		double depositedAmount= sc.nextDouble();
		p.setDepositeAmount(depositedAmount);
		System.out.println("All the best");
		RandomNumberGenerator generator=new RandomNumberGenerator();
		int[] randomNumbers=generator.generator();
		System.out.println(Arrays.toString(randomNumbers));
		
		double amountPerMatch = depositedAmount/3;
		double totalEarnedAmount=0;
		double profit=0;
		for(int i=0;i<=2;i++) {
			System.out.println("Guess the Number");
			int no=sc.nextInt();
			if(no==randomNumbers[i]) {
				profit = profit+amountPerMatch;
			}
			else {
				depositedAmount = depositedAmount-amountPerMatch;
				System.out.println("OOPS!! wrong guess");
			}
		}
		totalEarnedAmount = profit+depositedAmount;
		p.setProfit(profit);
		p.setTotalearnedAmount(totalEarnedAmount);
		logic.addObject(p);	
		}	break;
		case 2: {
			System.out.println("Enter email to fetch the details");
			logic.fetchObject(sc.next());
		}
			break;
		case 3: {
			System.out.println("Enter email to delete the object");
			logic.deleteObject(sc.next());
		}
			break;
		case 4: {
			System.out.println("Enter email ");
			String email = sc.next();
			System.out.println("Enter new Name");
			Scanner sc2 = new Scanner(System.in);
			String newName = sc2.nextLine();
			logic.updateObject(email, newName);
		}
			break;
		case 5: {
			System.out.println("Thank you");
			flag = false;
		}
			break;
		default: {
			System.out.println("Invalid option");
		}
		}

		
	}
		}
	}

