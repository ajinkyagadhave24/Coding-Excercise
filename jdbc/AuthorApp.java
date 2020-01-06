package jdbc;
import java.util.Scanner;
public class AuthorApp {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice = 0;
		AuthorQuery aa= new AuthorQuery();
		long phoneno;
		String fname,mname,lname,title;	
		float price;
		do
		{
		System.out.println(" ");
		System.out.println("Following 3 options :- ");
		System.out.println("1.Select the list of all book titles which are written by specific Author");
		System.out.println("2.Accept book and author details from user and insert into database");
		System.out.println("3.Update the price of books for which author name is entered by user");
		System.out.println("4.Exit");
		System.out.println("Enter your choice:  ");
		choice= sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Author fname to be searched: ");
			fname = sc.next();
			aa.select(fname);
			break;
		case 3:
			System.out.println("Enter Author fname and price: ");
			fname = sc.next();
			price= sc.nextFloat();
			aa.update(fname,price);
			break;
			
		}
		}while(choice!=4);
	}
}
