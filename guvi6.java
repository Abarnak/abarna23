package aba;

import java.util.Scanner;

public class guvi6 {

	

	public static void main(String[] args){
		
	   
	   
		Scanner t=new Scanner(System.in);
		int n=t.nextInt();
		//for(int i=n;i<=n;i++){
			
		
		if(n==1){
			System.out.println("I");
		}
		else if(n==5){
			System.out.println("V");
		}
		else if(n==10){
			System.out.println("X");
		}else if(n==100){
			System.out.println("C");
		}else if(n==50){
			System.out.println("L");
		}else if(n==1000){
			System.out.println("D");
		}
	else{
	System.out.println("not roman");
	}
}
}
