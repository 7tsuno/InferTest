package infertest.tested.logic;

import java.util.Random;

import infertest.tested.bean.Bean;

public class DAO {

	private int i = 0;

	public Bean getBeanOrNot() {
		Random r = new Random();
		return r.nextInt(50) > 1 + i ? null : new Bean();
	}

	public Bean getBeanOrNot2() {
		return i == 3 ? null : new Bean();
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
