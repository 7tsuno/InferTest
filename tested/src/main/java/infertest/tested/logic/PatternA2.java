package infertest.tested.logic;

import java.util.Arrays;
import java.util.List;

import infertest.other.bean.OtherBean;
import infertest.other.logic.OtherLogic;

/**
 * pattern A. <br>
 * Common null check pattern.
 */
public class PatternA2 {

	public void check1() {

		String str = null;
		str.length(); // NPE check1

	}

	public void check2() {

		String str = "abc";

		int a = 1;

		if (a == 1) {
			str = null;
		}

		str.length(); // NPE check2

	}

	public void check3() {

		String str = returnNull();
		str.length(); // NPE check3

	}

	private String returnNull() {
		return null;
	}

	public void check4() {

		String str = returnNull(1);
		str.length(); // NPE check4

	}

	private String returnNull(int a) {

		if (a == 1) {
			return null;
		}
		return "abc";
	}

	public void check5() {

		String str = OtherLogic.returnNullStatic();
		str.length(); // NPE check5

	}

	public void check6() {

		OtherLogic logic = new OtherLogic();
		String str = logic.returnNullInstance();
		str.length(); // NPE check6
	}

	public void check7() {

		OtherLogic logic = new OtherLogic();
		logic.setCheck(false);
		String str = logic.returnWithCheck();
		str.length(); // NPE check7
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

		returnLength(str);// NPE check10
	}

	private int returnLength(String str) {
		return str.length();
	}

	public void check11() {

		String str = null;
		OtherLogic logic = new OtherLogic();

		logic.returnLength(str);// NPE check11
	}

	public void check12() {

		String str = null;
		OtherLogic logic = new OtherLogic();
		logic.setCheck(true);

		logic.returnLengthWithCheck(str);
	}

	public void check13() {

		String str = null;
		OtherLogic logic = new OtherLogic();
		logic.setCheck(false);

		logic.returnLengthWithCheck(str); // NPE check13
	}

	public void check14(String str) {
		str.length();
	}

	public void check15(String str) {

		if (str == null) {
			str.length(); // NPE check15
		}

	}

	public void check16(String str) {

		if (str == null) {

		}

		str.length();

	}

	public void check17(OtherBean OtherBean) {

		OtherBean.getCode().length();

	}

	public void check18(OtherBean OtherBean) {

		if (OtherBean.getCode() == null) {

		}

		OtherBean.getCode().length();

	}

	private InterfaceLogic logicField;

	public void check19() {
		logicField.returnStr().length();
	}

	public void check20() {
		InterfaceLogic logic = new InterfaceLogicImpl();
		logic.returnStr().length(); // NPE check20
	}

	public void check21() {
		InterfaceLogicImpl logic = new InterfaceLogicImpl();
		logic.returnStr().length(); // NPE check21
	}

	private InterfaceLogicImpl logicField2;

	public void check22() {
		logicField2.returnStr().length(); // NPE check22
	}

	public void check23() {

		List<String> list = Arrays.asList(null, null);
		list.get(0).length(); // NPE check23
	}

	public void check24() {

		String a = null;

		a.length(); // NPE check24-1

		String b = null;

		b.length(); // NPE check24-2

	}

}
