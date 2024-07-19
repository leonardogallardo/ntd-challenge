package cli_calculator;

import clojure.lang.AFn;
import clojure.lang.Compiler;
import clojure.lang.IFn;
import clojure.lang.IPersistentMap;
import clojure.lang.LockingTransaction;
import clojure.lang.PersistentList;
import clojure.lang.RT;
import clojure.lang.Symbol;
import clojure.lang.Tuple;
import clojure.lang.Var;
import java.util.Arrays;

public class core__init {
   public static final Var const__0;
   public static final AFn const__1;
   public static final AFn const__2;
   public static final Var const__3;
   public static final AFn const__12;
   public static final Var const__13;
   public static final AFn const__16;
   public static final Var const__17;
   public static final AFn const__20;
   public static final Var const__21;
   public static final AFn const__24;
   public static final Var const__25;
   public static final AFn const__28;
   public static final Var const__29;
   public static final AFn const__32;
   public static final Var const__33;
   public static final AFn const__36;
   public static final Var const__37;
   public static final AFn const__40;

   public static void load() {
      ((IFn)const__0.getRawRoot()).invoke(const__1);
      (new core$loading__6789__auto____171()).invoke();
      if (((Symbol)const__1).equals(const__2)) {
         Object var10002 = null;
      } else {
         LockingTransaction.runInTransaction(new core$fn__173());
         Object var0 = null;
      }

      Var var10003 = const__3;
      const__3.setMeta((IPersistentMap)const__12);
      var10003.bindRoot(new core$bug_1());
      Var var10004 = const__13;
      const__13.setMeta((IPersistentMap)const__16);
      var10004.bindRoot(new core$bug_2());
      Var var10005 = const__17;
      const__17.setMeta((IPersistentMap)const__20);
      var10005.bindRoot(new core$result_round_float());
      Var var10006 = const__21;
      const__21.setMeta((IPersistentMap)const__24);
      var10006.bindRoot(new core$result_negative_zero());
      Var var10007 = const__25;
      const__25.setMeta((IPersistentMap)const__28);
      var10007.bindRoot(new core$result_final_format());
      Var var10008 = const__29;
      const__29.setMeta((IPersistentMap)const__32);
      var10008.bindRoot(new core$calculator());
      Var var10009 = const__33;
      const__33.setMeta((IPersistentMap)const__36);
      var10009.bindRoot(new core$parse_arg_double());
      Var var10010 = const__37;
      const__37.setMeta((IPersistentMap)const__40);
      var10010.bindRoot(new core$_main());
   }

