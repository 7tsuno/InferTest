package infertest.tested.logic;

import java.util.Random;

public class Util {

    public static String getStringNullable() {

        return new Random().nextInt(10) > 5 ? null : "hoge";

    }

}
