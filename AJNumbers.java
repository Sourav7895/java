import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        StringBuilder str=new StringBuilder(input.nextLine());
        
        solve(str,n);

        input.close();
    }
	
   public static boolean isAJ(long num){ // 2
		if(num == 0 || num == 1){
			return false;
		}

		int [] vals = {2,3,5,7,11,13,17,19,23,29};


		// num
		for(int i = 0; i < vals.length; i++){
			if(num == vals[i]){
				return true;
			}


			long rem = num%vals[i];
			if(rem == (long)0){
				return false;
			}
		}

		return true;

	}

    public static boolean isAlreadyUsedIndex(boolean [] history, int st, int en){
		for(int i = st; i < en; i++){
			if(history[i] == true){
				return true;
			}
		}
		return false;
	}

	public static void markTrue(boolean [] history, int st, int en){
		for(int i = st; i < en; i++){
			history[i] = true;
		}
	}

    public static void solve(StringBuilder str,int n){
        
      int maxLen = str.length();
		int count = 0;
		boolean [] history = new boolean[str.length()];
		for(int len = 1; len <= maxLen; len++){
			for(int i = 0; i <= str.length() - len; i++){
				String sub = str.substring(i, i + len);
				long num = Long.parseLong(sub);
				boolean ajRes = isAJ(num); // true
				boolean indexUseRes = isAlreadyUsedIndex(history, i, i + len); //false
				if(ajRes == true && indexUseRes == false){
					count++;
					markTrue(history, i, i + len);
				}
			}
		}

		System.out.println(count);

    }
}
