package condition;

public class TestIf {

	public static void main(String[] args) {

		System.out.println("====이프문====");

		int x = 0;

//		x 변수의 값이
//		양수이면, plus
//		음수면, minus

		if (x > 0) {
			System.out.println("plus");
		} else if (x == 0) {
			System.out.println("zero");
		} else {
			System.out.println("minus");
		}

	}

}
