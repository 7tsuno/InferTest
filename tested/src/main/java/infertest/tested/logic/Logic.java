package infertest.tested.logic;

import infertest.tested.bean.Bean;

public class Logic {

	private DAO dao;

	public void testCall() {

		Bean bean = new Bean();

		test1(bean, null);

	}

	public void test1(Bean bean, String str) {

		System.out.println(bean.getCode().length());
		
		str = null;
		
		str.length();
	}

}
