package com.corejava;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputRead {
	
	public static void main(String[] args) throws IOException {
		
		//to take user input using System.in
		//We can go with multipe options:
		//1. BufferedReader using InputStreamReader(System.in)
		//2. Scanner class Scanner(System.in)
		//3. DataInputStream DataInputStream(System.in)
		
		
		System.out.println("Reading from user input: ");
		System.out.println("1. BufferedReader using InputStreamReader(System.in)");
		System.out.println("Enter something: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str);
		//br.close();
		
		System.out.println("Reading from user input: ");
		System.out.println("2. Scanner class Scanner(System.in)");
		System.out.println("Enter something: ");
		Scanner sc = new Scanner(System.in);
		//while(sc.hasNext()) {
		System.out.println(sc.next());
		//System.out.println(sc.hasNext());
		//}
		//sc.close();
		
		System.out.println("Reading from user input: ");
		System.out.println("3. DataInputStream DataInputStream(System.in)");
		DataInputStream ds = new DataInputStream(System.in);
		System.out.println("Enter something: ");
		String strInput = ds.readLine();
		System.out.println(strInput);
		System.out.println("However it has printed, but the DataInputSteam is deprecated now, encourage"
				+ " to use BufferedReader for input streams operations");
		
		br.close();
		sc.close();
		ds.close();

	}

}
