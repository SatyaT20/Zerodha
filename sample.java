package operators;


public class sample {

	
	public static void m1() {
		//assignment operator
		int x=10;
		//arithmatic operator
		int a=x+5;    //addition
		int b=x-5;  //subtraction
		int c=x*5;   //multiplication
		int d=x/2;   //division
		int e=x%3;   //modules
		 
		System.out.println(a+"addition");
		System.out.println(b+"subtraction");
		System.out.println(c+"mult");
		System.out.println(d+"division");
		System.out.println(e+"module");
		
		//unary operators
		int v=+5;
		int w=-5;
		System.out.println(v);
		System.out.println(w);

		//pre increment= increment first then assign
		//post increment= assign then increment
		int y = 15;
	int	yy= ++y;
		//post increment
		int z=20;
		int zz= z++;
		System.out.println(yy);
		System.out.println(zz);
		
		
		//pre & post decrement
		
		int k=45;
		int l=--k; //pre dr
		int kk=40;
		int m=kk--;    //post decrment
		System.out.println(l);
		System.out.println(m);
		
		//relational operators
		System.out.println(x==y);
		System.out.println(x!=y);
	}
	public static void main(String[] args) {
		m1();
		
		
		
	}	
	
		
	}
