package d4;

import Gh.C5411l;
import Sg.p;
import X3.g;
import a4.C3114g;
import a4.S;
import a4.V;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import b4.C3145a;
import com.adjust.sdk.Constants;
import d4.C3472i;
import i4.C3589d;
import j4.C3627n;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o4.l;
import qf.C6658d;
import rh.C;
import rh.C6707d;
import rh.E;
import rh.F;
import rh.y;

public final class k implements C3472i {

    /* renamed from: f  reason: collision with root package name */
    public static final a f43110f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private static final C6707d f43111g = new C6707d.a().d().e().a();

    /* renamed from: h  reason: collision with root package name */
    private static final C6707d f43112h = new C6707d.a().d().f().a();

    /* renamed from: a  reason: collision with root package name */
    private final String f43113a;

    /* renamed from: b  reason: collision with root package name */
    private final C3627n f43114b;

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f43115c;

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f43116d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f43117e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements C3472i.a {

        /* renamed from: a  reason: collision with root package name */
        private final Lazy f43118a;

        /* renamed from: b  reason: collision with root package name */
        private final Lazy f43119b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f43120c;

        public b(Lazy lazy, Lazy lazy2, boolean z10) {
            this.f43118a = lazy;
            this.f43119b = lazy2;
            this.f43120c = z10;
        }

        private final boolean c(Uri uri) {
            if (C6496s.c(uri.getScheme(), "http") || C6496s.c(uri.getScheme(), Constants.SCHEME)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public C3472i a(Uri uri, C3627n nVar, g gVar) {
            if (!c(uri)) {
                return null;
            }
            return new k(uri.toString(), nVar, this.f43118a, this.f43119b, this.f43120c);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f43121a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f43122b;

        /* renamed from: c  reason: collision with root package name */
        int f43123c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k kVar, C6658d dVar) {
            super(dVar);
            this.f43122b = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f43121a = obj;
            this.f43123c |= Integer.MIN_VALUE;
            return this.f43122b.c((C) null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f43124a;

        /* renamed from: b  reason: collision with root package name */
        Object f43125b;

        /* renamed from: c  reason: collision with root package name */
        Object f43126c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f43127d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f43128e;

        /* renamed from: f  reason: collision with root package name */
        int f43129f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(k kVar, C6658d dVar) {
            super(dVar);
            this.f43128e = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f43127d = obj;
            this.f43129f |= Integer.MIN_VALUE;
            return this.f43128e.a(this);
        }
    }

    public k(String str, C3627n nVar, Lazy lazy, Lazy lazy2, boolean z10) {
        this.f43113a = str;
        this.f43114b = nVar;
        this.f43115c = lazy;
        this.f43116d = lazy2;
        this.f43117e = z10;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(rh.C r5, qf.C6658d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof d4.k.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            d4.k$c r0 = (d4.k.c) r0
            int r1 = r0.f43123c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f43123c = r1
            goto L_0x0018
        L_0x0013:
            d4.k$c r0 = new d4.k$c
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f43121a
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f43123c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            lf.w.b(r6)
            goto L_0x0072
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            lf.w.b(r6)
            boolean r6 = o4.l.r()
            if (r6 == 0) goto L_0x005d
            j4.n r6 = r4.f43114b
            j4.b r6 = r6.k()
            boolean r6 = r6.b()
            if (r6 != 0) goto L_0x0057
            kotlin.Lazy r6 = r4.f43115c
            java.lang.Object r6 = r6.getValue()
            rh.e$a r6 = (rh.C6708e.a) r6
            rh.e r5 = r6.a(r5)
            rh.E r5 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r5)
            goto L_0x0075
        L_0x0057:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L_0x005d:
            kotlin.Lazy r6 = r4.f43115c
            java.lang.Object r6 = r6.getValue()
            rh.e$a r6 = (rh.C6708e.a) r6
            rh.e r5 = r6.a(r5)
            r0.f43123c = r3
            java.lang.Object r6 = o4.C3879b.a(r5, r0)
            if (r6 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r5 = r6
            rh.E r5 = (rh.E) r5
        L_0x0075:
            boolean r6 = r5.m0()
            if (r6 != 0) goto L_0x0092
            int r6 = r5.o()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L_0x0092
            rh.F r6 = r5.a()
            if (r6 == 0) goto L_0x008c
            o4.l.d(r6)
        L_0x008c:
            i4.f r6 = new i4.f
            r6.<init>(r5)
            throw r6
        L_0x0092:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.k.c(rh.C, qf.d):java.lang.Object");
    }

    private final String d() {
        String h10 = this.f43114b.h();
        if (h10 == null) {
            return this.f43113a;
        }
        return h10;
    }

    private final C5411l e() {
        Object value = this.f43116d.getValue();
        C6496s.e(value);
        return ((C3145a) value).c();
    }

    private final boolean g(C c10, E e10) {
        if (!this.f43114b.i().c() || (this.f43117e && !C3589d.f44181c.c(c10, e10))) {
            return false;
        }
        return true;
    }

    private final C h() {
        C.a f10 = new C.a().l(this.f43113a).f(this.f43114b.j());
        for (Map.Entry entry : this.f43114b.p().a().entrySet()) {
            Object key = entry.getKey();
            C6496s.f(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            f10.j((Class) key, entry.getValue());
        }
        boolean b10 = this.f43114b.i().b();
        boolean b11 = this.f43114b.k().b();
        if (!b11 && b10) {
            f10.c(C6707d.f73249p);
        } else if (!b11 || b10) {
            if (!b11 && !b10) {
                f10.c(f43112h);
            }
        } else if (this.f43114b.i().c()) {
            f10.c(C6707d.f73248o);
        } else {
            f10.c(f43111g);
        }
        return f10.b();
    }

    private final C3145a.c i() {
        C3145a aVar;
        if (!this.f43114b.i().b() || (aVar = (C3145a) this.f43116d.getValue()) == null) {
            return null;
        }
        return aVar.b(d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f A[Catch:{ IOException -> 0x0031 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[Catch:{ IOException -> 0x0031 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final i4.C3588c j(b4.C3145a.c r3) {
        /*
            r2 = this;
            r0 = 0
            Gh.l r1 = r2.e()     // Catch:{ IOException -> 0x0031 }
            Gh.M r3 = r3.getMetadata()     // Catch:{ IOException -> 0x0031 }
            Gh.W r3 = r1.q(r3)     // Catch:{ IOException -> 0x0031 }
            Gh.g r3 = Gh.H.d(r3)     // Catch:{ IOException -> 0x0031 }
            i4.c r1 = new i4.c     // Catch:{ all -> 0x0020 }
            r1.<init>((Gh.C5406g) r3)     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x001e
            r3.close()     // Catch:{ all -> 0x001c }
            goto L_0x001e
        L_0x001c:
            r3 = move-exception
            goto L_0x002d
        L_0x001e:
            r3 = r0
            goto L_0x002d
        L_0x0020:
            r1 = move-exception
            if (r3 == 0) goto L_0x002b
            r3.close()     // Catch:{ all -> 0x0027 }
            goto L_0x002b
        L_0x0027:
            r3 = move-exception
            lf.C6523g.a(r1, r3)     // Catch:{ IOException -> 0x0031 }
        L_0x002b:
            r3 = r1
            r1 = r0
        L_0x002d:
            if (r3 != 0) goto L_0x0030
            return r1
        L_0x0030:
            throw r3     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.k.j(b4.a$c):i4.c");
    }

    private final C3114g k(E e10) {
        if (e10.Q() != null) {
            return C3114g.NETWORK;
        }
        return C3114g.DISK;
    }

    private final S l(C3145a.c cVar) {
        return V.g(cVar.getData(), e(), d(), cVar);
    }

    private final S m(F f10) {
        return V.e(f10.y(), this.f43114b.g());
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bc A[Catch:{ Exception -> 0x0082, all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f9 A[Catch:{ Exception -> 0x0082, all -> 0x007f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final b4.C3145a.c n(b4.C3145a.c r5, rh.C r6, rh.E r7, i4.C3588c r8) {
        /*
            r4 = this;
            boolean r6 = r4.g(r6, r7)
            r0 = 0
            if (r6 != 0) goto L_0x000d
            if (r5 == 0) goto L_0x000c
            o4.l.d(r5)
        L_0x000c:
            return r0
        L_0x000d:
            if (r5 == 0) goto L_0x0014
            b4.a$b r5 = r5.T0()
            goto L_0x0028
        L_0x0014:
            kotlin.Lazy r5 = r4.f43116d
            java.lang.Object r5 = r5.getValue()
            b4.a r5 = (b4.C3145a) r5
            if (r5 == 0) goto L_0x0027
            java.lang.String r6 = r4.d()
            b4.a$b r5 = r5.a(r6)
            goto L_0x0028
        L_0x0027:
            r5 = r0
        L_0x0028:
            if (r5 != 0) goto L_0x002b
            return r0
        L_0x002b:
            int r6 = r7.o()     // Catch:{ Exception -> 0x0082 }
            r1 = 304(0x130, float:4.26E-43)
            r2 = 0
            if (r6 != r1) goto L_0x008a
            if (r8 == 0) goto L_0x008a
            rh.E$a r6 = r7.T()     // Catch:{ Exception -> 0x0082 }
            i4.d$a r1 = i4.C3589d.f44181c     // Catch:{ Exception -> 0x0082 }
            rh.u r8 = r8.h()     // Catch:{ Exception -> 0x0082 }
            rh.u r3 = r7.F()     // Catch:{ Exception -> 0x0082 }
            rh.u r8 = r1.a(r8, r3)     // Catch:{ Exception -> 0x0082 }
            rh.E$a r6 = r6.k(r8)     // Catch:{ Exception -> 0x0082 }
            rh.E r6 = r6.c()     // Catch:{ Exception -> 0x0082 }
            Gh.l r8 = r4.e()     // Catch:{ Exception -> 0x0082 }
            Gh.M r1 = r5.getMetadata()     // Catch:{ Exception -> 0x0082 }
            Gh.U r8 = r8.p(r1, r2)     // Catch:{ Exception -> 0x0082 }
            Gh.f r8 = Gh.H.c(r8)     // Catch:{ Exception -> 0x0082 }
            i4.c r1 = new i4.c     // Catch:{ all -> 0x0072 }
            r1.<init>((rh.E) r6)     // Catch:{ all -> 0x0072 }
            r1.k(r8)     // Catch:{ all -> 0x0072 }
            lf.M r6 = lf.C6514M.f71813a     // Catch:{ all -> 0x0072 }
            if (r8 == 0) goto L_0x0085
            r8.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0085
        L_0x0070:
            r0 = move-exception
            goto L_0x0085
        L_0x0072:
            r6 = move-exception
            r0 = r6
            if (r8 == 0) goto L_0x0085
            r8.close()     // Catch:{ all -> 0x007a }
            goto L_0x0085
        L_0x007a:
            r6 = move-exception
            lf.C6523g.a(r0, r6)     // Catch:{ Exception -> 0x0082 }
            goto L_0x0085
        L_0x007f:
            r5 = move-exception
            goto L_0x00fe
        L_0x0082:
            r6 = move-exception
            goto L_0x00fa
        L_0x0085:
            if (r0 != 0) goto L_0x0089
            goto L_0x00f0
        L_0x0089:
            throw r0     // Catch:{ Exception -> 0x0082 }
        L_0x008a:
            Gh.l r6 = r4.e()     // Catch:{ Exception -> 0x0082 }
            Gh.M r8 = r5.getMetadata()     // Catch:{ Exception -> 0x0082 }
            Gh.U r6 = r6.p(r8, r2)     // Catch:{ Exception -> 0x0082 }
            Gh.f r6 = Gh.H.c(r6)     // Catch:{ Exception -> 0x0082 }
            i4.c r8 = new i4.c     // Catch:{ all -> 0x00ae }
            r8.<init>((rh.E) r7)     // Catch:{ all -> 0x00ae }
            r8.k(r6)     // Catch:{ all -> 0x00ae }
            lf.M r8 = lf.C6514M.f71813a     // Catch:{ all -> 0x00ae }
            if (r6 == 0) goto L_0x00ac
            r6.close()     // Catch:{ all -> 0x00aa }
            goto L_0x00ac
        L_0x00aa:
            r6 = move-exception
            goto L_0x00ba
        L_0x00ac:
            r6 = r0
            goto L_0x00ba
        L_0x00ae:
            r8 = move-exception
            if (r6 == 0) goto L_0x00b9
            r6.close()     // Catch:{ all -> 0x00b5 }
            goto L_0x00b9
        L_0x00b5:
            r6 = move-exception
            lf.C6523g.a(r8, r6)     // Catch:{ Exception -> 0x0082 }
        L_0x00b9:
            r6 = r8
        L_0x00ba:
            if (r6 != 0) goto L_0x00f9
            Gh.l r6 = r4.e()     // Catch:{ Exception -> 0x0082 }
            Gh.M r8 = r5.getData()     // Catch:{ Exception -> 0x0082 }
            Gh.U r6 = r6.p(r8, r2)     // Catch:{ Exception -> 0x0082 }
            Gh.f r6 = Gh.H.c(r6)     // Catch:{ Exception -> 0x0082 }
            rh.F r8 = r7.a()     // Catch:{ all -> 0x00e2 }
            kotlin.jvm.internal.C6496s.e(r8)     // Catch:{ all -> 0x00e2 }
            Gh.g r8 = r8.y()     // Catch:{ all -> 0x00e2 }
            r8.d0(r6)     // Catch:{ all -> 0x00e2 }
            if (r6 == 0) goto L_0x00ee
            r6.close()     // Catch:{ all -> 0x00e0 }
            goto L_0x00ee
        L_0x00e0:
            r0 = move-exception
            goto L_0x00ee
        L_0x00e2:
            r8 = move-exception
            r0 = r8
            if (r6 == 0) goto L_0x00ee
            r6.close()     // Catch:{ all -> 0x00ea }
            goto L_0x00ee
        L_0x00ea:
            r6 = move-exception
            lf.C6523g.a(r0, r6)     // Catch:{ Exception -> 0x0082 }
        L_0x00ee:
            if (r0 != 0) goto L_0x00f8
        L_0x00f0:
            b4.a$c r5 = r5.b()     // Catch:{ Exception -> 0x0082 }
            o4.l.d(r7)
            return r5
        L_0x00f8:
            throw r0     // Catch:{ Exception -> 0x0082 }
        L_0x00f9:
            throw r6     // Catch:{ Exception -> 0x0082 }
        L_0x00fa:
            o4.l.a(r5)     // Catch:{ all -> 0x007f }
            throw r6     // Catch:{ all -> 0x007f }
        L_0x00fe:
            o4.l.d(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.k.n(b4.a$c, rh.C, rh.E, i4.c):b4.a$c");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012c A[Catch:{ Exception -> 0x013f }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014d A[Catch:{ Exception -> 0x013f }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(qf.C6658d r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof d4.k.d
            if (r0 == 0) goto L_0x0013
            r0 = r12
            d4.k$d r0 = (d4.k.d) r0
            int r1 = r0.f43129f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f43129f = r1
            goto L_0x0018
        L_0x0013:
            d4.k$d r0 = new d4.k$d
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f43127d
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f43129f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x005c
            if (r2 == r4) goto L_0x0045
            if (r2 != r3) goto L_0x003d
            java.lang.Object r1 = r0.f43126c
            rh.E r1 = (rh.E) r1
            java.lang.Object r2 = r0.f43125b
            b4.a$c r2 = (b4.C3145a.c) r2
            java.lang.Object r0 = r0.f43124a
            d4.k r0 = (d4.k) r0
            lf.w.b(r12)     // Catch:{ Exception -> 0x003a }
            goto L_0x018a
        L_0x003a:
            r12 = move-exception
            goto L_0x01a8
        L_0x003d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0045:
            java.lang.Object r2 = r0.f43126c
            i4.d r2 = (i4.C3589d) r2
            java.lang.Object r4 = r0.f43125b
            b4.a$c r4 = (b4.C3145a.c) r4
            java.lang.Object r6 = r0.f43124a
            d4.k r6 = (d4.k) r6
            lf.w.b(r12)     // Catch:{ Exception -> 0x0059 }
            r10 = r4
            r4 = r2
            r2 = r10
            goto L_0x0118
        L_0x0059:
            r12 = move-exception
            goto L_0x01ae
        L_0x005c:
            lf.w.b(r12)
            b4.a$c r12 = r11.i()
            if (r12 == 0) goto L_0x00f0
            Gh.l r2 = r11.e()     // Catch:{ Exception -> 0x0094 }
            Gh.M r6 = r12.getMetadata()     // Catch:{ Exception -> 0x0094 }
            Gh.k r2 = r2.l(r6)     // Catch:{ Exception -> 0x0094 }
            java.lang.Long r2 = r2.c()     // Catch:{ Exception -> 0x0094 }
            if (r2 != 0) goto L_0x0078
            goto L_0x0099
        L_0x0078:
            long r6 = r2.longValue()     // Catch:{ Exception -> 0x0094 }
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0099
            d4.m r0 = new d4.m     // Catch:{ Exception -> 0x0094 }
            a4.S r1 = r11.l(r12)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = r11.f43113a     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = r11.f(r2, r5)     // Catch:{ Exception -> 0x0094 }
            a4.g r3 = a4.C3114g.DISK     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x0094 }
            return r0
        L_0x0094:
            r0 = move-exception
            r4 = r12
            r12 = r0
            goto L_0x01ae
        L_0x0099:
            boolean r2 = r11.f43117e     // Catch:{ Exception -> 0x0094 }
            if (r2 == 0) goto L_0x00d4
            i4.d$b r2 = new i4.d$b     // Catch:{ Exception -> 0x0094 }
            rh.C r6 = r11.h()     // Catch:{ Exception -> 0x0094 }
            i4.c r7 = r11.j(r12)     // Catch:{ Exception -> 0x0094 }
            r2.<init>(r6, r7)     // Catch:{ Exception -> 0x0094 }
            i4.d r2 = r2.b()     // Catch:{ Exception -> 0x0094 }
            rh.C r6 = r2.b()     // Catch:{ Exception -> 0x0094 }
            if (r6 != 0) goto L_0x00fd
            i4.c r6 = r2.a()     // Catch:{ Exception -> 0x0094 }
            if (r6 == 0) goto L_0x00fd
            d4.m r0 = new d4.m     // Catch:{ Exception -> 0x0094 }
            a4.S r1 = r11.l(r12)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r3 = r11.f43113a     // Catch:{ Exception -> 0x0094 }
            i4.c r2 = r2.a()     // Catch:{ Exception -> 0x0094 }
            rh.y r2 = r2.f()     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = r11.f(r3, r2)     // Catch:{ Exception -> 0x0094 }
            a4.g r3 = a4.C3114g.DISK     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x0094 }
            return r0
        L_0x00d4:
            d4.m r0 = new d4.m     // Catch:{ Exception -> 0x0094 }
            a4.S r1 = r11.l(r12)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = r11.f43113a     // Catch:{ Exception -> 0x0094 }
            i4.c r3 = r11.j(r12)     // Catch:{ Exception -> 0x0094 }
            if (r3 == 0) goto L_0x00e6
            rh.y r5 = r3.f()     // Catch:{ Exception -> 0x0094 }
        L_0x00e6:
            java.lang.String r2 = r11.f(r2, r5)     // Catch:{ Exception -> 0x0094 }
            a4.g r3 = a4.C3114g.DISK     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x0094 }
            return r0
        L_0x00f0:
            i4.d$b r2 = new i4.d$b     // Catch:{ Exception -> 0x0094 }
            rh.C r6 = r11.h()     // Catch:{ Exception -> 0x0094 }
            r2.<init>(r6, r5)     // Catch:{ Exception -> 0x0094 }
            i4.d r2 = r2.b()     // Catch:{ Exception -> 0x0094 }
        L_0x00fd:
            rh.C r6 = r2.b()     // Catch:{ Exception -> 0x0094 }
            kotlin.jvm.internal.C6496s.e(r6)     // Catch:{ Exception -> 0x0094 }
            r0.f43124a = r11     // Catch:{ Exception -> 0x0094 }
            r0.f43125b = r12     // Catch:{ Exception -> 0x0094 }
            r0.f43126c = r2     // Catch:{ Exception -> 0x0094 }
            r0.f43129f = r4     // Catch:{ Exception -> 0x0094 }
            java.lang.Object r4 = r11.c(r6, r0)     // Catch:{ Exception -> 0x0094 }
            if (r4 != r1) goto L_0x0113
            return r1
        L_0x0113:
            r6 = r11
            r10 = r2
            r2 = r12
            r12 = r4
            r4 = r10
        L_0x0118:
            rh.E r12 = (rh.E) r12     // Catch:{ Exception -> 0x01ac }
            rh.F r7 = o4.l.y(r12)     // Catch:{ Exception -> 0x01ac }
            rh.C r8 = r4.b()     // Catch:{ Exception -> 0x013f }
            i4.c r4 = r4.a()     // Catch:{ Exception -> 0x013f }
            b4.a$c r2 = r6.n(r2, r8, r12, r4)     // Catch:{ Exception -> 0x013f }
            if (r2 == 0) goto L_0x014d
            d4.m r0 = new d4.m     // Catch:{ Exception -> 0x013f }
            a4.S r1 = r6.l(r2)     // Catch:{ Exception -> 0x013f }
            java.lang.String r3 = r6.f43113a     // Catch:{ Exception -> 0x013f }
            i4.c r4 = r6.j(r2)     // Catch:{ Exception -> 0x013f }
            if (r4 == 0) goto L_0x0143
            rh.y r5 = r4.f()     // Catch:{ Exception -> 0x013f }
            goto L_0x0143
        L_0x013f:
            r0 = move-exception
            r1 = r12
            r12 = r0
            goto L_0x01a8
        L_0x0143:
            java.lang.String r3 = r6.f(r3, r5)     // Catch:{ Exception -> 0x013f }
            a4.g r4 = a4.C3114g.NETWORK     // Catch:{ Exception -> 0x013f }
            r0.<init>(r1, r3, r4)     // Catch:{ Exception -> 0x013f }
            return r0
        L_0x014d:
            Gh.g r4 = r7.y()     // Catch:{ Exception -> 0x013f }
            r8 = 1
            boolean r4 = r4.e0(r8)     // Catch:{ Exception -> 0x013f }
            if (r4 == 0) goto L_0x0171
            d4.m r0 = new d4.m     // Catch:{ Exception -> 0x013f }
            a4.S r1 = r6.m(r7)     // Catch:{ Exception -> 0x013f }
            java.lang.String r3 = r6.f43113a     // Catch:{ Exception -> 0x013f }
            rh.y r4 = r7.q()     // Catch:{ Exception -> 0x013f }
            java.lang.String r3 = r6.f(r3, r4)     // Catch:{ Exception -> 0x013f }
            a4.g r4 = r6.k(r12)     // Catch:{ Exception -> 0x013f }
            r0.<init>(r1, r3, r4)     // Catch:{ Exception -> 0x013f }
            return r0
        L_0x0171:
            o4.l.d(r12)     // Catch:{ Exception -> 0x013f }
            rh.C r4 = r6.h()     // Catch:{ Exception -> 0x013f }
            r0.f43124a = r6     // Catch:{ Exception -> 0x013f }
            r0.f43125b = r2     // Catch:{ Exception -> 0x013f }
            r0.f43126c = r12     // Catch:{ Exception -> 0x013f }
            r0.f43129f = r3     // Catch:{ Exception -> 0x013f }
            java.lang.Object r0 = r6.c(r4, r0)     // Catch:{ Exception -> 0x013f }
            if (r0 != r1) goto L_0x0187
            return r1
        L_0x0187:
            r1 = r12
            r12 = r0
            r0 = r6
        L_0x018a:
            rh.E r12 = (rh.E) r12     // Catch:{ Exception -> 0x003a }
            rh.F r1 = o4.l.y(r12)     // Catch:{ Exception -> 0x013f }
            d4.m r3 = new d4.m     // Catch:{ Exception -> 0x013f }
            a4.S r4 = r0.m(r1)     // Catch:{ Exception -> 0x013f }
            java.lang.String r5 = r0.f43113a     // Catch:{ Exception -> 0x013f }
            rh.y r1 = r1.q()     // Catch:{ Exception -> 0x013f }
            java.lang.String r1 = r0.f(r5, r1)     // Catch:{ Exception -> 0x013f }
            a4.g r0 = r0.k(r12)     // Catch:{ Exception -> 0x013f }
            r3.<init>(r4, r1, r0)     // Catch:{ Exception -> 0x013f }
            return r3
        L_0x01a8:
            o4.l.d(r1)     // Catch:{ Exception -> 0x01ac }
            throw r12     // Catch:{ Exception -> 0x01ac }
        L_0x01ac:
            r12 = move-exception
            r4 = r2
        L_0x01ae:
            if (r4 == 0) goto L_0x01b3
            o4.l.d(r4)
        L_0x01b3:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.k.a(qf.d):java.lang.Object");
    }

    public final String f(String str, y yVar) {
        String str2;
        String j10;
        if (yVar != null) {
            str2 = yVar.toString();
        } else {
            str2 = null;
        }
        if ((str2 == null || p.J(str2, "text/plain", false, 2, (Object) null)) && (j10 = l.j(MimeTypeMap.getSingleton(), str)) != null) {
            return j10;
        }
        if (str2 != null) {
            return p.Z0(str2, ';', (String) null, 2, (Object) null);
        }
        return null;
    }
}
