package infertest.tested.logic;

import java.util.Random;

import infertest.tested.bean.Bean;

public class DAO {

	public Bean getBeanOrNot(String s) {

		Random r = new Random();
		return r.nextInt(50) > s.length() ? null : new Bean();
	}

}
