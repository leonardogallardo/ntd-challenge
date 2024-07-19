package cli_calculator;

import clojure.lang.AFunction;
import clojure.lang.IFn;
import clojure.lang.RT;
import clojure.lang.Var;

public final class core$parse_arg_double extends AFunction {
   public static final Var const__0 = RT.var("clojure.core", "println");

   public static Object invokeStatic(Object arg) {
      Double var1;
      try {
         Object var4 = null;
         var1 = Double.parseDouble((String)arg);
      } catch (Exception var3) {
         ((IFn)const__0.getRawRoot()).invoke("Invalid argument. Must be a numeric value.");
         System.exit(RT.intCast(1L));
         var1 = null;
      }

      return var1;
   }

   @Override
   public Object invoke(Object var1) {
      Object var2 = null;
      return invokeStatic(var1);
   }
}
