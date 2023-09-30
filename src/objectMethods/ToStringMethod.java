package objectMethods;
class Ab
{
	int i=10;
	int j=20;
	@Override
	public String toString()
	{
		return "i="+i+" j="+j;
	}
}
public class ToStringMethod {
	public static void main(String[] args){
		Ab a1=new Ab();
//		println method calls internally toString which gives class name @ hash code.
//		so we want to print values of inside object then we want to over ride in instance class.
//		at runtime instance type method can be executed while overriding.
		System.out.println(a1);
	}
}
