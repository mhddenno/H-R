
public abstract class Shells {
	String text;
	char type;
	String solution;
	Shells(String s, char c, String so){
		text=s;
		type=c;
		solution=so;
	}
	abstract void solve();
}
