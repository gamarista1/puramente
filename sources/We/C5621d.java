package We;

import We.C5632i0;
import ff.C5868v;

/* renamed from: We.d  reason: case insensitive filesystem */
public final class C5621d implements C5656v {

    /* renamed from: a  reason: collision with root package name */
    private final C5656v f65839a;

    /* renamed from: b  reason: collision with root package name */
    private final C5656v f65840b;

    /* renamed from: c  reason: collision with root package name */
    private final C5656v f65841c;

    /* renamed from: We.d$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65842a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                We.k0[] r0 = We.C5636k0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f65842a = r0
                We.k0 r1 = We.C5636k0.CURRENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f65842a     // Catch:{ NoSuchFieldError -> 0x001d }
                We.k0 r1 = We.C5636k0.ISOLATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f65842a     // Catch:{ NoSuchFieldError -> 0x0028 }
                We.k0 r1 = We.C5636k0.GLOBAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f65842a     // Catch:{ NoSuchFieldError -> 0x0033 }
                We.k0 r1 = We.C5636k0.COMBINED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: We.C5621d.a.<clinit>():void");
        }
    }

    public C5621d(C5656v vVar, C5656v vVar2, C5656v vVar3) {
        this.f65839a = vVar;
        this.f65840b = vVar2;
        this.f65841c = vVar3;
    }

    private C5656v h() {
        return i((C5636k0) null);
    }

    public C5611D a() {
        this.f65841c.a();
        this.f65840b.a();
        this.f65839a.a();
        return null;
    }

    public M0 b() {
        return this.f65839a.b();
    }

    public void c(C5663y0 y0Var) {
        this.f65839a.c(y0Var);
    }

    public void clear() {
        h().clear();
    }

    public U0 d() {
        return h().d();
    }

    public C5660x e() {
        C5660x e10 = this.f65841c.e();
        if (!(e10 instanceof S)) {
            return e10;
        }
        C5660x e11 = this.f65840b.e();
        if (!(e11 instanceof S)) {
            return e11;
        }
        return this.f65839a.e();
    }

    public void f(C5868v vVar) {
        this.f65839a.f(vVar);
        this.f65840b.f(vVar);
        this.f65841c.f(vVar);
    }

    public C5632i0.a g() {
        return h().g();
    }

    /* access modifiers changed from: package-private */
    public C5656v i(C5636k0 k0Var) {
        if (k0Var != null) {
            int i10 = a.f65842a[k0Var.ordinal()];
            if (i10 == 1) {
                return this.f65841c;
            }
            if (i10 == 2) {
                return this.f65840b;
            }
            if (i10 == 3) {
                return this.f65839a;
            }
            if (i10 == 4) {
                return this;
            }
        }
        int i11 = a.f65842a[b().l().ordinal()];
        if (i11 == 1) {
            return this.f65841c;
        }
        if (i11 == 2) {
            return this.f65840b;
        }
        if (i11 != 3) {
            return this.f65841c;
        }
        return this.f65839a;
    }

    public C5656v clone() {
        return new C5621d(this.f65839a, this.f65840b.clone(), this.f65841c.clone());
    }
}
