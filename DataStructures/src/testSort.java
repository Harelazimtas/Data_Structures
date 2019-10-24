
public class testSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 10, k = 6;
		// count sort
		int[] temp = new int[MAX];
		int[] array = new int[MAX];
		int[] unsort=new int[MAX];
		for (int i = 0; i < array.length; i++) {
			array[i] = i % k;
			unsort[i]=i % k;
		}
		beforeSort(array);
		InterfaceSort sort = new CountingSort(k - 1, array);
		temp = sort.sortInteger();
		AfterSort(temp);
		/*Selection Sort */
		System.out.println();
		System.out.println("\nselection sort");
		beforeSort(array);
		sort=new SelctionSort(array);
		temp=sort.sortInteger();
		AfterSort(temp);
		/*Insertion Sort*/
		System.out.println();
		System.out.println("\nInsertion sort");
		beforeSort(unsort);
		sort=new InsertionSort(unsort);
		temp=sort.sortInteger();
		AfterSort(temp);
	}
	private static void AfterSort(int[] temp) {
		System.out.println();
		System.out.println("After sort:");
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		
	}
	private static void beforeSort(int[] array) {
		System.out.println("before sort:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

}
