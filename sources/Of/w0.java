package Of;

import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.O;

public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    public static final w0 f64523a = new w0();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f64524b;

    /* renamed from: c  reason: collision with root package name */
    private static final h f64525c;

    public static final class a extends x0 {

        /* renamed from: c  reason: collision with root package name */
        public static final a f64526c = new a();

        private a() {
            super("inherited", false);
        }
    }

    public static final class b extends x0 {

        /* renamed from: c  reason: collision with root package name */
        public static final b f64527c = new b();

        private b() {
            super("internal", false);
        }
    }

    public static final class c extends x0 {

        /* renamed from: c  reason: collision with root package name */
        public static final c f64528c = new c();

        private c() {
            super("invisible_fake", false);
        }
    }

    public static final class d extends x0 {

        /* renamed from: c  reason: collision with root package name */
        public static final d f64529c = new d();

        private d() {
            super("local", false);
        }
    }

    public static final class e extends x0 {

        /* renamed from: c  reason: collision with root package name */
        public static final e f64530c = new e();

        private e() {
            super("private", false);
        }
    }

    public static final class f extends x0 {

        /* renamed from: c  reason: collision with root package name */
        public static final f f64531c = new f();

        private f() {
            super("private_to_this", false);
        }

        public String b() {
            return "private/*private to this*/";
        }
    }

    public static final class g extends x0 {

        /* renamed from: c  reason: collision with root package name */
        public static final g f64532c = new g();

        private g() {
            super("protected", true);
        }
    }

    public static final class h extends x0 {

        /* renamed from: c  reason: collision with root package name */
        public static final h f64533c = new h();

        private h() {
            super("public", true);
        }
    }

    public static final class i extends x0 {

        /* renamed from: c  reason: collision with root package name */
        public static final i f64534c = new i();

        private i() {
            super("unknown", false);
        }
    }

    static {
        Map c10 = O.c();
        c10.put(f.f64531c, 0);
        c10.put(e.f64530c, 0);
        c10.put(b.f64527c, 1);
        c10.put(g.f64532c, 1);
        h hVar = h.f64533c;
        c10.put(hVar, 2);
        f64524b = O.b(c10);
        f64525c = hVar;
    }

    private w0() {
    }

    public final Integer a(x0 x0Var, x0 x0Var2) {
        C6496s.h(x0Var, "first");
        C6496s.h(x0Var2, "second");
        if (x0Var == x0Var2) {
            return 0;
        }
        Map map = f64524b;
        Integer num = (Integer) map.get(x0Var);
        Integer num2 = (Integer) map.get(x0Var2);
        if (num == null || num2 == null || C6496s.c(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(x0 x0Var) {
        C6496s.h(x0Var, "visibility");
        if (x0Var == e.f64530c || x0Var == f.f64531c) {
            return true;
        }
        return false;
    }
}
