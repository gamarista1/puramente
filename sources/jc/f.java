package Jc;

import Ff.l;
import Hc.C4299b;
import Hc.w;
import Hc.x;
import L1.d;
import L1.e;
import Tg.a;
import Ug.K;
import android.content.Context;
import android.util.Log;
import jc.C5046e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.O;
import qf.C6658d;
import qf.g;
import ub.C5226c;
import ub.n;
import yf.C6798l;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final b f51390c = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final Bf.c f51391d = K1.a.b(x.f51048a.b(), new J1.b(a.f51394a), (C6798l) null, (K) null, 12, (Object) null);

    /* renamed from: a  reason: collision with root package name */
    private final h f51392a;

    /* renamed from: b  reason: collision with root package name */
    private final h f51393b;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f51394a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final d invoke(I1.a aVar) {
            C6496s.h(aVar, "ex");
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + w.f51047a.e() + '.', aVar);
            return e.a();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ l[] f51395a = {O.j(new H(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final I1.f b(Context context) {
            return (I1.f) f.f51391d.a(context, f51395a[0]);
        }

        public final f c() {
            Object k10 = n.a(C5226c.f61678a).k(f.class);
            C6496s.g(k10, "Firebase.app[SessionsSettings::class.java]");
            return (f) k10;
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f51396a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f51397b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f51398c;

        /* renamed from: d  reason: collision with root package name */
        int f51399d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, C6658d dVar) {
            super(dVar);
            this.f51398c = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f51397b = obj;
            this.f51399d |= Integer.MIN_VALUE;
            return this.f51398c.g(this);
        }
    }

    public f(h hVar, h hVar2) {
        C6496s.h(hVar, "localOverrideSettings");
        C6496s.h(hVar2, "remoteSettings");
        this.f51392a = hVar;
        this.f51393b = hVar2;
    }

    private final boolean e(double d10) {
        if (0.0d > d10 || d10 > 1.0d) {
            return false;
        }
        return true;
    }

    private final boolean f(long j10) {
        if (!Tg.a.N(j10) || !Tg.a.F(j10)) {
            return false;
        }
        return true;
    }

    public final double b() {
        Double c10 = this.f51392a.c();
        if (c10 != null) {
            double doubleValue = c10.doubleValue();
            if (e(doubleValue)) {
                return doubleValue;
            }
        }
        Double c11 = this.f51393b.c();
        if (c11 == null) {
            return 1.0d;
        }
        double doubleValue2 = c11.doubleValue();
        if (e(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    public final long c() {
        Tg.a b10 = this.f51392a.b();
        if (b10 != null) {
            long X10 = b10.X();
            if (f(X10)) {
                return X10;
            }
        }
        Tg.a b11 = this.f51393b.b();
        if (b11 != null) {
            long X11 = b11.X();
            if (f(X11)) {
                return X11;
            }
        }
        a.C0955a aVar = Tg.a.f65168b;
        return Tg.c.s(30, Tg.d.MINUTES);
    }

    public final boolean d() {
        Boolean a10 = this.f51392a.a();
        if (a10 != null) {
            return a10.booleanValue();
        }
        Boolean a11 = this.f51393b.a();
        if (a11 != null) {
            return a11.booleanValue();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(qf.C6658d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Jc.f.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Jc.f$c r0 = (Jc.f.c) r0
            int r1 = r0.f51399d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f51399d = r1
            goto L_0x0018
        L_0x0013:
            Jc.f$c r0 = new Jc.f$c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f51397b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f51399d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            lf.w.b(r6)
            goto L_0x005b
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.f51396a
            Jc.f r2 = (Jc.f) r2
            lf.w.b(r6)
            goto L_0x004d
        L_0x003c:
            lf.w.b(r6)
            Jc.h r6 = r5.f51392a
            r0.f51396a = r5
            r0.f51399d = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r2 = r5
        L_0x004d:
            Jc.h r6 = r2.f51393b
            r2 = 0
            r0.f51396a = r2
            r0.f51399d = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L_0x005b
            return r1
        L_0x005b:
            lf.M r6 = lf.C6514M.f71813a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Jc.f.g(qf.d):java.lang.Object");
    }

    private f(Context context, g gVar, g gVar2, C5046e eVar, C4299b bVar) {
        this(new b(context), new c(gVar2, eVar, bVar, new d(bVar, gVar, (String) null, 4, (DefaultConstructorMarker) null), f51390c.b(context)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(ub.C5230g r8, qf.g r9, qf.g r10, jc.C5046e r11) {
        /*
            r7 = this;
            java.lang.String r0 = "firebaseApp"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            java.lang.String r0 = "blockingDispatcher"
            kotlin.jvm.internal.C6496s.h(r9, r0)
            java.lang.String r0 = "backgroundDispatcher"
            kotlin.jvm.internal.C6496s.h(r10, r0)
            java.lang.String r0 = "firebaseInstallationsApi"
            kotlin.jvm.internal.C6496s.h(r11, r0)
            android.content.Context r2 = r8.m()
            java.lang.String r0 = "firebaseApp.applicationContext"
            kotlin.jvm.internal.C6496s.g(r2, r0)
            Hc.B r0 = Hc.B.f50908a
            Hc.b r6 = r0.b(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Jc.f.<init>(ub.g, qf.g, qf.g, jc.e):void");
    }
}
