package A;

import java.util.Scanner;

public class reverr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String d=s.next();
String a=new StringBuffer(d).reverse().toString();
String f="";
for(int i=0;i<a.length();i++) {
	f=a.replaceAll("[aeiou]", "");
}
System.out.println(f);
	}

}
