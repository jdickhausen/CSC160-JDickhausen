
public class Person implements Comparable <Person>{
	private int height;
	private int weight; 
	
	public Person(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(Person o) {
		return this.height - o.height;
	}
}
