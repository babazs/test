public class Swap {

	private static int[] tmb = { 12, 434, 65, 5, 2312, 1, 98, 5, 2, 52, 2, 3 };

	public static void main(String[] args) {

		int swap;
		print();

		swap = tmb[0];
		tmb[0] = tmb[tmb.length - 1];
		tmb[tmb.length - 1] = swap;

		print();
	}

	private static void print() {

		for (int item : tmb)
			System.out.print(item + " ");

		System.out.println();
	}
}
