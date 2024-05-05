package arrays;

public class LowerToUpper {

	public static void main(String[] args) {
		String str = "amulya";
		System.out.println("Before conversion: "+str );
		char ch[]= str.toCharArray();
		int len = ch.length;
		for(int i=0;i<len;i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]=(char) (ch[i]-32);
			}
			str = new String(ch);
		}
		System.out.println("After conversion: "+str);
	}

}
