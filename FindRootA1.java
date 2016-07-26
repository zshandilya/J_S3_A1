
public class FindRootA1 {
	
	private double x;
	private double n;
	private double root;
	
	public FindRootA1(double a, double b) {
		
		x=a;
		n=b;
		root=0;
				
	}
	
	public void setRoot() {
		this.root = Math.pow(x, 1/n);
	}

	public void showResult() {
		char symb=8730;
		String result1="", result2="";
		int x1, n1, root1;
		
		if (n==(int)n) {
			n1=(int)n;
			result1=result1+Integer.toString(n1);
		}
		else
			result1=result1+Double.toString(n);
		
		if (x==(int)x) {
			x1=(int)x;
			result2=result2+Integer.toString(x1);
		}
		else
			result2=result2+Double.toString(x);
		
		result2=result2+" = ";
		
		if (root==(int)root) {
			root1=(int)root;
			result2=result2+Integer.toString(root1);
		}
		else
			result2=result2+Double.toString(root);
		
		System.out.print(result1);
		System.out.print(symb);
		System.out.println(result2);
		
	}

}
