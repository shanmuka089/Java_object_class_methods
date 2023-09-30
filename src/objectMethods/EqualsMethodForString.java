package objectMethods;
public class EqualsMethodForString {
	public static void main(String[] args){
//		string is non primitive type which creates object for every time when we declared.
//		string is a one class by default which has having some methods.
		String s1=new String("java");
		String s=new String("java");
		System.out.println(s1.equals(s));
		System.out.println(s1.hashCode());
		System.out.println(s.hashCode());
		
	}

}
