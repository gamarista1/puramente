package pg;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pg.C6639a;
import pg.C6646h;
import pg.C6648j;
import pg.p;
import pg.y;

/* renamed from: pg.i  reason: case insensitive filesystem */
public abstract class C6647i extends C6639a implements Serializable {

    /* renamed from: pg.i$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f72527a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                pg.y$c[] r0 = pg.y.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f72527a = r0
                pg.y$c r1 = pg.y.c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f72527a     // Catch:{ NoSuchFieldError -> 0x001d }
                pg.y$c r1 = pg.y.c.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pg.C6647i.a.<clinit>():void");
        }
    }

    /* renamed from: pg.i$b */
    public static abstract class b extends C6639a.C1046a {

        /* renamed from: a  reason: collision with root package name */
        private C6642d f72528a = C6642d.f72492a;

        protected b() {
        }

        public final C6642d j() {
            return this.f72528a;
        }

        public abstract b k(C6647i iVar);

        public final b l(C6642d dVar) {
            this.f72528a = dVar;
            return this;
        }
    }

    /* renamed from: pg.i$c */
    public static abstract class c extends b implements q {

        /* renamed from: b  reason: collision with root package name */
        private C6646h f72529b = C6646h.g();

        /* renamed from: c  reason: collision with root package name */
        private boolean f72530c;

        protected c() {
        }

        /* access modifiers changed from: private */
        public C6646h o() {
            this.f72529b.q();
            this.f72530c = false;
            return this.f72529b;
        }

        private void p() {
            if (!this.f72530c) {
                this.f72529b = this.f72529b.clone();
                this.f72530c = true;
            }
        }

        /* access modifiers changed from: protected */
        public final void q(d dVar) {
            p();
            this.f72529b.r(dVar.f72531b);
        }
    }

    /* renamed from: pg.i$e */
    static final class e implements C6646h.b {

        /* renamed from: a  reason: collision with root package name */
        final C6648j.b f72536a;

        /* renamed from: b  reason: collision with root package name */
        final int f72537b;

        /* renamed from: c  reason: collision with root package name */
        final y.b f72538c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f72539d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f72540e;

        e(C6648j.b bVar, int i10, y.b bVar2, boolean z10, boolean z11) {
            this.f72536a = bVar;
            this.f72537b = i10;
            this.f72538c = bVar2;
            this.f72539d = z10;
            this.f72540e = z11;
        }

        /* renamed from: a */
        public int compareTo(e eVar) {
            return this.f72537b - eVar.f72537b;
        }

        public C6648j.b b() {
            return this.f72536a;
        }

        public int d() {
            return this.f72537b;
        }

        public boolean g() {
            return this.f72539d;
        }

        public y.b h() {
            return this.f72538c;
        }

        public boolean k() {
            return this.f72540e;
        }

        public p.a n(p.a aVar, p pVar) {
            return ((b) aVar).k((C6647i) pVar);
        }

        public y.c v() {
            return this.f72538c.a();
        }
    }

    /* renamed from: pg.i$f */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        final p f72541a;

        /* renamed from: b  reason: collision with root package name */
        final Object f72542b;

        /* renamed from: c  reason: collision with root package name */
        final p f72543c;

        /* renamed from: d  reason: collision with root package name */
        final e f72544d;

        /* renamed from: e  reason: collision with root package name */
        final Class f72545e;

        /* renamed from: f  reason: collision with root package name */
        final Method f72546f;

