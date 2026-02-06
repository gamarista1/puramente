package Nf;

import Eg.m;
import Eg.n;
import Ff.l;
import Lf.i;
import Of.H;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import lf.C6535s;
import mf.C6565s;
import sf.C6714a;
import yf.C6787a;
import yf.C6798l;

public final class k extends i {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ l[] f64292k = {O.i(new F(O.b(k.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: h  reason: collision with root package name */
    private final a f64293h;

    /* renamed from: i  reason: collision with root package name */
    private C6787a f64294i;

    /* renamed from: j  reason: collision with root package name */
    private final Eg.i f64295j;

    public enum a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK;

        static {
            a[] a10;
            f64300e = C6714a.a(a10);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final H f64301a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f64302b;

        public b(H h10, boolean z10) {
            C6496s.h(h10, "ownerModuleDescriptor");
            this.f64301a = h10;
            this.f64302b = z10;
        }

        public final H a() {
            return this.f64301a;
        }

        public final boolean b() {
            return this.f64302b;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f64303a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Nf.k$a[] r0 = Nf.k.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nf.k$a r1 = Nf.k.a.FROM_DEPENDENCIES     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Nf.k$a r1 = Nf.k.a.FROM_CLASS_LOADER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Nf.k$a r1 = Nf.k.a.FALLBACK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f64303a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Nf.k.c.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(n nVar, a aVar) {
        super(nVar);
        C6496s.h(nVar, "storageManager");
        C6496s.h(aVar, "kind");
        this.f64293h = aVar;
        this.f64295j = nVar.g(new h(this, nVar));
        int i10 = c.f64303a[aVar.ordinal()];
        if (i10 == 1) {
            return;
        }
        if (i10 == 2) {
            f(false);
        } else if (i10 == 3) {
            f(true);
        } else {
            throw new C6535s();
        }
    }

    /* access modifiers changed from: private */
    public static final u I0(k kVar, n nVar) {
        Rf.F r10 = kVar.r();
        C6496s.g(r10, "getBuiltInsModule(...)");
        return new u(r10, nVar, new j(kVar));
    }

    /* access modifiers changed from: private */
    public static final b J0(k kVar) {
        C6787a aVar = kVar.f64294i;
        if (aVar != null) {
            b bVar = (b) aVar.invoke();
            kVar.f64294i = null;
            return bVar;
        }
        throw new AssertionError("JvmBuiltins instance has not been initialized properly");
    }

    /* access modifiers changed from: private */
    public static final b N0(H h10, boolean z10) {
        return new b(h10, z10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public List v() {
        Iterable v10 = super.v();
        C6496s.g(v10, "getClassDescriptorFactories(...)");
        n U10 = U();
        C6496s.g(U10, "getStorageManager(...)");
        Rf.F r10 = r();
        C6496s.g(r10, "getBuiltInsModule(...)");
        return C6565s.J0(v10, new g(U10, r10, (C6798l) null, 4, (DefaultConstructorMarker) null));
    }

    public final u L0() {
        return (u) m.a(this.f64295j, this, f64292k[0]);
    }

    /* access modifiers changed from: protected */
    public Qf.c M() {
        return L0();
    }

    public final void M0(H h10, boolean z10) {
        C6496s.h(h10, "moduleDescriptor");
        O0(new i(h10, z10));
    }

    public final void O0(C6787a aVar) {
        C6496s.h(aVar, "computation");
        this.f64294i = aVar;
    }

    /* access modifiers changed from: protected */
    public Qf.a g() {
        return L0();
    }
}
