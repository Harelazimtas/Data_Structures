
//The "counting sort" sort integer number between [0,K].
public class CountingSort implements InterfaceSort {
	private int maxNumber;
	private int[] array;

	public CountingSort(int max, int[] array) {
		this.maxNumber = max;
		this.array = array;
	}

	// o(n)
	@Override
	public int[] sortInteger() {
		int[] count = new int[this.maxNumber + 1];
		int[] sortArray = new int[this.array.length];
		for (int i = 0; i < this.array.length; i++) {
			count[this.array[i]] = count[this.array[i]] + 1;
		}
		for (int i = 1; i < count.length; i++) {
			count[i] = count[i] + count[i - 1];
		}
		for (int i = 0; i < this.array.length; i++) {
			sortArray[count[this.array[i]] - 1] = this.array[i];
			count[this.array[i]]--;
		}
		return sortArray;
	}

	// Setter and getter
	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}

}