   public static void __init0() {
      const__0 = RT.var("clojure.core", "in-ns");
      const__1 = Symbol.intern(null, "cli-calculator.core");
      const__2 = Symbol.intern(null, "clojure.core");
      const__3 = RT.var("cli-calculator.core", "bug-1");
      const__12 = (AFn)RT.map(
         RT.keyword(null, "arglists"),
         PersistentList.create(
            Arrays.asList(Tuple.create(Tuple.create(Symbol.intern(null, "op"), Symbol.intern(null, "a"), Symbol.intern(null, "b"), Symbol.intern(null, "n"))))
         ),
         RT.keyword(null, "doc"),
         "Adds a random value to the result if the sum of the digits of the result n equals 42",
         RT.keyword(null, "line"),
         5,
         RT.keyword(null, "column"),
         1,
         RT.keyword(null, "file"),
         "cli_calculator/core.clj"
      );
      const__13 = RT.var("cli-calculator.core", "bug-2");
      const__16 = (AFn)RT.map(
         RT.keyword(null, "arglists"),
         PersistentList.create(
            Arrays.asList(Tuple.create(Tuple.create(Symbol.intern(null, "op"), Symbol.intern(null, "a"), Symbol.intern(null, "b"), Symbol.intern(null, "n"))))
         ),
         RT.keyword(null, "doc"),
         "Returns 31337 when the following conditions are met:\n\n  - The result is zero\n  - Both operands are not equal\n  - The operation is either add or subtract\n  - The sum of the absolute value of both operands is greater than Integer/MAX_VALUE / 2",
         RT.keyword(null, "line"),
         14,
         RT.keyword(null, "column"),
         1,
         RT.keyword(null, "file"),
         "cli_calculator/core.clj"
      );
      const__17 = RT.var("cli-calculator.core", "result-round-float");
      const__20 = (AFn)RT.map(
         RT.keyword(null, "arglists"),
         PersistentList.create(
            Arrays.asList(Tuple.create(Tuple.create(Symbol.intern(null, "op"), Symbol.intern(null, "a"), Symbol.intern(null, "b"), Symbol.intern(null, "n"))))
         ),
         RT.keyword(null, "doc"),
         "Rounds the result when is a Double",
         RT.keyword(null, "line"),
         30,
         RT.keyword(null, "column"),
         1,
         RT.keyword(null, "file"),
         "cli_calculator/core.clj"
      );
      const__21 = RT.var("cli-calculator.core", "result-negative-zero");
      const__24 = (AFn)RT.map(
         RT.keyword(null, "arglists"),
         PersistentList.create(
            Arrays.asList(Tuple.create(Tuple.create(Symbol.intern(null, "op"), Symbol.intern(null, "a"), Symbol.intern(null, "b"), Symbol.intern(null, "n"))))
         ),
         RT.keyword(null, "doc"),
         "Handle -0 results",
         RT.keyword(null, "line"),
         35,
         RT.keyword(null, "column"),
         1,
         RT.keyword(null, "file"),
         "cli_calculator/core.clj"
      );
      const__25 = RT.var("cli-calculator.core", "result-final-format");
      const__28 = (AFn)RT.map(
         RT.keyword(null, "arglists"),
         PersistentList.create(
            Arrays.asList(Tuple.create(Tuple.create(Symbol.intern(null, "op"), Symbol.intern(null, "a"), Symbol.intern(null, "b"), Symbol.intern(null, "n"))))
         ),
         RT.keyword(null, "doc"),
         "Rounds the result when is a Double",
         RT.keyword(null, "line"),
         40,
         RT.keyword(null, "column"),
         1,
         RT.keyword(null, "file"),
         "cli_calculator/core.clj"
      );
      const__29 = RT.var("cli-calculator.core", "calculator");
      const__32 = (AFn)RT.map(
         RT.keyword(null, "arglists"),
         PersistentList.create(Arrays.asList(Tuple.create(Symbol.intern(null, "operation"), Symbol.intern(null, "a"), Symbol.intern(null, "b")))),
         RT.keyword(null, "line"),
         46,
         RT.keyword(null, "column"),
         1,
         RT.keyword(null, "file"),
         "cli_calculator/core.clj"
      );
      const__33 = RT.var("cli-calculator.core", "parse-arg-double");
      const__36 = (AFn)RT.map(
         RT.keyword(null, "arglists"),
         PersistentList.create(Arrays.asList(Tuple.create(Symbol.intern(null, "arg")))),
         RT.keyword(null, "line"),
         59,
         RT.keyword(null, "column"),
         1,
         RT.keyword(null, "file"),
         "cli_calculator/core.clj"
      );
      const__37 = RT.var("cli-calculator.core", "-main");
      const__40 = (AFn)RT.map(
         RT.keyword(null, "arglists"),
         PersistentList.create(Arrays.asList(Tuple.create(Symbol.intern(null, "&"), Symbol.intern(null, "args")))),
         RT.keyword(null, "line"),
         67,
         RT.keyword(null, "column"),
         1,
         RT.keyword(null, "file"),
         "cli_calculator/core.clj"
      );
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      __init0();
      Compiler.pushNSandLoader(RT.classForName("cli_calculator.core__init").getClassLoader());

      try {
         load();
      } catch (Throwable var1) {
         Var.popThreadBindings();
         throw var1;
      }

      Var.popThreadBindings();
   }
}
