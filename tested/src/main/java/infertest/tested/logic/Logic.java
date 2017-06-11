package infertest.tested.logic;

import infertest.tested.bean.Bean;

public class Logic {

	private DAO dao;

	public void testCall() {

		Bean bean = new Bean();

		test1(bean);

	}

	public void test1(Bean bean) {

		bean.getCode().length();

		bean.getCode2().length();

	}

}
