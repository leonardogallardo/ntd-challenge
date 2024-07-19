package cli_calculator;

import clojure.lang.AFunction;
import clojure.lang.Numbers;
import clojure.lang.RT;
import clojure.lang.Tuple;

public final class core$result_negative_zero extends AFunction {
   public static Object invokeStatic(Object p__197) {
      Object var6 = null;
      Object op = RT.nth(p__197, RT.intCast(0L), null);
      Object a = RT.nth(p__197, RT.intCast(1L), null);
      Object b = RT.nth(p__197, RT.intCast(2L), null);
      Object var7 = null;
      Object n = RT.nth(p__197, RT.intCast(3L), null);
      op = null;
      a = null;
      b = null;
      Object var15;
      if (Numbers.isZero(n)) {
         Object var11 = null;
         var15 = Numbers.abs(n);
      } else {
         var15 = n;
         n = null;
      }

      return Tuple.create(op, a, b, var15);
   }

   @Override
   public Object invoke(Object var1) {
      Object var2 = null;
      return invokeStatic(var1);
   }
}
