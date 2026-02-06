package Xf;

import Xf.C;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6529m;
import mf.O;
import ng.c;

public abstract class B {

    /* renamed from: a  reason: collision with root package name */
    private static final c f66231a;

    /* renamed from: b  reason: collision with root package name */
    private static final c f66232b;

    /* renamed from: c  reason: collision with root package name */
    private static final c f66233c;

    /* renamed from: d  reason: collision with root package name */
    private static final c f66234d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f66235e;

    /* renamed from: f  reason: collision with root package name */
    private static final c[] f66236f;

    /* renamed from: g  reason: collision with root package name */
    private static final K f66237g;

    /* renamed from: h  reason: collision with root package name */
    private static final C f66238h;

    static {
        c cVar = new c("org.jspecify.nullness");
        f66231a = cVar;
        c cVar2 = new c("org.jspecify.annotations");
        f66232b = cVar2;
        c cVar3 = new c("io.reactivex.rxjava3.annotations");
        f66233c = cVar3;
        c cVar4 = new c("org.checkerframework.checker.nullness.compatqual");
        f66234d = cVar4;
        String b10 = cVar3.b();
        C6496s.g(b10, "asString(...)");
        f66235e = b10;
        c cVar5 = new c(b10 + ".Nullable");
        f66236f = new c[]{cVar5, new c(b10 + ".NonNull")};
        c cVar6 = new c("org.jetbrains.annotations");
        C.a aVar = C.f66239d;
        Pair a10 = C6502A.a(cVar6, aVar.a());
        Pair a11 = C6502A.a(new c("androidx.annotation"), aVar.a());
        Pair a12 = C6502A.a(new c("android.support.annotation"), aVar.a());
        Pair a13 = C6502A.a(new c("android.annotation"), aVar.a());
        Pair a14 = C6502A.a(new c("com.android.annotations"), aVar.a());
        Pair a15 = C6502A.a(new c("org.eclipse.jdt.annotation"), aVar.a());
        Pair a16 = C6502A.a(new c("org.checkerframework.checker.nullness.qual"), aVar.a());
        Pair a17 = C6502A.a(cVar4, aVar.a());
        Pair a18 = C6502A.a(new c("javax.annotation"), aVar.a());
        Pair a19 = C6502A.a(new c("edu.umd.cs.findbugs.annotations"), aVar.a());
        Pair a20 = C6502A.a(new c("io.reactivex.annotations"), aVar.a());
        c cVar7 = new c("androidx.annotation.RecentlyNullable");
        O o10 = O.WARN;
        Pair a21 = C6502A.a(cVar7, new C(o10, (C6529m) null, (O) null, 4, (DefaultConstructorMarker) null));
        Pair a22 = C6502A.a(new c("androidx.annotation.RecentlyNonNull"), new C(o10, (C6529m) null, (O) null, 4, (DefaultConstructorMarker) null));
        Pair a23 = C6502A.a(new c("lombok"), aVar.a());
        C6529m mVar = new C6529m(2, 1);
        O o11 = O.STRICT;
        f66237g = new M(O.l(a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, C6502A.a(cVar, new C(o10, mVar, o11)), C6502A.a(cVar2, new C(o10, new C6529m(2, 1), o11)), C6502A.a(cVar3, new C(o10, new C6529m(1, 8), o11))));
        f66238h = new C(o10, (C6529m) null, (O) null, 4, (DefaultConstructorMarker) null);
    }

    public static final G a(C6529m mVar) {
        O c10;
        C6496s.h(mVar, "configuredKotlinVersion");
        C c11 = f66238h;
        if (c11.d() == null || c11.d().compareTo(mVar) > 0) {
            c10 = c11.c();
        } else {
            c10 = c11.b();
        }
        O o10 = c10;
        return new G(o10, c(o10), (Map) null, 4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ G b(C6529m mVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = C6529m.f71829f;
        }
        return a(mVar);
    }

    public static final O c(O o10) {
        C6496s.h(o10, "globalReportLevel");
        if (o10 == O.WARN) {
            return null;
        }
        return o10;
    }

    public static final O d(c cVar) {
        C6496s.h(cVar, "annotationFqName");
        return h(cVar, K.f66310a.a(), (C6529m) null, 4, (Object) null);
    }

    public static final c e() {
        return f66232b;
    }

    public static final c[] f() {
        return f66236f;
    }

    public static final O g(c cVar, K k10, C6529m mVar) {
        C6496s.h(cVar, "annotation");
        C6496s.h(k10, "configuredReportLevels");
        C6496s.h(mVar, "configuredKotlinVersion");
        O o10 = (O) k10.a(cVar);
        if (o10 != null) {
            return o10;
        }
        C c10 = (C) f66237g.a(cVar);
        if (c10 == null) {
            return O.IGNORE;
        }
        if (c10.d() == null || c10.d().compareTo(mVar) > 0) {
            return c10.c();
        }
        return c10.b();
    }

    public static /* synthetic */ O h(c cVar, K k10, C6529m mVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            mVar = new C6529m(1, 7, 20);
        }
        return g(cVar, k10, mVar);
    }
}
