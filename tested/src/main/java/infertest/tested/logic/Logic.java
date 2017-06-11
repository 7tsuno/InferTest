package infertest.tested.logic;

import infertest.tested.bean.Bean;

public class Logic {

	private DAO dao;

	public void testCall() {

		Bean bean = new Bean();

		test1(bean, null);

		Bean bean2 = test2("str");

		bean2.getCode();

	}

	private Bean test2(String string) {

		return dao.getBeanOrNot("bbb");

	}

	public void test1(Bean bean, String str) {

	}

}
