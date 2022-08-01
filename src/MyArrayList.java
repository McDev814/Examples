
public class MyArrayList {
	
	private int size; // number of slots in the current array list
	private int currentLastIndex; // index of the last slot that holds a value
	private int[] backing; // array that holds the current values
	
	public MyArrayList() {
		this.size = 10;
		this.currentLastIndex = 0;
		this.backing = new int[size];
	}
	
	public void addElement(int data) {
		if ((this.size - 1) == this.currentLastIndex) {
			this.resize();
		}
		this.backing[this.currentLastIndex] = data;
		this.currentLastIndex++;
	}
	
	private void resize() {
		int[] temp = new int[(int) (this.size * 1.5)];
		for (int i : this.backing) {
			temp[i] = this.backing[i];
		}
		this.backing = temp;
		size *= (int) 1.5;
	}
	
	public int getElementAtIndex(int index) {
		return this.backing[index];
	}
	
	public int[] getAllElements() {
		int[] temp = new int[this.size];
		for (int i = 0; i < this.currentLastIndex; i++) {
			temp[i] = this.backing[i];
		}
		return temp;
	}
	
	public int getLength() {
		return this.currentLastIndex;
	}
}
