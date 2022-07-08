package Action;

public class Test {
	void test(int a, float f){
		System.out.println("test(int a, float f) method");
	}

	void test(float a, int b){
	System.out.println("test(float a, int b) method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Test t = new Test();
			t.test(10,25.5f);
			t.test(200.5f,30);
			

	}

}
