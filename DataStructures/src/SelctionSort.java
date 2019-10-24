
public class SelctionSort implements InterfaceSort {
	private int[] array;

	public SelctionSort(int[] array) {
		this.array = array;
	}
	
	@Override
	public int[] sortInteger() {
		int minIndex = 0,max;
		for (int j = 0; j < this.array.length-1; j++) {
			max = Integer.MAX_VALUE;
			minIndex=j;
			for (int i = j; i < this.array.length; i++) {
				if (max > array[i]) {
					max = array[i];
					minIndex = i;
				}
			}
			swap(minIndex,j);
		}

		return this.array;
	}

	private void swap(int i, int j) {
		int temp=this.array[j];
		this.array[j]=this.array[i];
		this.array[i]=temp;	
	}
	
	//getter and setter
	public void setArray(int[] array) {
		this.array = array;
	}

	public int[] getArray() {
		return array;
	}
	
	

	

}
