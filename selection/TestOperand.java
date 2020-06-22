package selection;

public class TestOperand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int x = 2, y = 3, z = 6;
			System.out.println("(x < y && y < z) is " + (x < y && y < z)); 
			System.out.println("(x < y || y < z) is " + (x < y || y < z)); 
			System.out.println("!(x < y) is " + !(x < y)); 
			System.out.println("(x + y < z) is " + (x + y < z)); 
			System.out.println("(x + y > z) is " + (x + y > z));
		
	}

}
