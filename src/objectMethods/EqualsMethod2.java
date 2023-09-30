package objectMethods;
class Engine
{
	int cc;
	Engine(int cc)
	{
		this.cc=cc;
	}
	@Override
	public boolean equals(Object arg)
	{
//		the argument object type which can be automatically upcasted.
//		by using super class type we can't access sub class data member so we do down casting.
		return this.cc==((Engine)arg).cc;
	}
}
class Car
{
	int price;
	Engine e;
	
	Car(int price,Engine e)
	{
		this.e=e;
		this.price=price;
	}
	@Override
	public boolean equals(Object arg)
	{
//		'equals()' is  used to compare two objects(non primitive types).
//		'==' operator is used to compare object references are primitive types.
		return this.price==((Car)arg).price && e.equals(((Car)arg).e);
	}
}
public class EqualsMethod2 {
	public static void main(String[] args) {
		Car c1=new Car(100000,new Engine(1200));
		Car c2=new Car(100000,new Engine(1200));
		System.out.println(c1.equals(c2));

	}

}
