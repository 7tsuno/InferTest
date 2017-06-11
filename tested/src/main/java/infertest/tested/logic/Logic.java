package infertest.tested.logic;

import infertest.tested.bean.Bean;

public class Logic {

	public void test1() {

		DAO dao = new DAO();

		if (dao.getBeanOrNot() != null) {

			Bean bean = new Bean();
			bean.getCode().length();

			DAO dao3 = new DAO();
			dao3.getBeanOrNot().getCode();
		}

	}

}
