package Gh;

import Gh.M;
import Hh.i;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public final class Z extends C5411l {

    /* renamed from: i  reason: collision with root package name */
    private static final a f63261i = new a((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    private static final M f63262j = M.a.e(M.f63223b, "/", false, 1, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    private final M f63263e;

    /* renamed from: f  reason: collision with root package name */
    private final C5411l f63264f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f63265g;

    /* renamed from: h  reason: collision with root package name */
    private final String f63266h;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Z(M m10, C5411l lVar, Map map, String str) {
        C6496s.h(m10, "zipPath");
        C6496s.h(lVar, "fileSystem");
        C6496s.h(map, "entries");
        this.f63263e = m10;
        this.f63264f = lVar;
        this.f63265g = map;
        this.f63266h = str;
    }

    private final M r(M m10) {
        return f63262j.o(m10, true);
    }

    private final List s(M m10, boolean z10) {
        i iVar = (i) this.f63265g.get(r(m10));
        if (iVar != null) {
            return C6565s.e1(iVar.c());
        }
        if (!z10) {
            return null;
        }
        throw new IOException("not a directory: " + m10);
    }

    public U b(M m10, boolean z10) {
        C6496s.h(m10, "file");
        throw new IOException("zip file systems are read-only");
    }

    public void c(M m10, M m11) {
        C6496s.h(m10, "source");
        C6496s.h(m11, "target");
        throw new IOException("zip file systems are read-only");
    }

    public void g(M m10, boolean z10) {
        C6496s.h(m10, "dir");
        throw new IOException("zip file systems are read-only");
    }

    public void i(M m10, boolean z10) {
        C6496s.h(m10, "path");
        throw new IOException("zip file systems are read-only");
    }

    public List k(M m10) {
        C6496s.h(m10, "dir");
        List s10 = s(m10, true);
        C6496s.e(s10);
        return s10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d A[SYNTHETIC, Splitter:B:30:0x005d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Gh.C5410k m(Gh.M r14) {
        /*
            r13 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.C6496s.h(r14, r0)
            Gh.M r14 = r13.r(r14)
            java.util.Map r0 = r13.f63265g
            java.lang.Object r14 = r0.get(r14)
            Hh.i r14 = (Hh.i) r14
            r0 = 0
            if (r14 != 0) goto L_0x0015
            return r0
        L_0x0015:
            long r1 = r14.i()
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x006e
            Gh.l r1 = r13.f63264f
            Gh.M r2 = r13.f63263e
            Gh.j r1 = r1.n(r2)
            long r2 = r14.i()     // Catch:{ all -> 0x004d }
            Gh.W r2 = r1.F(r2)     // Catch:{ all -> 0x004d }
            Gh.g r2 = Gh.H.d(r2)     // Catch:{ all -> 0x004d }
            Hh.i r14 = Hh.j.j(r2, r14)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003f
            r2.close()     // Catch:{ all -> 0x003d }
            goto L_0x003f
        L_0x003d:
            r2 = move-exception
            goto L_0x0051
        L_0x003f:
            r2 = r0
            goto L_0x0051
        L_0x0041:
            r14 = move-exception
            if (r2 == 0) goto L_0x004f
            r2.close()     // Catch:{ all -> 0x0048 }
            goto L_0x004f
        L_0x0048:
            r2 = move-exception
            lf.C6523g.a(r14, r2)     // Catch:{ all -> 0x004d }
            goto L_0x004f
        L_0x004d:
            r14 = move-exception
            goto L_0x005e
        L_0x004f:
            r2 = r14
            r14 = r0
        L_0x0051:
            if (r2 != 0) goto L_0x005d
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ all -> 0x0059 }
            goto L_0x005b
        L_0x0059:
            r1 = move-exception
            goto L_0x006a
        L_0x005b:
            r1 = r0
            goto L_0x006a
        L_0x005d:
            throw r2     // Catch:{ all -> 0x004d }
        L_0x005e:
            if (r1 == 0) goto L_0x0068
            r1.close()     // Catch:{ all -> 0x0064 }
            goto L_0x0068
        L_0x0064:
            r1 = move-exception
            lf.C6523g.a(r14, r1)
        L_0x0068:
            r1 = r14
            r14 = r0
        L_0x006a:
            if (r1 != 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            throw r1
        L_0x006e:
            Gh.k r12 = new Gh.k
            boolean r1 = r14.k()
            r2 = r1 ^ 1
            boolean r3 = r14.k()
            boolean r1 = r14.k()
            if (r1 == 0) goto L_0x0082
        L_0x0080:
            r5 = r0
            goto L_0x008b
        L_0x0082:
            long r0 = r14.j()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0080
        L_0x008b:
            java.lang.Long r6 = r14.f()
            java.lang.Long r7 = r14.h()
            java.lang.Long r8 = r14.g()
            r10 = 128(0x80, float:1.794E-43)
            r11 = 0
            r4 = 0
            r9 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Gh.Z.m(Gh.M):Gh.k");
    }

    public C5409j n(M m10) {
        C6496s.h(m10, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    public U p(M m10, boolean z10) {
        C6496s.h(m10, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Throwable} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Gh.W q(Gh.M r8) {
        /*
            r7 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            Gh.M r0 = r7.r(r8)
            java.util.Map r1 = r7.f63265g
            java.lang.Object r0 = r1.get(r0)
            Hh.i r0 = (Hh.i) r0
            if (r0 == 0) goto L_0x0074
            Gh.l r8 = r7.f63264f
            Gh.M r1 = r7.f63263e
            Gh.j r8 = r8.n(r1)
            r1 = 0
            long r2 = r0.i()     // Catch:{ all -> 0x0033 }
            Gh.W r2 = r8.F(r2)     // Catch:{ all -> 0x0033 }
            Gh.g r2 = Gh.H.d(r2)     // Catch:{ all -> 0x0033 }
            if (r8 == 0) goto L_0x002f
            r8.close()     // Catch:{ all -> 0x002e }
            goto L_0x002f
        L_0x002e:
            r1 = move-exception
        L_0x002f:
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x003e
        L_0x0033:
            r2 = move-exception
            if (r8 == 0) goto L_0x003e
            r8.close()     // Catch:{ all -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r8 = move-exception
            lf.C6523g.a(r2, r8)
        L_0x003e:
            if (r2 != 0) goto L_0x0073
            Hh.j.m(r1)
            int r8 = r0.e()
            r2 = 1
            if (r8 != 0) goto L_0x0054
            Hh.g r8 = new Hh.g
            long r3 = r0.j()
            r8.<init>(r1, r3, r2)
            goto L_0x0072
        L_0x0054:
            Gh.r r8 = new Gh.r
            Hh.g r3 = new Hh.g
            long r4 = r0.d()
            r3.<init>(r1, r4, r2)
            java.util.zip.Inflater r1 = new java.util.zip.Inflater
            r1.<init>(r2)
            r8.<init>((Gh.W) r3, (java.util.zip.Inflater) r1)
            Hh.g r1 = new Hh.g
            long r2 = r0.j()
            r0 = 0
            r1.<init>(r8, r2, r0)
            r8 = r1
        L_0x0072:
            return r8
        L_0x0073:
            throw r2
        L_0x0074:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such file: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Gh.Z.q(Gh.M):Gh.W");
    }
}
