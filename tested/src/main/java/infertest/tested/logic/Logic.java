package infertest.tested.logic;

import infertest.tested.bean.Bean;

public class Logic {

	private DAO dao;

	public void test1() {

		Bean bean = dao.getBeanOrNot("bbb");

		if (bean != null) {

			dao.getBeanOrNot("bbb").getCode();

		} else {

			dao.getBeanOrNot("bbb").getCode();

		}

	}

}
