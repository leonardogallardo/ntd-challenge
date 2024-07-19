package cli_calculator;

import clojure.lang.AFn;
import clojure.lang.AFunction;
import clojure.lang.Compiler;
import clojure.lang.IFn;
import clojure.lang.Namespace;
import clojure.lang.RT;
import clojure.lang.Symbol;
import clojure.lang.Var;

public final class core$loading__6789__auto____171 extends AFunction {
   public static final Var const__0 = RT.var("clojure.core", "refer");
   public static final AFn const__1 = Symbol.intern(null, "clojure.core");

   @Override
   public Object invoke() {
      Var.pushThreadBindings(RT.mapUniqueKeys(Compiler.LOADER, this.getClass().getClassLoader()));

      Class var1;
      try {
         Object var10000 = null;
         ((IFn)const__0.getRawRoot()).invoke(const__1);
         var1 = ((Namespace)RT.CURRENT_NS.deref()).importClass(RT.classForNameNonLoading("java.text.DecimalFormat"));
      } finally {
         Var.popThreadBindings();
      }

      return var1;
   }
}
