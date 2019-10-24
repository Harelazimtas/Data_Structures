
public class InsertionSort implements InterfaceSort {
	private int[] array;
	
	
	public InsertionSort(int[] array) {
		super();
		this.array = array;
	}


	@Override
	public int[] sortInteger() {
		int j,value;
		for(int i=1;i<this.array.length;i++) {
			value=this.array[i];
			j=i-1;
			while(j>=0 && this.array[j]>value) {
				this.array[j+1]=this.array[j];
				j=j-1;
			}
			array[j+1]=value;
		}
		return this.array;
	}


	public int[] getArray() {
		return array;
	}


	public void setArray(int[] array) {
		this.array = array;
	}
	
	
}
