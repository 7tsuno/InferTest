package infertest.other.logic;

import infertest.other.bean.OtherBean;
import lombok.Data;

@Data
public class OtherLogic {

    private boolean check;

    public static String returnNullStatic() {
        return null;
    }

    public String returnNullInstance() {
        return null;
    }

    public String returnWithCheck() {

        return check ? "abc" : null;

    }

    public int returnLength(String str) {
        return str.length();
    }

    public int returnLengthWithCheck(String str) {

        return check ? 0 : str.length();
    }

    public void a() {

        OtherBean b = new OtherBean();
        b.setCode(null);
        b.getCode().length();

    }

}
