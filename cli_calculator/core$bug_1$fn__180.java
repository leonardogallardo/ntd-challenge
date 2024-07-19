package cli_calculator;

import clojure.lang.AFunction;
import clojure.lang.RT;
import clojure.lang.Reflector;

public final class core$bug_1$fn__180 extends AFunction {
   @Override
   public Object invoke(Object p1__175_SHARP_) {
      Class var10000 = RT.classForName("java.lang.Character");
      Object[] var10002 = new Object[1];
      Object var2 = null;
      var10002[0] = p1__175_SHARP_;
      return Reflector.invokeStaticMethod(var10000, "getNumericValue", var10002);
   }
}
