package infertest.tested.logic;

public class Logic {

	public void test1() {

		DAO dao = new DAO();

		if (dao.getBeanOrNot() != null) {
			DAO dao3 = new DAO();

			dao3.getBeanOrNot().getCode();
		}

	}

}
