package infertest.tested.logic;

public class Logic {

	public void test1() {

		DAO dao = new DAO();
		dao.setI(2);

		if (dao.getBeanOrNot() != null) {

			DAO dao3 = new DAO();
			dao.setI(3);
			dao3.getBeanOrNot().getCode();
		}

	}

}
