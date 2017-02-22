
public abstract class Shell {
	String text;
	char type;
	Shell(String s, char c){
		text=s;
		type=c;
	}
	abstract void solve();
}
