package interfaceStudy;

public class MyClass implements MyInterface
{

	public static void main(String[] args)
	{
		
		MyClass m=new MyClass();
		m.test();
		m.test1();

	}

	@Override
	public void test() {
	  System.out.println("test method completed in Implementation class");
		
	}

	@Override
	public void test1() {
		
		System.out.println("test1 method completed in Implementation class");
	}

	}


