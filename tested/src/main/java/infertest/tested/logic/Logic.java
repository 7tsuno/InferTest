package infertest.tested.logic;

import lombok.Data;

@Data
public class Logic {

	private boolean check;

	public static String returnNullStatic() {
		return null;
	}

	public String returnNullInstance() {
		return null;
	}

	public String returnWithCheck() {

		return check ? "abc" : null;

	}

	public void returnLength(String str) {
		str.length();
	}

	public int returnLengthWithCheck(String str) {

		return check ? 0 : str.length();
	}

}
