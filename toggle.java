public class togglestring {
public static String toggle(String str1) {
String tog="";
for(int i=0;i<str1.length();i++) {
	char c=str1.charAt(i);
	if(Character.isUpperCase(str1.charAt(i))) {
		c=Character.toLowerCase(c);
		tog=tog+c;
	}
	else if(Character.isLowerCase(str1.charAt(i))) {
		c=Character.toUpperCase(c);
		tog=tog+c;
		
	}
}
return tog;
}
	public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String str1=sc.nextLine();
System.out.println(toggle(str1));
	}

}
