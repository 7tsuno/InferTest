package infertest.tested.logic;

import java.util.Random;

public class OtherLogic2 {

    public int getLength(String str) {
        return str.length();
    }

    public void method(int i, String str) {

        if (i == 1) {
            str.length();
        }
    }

    public void method2(int i, String str) {

        if (new Random().nextInt(5) > i) {
            str.length();
        }
    }

}
