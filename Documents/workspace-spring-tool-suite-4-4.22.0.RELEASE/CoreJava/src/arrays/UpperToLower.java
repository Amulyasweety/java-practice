package arrays;

public class UpperToLower {
public static void main(String[] args) {
	String str = "SHIVA";
	System.out.println("Before conversion: "+str);
	char ch[]= str.toCharArray();
	for(int i=0;i< ch.length;i++) {
		if(ch[i]>='A'&& ch[i]<='Z') {
			ch[i]= (char) (ch[i]+32);
		}
		 str = new String(ch);
	}
	System.out.println("After conversion:  "+str);
}
}
