package infertest.tested.logic;

import infertest.tested.bean.Bean;

public class Logic {

	private DAO dao;

	public void test1() {

		Bean bean = dao.findBeanOrNot();

		if (bean != null) {

			dao.findBeanOrNot().getCode();

		} else {

			dao.findBeanOrNot().getCode();

		}

	}

}
