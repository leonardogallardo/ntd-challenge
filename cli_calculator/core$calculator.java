package cli_calculator;

import clojure.lang.AFunction;
import clojure.lang.IFn;
import clojure.lang.Numbers;
import clojure.lang.RT;
import clojure.lang.Tuple;
import clojure.lang.Util;
import clojure.lang.Var;

public final class core$calculator extends AFunction {
   public static final Var const__1 = RT.var("clojure.core", "comp");
   public static final Var const__2 = RT.var("cli-calculator.core", "result-final-format");
   public static final Var const__3 = RT.var("cli-calculator.core", "result-negative-zero");
   public static final Var const__4 = RT.var("cli-calculator.core", "result-round-float");
   public static final Var const__5 = RT.var("cli-calculator.core", "bug-2");
   public static final Var const__6 = RT.var("cli-calculator.core", "bug-1");
   public static final String const__7 = "add";
   public static final String const__9 = "subtract";
   public static final String const__11 = "divide";
   public static final String const__14 = "multiply";
   public static final Var const__16 = RT.var("clojure.core", "str");
   public static final Object const__17 = 3L;

   public static Object invokeStatic(Object operation, Object a, Object b) {
      label32: {
         IFn var10000 = (IFn)((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), const__3.getRawRoot(), const__4.getRawRoot());
         IFn var10001 = (IFn)((IFn)const__1.getRawRoot()).invoke(const__5.getRawRoot(), const__6.getRawRoot());
         Number var13;
         switch (Util.hash(operation) >> 9 & 3) {
            case 0:
               if (!Util.equiv(operation, const__7)) {
                  break label32;
               }

               Object var8 = null;
               Object var12 = null;
               var13 = Numbers.add(a, b);
               break;
            case 1:
               if (!Util.equiv(operation, const__9)) {
                  break label32;
               }

               Object var7 = null;
               Object var11 = null;
               var13 = Numbers.minus(a, b);
               break;
            case 2:
               if (!Util.equiv(operation, const__11)) {
                  break label32;
               }

               if (Numbers.isZero(b)) {
                  throw (Throwable)(new Exception("Cannot divide by zero"));
               }

               Object var6 = null;
               Object var10 = null;
               var13 = Numbers.divide(a, b);
               break;
            case 3:
               if (Util.equiv(operation, const__14)) {
                  Object var5 = null;
                  Object var9 = null;
                  var13 = Numbers.multiply(a, b);
                  break;
               }
            default:
               break label32;
         }

         return RT.get(var10000.invoke(var10001.invoke(Tuple.create(operation, a, b, var13))), const__17);
      }

      IFn var10007 = (IFn)const__16.getRawRoot();
      Object var4 = null;
      throw (Throwable)(new Exception((String)var10007.invoke("Unknown operation: ", operation)));
   }

   @Override
   public Object invoke(Object var1, Object var2, Object var3) {
      Object var4 = null;
      Object var5 = null;
      Object var6 = null;
      return invokeStatic(var1, var2, var3);
   }
}
