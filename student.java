package peopleinhetirance;

public class student extends person{
	public String major = "";
	public student(String n, int y, String m){
		super(n, y);
		major = m;
	}
public String toString(){
	String a = name + " " + year + " " + major;
	return a;
	
}
}
