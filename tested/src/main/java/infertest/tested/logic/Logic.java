package infertest.tested.logic;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import infertest.other.logic.OtherLogic;
import infertest.tested.bean.Bean;
import infertest.tested.bean.Bean2;
import infertest.tested.bean.MAO;

public class Logic {

    private OtherLogic2 other;

    private DAO dao;

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

        Bean bean = iLogic.find("abc");

        if (bean == null) {

            iLogic.find("abc").getCode();

        } else {

            iLogic.find("abc").getCode();
        }

    }

    public void test11() {

        List<String> list = Arrays.asList(null);
        list.get(0).length();

    }

    public void test12() {

        OtherLogic lo = new OtherLogic();
        lo.returnLength(null);
    }

    public void test13() {

        MAO mao = new MAO();
        mao.setBean(dao.getBeanOrNot("aaa"));
        a(mao);
        a(mao);
        a(mao);
        a(mao);
        a(mao);
        a(mao);

    }

    public static void main(String[] args) {
        new Logic().test14();
    }

    public void test14() {

        Bean bean = new Bean();
        bean.setCode(new Random().nextInt(50) > 1 ? null : new String("jge"));
        bean.setCode2(new Random().nextInt(50) > 1 ? null : new String("jge"));
        b(bean);
        b2(bean);

    }

    private void b(Bean bean) {
        bean.getCode().length();
    }

    private void b2(Bean bean) {
        bean.getCode2().length();
    }

    private void a(MAO mao) {
        mao.getBean().getCode();
    }
}
