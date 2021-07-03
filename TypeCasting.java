
public class TypeCasting {
public static void main(String[] args) {
	
//	Implicit conversion
	
	int i=100;
	long l=i;
	float f=i;
	double d=i;
	
	System.out.println("Implicit Type casting");
	System.out.println("Int Value    "+ i);
	System.out.println("Long Value   " + l);
	System.out.println("float Value  " + f);
	System.out.println("Double Value " + d);
	System.out.println("\n"); 
	//	Explicit conversion
	double x=100.04;
	long y=(long)x;
	int z=(int)y;

	System.out.println("Explicit Type casting");
	System.out.println("Double Value " + x);
	System.out.println("Long Value   " + y);
	System.out.println("Int Value    "+ z); 
}
}
