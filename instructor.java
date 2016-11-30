package peopleinhetirance;

public class instructor extends person{
	private int salary;
	public instructor(String n, int y,int i){
		super(n, y);
		salary = i;
	}
	
	public String toString(){
		String a = name + " " + year + " " + salary;
		return a;
		
	}
}
