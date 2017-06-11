package infertest.tested.logic;

import infertest.tested.bean.Bean;

public class Logic {

	private DAO dao;

	public void testCall() {

		Bean bean = new Bean();

		test(bean);
		test2(bean);

	}

	private void test2(Bean bean) {
		bean.getCode().length();
		bean.getCode2().length();
	}

	private void test(Bean bean) {
		bean.getCode().length();
		bean.getCode2().length();
	}

}
