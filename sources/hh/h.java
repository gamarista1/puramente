package Hh;

import Gh.C5409j;
import Gh.C5410k;
import Gh.C5411l;
import Gh.H;
import Gh.M;
import Gh.U;
import Gh.W;
import Sg.p;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6531o;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;

public final class h extends C5411l {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final a f63491h = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final M f63492i = M.a.e(M.f63223b, "/", false, 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final ClassLoader f63493e;

    /* renamed from: f  reason: collision with root package name */
    private final C5411l f63494f;

    /* renamed from: g  reason: collision with root package name */
    private final Lazy f63495g;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean c(M m10) {
            return !p.t(m10.i(), ".class", true);
        }

        public final M b() {
            return h.f63492i;
        }

        public final M d(M m10, M m11) {
            C6496s.h(m10, "<this>");
            C6496s.h(m11, "base");
            return b().p(p.C(p.v0(m10.toString(), m11.toString()), '\\', '/', false, 4, (Object) null));
        }

        private a() {
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f63496a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar) {
            super(0);
            this.f63496a = hVar;
        }

        public final List invoke() {
            h hVar = this.f63496a;
            return hVar.x(hVar.f63493e);
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f63497a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(i iVar) {
            C6496s.h(iVar, "entry");
            return Boolean.valueOf(h.f63491h.c(iVar.b()));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ClassLoader classLoader, boolean z10, C5411l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z10, (i10 & 4) != 0 ? C5411l.f63319b : lVar);
    }

    private final String A(M m10) {
        return v(m10).m(f63492i).toString();
    }

    private final M v(M m10) {
        return f63492i.o(m10, true);
    }

    private final List w() {
        return (List) this.f63495g.getValue();
    }

    /* access modifiers changed from: private */
    public final List x(ClassLoader classLoader) {
        Enumeration<URL> resources = classLoader.getResources("");
        C6496s.g(resources, "getResources(...)");
        ArrayList<T> list = Collections.list(resources);
        C6496s.g(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (T t10 : list) {
            C6496s.e(t10);
            Pair y10 = y(t10);
            if (y10 != null) {
                arrayList.add(y10);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        C6496s.g(resources2, "getResources(...)");
        ArrayList<T> list2 = Collections.list(resources2);
        C6496s.g(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (T t11 : list2) {
            C6496s.e(t11);
            Pair z10 = z(t11);
            if (z10 != null) {
                arrayList2.add(z10);
            }
        }
        return C6565s.K0(arrayList, arrayList2);
    }

    private final Pair y(URL url) {
        if (!C6496s.c(url.getProtocol(), "file")) {
            return null;
        }
        return C6502A.a(this.f63494f, M.a.d(M.f63223b, new File(url.toURI()), false, 1, (Object) null));
    }

    private final Pair z(URL url) {
        int h02;
        String url2 = url.toString();
        C6496s.g(url2, "toString(...)");
        if (!p.J(url2, "jar:file:", false, 2, (Object) null) || (h02 = p.h0(url2, "!", 0, false, 6, (Object) null)) == -1) {
            return null;
        }
        M.a aVar = M.f63223b;
        String substring = url2.substring(4, h02);
        C6496s.g(substring, "substring(...)");
        return C6502A.a(j.f(M.a.d(aVar, new File(URI.create(substring)), false, 1, (Object) null), this.f63494f, c.f63497a), f63492i);
    }

    public U b(M m10, boolean z10) {
        C6496s.h(m10, "file");
        throw new IOException(this + " is read-only");
    }

    public void c(M m10, M m11) {
        C6496s.h(m10, "source");
        C6496s.h(m11, "target");
        throw new IOException(this + " is read-only");
    }

    public void g(M m10, boolean z10) {
        C6496s.h(m10, "dir");
        throw new IOException(this + " is read-only");
    }

    public void i(M m10, boolean z10) {
        C6496s.h(m10, "path");
        throw new IOException(this + " is read-only");
    }

    public List k(M m10) {
        C6496s.h(m10, "dir");
        String A10 = A(m10);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (Pair pair : w()) {
            C5411l lVar = (C5411l) pair.a();
            M m11 = (M) pair.b();
            try {
                ArrayList<M> arrayList = new ArrayList<>();
                for (Object next : lVar.k(m11.p(A10))) {
                    if (f63491h.c((M) next)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
                for (M d10 : arrayList) {
                    arrayList2.add(f63491h.d(d10, m11));
                }
                C6565s.D(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return C6565s.e1(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + m10);
    }

    public C5410k m(M m10) {
        C6496s.h(m10, "path");
        if (!f63491h.c(m10)) {
            return null;
        }
        String A10 = A(m10);
        for (Pair pair : w()) {
            C5410k m11 = ((C5411l) pair.a()).m(((M) pair.b()).p(A10));
            if (m11 != null) {
                return m11;
            }
        }
        return null;
    }

    public C5409j n(M m10) {
        C6496s.h(m10, "file");
        if (f63491h.c(m10)) {
            String A10 = A(m10);
            for (Pair pair : w()) {
                try {
                    return ((C5411l) pair.a()).n(((M) pair.b()).p(A10));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + m10);
        }
        throw new FileNotFoundException("file not found: " + m10);
    }

    public U p(M m10, boolean z10) {
        C6496s.h(m10, "file");
        throw new IOException(this + " is read-only");
    }

    public W q(M m10) {
        C6496s.h(m10, "file");
        if (f63491h.c(m10)) {
            M m11 = f63492i;
            URL resource = this.f63493e.getResource(M.r(m11, m10, false, 2, (Object) null).m(m11).toString());
            if (resource != null) {
                URLConnection openConnection = resource.openConnection();
                if (openConnection instanceof JarURLConnection) {
                    ((JarURLConnection) openConnection).setUseCaches(false);
                }
                InputStream inputStream = openConnection.getInputStream();
                C6496s.g(inputStream, "getInputStream(...)");
                return H.l(inputStream);
            }
            throw new FileNotFoundException("file not found: " + m10);
        }
        throw new FileNotFoundException("file not found: " + m10);
    }

    public h(ClassLoader classLoader, boolean z10, C5411l lVar) {
        C6496s.h(classLoader, "classLoader");
        C6496s.h(lVar, "systemFileSystem");
        this.f63493e = classLoader;
        this.f63494f = lVar;
        this.f63495g = C6531o.b(new b(this));
        if (z10) {
            w().size();
        }
    }
}
