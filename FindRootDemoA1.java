import java.util.Scanner;

public class FindRootDemoA1 {
	
		public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double x,n;
		char ans,ch=8730;
		FindRootA1 z;
		
		do {
			
			System.out.print("***** FIND nth ROOT OF x (n");
			System.out.print(ch);
			System.out.println("x) *****");
			System.out.print("Enter x(>=0): ");
			x=s.nextDouble();
		
			if (x<0)
				System.out.println("Incorrect Value. x can't be negative. Please try again ....");
			else {
				System.out.print("Enter n(>0): ");
				n=s.nextDouble();
			
				if (n<=0)
					System.out.println("Incorrect Value. n must be greater than 0. Please try again ....");
				else {
					z=new FindRootA1(x,n);
					z.setRoot();
					z.showResult();
				}
			}
			
			System.out.print("\nDo you wish to retry (y/n): ");
			ans=s.next().toLowerCase().charAt(0);
			
		} while(ans=='y');
		s.close();
	}

}
