package cli_calculator;

import clojure.lang.AFunction;
import clojure.lang.RT;
import clojure.lang.Tuple;

public final class core$result_round_float extends AFunction {
   public static Object invokeStatic(Object p__192) {
      Object var6 = null;
      Object op = RT.nth(p__192, RT.intCast(0L), null);
      Object a = RT.nth(p__192, RT.intCast(1L), null);
      Object b = RT.nth(p__192, RT.intCast(2L), null);
      Object var7 = null;
      Object n = RT.nth(p__192, RT.intCast(3L), null);
      Object var8 = null;
      Object var9 = null;
      Object var10 = null;
      Object var11 = null;
      return Tuple.create(op, a, b, RT.doubleCast(n));
   }

   @Override
   public Object invoke(Object var1) {
      Object var2 = null;
      return invokeStatic(var1);
   }
}
