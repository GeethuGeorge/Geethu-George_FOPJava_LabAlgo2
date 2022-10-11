package com.GL.Denominations.Lab2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MergeSortImplementation mergeSortImplementation=new MergeSortImplementation();
		NotesCount notesCount=new  NotesCount();
		
		
		//size of the currency denominations
		System.out.println("Enter the size of currency denominations");
		int size= sc.nextInt();
		
		//currency denominations value
		int []notes=new int[size];
		System.out.println("Enter the currency denominations value");
		for (int i=0;i<notes.length; i++) {
			notes[i]=sc.nextInt();
		}
		
		//amount to pay
		System.out.println("Enter the amount you want to pay");
		int amount=sc.nextInt();
		
		//merge sort to sort the denomination value in descending order
		mergeSortImplementation.sort(notes, 0, notes.length-1);
		notesCount.notesCount(notes, amount);
	}

}
