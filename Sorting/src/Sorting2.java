import java.util.Arrays;

public class Sorting2 {

	private static int[] tmb = { 12, 434, 65, 5, 2312, 1, 98, 5, 2, 52, 2, 3 };

	public static void main(String[] args) {
		print();
		Arrays.sort(tmb);
		print();

	}

	private static void print() {

		for (int item : tmb)
			System.out.print(item + " ");

		System.out.println();
	}

}
