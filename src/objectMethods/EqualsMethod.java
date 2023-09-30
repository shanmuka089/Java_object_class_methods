package objectMethods;
class A extends Object
{
	int i=10;
	int j=20;
	@Override
	public boolean equals(Object arg)
	{
		return this.i==((A)arg).i && this.j==((A)arg).j;
	}
}
public class EqualsMethod {
	public static void main(String[] args) {
		A a1= new A();
		A a2= new A();
		System.out.println(a1.equals(a2));
	}

}
