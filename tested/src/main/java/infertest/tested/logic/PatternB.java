package infertest.tested.logic;

import infertest.other.bean.OtherBean;
import infertest.other.bean.OtherLombokedBean;
import infertest.tested.bean.MyBean;
import infertest.tested.bean.MyLombokedBean;

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

		MyBean bean = new MyBean();
		bean.setCode("abc");
		bean.getCode().length();

	}

	/**
	 * B-2. <br>
	 * Reference to the property not set by setter. <br>
	 * Target : Bean of my project(Not Lomboked)
	 */
	public void check2() {

		MyBean bean = new MyBean();
		bean.getCode().length();

	}

	/**
	 * B-3. <br>
	 * Reference to the property set by setter. <br>
	 * Target : Bean of my project(Lomboked)
	 */
	public void check3() {

		MyLombokedBean bean = new MyLombokedBean();
		bean.setCode("abc");
		bean.getCode().length();

	}

	/**
	 * B-4. <br>
	 * Reference to the property not set by setter. <br>
	 * Target : Bean of my project(Lomboked)
	 */
	public void check4() {

		MyLombokedBean bean = new MyLombokedBean();
		bean.getCode().length();

	}

	/**
	 * B-5. <br>
	 * Reference to the property set by setter. <br>
	 * Target : Bean of Other project(Not Lomboked)
	 */
	public void check5() {

		OtherBean bean = new OtherBean();
		bean.setCode("abc");
		bean.getCode().length();

	}

	/**
	 * B-6. <br>
	 * Reference to the property not set by setter. <br>
	 * Target : Bean of Other project(Not Lomboked)
	 */
	public void check6() {

		OtherBean bean = new OtherBean();
		bean.getCode().length();

	}

	/**
	 * B-7. <br>
	 * Reference to the property set by setter. <br>
	 * Target : Bean of Other project(Lomboked)
	 */
	public void check7() {

		OtherLombokedBean bean = new OtherLombokedBean();
		bean.setCode("abc");
		bean.getCode().length();

	}

	/**
	 * B-8. <br>
	 * Reference to the property not set by setter. <br>
	 * Target : Bean of Other project(Lomboked)
	 */
	public void check8() {

		OtherLombokedBean bean = new OtherLombokedBean();
		bean.getCode().length();

	}

}
