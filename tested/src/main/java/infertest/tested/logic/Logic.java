package infertest.tested.logic;

import infertest.tested.bean.Bean;

public class Logic {

	private DAO dao;

	public static void main(String[] args) {
		new Logic().testCall();
	}

	public void testCall() {

		Bean bean = new Bean();
		bean.getCode().length();

		test1(bean);

	}

	private void test1(Bean bean) {

		bean.getCode().length();

		bean.getCode2().length();

	}

}
