package com.GL.Denominations.Lab2;

public class NotesCount {
	//notes=5,1,10
		//descending order 10,5,1
		//amount=of money to be paid= 12
		//notes  12/10 10:1
		//amount=12-10*1   1:2
		
		
		public void notesCount(int notes[],int amount) {
			int noteCounter[]=new int[notes.length];
			
			try {
				for(int i=0;i<notes.length;i++) {
					if(amount>=notes[i]) {
						noteCounter[i]=amount/notes[i];
						amount=amount-noteCounter[i]*notes[i];
					 }
				 }  
				
				if (amount>0) {
					System.out.println("Exact amount can not be given with the highest denomination");
				}else {
					System.out.println("Your payment approach inorder to give minimum  no of notes will be");
					for(int i=0;i<notes.length;i++) {
						if(noteCounter[i]!=0) {
							System.out.println(notes[i]+":"+noteCounter[i]);
						}
					}
				}
				
			}catch(ArithmeticException e) {
				System.out.println(e+"notes of denomination 0 is invalid");
			}
		}
		
	}

