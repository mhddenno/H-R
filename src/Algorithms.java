
public abstract class Algorithms {
	String text;
	char type;
	String solution;
	Algorithms(String s, char c, String so){
		text=s;
		type=c;
		solution=so;
	}
	abstract void solve();
}
