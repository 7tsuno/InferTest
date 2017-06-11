package infertest.tested.logic;

import infertest.tested.bean.Bean;

public class Logic {

	private DAO dao;

	public void testCall() {

		Bean bean = new Bean();

		test1(null);

	}

	private void test1(String str) {

		str.length();
	}

}
