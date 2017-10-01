package A;

import java.util.Scanner;

public class stt {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
String e=s.next();
for(char j1='a' ;j1<='z';j1++) {
	if(e.contains(Character.toString(j1))) {
	System.out.print(j1);	
		}}
}
}