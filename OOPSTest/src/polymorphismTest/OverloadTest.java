package polymorphismTest;

public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1, 1, "Addition of 2 number is: ");
		add(1,1);
	}

	public static void add(int i, int j) {
		// int i = 1;
		// int j = 1;
		int k = i + j;
		System.out.println(k);
	}

	public static void add(int i, int j, int z) {
		// int i = 1;
		// int j = 1;
		// int z = 1;
		int k = i + j + z;
		System.out.println(k);
	}

	public static void add(int i, int j, String m) {
		// int i = 1;
		// int j = 1;
		int k = i + j;
		System.out.println(m + k);
	}
}
