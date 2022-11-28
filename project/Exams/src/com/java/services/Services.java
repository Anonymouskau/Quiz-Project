package com.java.services;

import java.util.Scanner;

import com.java.exam.EXAM;
import com.java.exam.ExamQuesstions;
import com.java.exam.Examans;

public class Services {

	//	public EXAM e1=new EXAM();
	public ExamQuesstions e2=new ExamQuesstions(); 
	public Examans e3= new Examans();



	public void Menu() {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);

		System.out.println("===============Choice  Based Exam ===================");

		System.out.println("[][][]]][]][][][[][] Login  [][[][][][][][[]]]]]]]]]]]][]");

		System.out.println("\n Enter the ExamId :");

		String c=sc.nextLine();
		System.out.println("\n Enter the Examname:");
		String b=sc.nextLine();
		System.out.println("\n Enter the Prn:");

		int b1=sc.nextInt();	

		EXAM e1=new EXAM(c,b,b1);	


		System.out.println("1.Java"+"\n 2.Html");

		System.out.println("Enter the choice of cbt:");
		int ch=sc.nextInt();

		{switch(ch) {

		case 1:
			for (int i = 0; i < e2.getArr().length; i++) {

				try {
					System.out.println(e2.arr[i]);
					System.out.println(e3.arr1[i]);
					System.out.println("Enter the choice");
					int x=sc.nextInt();

					if(x==e3.ans[i]) {

						System.out.println("Correct Answer");


					}
					else {

						System.out.println("Wrong answer");
					}

				} catch (Exception e) {
					// TODO: handle exception

					System.out.println("Game over");
					break;


				}








			}

			break;













		case 2:






		
		


	
	
	

}
}	
}}
