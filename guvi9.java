package aba;

import java.util.Scanner;

public class guvi9 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
   int y=t.nextInt();
   
   int f;
   while(y!=0){
	   f=y%10;
	    y=y/10;
	 
	  System.out.print(f); 
   }
	}

}
