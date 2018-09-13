import java.util.*;
public class biggestcharacter {

	public static void main(String[] args) {
	
Scanner s=new Scanner(System.in);
System.out.println("enter a string");
String st=s.nextLine();
char max=st.charAt(0);
for(int i=0;i<st.length();i++) {
	if(st.charAt(i)>max) {
		max=st.charAt(i);
	}
}
System.out.println(max);
	}

}
