
public class testSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 10, k = 6;
		// count sort
		int[] temp = new int[MAX];
		int[] array = new int[MAX];
		for (int i = 0; i < array.length; i++) {
			array[i] = i % k;
		}
		System.out.println("before sort:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		CountingSort sort = new CountingSort(k - 1, array);
		temp = sort.sortInteger();
		System.out.println("After sort:");
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

	}

}
