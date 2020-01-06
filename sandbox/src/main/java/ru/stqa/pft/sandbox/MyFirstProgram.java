package ru.stqa.pft.sandbox;

/* Name it "Hello.java"
 * Compile it by running "javac Hello.java"
 * Run it by typing "java Hello"
 */
class MyFirstProgram {
	public static void main(String args[]) {
		/*norok ("world");
		norok ("MAX");
		norok ("Vasia");
		matem("5");*/
		double l = 5;
		System.out.println("площ квдрата" + l + "=" + area(l));

		double a = 5;
		double b = a;
		System.out.println("площ прям.угл" + a + "и" + b + "=" + area(a, b));

	/*String some = "world";
  System.out.println("Hello, " + some + "!");
  int max = 5;
  int s = max * max;
  System.out.println("Площадь кв со сторн " + max + " = " + s);


	public static void norok (String some) {
		System.out.println("Hello," + some +"!");
	}

	public static void matem (String sis)	 {
		System.out.println(5 + sis);
	}
	 */
	}
	public  static double area(double lin) {
		return lin * lin ;
	}
	public  static double area(double a, double b  ) {
		return a* b;
	}
}


