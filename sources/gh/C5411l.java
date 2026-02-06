package Gh;

import Gh.M;
import Hh.c;
import Hh.h;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Gh.l  reason: case insensitive filesystem */
public abstract class C5411l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f63318a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final C5411l f63319b;

    /* renamed from: c  reason: collision with root package name */
    public static final M f63320c;

    /* renamed from: d  reason: collision with root package name */
    public static final C5411l f63321d;

    /* renamed from: Gh.l$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C5411l lVar;
        try {
            Class.forName("java.nio.file.Files");
            lVar = new G();
        } catch (ClassNotFoundException unused) {
            lVar = new C5419u();
        }
        f63319b = lVar;
        M.a aVar = M.f63223b;
        String property = System.getProperty("java.io.tmpdir");
        C6496s.g(property, "getProperty(...)");
        f63320c = M.a.e(aVar, property, false, 1, (Object) null);
        ClassLoader classLoader = h.class.getClassLoader();
        C6496s.g(classLoader, "getClassLoader(...)");
        f63321d = new h(classLoader, false, (C5411l) null, 4, (DefaultConstructorMarker) null);
    }

    public final U a(M m10) {
        C6496s.h(m10, "file");
        return b(m10, false);
    }

    public abstract U b(M m10, boolean z10);

    public abstract void c(M m10, M m11);

    public final void d(M m10) {
        C6496s.h(m10, "dir");
        e(m10, false);
    }

    public final void e(M m10, boolean z10) {
        C6496s.h(m10, "dir");
        c.a(this, m10, z10);
    }

    public final void f(M m10) {
        C6496s.h(m10, "dir");
        g(m10, false);
    }

    public abstract void g(M m10, boolean z10);

    public final void h(M m10) {
        C6496s.h(m10, "path");
        i(m10, false);
    }

    public abstract void i(M m10, boolean z10);

    public final boolean j(M m10) {
        C6496s.h(m10, "path");
        return c.b(this, m10);
    }

    public abstract List k(M m10);

    public final C5410k l(M m10) {
        C6496s.h(m10, "path");
        return c.c(this, m10);
    }

    public abstract C5410k m(M m10);

    public abstract C5409j n(M m10);

    public final U o(M m10) {
        C6496s.h(m10, "file");
        return p(m10, false);
    }

    public abstract U p(M m10, boolean z10);

    public abstract W q(M m10);
}
