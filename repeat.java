package A;

import java.util.Arrays;
import java.util.Scanner;

public class repeat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String f=s.next();
		int a[]=new int[100];
		int count=0;int ll=0;
		for(int i=0;i<f.length();i++) {
			int c=0;
		count=0;
	
			for(int k=0;k<i;k++) {
				if(f.charAt(i)==f.charAt(k)) {
					c=c+1;
			}
			}
				if(c==0) {
		for(int j=0;j<f.length();j++) {
				if(f.charAt(i)==f.charAt(j)) {
					count++;
				}
			}
	a[ll]=count;
	ll++;
				}
		}Arrays.sort(a);
		System.out.println(a[99]);

	}
}

