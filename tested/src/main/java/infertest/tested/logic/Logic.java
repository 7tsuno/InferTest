package infertest.tested.logic;

public class Logic {

	public void test1() {

		DAO dao = new DAO();

		if (dao.getBeanOrNot() == null) {

			DAO dao2 = new DAO();
			dao2.getBeanOrNot().getCode();

		}

		DAO dao3 = new DAO();
		dao3.getBeanOrNot().getCode();

	}

}
