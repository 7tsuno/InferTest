package infertest.tested.logic;

import javax.annotation.Nullable;

import infertest.tested.bean.Bean;

public interface InterfaceLogic {

    @Nullable
    Bean find(String str);

}
