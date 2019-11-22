@FunctionalInterface
interface Func1{
	int calc(int a,int b);
}

@FunctionalInterface
interface Func2{
	void sayHello();
}

public class ArrayTest {
	public static void main(String[] args) {
		Func1 sub = (int a,int b) -> a-b;
		Func1 add2 = (int a,int b) -> {return a+b;};
		Func2 hello = () -> System.out.println("Hello Lambda!");
		// or {System.out.println("Hello Lambda!"); }
		int result = sub.calc(3, 4) + add2.calc(5, 2);
		System.out.println("result = " + result);
		hello.sayHello();
	}
}
