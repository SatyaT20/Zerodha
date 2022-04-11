package sample;

public class prameterisation {
	
	public void a(int a, int b) {
		int add=  a+ b;
		System.out.println(add);
		
	}
	public static void b(float a, int b) {
		float mult=a*b;
		System.out.println(mult);
		
	}
public static void main(String[] args) {
	b(50.2f,0);
	prameterisation x= new prameterisation();
	x.a(15,15);
}
}
