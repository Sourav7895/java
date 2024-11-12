import java.io.*;
import java.lang.*;
import java.util.*;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    String p = sc.nextLine();
    while (t > 0) {
      String s = sc.nextLine();
      System.out.println(countWords(s));
      t--;
    }
  }

  public static int countWords(String s) {
    //your code here
    int i = 0;
    int j = 0;
    int count = 0;

    while(j < s.length()){
      char ch = s.charAt(j);
      if(ch == ' '){
        i = j;
        i++;
        j++;
      }else if(i == j){
        count++;
        j++;
      }else{
        j++;
      }
    }
    return count;
    
  }
}
