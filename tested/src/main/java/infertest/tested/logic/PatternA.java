package infertest.tested.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;

import infertest.tested.bean.Bean;
import infertest.tested.bean.Fuga;

/**
 * pattern A. <br>
 * Common null check pattern.
 */
public class PatternA {

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

		String str = Logic.returnNullStatic();
		str.length(); // NPE check5

	}

	public void check6() {

		Logic logic = new Logic();
		String str = logic.returnNullInstance();
		str.length(); // NPE check6
	}

	public void check7() {

		Logic logic = new Logic();
		logic.setCheck(false);
		String str = logic.returnWithCheck();
		str.length(); // NPE check7
	}

	public void check8() {

		Logic logic = new Logic();
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
		Logic logic = new Logic();

		logic.returnLength(str);// NPE check11
	}

	public void check12() {

		String str = null;
		Logic logic = new Logic();
		logic.setCheck(true);

		logic.returnLengthWithCheck(str);
	}

	public void check13() {

		String str = null;
		Logic logic = new Logic();
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

	public void check17(Bean bean) {

		bean.getCode().length();

	}

	public void check18(Bean bean) {

		if (bean.getCode() == null) {

		}

		bean.getCode().length();

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

		List<String> list = new ArrayList<>();
		list.add(null);
		list.get(0).length();

	}

	public void check24() {

		String a = null;

		a.length(); // NPE check24-1

		String b = null;

		b.length(); // NPE check24-2

	}

	public void check26() {

		String a = null;

		if (StringUtils.isBlank(a)) {
			a.length();
		}

	}

	public void check27() {

		String a = null;

		if (!StringUtils.isBlank(a)) {
			a.length();
		}

	}

	public void check28() {

		Fuga f = new Fuga();

		f.add("a");
		f.add(null);

		f.get(0).length();
		f.get(1).length();

	}

	public void check29() {

		Bean bean1 = getBeanOrNot();

		bean1.getCode(); //

		Bean bean2 = getBeanOrNot();

		bean2.getCode(); //
	}

	public static void main(String[] args) {

		new PatternA().check30();

	}

	public void check30() {

		Bean bean1 = getBeanOrNot();

		if (bean1 != null) {

			Bean bean2 = getBeanOrNot();

			bean2.getCode(); //

		}
	}

	private DAO dao;

	public void check31() {

		Bean bean1 = dao.getBeanOrNot();

		if (bean1 == null) {

			Bean bean2 = dao.getBeanOrNot();

			bean2.getCode(); //

		} else {

			Bean bean2 = dao.getBeanOrNot();

			bean2.getCode(); //

		}
	}

	public void check32() {

		String str = null;
		Logic logic = new Logic();
		logic.setCheck(true);

		logic.returnLengthWithCheck(str);

		String str2 = null;
		logic.setCheck(false);

		logic.returnLengthWithCheck(str2); // NPE check32
	}

	public void check33() {

		Logic logic = new Logic();
		logic.setCheck(true);
		String str = logic.returnWithCheck();
		str.length();

		if (str != null) {
		}

		logic.setCheck(false);
		String str2 = logic.returnWithCheck();
		str2.length(); // NPE check33

	}

	public Bean getBeanOrNot() {

		Random ran = new Random();

		return ran.nextInt(10) > 5 ? null : new Bean();
	}

	public void check34() {

		Bean bean = new Bean();
		bean.setCode("aaa");
		if (bean.getCode() != null) {

			Bean bean2 = new Bean();
			bean2.getCode().length();

		}

	}

	public void check35() {

		String str = null;
		a(str);
	}

	public void a(String s) {
		s.length();
	}
}
