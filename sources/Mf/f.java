package Mf;

import Lf.o;
import kotlin.jvm.internal.C6496s;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private final ng.c f64119a;

    /* renamed from: b  reason: collision with root package name */
    private final String f64120b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f64121c;

    /* renamed from: d  reason: collision with root package name */
    private final ng.b f64122d;

    public static final class a extends f {

        /* renamed from: e  reason: collision with root package name */
        public static final a f64123e = new a();

        private a() {
            super(o.f63920A, "Function", false, (ng.b) null);
        }
    }

    public static final class b extends f {

        /* renamed from: e  reason: collision with root package name */
        public static final b f64124e = new b();

        private b() {
            super(o.f63951x, "KFunction", true, (ng.b) null);
        }
    }

    public static final class c extends f {

        /* renamed from: e  reason: collision with root package name */
        public static final c f64125e = new c();

        private c() {
            super(o.f63951x, "KSuspendFunction", true, (ng.b) null);
        }
    }

    public static final class d extends f {

        /* renamed from: e  reason: collision with root package name */
        public static final d f64126e = new d();

        private d() {
            super(o.f63946s, "SuspendFunction", false, (ng.b) null);
        }
    }

    public f(ng.c cVar, String str, boolean z10, ng.b bVar) {
        C6496s.h(cVar, "packageFqName");
        C6496s.h(str, "classNamePrefix");
        this.f64119a = cVar;
        this.f64120b = str;
        this.f64121c = z10;
        this.f64122d = bVar;
    }

    public final String a() {
        return this.f64120b;
    }

    public final ng.c b() {
        return this.f64119a;
    }

    public final ng.f c(int i10) {
        ng.f i11 = ng.f.i(this.f64120b + i10);
        C6496s.g(i11, "identifier(...)");
        return i11;
    }

    public String toString() {
        return this.f64119a + '.' + this.f64120b + 'N';
    }
}
