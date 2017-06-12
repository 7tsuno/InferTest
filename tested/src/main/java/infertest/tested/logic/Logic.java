package infertest.tested.logic;

import infertest.tested.bean.Bean;
import infertest.tested.bean.Bean2;

public class Logic {

    private OtherLogic2 other;

    public void test1() {
        Bean bean = new Bean();
        bean.getCode().length(); // NPE 1
    }

    public void test2() {
        Bean bean = new Bean();
        other1(bean);
    }

    public void other1(Bean bean) {
        bean.getCode().length(); // NPE 2
    }

    public void test3() {
        Bean2 bean = new Bean2();
        other2(bean);
    }

    public void other2(Bean2 bean) {
        bean.getCode().length(); // NPE 3
    }

    public void test4() {

        String str = null;
        other.getLength(str); // NPE 4
    }

    public void test5() {

        other.method(1, null); // NPE 5
    }

    public void test6() {

        other.method(2, null); // NO NPE
    }

    public void test7() {

        String str = null;
        other.getLength(str); // NPE 7-1

        other.method(1, null); // NPE 7-2
    }

    public static void main(String[] args) {
        new Logic().test8();
    }

    public void test8() {

        other.get("aaa").getCode(); // NPE 8-1
        other.get("bbb").getCode(); // NPE 8-2
    }

    public void test9() {

        other.get2("aaa").getCode(); // NPE 9-1
        other.get2("bbb").getCode(); // NPE 9-2
    }

    public void test9(Bean bean) {

        bean.getCode();
        bean.getCode().length();

    }

    private InterfaceLogic iLogic;

    public void test10() {

        iLogic.find("abc").getCode();

    }

}
