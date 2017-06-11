package infertest.tested.logic;

import infertest.tested.bean.Bean;

public class Logic {

	private DAO dao;

	public void testCall() {

		Bean bean = new Bean();

		if (dao.getBeanOrNot("aaa") == null) {

			dao.getBeanOrNot("aaa").getCode();

		} else {

			dao.getBeanOrNot("aaa").getCode();
		}

	}

}
