package androidx.compose.ui.platform;

import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.C1521x;
import Y.I0;
import Y.J0;
import Y.L;
import Y.M;
import Y.M0;
import Y.P;
import Y.Y0;
import Y.o1;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.platform.r;
import h0.C2025i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6527k;
import x3.C2914f;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\" \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\" \u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0000X\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00168\u0006¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b)\u0010\u0019\" \u0010/\u001a\b\u0012\u0004\u0012\u00020+0\u00168FX\u0004¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0019¨\u00060²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u0002"}, d2 = {"Landroidx/compose/ui/platform/r;", "owner", "Lkotlin/Function0;", "Llf/M;", "content", "a", "(Landroidx/compose/ui/platform/r;Lyf/p;LY/m;I)V", "Landroid/content/Context;", "context", "LM0/f;", "n", "(Landroid/content/Context;LY/m;I)LM0/f;", "Landroid/content/res/Configuration;", "configuration", "LM0/d;", "m", "(Landroid/content/Context;Landroid/content/res/Configuration;LY/m;I)LM0/d;", "", "name", "", "l", "(Ljava/lang/String;)Ljava/lang/Void;", "LY/I0;", "LY/I0;", "f", "()LY/I0;", "LocalConfiguration", "b", "g", "LocalContext", "c", "h", "LocalImageVectorCache", "d", "i", "LocalResourceIdCache", "Lx3/f;", "e", "j", "LocalSavedStateRegistryOwner", "Landroid/view/View;", "k", "LocalView", "Landroidx/lifecycle/v;", "getLocalLifecycleOwner", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a  reason: collision with root package name */
    private static final I0 f13461a = C1521x.d((o1) null, a.f13467a, 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    private static final I0 f13462b = C1521x.f(b.f13468a);

    /* renamed from: c  reason: collision with root package name */
    private static final I0 f13463c = C1521x.f(c.f13469a);

    /* renamed from: d  reason: collision with root package name */
    private static final I0 f13464d = C1521x.f(d.f13470a);

    /* renamed from: e  reason: collision with root package name */
    private static final I0 f13465e = C1521x.f(e.f13471a);

    /* renamed from: f  reason: collision with root package name */
    private static final I0 f13466f = C1521x.f(f.f13472a);

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13467a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final Configuration invoke() {
            Void unused = AndroidCompositionLocals_androidKt.l("LocalConfiguration");
            throw new C6527k();
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13468a = new b();

        b() {
            super(0);
        }

        /* renamed from: a */
        public final Context invoke() {
            Void unused = AndroidCompositionLocals_androidKt.l("LocalContext");
            throw new C6527k();
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f13469a = new c();

        c() {
            super(0);
        }

        /* renamed from: a */
        public final M0.d invoke() {
            Void unused = AndroidCompositionLocals_androidKt.l("LocalImageVectorCache");
            throw new C6527k();
        }
    }

    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f13470a = new d();

        d() {
            super(0);
        }

        /* renamed from: a */
        public final M0.f invoke() {
            Void unused = AndroidCompositionLocals_androidKt.l("LocalResourceIdCache");
            throw new C6527k();
        }
    }

    static final class e extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f13471a = new e();

        e() {
            super(0);
        }

        /* renamed from: a */
        public final C2914f invoke() {
            Void unused = AndroidCompositionLocals_androidKt.l("LocalSavedStateRegistryOwner");
            throw new C6527k();
        }
    }

    static final class f extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final f f13472a = new f();

        f() {
            super(0);
        }

        /* renamed from: a */
        public final View invoke() {
            Void unused = AndroidCompositionLocals_androidKt.l("LocalView");
            throw new C6527k();
        }
    }

    static final class g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1510r0 f13473a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C1510r0 r0Var) {
            super(1);
            this.f13473a = r0Var;
        }

        public final void a(Configuration configuration) {
            AndroidCompositionLocals_androidKt.c(this.f13473a, new Configuration(configuration));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Configuration) obj);
            return C6514M.f71813a;
        }
    }

    static final class h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1655o0 f13474a;

        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1655o0 f13475a;

            public a(C1655o0 o0Var) {
                this.f13475a = o0Var;
            }

            public void dispose() {
                this.f13475a.c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C1655o0 o0Var) {
            super(1);
            this.f13474a = o0Var;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            return new a(this.f13474a);
        }
    }

    static final class i extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f13476a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ W f13477b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f13478c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(r rVar, W w10, p pVar) {
            super(2);
            this.f13476a = rVar;
            this.f13477b = w10;
            this.f13478c = pVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(1471621628, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:131)");
                }
                C1644k0.a(this.f13476a, this.f13477b, this.f13478c, mVar, 0);
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class j extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f13479a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f13480b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f13481c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(r rVar, p pVar, int i10) {
            super(2);
            this.f13479a = rVar;
            this.f13480b = pVar;
            this.f13481c = i10;
        }

        public final void a(C1500m mVar, int i10) {
            AndroidCompositionLocals_androidKt.a(this.f13479a, this.f13480b, mVar, M0.a(this.f13481c | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class k extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f13482a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f13483b;

        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f13484a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l f13485b;

            public a(Context context, l lVar) {
                this.f13484a = context;
                this.f13485b = lVar;
            }

            public void dispose() {
                this.f13484a.getApplicationContext().unregisterComponentCallbacks(this.f13485b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(Context context, l lVar) {
            super(1);
            this.f13482a = context;
            this.f13483b = lVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f13482a.getApplicationContext().registerComponentCallbacks(this.f13483b);
            return new a(this.f13482a, this.f13483b);
        }
    }

    public static final class l implements ComponentCallbacks2 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Configuration f13486a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ M0.d f13487b;

        l(Configuration configuration, M0.d dVar) {
            this.f13486a = configuration;
            this.f13487b = dVar;
        }

        public void onConfigurationChanged(Configuration configuration) {
            this.f13487b.c(this.f13486a.updateFrom(configuration));
            this.f13486a.setTo(configuration);
        }

        public void onLowMemory() {
            this.f13487b.a();
        }

        public void onTrimMemory(int i10) {
            this.f13487b.a();
        }
    }

    static final class m extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f13488a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f13489b;

        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f13490a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ n f13491b;

            public a(Context context, n nVar) {
                this.f13490a = context;
                this.f13491b = nVar;
            }

            public void dispose() {
                this.f13490a.getApplicationContext().unregisterComponentCallbacks(this.f13491b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(Context context, n nVar) {
            super(1);
            this.f13488a = context;
            this.f13489b = nVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f13488a.getApplicationContext().registerComponentCallbacks(this.f13489b);
            return new a(this.f13488a, this.f13489b);
        }
    }

    public static final class n implements ComponentCallbacks2 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ M0.f f13492a;

        n(M0.f fVar) {
            this.f13492a = fVar;
        }

        public void onConfigurationChanged(Configuration configuration) {
            this.f13492a.a();
        }

        public void onLowMemory() {
            this.f13492a.a();
        }

        public void onTrimMemory(int i10) {
            this.f13492a.a();
        }
    }

    public static final void a(r rVar, p pVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        r rVar2 = rVar;
        p pVar2 = pVar;
        int i14 = i10;
        C1500m h10 = mVar.h(1396852028);
        if ((i14 & 6) == 0) {
            if (h10.C(rVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i14;
        } else {
            i11 = i14;
        }
        if ((i14 & 48) == 0) {
            if (h10.C(pVar2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(1396852028, i11, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:91)");
            }
            Context context = rVar.getContext();
            Object A10 = h10.A();
            C1500m.a aVar = C1500m.f10026a;
            if (A10 == aVar.a()) {
                A10 = u1.d(new Configuration(context.getResources().getConfiguration()), (o1) null, 2, (Object) null);
                h10.r(A10);
            }
            C1510r0 r0Var = (C1510r0) A10;
            Object A11 = h10.A();
            if (A11 == aVar.a()) {
                A11 = new g(r0Var);
                h10.r(A11);
            }
            rVar2.setConfigurationChangeObserver((C6798l) A11);
            Object A12 = h10.A();
            if (A12 == aVar.a()) {
                A12 = new W(context);
                h10.r(A12);
            }
            W w10 = (W) A12;
            r.b viewTreeOwners = rVar.getViewTreeOwners();
            if (viewTreeOwners != null) {
                Object A13 = h10.A();
                if (A13 == aVar.a()) {
                    A13 = C1659q0.b(rVar2, viewTreeOwners.b());
                    h10.r(A13);
                }
                C1655o0 o0Var = (C1655o0) A13;
                C6514M m10 = C6514M.f71813a;
                boolean C10 = h10.C(o0Var);
                Object A14 = h10.A();
                if (C10 || A14 == aVar.a()) {
                    A14 = new h(o0Var);
                    h10.r(A14);
                }
                P.c(m10, (C6798l) A14, h10, 6);
                C1521x.b(new J0[]{f13461a.d(b(r0Var)), f13462b.d(context), X1.a.a().d(viewTreeOwners.a()), f13465e.d(viewTreeOwners.b()), C2025i.d().d(o0Var), f13466f.d(rVar.getView()), f13463c.d(m(context, b(r0Var), h10, 0)), f13464d.d(n(context, h10, 0)), C1644k0.m().d(Boolean.valueOf(((Boolean) h10.m(C1644k0.n())).booleanValue() | rVar.getScrollCaptureInProgress$ui_release()))}, g0.c.e(1471621628, true, new i(rVar2, w10, pVar2), h10, 54), h10, J0.f9784i | 48);
                if (C1506p.H()) {
                    C1506p.P();
                }
            } else {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new j(rVar2, pVar2, i14));
        }
    }

    private static final Configuration b(C1510r0 r0Var) {
        return (Configuration) r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void c(C1510r0 r0Var, Configuration configuration) {
        r0Var.setValue(configuration);
    }

    public static final I0 f() {
        return f13461a;
    }

    public static final I0 g() {
        return f13462b;
    }

    public static final I0 getLocalLifecycleOwner() {
        return X1.a.a();
    }

    public static final I0 h() {
        return f13463c;
    }

    public static final I0 i() {
        return f13464d;
    }

    public static final I0 j() {
        return f13465e;
    }

    public static final I0 k() {
        return f13466f;
    }

    /* access modifiers changed from: private */
    public static final Void l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    private static final M0.d m(Context context, Configuration configuration, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-485908294, i10, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:172)");
        }
        Object A10 = mVar.A();
        C1500m.a aVar = C1500m.f10026a;
        if (A10 == aVar.a()) {
            A10 = new M0.d();
            mVar.r(A10);
        }
        M0.d dVar = (M0.d) A10;
        Object A11 = mVar.A();
        Configuration configuration2 = A11;
        if (A11 == aVar.a()) {
            Configuration configuration3 = new Configuration();
            if (configuration != null) {
                configuration3.setTo(configuration);
            }
            mVar.r(configuration3);
            configuration2 = configuration3;
        }
        Configuration configuration4 = (Configuration) configuration2;
        Object A12 = mVar.A();
        if (A12 == aVar.a()) {
            A12 = new l(configuration4, dVar);
            mVar.r(A12);
        }
        l lVar = (l) A12;
        boolean C10 = mVar.C(context);
        Object A13 = mVar.A();
        if (C10 || A13 == aVar.a()) {
            A13 = new k(context, lVar);
            mVar.r(A13);
        }
        P.c(dVar, (C6798l) A13, mVar, 0);
        if (C1506p.H()) {
            C1506p.P();
        }
        return dVar;
    }

    private static final M0.f n(Context context, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-1348507246, i10, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:141)");
        }
        Object A10 = mVar.A();
        C1500m.a aVar = C1500m.f10026a;
        if (A10 == aVar.a()) {
            A10 = new M0.f();
            mVar.r(A10);
        }
        M0.f fVar = (M0.f) A10;
        Object A11 = mVar.A();
        if (A11 == aVar.a()) {
            A11 = new n(fVar);
            mVar.r(A11);
        }
        n nVar = (n) A11;
        boolean C10 = mVar.C(context);
        Object A12 = mVar.A();
        if (C10 || A12 == aVar.a()) {
            A12 = new m(context, nVar);
            mVar.r(A12);
        }
        P.c(fVar, (C6798l) A12, mVar, 0);
        if (C1506p.H()) {
            C1506p.P();
        }
        return fVar;
    }
}
