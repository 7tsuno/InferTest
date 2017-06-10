package infertest.tested.bean;

public class Fuga {

	private String strs[] = new String[10];
	private int size = 0;

	public void add(String s) {

		strs[size] = s;
		size++;

	}

	public String get(int a) {

		return strs[a];

	}

}
