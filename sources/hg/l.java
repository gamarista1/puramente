package Hg;

import Fg.S;
import Fg.v0;
import Kg.d;
import Of.C5495m;
import Of.H;
import Of.Z;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.Y;
import ng.f;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f63471a = new l();

    /* renamed from: b  reason: collision with root package name */
    private static final H f63472b = e.f63351a;

    /* renamed from: c  reason: collision with root package name */
    private static final a f63473c;

    /* renamed from: d  reason: collision with root package name */
    private static final S f63474d = d(k.CYCLIC_SUPERTYPES, new String[0]);

    /* renamed from: e  reason: collision with root package name */
    private static final S f63475e = d(k.ERROR_PROPERTY_TYPE, new String[0]);

    /* renamed from: f  reason: collision with root package name */
    private static final Z f63476f;

    /* renamed from: g  reason: collision with root package name */
    private static final Set f63477g;

    static {
        String format = String.format(b.ERROR_CLASS.b(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        C6496s.g(format, "format(...)");
        f m10 = f.m(format);
        C6496s.g(m10, "special(...)");
        f63473c = new a(m10);
        f fVar = new f();
        f63476f = fVar;
        f63477g = Y.d(fVar);
    }

    private l() {
    }

    public static final g a(h hVar, boolean z10, String... strArr) {
        C6496s.h(hVar, "kind");
        C6496s.h(strArr, "formatParams");
        if (z10) {
            return new m(hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        return new g(hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final g b(h hVar, String... strArr) {
        C6496s.h(hVar, "kind");
        C6496s.h(strArr, "formatParams");
        return a(hVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final i d(k kVar, String... strArr) {
        C6496s.h(kVar, "kind");
        C6496s.h(strArr, "formatParams");
        return f63471a.g(kVar, C6565s.n(), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean m(C5495m mVar) {
        if (mVar != null) {
            l lVar = f63471a;
            if (lVar.n(mVar) || lVar.n(mVar.b()) || mVar == f63472b) {
                return true;
            }
        }
        return false;
    }

    private final boolean n(C5495m mVar) {
        return mVar instanceof a;
    }

    public static final boolean o(S s10) {
        if (s10 == null) {
            return false;
        }
        v0 N02 = s10.N0();
        if (!(N02 instanceof j) || ((j) N02).b() != k.UNINFERRED_TYPE_VARIABLE) {
            return false;
        }
        return true;
    }

    public final i c(k kVar, v0 v0Var, String... strArr) {
        C6496s.h(kVar, "kind");
        C6496s.h(v0Var, "typeConstructor");
        C6496s.h(strArr, "formatParams");
        return f(kVar, C6565s.n(), v0Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final j e(k kVar, String... strArr) {
        C6496s.h(kVar, "kind");
        C6496s.h(strArr, "formatParams");
        return new j(kVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final i f(k kVar, List list, v0 v0Var, String... strArr) {
        C6496s.h(kVar, "kind");
        C6496s.h(list, "arguments");
        C6496s.h(v0Var, "typeConstructor");
        C6496s.h(strArr, "formatParams");
        return new i(v0Var, b(h.ERROR_TYPE_SCOPE, v0Var.toString()), kVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final i g(k kVar, List list, String... strArr) {
        C6496s.h(kVar, "kind");
        C6496s.h(list, "arguments");
        C6496s.h(strArr, "formatParams");
        return f(kVar, list, e(kVar, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final a h() {
        return f63473c;
    }

    public final H i() {
        return f63472b;
    }

    public final Set j() {
        return f63477g;
    }

    public final S k() {
        return f63475e;
    }

    public final S l() {
        return f63474d;
    }

    public final String p(S s10) {
        C6496s.h(s10, "type");
        d.z(s10);
        v0 N02 = s10.N0();
        C6496s.f(N02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
        return ((j) N02).c(0);
    }
}
