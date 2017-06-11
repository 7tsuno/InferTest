package infertest.tested.logic;

import infertest.tested.bean.Bean;

public class Logic {

	private DAO dao;

	public void test1() {

		Bean bean = dao.getBeanOrNot();

		if (bean != null) {

			dao.getBeanOrNot().getCode();

		} else {

			dao.getBeanOrNot().getCode();

		}

	}

}
