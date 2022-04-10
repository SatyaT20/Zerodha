
package test;

public class practice {
		
		public void addition () {
	 int a= 20;
	 int b=30;
	 int c= a+b;
	 
	System.out.println(c);
	}
		
	}	
	 class practice2 extends practice{
		
		public void addition() {
			int a= 60;
			int b=70;
				int c= a+b;
			System.out.println(c);
			
			
		}
	 }

		 class runner{
		public static void main(String[] args) {
			practice2 t= new practice2();
			t.addition();
		
		}	
			
		}


