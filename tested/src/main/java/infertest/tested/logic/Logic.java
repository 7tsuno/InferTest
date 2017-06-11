package infertest.tested.logic;

import infertest.tested.bean.Bean;
import infertest.tested.bean.MAO;

public class Logic {

	private DAO dao;

	public void testCall() {

		Bean bean = new Bean();
		test1(bean, null);

		Bean bean2 = test2("str");

		MAO mao = new MAO();

		mao.setBean(bean2);

		test3(mao);

	}

	private void test3(MAO mao) {
		mao.getBean().getCode();
	}

	private Bean test2(String string) {

		return dao.getBeanOrNot("bbb");

	}

	public void test1(Bean bean, String str) {
		bean.getCode().length();
	}

}
