package infertest.tested.logic;

public class Logic {

	private DAO dao;

	public void test1() {

		if (dao.getBeanOrNot("aaa") != null) {

			dao.getBeanOrNot("bbb").getCode();

		} else {

			dao.getBeanOrNot("bbb").getCode();

		}

	}

}
