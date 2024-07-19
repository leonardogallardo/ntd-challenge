package cli_calculator;

import clojure.lang.IFn;
import clojure.lang.RT;
import clojure.lang.Util;
import clojure.lang.Var;

public class core {
   private static final Var main__var = Var.internPrivate("cli-calculator.core", "-main");
   private static final Var equals__var = Var.internPrivate("cli-calculator.core", "-equals");
   private static final Var toString__var = Var.internPrivate("cli-calculator.core", "-toString");
   private static final Var hashCode__var = Var.internPrivate("cli-calculator.core", "-hashCode");
   private static final Var clone__var = Var.internPrivate("cli-calculator.core", "-clone");

   static {
      Util.loadWithClass("/cli_calculator/core", core.class);
   }

   @Override
   public boolean equals(Object var1) {
      Var var10000 = equals__var;
      Object var2 = equals__var.isBound() ? var10000.get() : null;
      return var2 != null ? (Boolean)((IFn)var2).invoke(this, var1) : super.equals(var1);
   }

   @Override
   public String toString() {
      Var var10000 = toString__var;
      Object var1 = toString__var.isBound() ? var10000.get() : null;
      return var1 != null ? (String)((IFn)var1).invoke(this) : super.toString();
   }

   @Override
   public int hashCode() {
      Var var10000 = hashCode__var;
      Object var1 = hashCode__var.isBound() ? var10000.get() : null;
      return var1 != null ? ((Number)((IFn)var1).invoke(this)).intValue() : super.hashCode();
   }

   @Override
   public Object clone() {
      Var var10000 = clone__var;
      Object var1 = clone__var.isBound() ? var10000.get() : null;
      return var1 != null ? ((IFn)var1).invoke(this) : super.clone();
   }

   public static void main(String[] var0) {
      Var var10000 = main__var;
      Object var1 = main__var.isBound() ? var10000.get() : null;
      if (var1 != null) {
         ((IFn)var1).applyTo(RT.seq(var0));
      } else {
         throw new UnsupportedOperationException("cli-calculator.core/-main not defined");
      }
   }
}
