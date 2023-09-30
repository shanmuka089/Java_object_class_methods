package objectMethods;
public class ToStringMethod2 {

	public static void main(String[] args) {
		String s="java";
		String s1= new String("java1");
//		internally "println()" call to toString method of String class.
//		by default the toString method can be Overridden by toString method of String class.
//		so in Overridden method method call to method implementation depends on instance type.
//		in these case the instance type is string so the string class toString method is called.
//		in string class toString method by default contains implementation to print the String. 
		System.out.println(s);
		System.out.println(s1);
	}

}
