package stringmatchingalgorithm;

public class Longestpalindromicstring {
	// from o(n^3) to o(n^2) and further o(n) (using the manacher's algorithm).
	// This type of algorithm used to count the number of substring in the given string  and the length of longest substring.
	public static void main(String[] args) {
		String s="abbabbabbc";
		String ss="banana";
		System.out.println(fun2(ss));

	}
	static int fun1(String s) {
		int max=1;
		int n=s.length();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				String ss=s.substring(i,j+1);
				if(check(ss)) {
					max=Math.max(max, ss.length());
				}
			}
		}
		return max;
	}
	private static boolean check(String ss) {
		if(ss.length()==1) {
			return true;
		}
		else {
			int n=ss.length();
			if(n%2!=0) {
				int mid=n/2;
				int i=mid-1;
				int j=mid+1;
				while(i>=0 && j<n) {
					if(ss.charAt(i)!=ss.charAt(j)) {
						return false;
					}
					i--;
					j++;
				}
				return true;
			}
			else {
				int mid=n/2;
				int i=mid-1;
				int j=mid;
				while(i>=0 && j<n) {
					if(ss.charAt(i)!=ss.charAt(j)) {
						return false;
					}
					i--;
					j++;
				}
				return true;
			}


		}}
	static int fun2(String s) {
		int max1=1;
		int n=s.length();
		for(int i=0;i<n;i++) {
			int k=i-1;
			int j=i+1;
			while(k>=0&& j<n) {
				if(s.charAt(k)!=s.charAt(j)) {
					break;
				}
				max1=Math.max(max1,Math.abs(j-k)+1);
				k--;
				j++;
			}
		}
		for(int i=0;i<n-1;i++) {
			int k=i;
			int j=i+1;
			if(s.charAt(k)==s.charAt(j)) {
				while(k>=0 && j<n) {
					if(s.charAt(k)!=s.charAt(j)) {
						break;
					}
					max1=Math.max(max1,Math.abs(j-k)+1);
					k--;
					j++;
				}
			}

		}

		return max1;


	}

}
