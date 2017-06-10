package infertest.tested.logic;

import java.util.Arrays;
import java.util.List;

import infertest.tested.bean.Bean;

/**
 * pattern A. <br>
 * Common null check pattern.
 */
public class PatternA {

	public void check1() {

		String str = null;
		str.length(); // NPE

	}

	public void check2() {

		String str = "abc";

		int a = 1;

		if (a == 1) {
			str = null;
		}

		str.length(); // NPE

	}

	public void check3() {

		String str = returnNull();
		str.length(); // NPE

	}

	private String returnNull() {
		return null;
	}

	public void check4() {

		String str = returnNull(1);
		str.length(); // NPE

	}

	private String returnNull(int a) {

		if (a == 1) {
			return null;
		}
		return "abc";
	}

	public void check5() {

		String str = OtherLogic.returnNullStatic();
		str.length(); // NPE

	}

	public void check6() {

		OtherLogic logic = new OtherLogic();
		String str = logic.returnNullInstance();
		str.length(); // NPE
	}

	public void check7() {

		OtherLogic logic = new OtherLogic();
		logic.setCheck(false);
		String str = logic.returnWithCheck();
		str.length(); // NPE
	}

	public void check8() {

		OtherLogic logic = new OtherLogic();
		logic.setCheck(true);
		String str = logic.returnWithCheck();
		str.length();
	}

	public void check9() {

		String str = "abc";

		int a = 1;

		if (a != 1) {
			str = null;
		}

		str.length();
	}

	public void check10() {

		String str = null;

		returnLength(str);// NPE
	}

	private int returnLength(String str) {
		return str.length();
	}

	public void check11() {

		String str = null;
		OtherLogic logic = new OtherLogic();

		logic.returnLength(str);// NPE
	}

	public void check12() {

		String str = null;
		OtherLogic logic = new OtherLogic();
		logic.setCheck(true);

		logic.returnLengthWithCheck(str); // NPE
	}

	public void check13() {

		String str = null;
		OtherLogic logic = new OtherLogic();
		logic.setCheck(false);

		logic.returnLengthWithCheck(str); // NPE
	}

	public void check14(String str) {
		str.length();
	}

	public void check15(String str) {

		if (str == null) {
			str.length(); // NPE
		}

	}

	public void check16(String str) {

		if (str == null) {

		}

		str.length();

	}

	public void check17(Bean bean) {

		if (bean.getCode() == null) {

		}

		bean.getCode().length();

	}

	private InterfaceLogic logicField;

	public void check18() {
		logicField.returnStr().length();
	}

	public void check19() {
		InterfaceLogic logic = new InterfaceLogicImpl();
		logic.returnStr().length(); // NPE
	}

	public void check20() {
		InterfaceLogicImpl logic = new InterfaceLogicImpl();
		logic.returnStr().length(); // NPE
	}

	private InterfaceLogicImpl logicField2;

	public void check21() {
		logicField2.returnStr().length(); // NPE
	}

	public void check22() {

		String str = logicField.returnStr();

		if (str == null) {

		}

		str.length();

	}

	public void check23() {

		List<String> list = Arrays.asList(null, null);
		list.get(0).length(); // NPE
	}

	public void check24() {

		String a = null;

		a.length();

		String b = null;

		b.length();

	}

}
