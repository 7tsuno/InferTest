package infertest.tested.logic;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import infertest.tested.bean.Bean;

public class DAO implements DAOI {

	public Bean getBeanOrNot(String s) {
		return extracted();
	}

	private Bean extracted() {
		Random r = new Random();
		return r.nextInt(50) > 1 ? null : new Bean();
	}

	public Bean getBeanOrNot2(String s) {
		return randomReturn(new Bean(), s);
	}

	public <T> T randomReturn(T obj, Object... ojs) {
		Random r = new Random();
		Long collect = Stream.of(ojs).map(Object::hashCode).collect(Collectors.counting());
		return r.nextInt(50) > Optional.ofNullable(collect).orElse(Long.valueOf("10")).intValue() ? null : obj;
	}

}
