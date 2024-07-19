package cli_calculator;

import clojure.lang.AFunction;
import clojure.lang.IFn;
import clojure.lang.Numbers;
import clojure.lang.RT;
import clojure.lang.Reflector;
import clojure.lang.Tuple;
import clojure.lang.Util;
import clojure.lang.Var;

public final class core$bug_2 extends AFunction {
   public static final Var const__6 = RT.var("clojure.core", "not");
   public static final Object const__11 = 31337L;

   public static Object invokeStatic(Object p__183) {
      Object var9 = null;
      Object op = RT.nth(p__183, RT.intCast(0L), null);
      Object a = RT.nth(p__183, RT.intCast(1L), null);
      Object b = RT.nth(p__183, RT.intCast(2L), null);
      Object var10 = null;
      Object n = RT.nth(p__183, RT.intCast(3L), null);
      boolean or__5581__auto__188 = Util.equiv(op, "add");
      boolean var10003;
      if (or__5581__auto__188) {
         var10003 = or__5581__auto__188;
      } else {
         Object var11 = null;
         var10003 = Util.equiv(op, "subtract");
      }

      or__5581__auto__188 = var10003;
      label53:
      if (or__5581__auto__188) {
         Object and__5579__auto__190 = ((IFn)const__6.getRawRoot()).invoke(Util.equiv(a, b) ? Boolean.TRUE : Boolean.FALSE);
         if (and__5579__auto__190 != null) {
            if (and__5579__auto__190 != Boolean.FALSE) {
               Class var20 = RT.classForName("java.lang.Math");
               Object[] var10005 = new Object[1];
               Object var12 = null;
               var10005[0] = a;
               Object var21 = Reflector.invokeStaticMethod(var20, "abs", var10005);
               Class var10004 = RT.classForName("java.lang.Math");
               Object[] var10006 = new Object[1];
               Object var13 = null;
               var10006[0] = b;
               boolean and__5579__auto__189 = Numbers.gt(
                  Numbers.add(var21, Reflector.invokeStaticMethod(var10004, "abs", var10006)), Numbers.divide((long)Integer.MAX_VALUE, 2L)
               );
               var22 = and__5579__auto__189 ? (Numbers.isZero(n) ? Boolean.TRUE : Boolean.FALSE) : (and__5579__auto__189 ? Boolean.TRUE : Boolean.FALSE);
               break label53;
            }
         }

         var22 = and__5579__auto__190;
         and__5579__auto__190 = null;
      } else {
         var22 = or__5581__auto__188 ? Boolean.TRUE : Boolean.FALSE;
      }

      if (var22 != null) {
         if (var22 != Boolean.FALSE) {
            return Tuple.create(op, a, b, const__11);
         }
      }

      Object var14 = null;
      return Tuple.create(op, a, b, n);
   }

   @Override
   public Object invoke(Object var1) {
      Object var2 = null;
      return invokeStatic(var1);
   }
}
