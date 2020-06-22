package math;

public class Trig {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Trig Methods
		
		System.out.println("Trig function");
		System.out.println(Math.toDegrees(Math.PI / 2)); // 90 degree
		System.out.println(Math.toRadians(30));  // return 0.5236 or (PI / 6)
		System.out.println(Math.sin(0)); // 0;
		System.out.println(Math.sin(Math.toRadians(270))); // return -1
		System.out.println(Math.sin(Math.PI / 6)); // return 0.5
		System.out.println(Math.sin(Math.PI / 2)); // return 1.0
		System.out.println(Math.cos(0)); // return 1.0 
		System.out.println(Math.cos(Math.PI / 6)); // return 0.866
		System.out.println(Math.cos(Math.PI / 2)); // 0
		System.out.println(Math.asin(0.5)); // return 0.523598333 (same as pi / 6)
		System.out.println(Math.acos(0.5));  // return 1.0472 (same as pi / 3)
		System.out.println(Math.atan(1.0));  // return 0.785398 (same as pi / 4)
		
	}

}
