package m3;

import Ef.m;
import Wg.g;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import dh.C5817a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import lf.w;
import m3.C2224x;
import m3.L;
import m3.Z;
import m3.r;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;

/* renamed from: m3.B  reason: case insensitive filesystem */
public final class C2197B {

    /* renamed from: a  reason: collision with root package name */
    private final C2200E f23738a;

    /* renamed from: b  reason: collision with root package name */
    private final List f23739b;

    /* renamed from: c  reason: collision with root package name */
    private final List f23740c;

    /* renamed from: d  reason: collision with root package name */
    private int f23741d;

    /* renamed from: e  reason: collision with root package name */
    private int f23742e;

    /* renamed from: f  reason: collision with root package name */
    private int f23743f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f23744g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f23745h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Wg.d f23746i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Wg.d f23747j;

    /* renamed from: k  reason: collision with root package name */
    private final Map f23748k;

    /* renamed from: l  reason: collision with root package name */
    private C2223w f23749l;

    /* renamed from: m3.B$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C2200E f23750a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C5817a f23751b = dh.c.b(false, 1, (Object) null);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final C2197B f23752c;

        public a(C2200E e10) {
            C6496s.h(e10, "config");
            this.f23750a = e10;
            this.f23752c = new C2197B(e10, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: m3.B$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23753a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                m3.t[] r0 = m3.C2220t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                m3.t r1 = m3.C2220t.REFRESH     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                m3.t r1 = m3.C2220t.PREPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                m3.t r1 = m3.C2220t.APPEND     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f23753a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.C2197B.b.<clinit>():void");
        }
    }

    /* renamed from: m3.B$c */
    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f23754a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2197B f23755b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2197B b10, C6658d dVar) {
            super(2, dVar);
            this.f23755b = b10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new c(this.f23755b, dVar);
        }

        public final Object invoke(C5695g gVar, C6658d dVar) {
            return ((c) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f23754a == 0) {
                w.b(obj);
                this.f23755b.f23747j.c(kotlin.coroutines.jvm.internal.b.c(this.f23755b.f23745h));
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: m3.B$d */
    static final class d extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f23756a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2197B f23757b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C2197B b10, C6658d dVar) {
            super(2, dVar);
            this.f23757b = b10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new d(this.f23757b, dVar);
        }

        public final Object invoke(C5695g gVar, C6658d dVar) {
            return ((d) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f23756a == 0) {
                w.b(obj);
                this.f23757b.f23746i.c(kotlin.coroutines.jvm.internal.b.c(this.f23757b.f23744g));
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public /* synthetic */ C2197B(C2200E e10, DefaultConstructorMarker defaultConstructorMarker) {
        this(e10);
    }

    public final C5694f e() {
        return C5696h.H(C5696h.k(this.f23747j), new c(this, (C6658d) null));
    }

    public final C5694f f() {
        return C5696h.H(C5696h.k(this.f23746i), new d(this, (C6658d) null));
    }

    public final M g(Z.a aVar) {
        Integer num;
        int i10;
        List e12 = C6565s.e1(this.f23740c);
        if (aVar != null) {
            int o10 = o();
            int i11 = -this.f23741d;
            int p10 = C6565s.p(this.f23740c) - this.f23741d;
            int g10 = aVar.g();
            for (int i12 = i11; i12 < g10; i12++) {
                if (i12 > p10) {
                    i10 = this.f23738a.f23769a;
                } else {
                    i10 = ((L.b.C0385b) this.f23740c.get(this.f23741d + i12)).a().size();
                }
                o10 += i10;
            }
            int f10 = o10 + aVar.f();
            if (aVar.g() < i11) {
                f10 -= this.f23738a.f23769a;
            }
            num = Integer.valueOf(f10);
        } else {
            num = null;
        }
        return new M(e12, num, this.f23738a, o());
    }

    public final void h(C2224x.a aVar) {
        C6496s.h(aVar, "event");
        if (aVar.f() <= this.f23740c.size()) {
            this.f23748k.remove(aVar.c());
            this.f23749l.c(aVar.c(), r.c.f24097b.b());
            int i10 = b.f23753a[aVar.c().ordinal()];
            if (i10 == 2) {
                int f10 = aVar.f();
                for (int i11 = 0; i11 < f10; i11++) {
                    this.f23739b.remove(0);
                }
                this.f23741d -= aVar.f();
                t(aVar.g());
                int i12 = this.f23744g + 1;
                this.f23744g = i12;
                this.f23746i.c(Integer.valueOf(i12));
            } else if (i10 == 3) {
                int f11 = aVar.f();
                for (int i13 = 0; i13 < f11; i13++) {
                    this.f23739b.remove(this.f23740c.size() - 1);
                }
                s(aVar.g());
                int i14 = this.f23745h + 1;
                this.f23745h = i14;
                this.f23747j.c(Integer.valueOf(i14));
            } else {
                throw new IllegalArgumentException("cannot drop " + aVar.c());
            }
        } else {
            throw new IllegalStateException(("invalid drop count. have " + this.f23740c.size() + " but wanted to drop " + aVar.f()).toString());
        }
    }

    public final C2224x.a i(C2220t tVar, Z z10) {
        int i10;
        int i11;
        int n10;
        int i12;
        int c10;
        C6496s.h(tVar, "loadType");
        C6496s.h(z10, "hint");
        C2224x.a aVar = null;
        if (this.f23738a.f23773e == Integer.MAX_VALUE || this.f23740c.size() <= 2 || q() <= this.f23738a.f23773e) {
            return null;
        }
        if (tVar != C2220t.REFRESH) {
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i14 < this.f23740c.size() && q() - i15 > this.f23738a.f23773e) {
                int[] iArr = b.f23753a;
                if (iArr[tVar.ordinal()] == 2) {
                    i12 = ((L.b.C0385b) this.f23740c.get(i14)).a().size();
                } else {
                    List list = this.f23740c;
                    i12 = ((L.b.C0385b) list.get(C6565s.p(list) - i14)).a().size();
                }
                if (iArr[tVar.ordinal()] == 2) {
                    c10 = z10.d();
                } else {
                    c10 = z10.c();
                }
                if ((c10 - i15) - i12 < this.f23738a.f23770b) {
                    break;
                }
                i15 += i12;
                i14++;
            }
            if (i14 != 0) {
                int[] iArr2 = b.f23753a;
                if (iArr2[tVar.ordinal()] == 2) {
                    i10 = -this.f23741d;
                } else {
                    i10 = (C6565s.p(this.f23740c) - this.f23741d) - (i14 - 1);
                }
                if (iArr2[tVar.ordinal()] == 2) {
                    i11 = (i14 - 1) - this.f23741d;
                } else {
                    i11 = C6565s.p(this.f23740c) - this.f23741d;
                }
                if (this.f23738a.f23771c) {
                    if (tVar == C2220t.PREPEND) {
                        n10 = o();
                    } else {
                        n10 = n();
                    }
                    i13 = n10 + i15;
                }
                aVar = new C2224x.a(tVar, i10, i11, i13);
            }
            return aVar;
        }
        throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + tVar).toString());
    }

    public final int j(C2220t tVar) {
        C6496s.h(tVar, "loadType");
        int i10 = b.f23753a[tVar.ordinal()];
        if (i10 == 1) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        } else if (i10 == 2) {
            return this.f23744g;
        } else {
            if (i10 == 3) {
                return this.f23745h;
            }
            throw new C6535s();
        }
    }

    public final Map k() {
        return this.f23748k;
    }

    public final int l() {
        return this.f23741d;
    }

    public final List m() {
        return this.f23740c;
    }

    public final int n() {
        if (this.f23738a.f23771c) {
            return this.f23743f;
        }
        return 0;
    }

    public final int o() {
        if (this.f23738a.f23771c) {
            return this.f23742e;
        }
        return 0;
    }

    public final C2223w p() {
        return this.f23749l;
    }

    public final int q() {
        int i10 = 0;
        for (L.b.C0385b a10 : this.f23740c) {
            i10 += a10.a().size();
        }
        return i10;
    }

    public final boolean r(int i10, C2220t tVar, L.b.C0385b bVar) {
        int i11;
        int i12;
        C6496s.h(tVar, "loadType");
        C6496s.h(bVar, "page");
        int i13 = b.f23753a[tVar.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    if (this.f23740c.isEmpty()) {
                        throw new IllegalStateException("should've received an init before append");
                    } else if (i10 != this.f23745h) {
                        return false;
                    } else {
                        this.f23739b.add(bVar);
                        if (bVar.b() == Integer.MIN_VALUE) {
                            i12 = m.d(n() - bVar.a().size(), 0);
                        } else {
                            i12 = bVar.b();
                        }
                        s(i12);
                        this.f23748k.remove(C2220t.APPEND);
                    }
                }
            } else if (this.f23740c.isEmpty()) {
                throw new IllegalStateException("should've received an init before prepend");
            } else if (i10 != this.f23744g) {
                return false;
            } else {
                this.f23739b.add(0, bVar);
                this.f23741d++;
                if (bVar.g() == Integer.MIN_VALUE) {
                    i11 = m.d(o() - bVar.a().size(), 0);
                } else {
                    i11 = bVar.g();
                }
                t(i11);
                this.f23748k.remove(C2220t.PREPEND);
            }
        } else if (!this.f23740c.isEmpty()) {
            throw new IllegalStateException("cannot receive multiple init calls");
        } else if (i10 == 0) {
            this.f23739b.add(bVar);
            this.f23741d = 0;
            s(bVar.b());
            t(bVar.g());
        } else {
            throw new IllegalStateException("init loadId must be the initial value, 0");
        }
        return true;
    }

    public final void s(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        this.f23743f = i10;
    }

    public final void t(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        this.f23742e = i10;
    }

    public final C2224x u(L.b.C0385b bVar, C2220t tVar) {
        C6496s.h(bVar, "<this>");
        C6496s.h(tVar, "loadType");
        int[] iArr = b.f23753a;
        int i10 = iArr[tVar.ordinal()];
        int i11 = 0;
        if (i10 != 1) {
            if (i10 == 2) {
                i11 = 0 - this.f23741d;
            } else if (i10 == 3) {
                i11 = (this.f23740c.size() - this.f23741d) - 1;
            } else {
                throw new C6535s();
            }
        }
        List e10 = C6565s.e(new W(i11, bVar.a()));
        int i12 = iArr[tVar.ordinal()];
        if (i12 == 1) {
            return C2224x.b.f24139g.c(e10, o(), n(), this.f23749l.d(), (C2219s) null);
        }
        if (i12 == 2) {
            return C2224x.b.f24139g.b(e10, o(), this.f23749l.d(), (C2219s) null);
        }
        if (i12 == 3) {
            return C2224x.b.f24139g.a(e10, n(), this.f23749l.d(), (C2219s) null);
        }
        throw new C6535s();
    }

    private C2197B(C2200E e10) {
        this.f23738a = e10;
        ArrayList arrayList = new ArrayList();
        this.f23739b = arrayList;
        this.f23740c = arrayList;
        this.f23746i = g.b(-1, (Wg.a) null, (C6798l) null, 6, (Object) null);
        this.f23747j = g.b(-1, (Wg.a) null, (C6798l) null, 6, (Object) null);
        this.f23748k = new LinkedHashMap();
        C2223w wVar = new C2223w();
        wVar.c(C2220t.REFRESH, r.b.f24096b);
        this.f23749l = wVar;
    }
}
