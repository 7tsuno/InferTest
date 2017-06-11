package infertest.tested.logic;

import infertest.tested.bean.Bean;

public class Logic {

	private DAO dao;

	public void testCall() {

		Bean bean = new Bean();

		bean.setCode("aaa");

		sss(bean);

	}

	private void sss(Bean bean) {

		if ("aaa".equals(bean.getCode())) {

		}

	}
}
