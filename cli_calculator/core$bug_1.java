package cli_calculator;

import clojure.lang.AFunction;
import clojure.lang.IFn;
import clojure.lang.Numbers;
import clojure.lang.RT;
import clojure.lang.Tuple;
import clojure.lang.Util;
import clojure.lang.Var;

public final class core$bug_1 extends AFunction {
   public static final Var const__5 = RT.var("clojure.core", "filter");
   public static final Var const__6 = RT.var("clojure.core", "pos-int?");
   public static final Var const__7 = RT.var("clojure.core", "map");
   public static final Var const__8 = RT.var("clojure.core", "str");
   public static final Var const__10 = RT.var("clojure.core", "reduce");
   public static final Var const__11 = RT.var("clojure.core", "+");
   public static final Object const__13 = 42L;
   public static final Var const__14 = RT.var("clojure.core", "rand-int");

   public static Object invokeStatic(Object p__176) {
      Object var8 = null;
      Object op = RT.nth(p__176, RT.intCast(0L), null);
      Object a = RT.nth(p__176, RT.intCast(1L), null);
      Object b = RT.nth(p__176, RT.intCast(2L), null);
      Object var9 = null;
      Object n = RT.nth(p__176, RT.intCast(3L), null);
      Object digits = ((IFn)const__5.getRawRoot())
         .invoke(const__6.getRawRoot(), ((IFn)const__7.getRawRoot()).invoke(new core$bug_1$fn__180(), ((IFn)const__8.getRawRoot()).invoke(Numbers.abs(n))));
      IFn var18 = (IFn)const__10.getRawRoot();
      Object var10001 = const__11.getRawRoot();
      Object var15 = null;
      Object sum_digits = var18.invoke(var10001, digits);
      op = null;
      a = null;
      b = null;
      sum_digits = null;
      Object var23;
      if (Util.equiv(sum_digits, 42L)) {
         Object var13 = null;
         var23 = Numbers.add(n, ((IFn)const__14.getRawRoot()).invoke(const__13));
      } else {
         var23 = n;
         n = null;
      }

      return Tuple.create(op, a, b, var23);
   }

   @Override
   public Object invoke(Object var1) {
      Object var2 = null;
      return invokeStatic(var1);
   }
}
