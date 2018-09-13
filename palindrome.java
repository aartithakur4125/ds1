import java.util.*;
public class palindrome {
public static int strpal(String str) {
	String reverse = "";
	
	
	for(int i = str.length() - 1; i >= 0; i--)
	{
		reverse = reverse + str.charAt(i);
	}
	if(str.equals(reverse)) {
		return 1;
	}
	else {
		return 0;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.nextLine();
int a=strpal(str);
System.out.println(a);

	}

}
