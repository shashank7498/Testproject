package stringmatchingalgorithm;

public class Basicmatchingalgo {

	public static void main(String[] args) {
	String s="ABABABCABABABCABABABC";
	String t="ABABAC";
	you w=fun(s,t);
	System.out.println(w.ans+" "+ w.index);

	
	}
	static you fun(String s, String p) {
		int n=s.length();
		int t=p.length();
		you y=new you();
		for(int i=0;i<=(n-t);i++) {
			y.ans=true;
			y.index=i;
				for(int j=0;j<t;j++) {
					if(s.charAt(i+j)!=p.charAt(j)) {
						y.ans=false;
						y.index=-1;
						break;
					}
				}
				if(y.ans==true) {
					return y;
				}
			}
		return y;
	}
}
class you{
	int index;
	boolean ans;
	you(){
		index=-1;
		ans=false;
	}
}