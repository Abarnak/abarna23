package aba;

import java.util.Scanner;

public class guvi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner u=new Scanner(System.in);
n=u.nextInt();
int fact=1;
for (int i=1;i<=n;i++){
	fact=fact*i;
}
   System.out.println(fact);

	}

}
