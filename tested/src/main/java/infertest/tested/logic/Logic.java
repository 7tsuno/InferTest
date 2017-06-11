package infertest.tested.logic;

public class Logic {

	public static void main(String[] args) {
		new Logic().test1();
	}

	public void test1() {

		DAO dao = new DAO();

		if (dao.getBeanOrNot("aaa") != null) {

			dao.getBeanOrNot("bbbbb").getCode().length();

		}

	}

}
