package cli_calculator;

import clojure.lang.AFunction;
import clojure.lang.RT;
import clojure.lang.Tuple;
import java.text.DecimalFormat;
import java.text.Format;

public final class core$result_final_format extends AFunction {
   public static Object invokeStatic(Object p__202) {
      Object var7 = null;
      Object op = RT.nth(p__202, RT.intCast(0L), null);
      Object a = RT.nth(p__202, RT.intCast(1L), null);
      Object b = RT.nth(p__202, RT.intCast(2L), null);
      Object var8 = null;
      Object n = RT.nth(p__202, RT.intCast(3L), null);
      Object G__206 = new DecimalFormat("#");
      ((DecimalFormat)G__206).setMaximumFractionDigits(RT.intCast(8L));
      ((DecimalFormat)G__206).setMinimumIntegerDigits(RT.intCast(1L));
      Object var13 = null;
      Object var9 = null;
      Object var10 = null;
      Object var11 = null;
      Object var15 = null;
      Format var19 = (Format)G__206;
      Object var12 = null;
      return Tuple.create(op, a, b, var19.format(n));
   }

   @Override
   public Object invoke(Object var1) {
      Object var2 = null;
      return invokeStatic(var1);
   }
}
