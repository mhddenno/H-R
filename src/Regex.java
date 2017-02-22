
public abstract class Regex {
	String text;
	char type;
	Regex(String s, char c){
		text=s;
		type=c;
	}
	abstract void solve();
}
