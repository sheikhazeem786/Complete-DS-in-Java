import java.util.*;
public class stringStart {

	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}

		str+=" World";
		System.out.println(str);
		System.out.println(10+20+"hello"+10+20);

		//Sub String
		System.out.println(str.substring(1, 3)); //el
		System.out.println(str.substring(1, 5)); //ello
		System.out.println(str.substring(0)); //hello World
		System.out.println(str.substring(3)); //lo World


	}

}
