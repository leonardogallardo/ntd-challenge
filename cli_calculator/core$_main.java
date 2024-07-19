package cli_calculator;

import clojure.lang.IFn;
import clojure.lang.ISeq;
import clojure.lang.Numbers;
import clojure.lang.RT;
import clojure.lang.RestFn;
import clojure.lang.Tuple;
import clojure.lang.Var;

public final class core$_main extends RestFn {
   public static final Var const__0 = RT.var("clojure.core", "empty?");
   public static final Var const__4 = RT.var("clojure.core", "println");
   public static final Var const__7 = RT.var("cli-calculator.core", "parse-arg-double");
   public static final Var const__10 = RT.var("clojure.core", "not-every?");
   public static final Var const__11 = RT.var("clojure.core", "comp");
   public static final Var const__12 = RT.var("clojure.core", "not");
   public static final Var const__13 = RT.var("clojure.core", "nil?");
   public static final Var const__14 = RT.var("clojure.core", "str");
   public static final Var const__16 = RT.var("cli-calculator.core", "calculator");

   public static Object invokeStatic(ISeq args) {
      Object var10000;
      label43: {
         Object or__5581__auto__212 = ((IFn)const__0.getRawRoot()).invoke(args);
         if (or__5581__auto__212 != null) {
            if (or__5581__auto__212 != Boolean.FALSE) {
               var10000 = (IFn)or__5581__auto__212;
               or__5581__auto__212 = null;
               break label43;
            }
         }

         var10000 = Numbers.lt((long)RT.count(args), 3L) ? Boolean.TRUE : Boolean.FALSE;
      }

      if (var10000 != null) {
         if (var10000 != Boolean.FALSE) {
            return ((IFn)const__4.getRawRoot())
               .invoke("Usage: cli-calculator operation operand1 operand2\nSupported operations: add, subtract, multiply, divide");
         }
      }

      Object a;
      Object b;
      Object operation;
      label33: {
         operation = RT.nth(args, RT.intCast(0L));
         a = ((IFn)const__7.getRawRoot()).invoke(RT.nth(args, RT.intCast(1L)));
         var10000 = (IFn)const__7.getRawRoot();
         ISeq var7 = null;
         b = var10000.invoke(RT.nth(args, RT.intCast(2L)));
         var10000 = (IFn)((IFn)const__10.getRawRoot())
            .invoke(((IFn)const__11.getRawRoot()).invoke(const__12.getRawRoot(), const__13.getRawRoot()), Tuple.create(a, b));
         if (var10000 != null) {
            if (var10000 != Boolean.FALSE) {
               ((IFn)const__4.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke("Both arguments are required."));
               System.exit(RT.intCast(-1L));
               break label33;
            }
         }

         var10000 = null;
      }

      Object var4;
      try {
         var10000 = (IFn)const__4.getRawRoot();
         IFn var20 = (IFn)const__14.getRawRoot();
         IFn var10003 = (IFn)const__16.getRawRoot();
         Object var10 = null;
         Object var11 = null;
         Object var12 = null;
         var4 = var10000.invoke(var20.invoke("Result: ", var10003.invoke(operation, a, b)));
      } catch (Exception var6) {
         var10000 = (IFn)const__4.getRawRoot();
         IFn var19 = (IFn)const__14.getRawRoot();
         Object e = null;
         var4 = var10000.invoke(var19.invoke("Error: ", var6.getMessage()));
      }

      return var4;
   }

   @Override
   public Object doInvoke(Object var1) {
      ISeq var10000 = (ISeq)var1;
      var1 = null;
      return invokeStatic(var10000);
   }

   @Override
   public int getRequiredArity() {
      return 0;
   }
}
