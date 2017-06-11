package infertest.tested.logic;

public class Logic {

	public static void main(String[] args) {
		new Logic().test1();
	}

	public void test1() {

		DAO dao = new DAO();
		dao.setI(2);

		DAO dao3 = new DAO();
		dao3.setI(3);
		dao3.getBeanOrNot2().getCode();

	}

}
