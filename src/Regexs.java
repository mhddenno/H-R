
public abstract class Regexs {
	String text;
	char type;
	String solution;
	Regexs(String s, char c, String so){
		text=s;
		type=c;
		solution=so;
	}
	abstract void solve();
}
