package infertest.tested.logic;

import java.util.Random;

import infertest.tested.bean.Bean;

public class DAO {

	public static boolean a;

	public Bean getBeanOrNot() {
		Random r = new Random();
		return r.nextInt(50) > 1 ? null : new Bean();
	}

}
