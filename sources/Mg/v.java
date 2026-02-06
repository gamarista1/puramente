package Mg;

import Fg.C5366d0;
import Fg.S;
import Lf.i;
import Mg.f;
import Of.C5507z;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vg.C6755e;
import yf.C6798l;

public abstract class v implements f {

    /* renamed from: a  reason: collision with root package name */
    private final String f64238a;

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f64239b;

    /* renamed from: c  reason: collision with root package name */
    private final String f64240c;

    public static final class a extends v {

        /* renamed from: d  reason: collision with root package name */
        public static final a f64241d = new a();

        private a() {
            super("Boolean", u.f64237a, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        public static final S c(i iVar) {
            C6496s.h(iVar, "<this>");
            C5366d0 n10 = iVar.n();
            C6496s.g(n10, "getBooleanType(...)");
            return n10;
        }
    }

    public static final class b extends v {

        /* renamed from: d  reason: collision with root package name */
        public static final b f64242d = new b();

        private b() {
            super("Int", w.f64244a, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        public static final S c(i iVar) {
            C6496s.h(iVar, "<this>");
            C5366d0 D10 = iVar.D();
            C6496s.g(D10, "getIntType(...)");
            return D10;
        }
    }

    public static final class c extends v {

        /* renamed from: d  reason: collision with root package name */
        public static final c f64243d = new c();

        private c() {
            super("Unit", x.f64245a, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        public static final S c(i iVar) {
            C6496s.h(iVar, "<this>");
            C5366d0 Z10 = iVar.Z();
            C6496s.g(Z10, "getUnitType(...)");
            return Z10;
        }
    }

    public /* synthetic */ v(String str, C6798l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, lVar);
    }

    public boolean a(C5507z zVar) {
        C6496s.h(zVar, "functionDescriptor");
        return C6496s.c(zVar.getReturnType(), this.f64239b.invoke(C6755e.m(zVar)));
    }

    public String b(C5507z zVar) {
        return f.a.a(this, zVar);
    }

    public String getDescription() {
        return this.f64240c;
    }

    private v(String str, C6798l lVar) {
        this.f64238a = str;
        this.f64239b = lVar;
        this.f64240c = "must return " + str;
    }
}
