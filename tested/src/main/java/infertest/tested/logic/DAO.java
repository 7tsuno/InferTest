package infertest.tested.logic;

import infertest.tested.bean.Bean;

public class DAO {

	public static boolean a;

	public Bean getBeanOrNot() {

		return a ? null : new Bean();
	}

}
