package Day_2;

public class prg1 {

	public String n="Person Name";
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	public static void main(String[] args) {
		
		prg1 obj=new Day_2.prg1();
		prg1 obj1=new Day_2.prg1();
		prg1 obj2=obj;
		obj.setN("XYZ");
		System.out.println(obj.n);
		System.out.println(obj1.n);
		System.out.println(obj2+"\n"+obj);
	}
}
