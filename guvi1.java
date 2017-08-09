package aba;

import java.util.Scanner;

public class guvi1 {

	public static void main(String[] args) {
		int n;
		Scanner y=new Scanner(System.in);
		n=y.nextInt();
		if(n>0)
			{
			System.out.println("positve");
		}
		else if(n<0){
			System.out.println("negative");
		}
		else{
			System.out.println("zero");
		}

	}

}
