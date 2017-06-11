package infertest.tested.logic;

import java.util.Random;

import infertest.tested.bean.Bean;

public class Logic {

	private DAO dao;

	public void testCall() {

		Bean bean = new Bean();
		bean.setCode(gs());
		bean.setCode2(gs());

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

	private String gs() {
		Random r = new Random();
		return r.nextInt(50) > 1 ? null : "hoge";
	}
}
