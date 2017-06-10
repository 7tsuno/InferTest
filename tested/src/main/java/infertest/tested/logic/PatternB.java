package infertest.tested.logic;

import infertest.tested.bean.Bean;
import infertest.tested.bean.LombokedBean;

/**
 * pattern B. <br>
 * References to objects defined in JavaBeans.
 */
public class PatternB {

	/**
	 * B-1. <br>
	 * Reference to the property set by setter. <br>
	 * Target : Bean of my project(Not Lomboked)
	 */
	public void check1() {

		Bean bean = new Bean();
		bean.setCode("abc");
		bean.getCode().length();

	}

	/**
	 * B-2. <br>
	 * Reference to the property not set by setter. <br>
	 * Target : Bean of my project(Not Lomboked)
	 */
	public void check2() {

		Bean bean = new Bean();
		bean.getCode().length();

	}

	/**
	 * B-3. <br>
	 * Reference to the property set by setter. <br>
	 * Target : Bean of my project(Lomboked)
	 */
	public void check3() {

		LombokedBean bean = new LombokedBean();
		bean.setCode("abc");
		bean.getCode().length();

	}

	/**
	 * B-4. <br>
	 * Reference to the property not set by setter. <br>
	 * Target : Bean of my project(Lomboked)
	 */
	public void check4() {

		LombokedBean bean = new LombokedBean();
		bean.getCode().length();

	}

}
