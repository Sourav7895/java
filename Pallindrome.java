import java.io.*;
import java.util.*;

public class Main {

	static String removeUnwantedCharacters(String str){
		String ans = "";

		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z'){
				ans += ch;
			}else if(ch >= 'A' && ch <= 'Z'){
				ans += ch;
			}
		}

		return ans.toLowerCase();

	}

	static int isPalindrome(String str)
      {
             
		str = removeUnwantedCharacters(str);

		int i = 0;
		int j = str.length() - 1;

		while( i < j){
			char chi = str.charAt(i);
			char chj = str.charAt(j);

			if(chi != chj){
				return 0;
			}
			i++;
			j--;

		}


		return 1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int result = isPalindrome(str);
        System.out.println(result);        
    }
}