        f(p pVar, Object obj, p pVar2, e eVar, Class cls) {
            if (pVar == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (eVar.h() == y.b.MESSAGE && pVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f72541a = pVar;
                this.f72542b = obj;
                this.f72543c = pVar2;
                this.f72544d = eVar;
                this.f72545e = cls;
                if (C6648j.a.class.isAssignableFrom(cls)) {
                    this.f72546f = C6647i.k(cls, "valueOf", Integer.TYPE);
                } else {
                    this.f72546f = null;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public Object a(Object obj) {
            if (!this.f72544d.g()) {
                return e(obj);
            }
            if (this.f72544d.v() != y.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object e10 : (List) obj) {
                arrayList.add(e(e10));
            }
            return arrayList;
        }

        public p b() {
            return this.f72541a;
        }

        public p c() {
            return this.f72543c;
        }

        public int d() {
            return this.f72544d.d();
        }

        /* access modifiers changed from: package-private */
        public Object e(Object obj) {
            if (this.f72544d.v() == y.c.ENUM) {
                return C6647i.l(this.f72546f, (Object) null, (Integer) obj);
            }
            return obj;
        }

        /* access modifiers changed from: package-private */
        public Object f(Object obj) {
            if (this.f72544d.v() == y.c.ENUM) {
                return Integer.valueOf(((C6648j.a) obj).d());
            }
            return obj;
        }
    }

    protected C6647i() {
    }

    static Method k(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            String valueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + valueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(valueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    static Object l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static f n(p pVar, p pVar2, C6648j.b bVar, int i10, y.b bVar2, boolean z10, Class cls) {
        return new f(pVar, Collections.emptyList(), pVar2, new e(bVar, i10, bVar2, true, z10), cls);
    }

    public static f o(p pVar, Object obj, p pVar2, C6648j.b bVar, int i10, y.b bVar2, Class cls) {
        return new f(pVar, obj, pVar2, new e(bVar, i10, bVar2, false, false), cls);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean q(pg.C6646h r5, pg.p r6, pg.C6643e r7, pg.C6644f r8, pg.C6645g r9, int r10) {
        /*
            int r0 = pg.y.b(r10)
            int r1 = pg.y.a(r10)
            pg.i$f r6 = r9.b(r6, r1)
            r1 = 1
            r2 = 0
            if (r6 != 0) goto L_0x0013
        L_0x0010:
            r0 = r1
            r3 = r2
            goto L_0x003e
        L_0x0013:
            pg.i$e r3 = r6.f72544d
            pg.y$b r3 = r3.h()
            int r3 = pg.C6646h.l(r3, r2)
            if (r0 != r3) goto L_0x0022
            r0 = r2
            r3 = r0
            goto L_0x003e
        L_0x0022:
            pg.i$e r3 = r6.f72544d
            boolean r4 = r3.f72539d
            if (r4 == 0) goto L_0x0010
            pg.y$b r3 = r3.f72538c
            boolean r3 = r3.c()
            if (r3 == 0) goto L_0x0010
            pg.i$e r3 = r6.f72544d
            pg.y$b r3 = r3.h()
            int r3 = pg.C6646h.l(r3, r1)
            if (r0 != r3) goto L_0x0010
            r3 = r1
            r0 = r2
        L_0x003e:
            if (r0 == 0) goto L_0x0045
            boolean r5 = r7.O(r10, r8)
            return r5
        L_0x0045:
            if (r3 == 0) goto L_0x0095
            int r8 = r7.z()
            int r8 = r7.i(r8)
            pg.i$e r9 = r6.f72544d
            pg.y$b r9 = r9.h()
            pg.y$b r10 = pg.y.b.ENUM
            if (r9 != r10) goto L_0x007a
        L_0x0059:
            int r9 = r7.e()
            if (r9 <= 0) goto L_0x0090
            int r9 = r7.m()
            pg.i$e r10 = r6.f72544d
            pg.j$b r10 = r10.b()
            pg.j$a r9 = r10.a(r9)
            if (r9 != 0) goto L_0x0070
            return r1
        L_0x0070:
            pg.i$e r10 = r6.f72544d
            java.lang.Object r9 = r6.f(r9)
            r5.a(r10, r9)
            goto L_0x0059
        L_0x007a:
            int r9 = r7.e()
            if (r9 <= 0) goto L_0x0090
            pg.i$e r9 = r6.f72544d
            pg.y$b r9 = r9.h()
            java.lang.Object r9 = pg.C6646h.u(r7, r9, r2)
            pg.i$e r10 = r6.f72544d
            r5.a(r10, r9)
            goto L_0x007a
        L_0x0090:
            r7.h(r8)
            goto L_0x0122
        L_0x0095:
            int[] r0 = pg.C6647i.a.f72527a
            pg.i$e r3 = r6.f72544d
            pg.y$c r3 = r3.v()
            int r3 = r3.ordinal()
            r0 = r0[r3]
            if (r0 == r1) goto L_0x00cc
            r9 = 2
            if (r0 == r9) goto L_0x00b3
            pg.i$e r8 = r6.f72544d
            pg.y$b r8 = r8.h()
            java.lang.Object r7 = pg.C6646h.u(r7, r8, r2)
            goto L_0x0107
        L_0x00b3:
            int r7 = r7.m()
            pg.i$e r9 = r6.f72544d
            pg.j$b r9 = r9.b()
            pg.j$a r9 = r9.a(r7)
            if (r9 != 0) goto L_0x00ca
            r8.n0(r10)
            r8.x0(r7)
            return r1
        L_0x00ca:
            r7 = r9
            goto L_0x0107
        L_0x00cc:
            pg.i$e r8 = r6.f72544d
            boolean r8 = r8.g()
            if (r8 != 0) goto L_0x00e3
            pg.i$e r8 = r6.f72544d
            java.lang.Object r8 = r5.h(r8)
            pg.p r8 = (pg.p) r8
            if (r8 == 0) goto L_0x00e3
            pg.p$a r8 = r8.g()
            goto L_0x00e4
        L_0x00e3:
            r8 = 0
        L_0x00e4:
            if (r8 != 0) goto L_0x00ee
            pg.p r8 = r6.c()
            pg.p$a r8 = r8.c()
        L_0x00ee:
            pg.i$e r10 = r6.f72544d
            pg.y$b r10 = r10.h()
            pg.y$b r0 = pg.y.b.GROUP
            if (r10 != r0) goto L_0x0100
            int r10 = r6.d()
            r7.q(r10, r8, r9)
            goto L_0x0103
        L_0x0100:
            r7.u(r8, r9)
        L_0x0103:
            pg.p r7 = r8.f()
        L_0x0107:
            pg.i$e r8 = r6.f72544d
            boolean r8 = r8.g()
            if (r8 == 0) goto L_0x0119
            pg.i$e r8 = r6.f72544d
            java.lang.Object r6 = r6.f(r7)
            r5.a(r8, r6)
            goto L_0x0122
        L_0x0119:
            pg.i$e r8 = r6.f72544d
            java.lang.Object r6 = r6.f(r7)
            r5.v(r8, r6)
        L_0x0122:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.C6647i.q(pg.h, pg.p, pg.e, pg.f, pg.g, int):boolean");
    }

    /* access modifiers changed from: protected */
    public boolean p(C6643e eVar, C6644f fVar, C6645g gVar, int i10) {
        return eVar.O(i10, fVar);
    }

    /* renamed from: pg.i$d */
    public static abstract class d extends C6647i implements q {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C6646h f72531b;

        /* renamed from: pg.i$d$a */
        protected class a {

            /* renamed from: a  reason: collision with root package name */
            private final Iterator f72532a;

            /* renamed from: b  reason: collision with root package name */
            private Map.Entry f72533b;

            /* renamed from: c  reason: collision with root package name */
            private final boolean f72534c;

            /* synthetic */ a(d dVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, C6644f fVar) {
                while (true) {
                    Map.Entry entry = this.f72533b;
                    if (entry != null && ((e) entry.getKey()).d() < i10) {
                        e eVar = (e) this.f72533b.getKey();
                        if (!this.f72534c || eVar.v() != y.c.MESSAGE || eVar.g()) {
                            C6646h.z(eVar, this.f72533b.getValue(), fVar);
                        } else {
                            fVar.e0(eVar.d(), (p) this.f72533b.getValue());
                        }
                        if (this.f72532a.hasNext()) {
                            this.f72533b = (Map.Entry) this.f72532a.next();
                        } else {
                            this.f72533b = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            private a(boolean z10) {
                Iterator p10 = d.this.f72531b.p();
                this.f72532a = p10;
                if (p10.hasNext()) {
                    this.f72533b = (Map.Entry) p10.next();
                }
                this.f72534c = z10;
            }
        }

        protected d() {
            this.f72531b = C6646h.t();
        }

        private void z(f fVar) {
            if (fVar.b() != d()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* access modifiers changed from: protected */
        public void m() {
            this.f72531b.q();
        }

        /* access modifiers changed from: protected */
        public boolean p(C6643e eVar, C6644f fVar, C6645g gVar, int i10) {
            return C6647i.q(this.f72531b, d(), eVar, fVar, gVar, i10);
        }

        /* access modifiers changed from: protected */
        public boolean s() {
            return this.f72531b.n();
        }

        /* access modifiers changed from: protected */
        public int t() {
            return this.f72531b.k();
        }

        public final Object u(f fVar) {
            z(fVar);
            Object h10 = this.f72531b.h(fVar.f72544d);
            if (h10 == null) {
                return fVar.f72542b;
            }
            return fVar.a(h10);
        }

        public final Object v(f fVar, int i10) {
            z(fVar);
            return fVar.e(this.f72531b.i(fVar.f72544d, i10));
        }

        public final int w(f fVar) {
            z(fVar);
            return this.f72531b.j(fVar.f72544d);
        }

        public final boolean x(f fVar) {
            z(fVar);
            return this.f72531b.m(fVar.f72544d);
        }

        /* access modifiers changed from: protected */
        public a y() {
            return new a(this, false, (a) null);
        }

        protected d(c cVar) {
            this.f72531b = cVar.o();
        }
    }

    protected C6647i(b bVar) {
    }

    /* access modifiers changed from: protected */
    public void m() {
    }
}
