package interfaceStudy;

public class Demo implements MyInterface2
{

	public static void main(String[] args) 
	{

		Demo d=new Demo();
		d.test();
		d.test1();
		d.test2();
		d.test3();

	}

	@Override
	public void test() {
		System.out.println("test");
	}

	@Override
	public void test1() {
		
		System.out.println("test1");
	}

	@Override
	public void test2() {
		System.out.println("test2");
	}

	@Override
	public void test3() {
		System.out.println("test3");
		
	}

	}


