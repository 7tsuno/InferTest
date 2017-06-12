package infertest.tested.logic;

import java.util.Random;

import infertest.tested.bean.Bean;

public class OtherLogic2 {

    public int getLength(String str) {
        return str.length();
    }

    public void method(int i, String str) {

        if (i == 1) {
            str.length();
        }
    }

    public Bean get(String str) {

        if (new Random().nextInt(5) > 1) {
            return null;
        }
        return new Bean();
    }

}
