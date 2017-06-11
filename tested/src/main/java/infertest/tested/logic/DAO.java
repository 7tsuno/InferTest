package infertest.tested.logic;

import java.util.Random;

import infertest.tested.bean.Bean;

public class DAO implements DAOI {

	public Bean getBeanOrNot(String s) {

		Random r = new Random();
		return r.nextInt(50) > s.length() ? null : new Bean();
	}

	public Bean getBeanOrNot() {

		Random r = new Random();
		return r.nextInt(50) > "bbb".length() ? null : new Bean();
	}

	public void eee(Bean bean) {
		bob(bean.getCode());
	}

	private void bob(String code) {
		code.length();
	}

}
