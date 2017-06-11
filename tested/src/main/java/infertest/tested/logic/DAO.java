package infertest.tested.logic;

import java.util.Random;

import infertest.tested.bean.Bean;

public class DAO implements DAOI {

	public Bean getBeanOrNot(String s) {

		Random r = new Random();
		return r.nextInt(50) > s.length() ? null : new Bean();
	}
	public Bean findBeanOrNot() {

		Random r = new Random();
		return r.nextInt(50) > "bbb".length() ? null : new Bean();
	}

}
