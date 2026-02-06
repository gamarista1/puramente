package i1;

import j1.C2121b;
import java.util.HashSet;

/* renamed from: i1.m  reason: case insensitive filesystem */
public abstract class C2071m extends C2068j {

    /* renamed from: X0  reason: collision with root package name */
    private int f22035X0 = 0;

    /* renamed from: Y0  reason: collision with root package name */
    private int f22036Y0 = 0;

    /* renamed from: Z0  reason: collision with root package name */
    private int f22037Z0 = 0;

    /* renamed from: a1  reason: collision with root package name */
    private int f22038a1 = 0;

    /* renamed from: b1  reason: collision with root package name */
    private int f22039b1 = 0;

    /* renamed from: c1  reason: collision with root package name */
    private int f22040c1 = 0;

    /* renamed from: d1  reason: collision with root package name */
    private int f22041d1 = 0;

    /* renamed from: e1  reason: collision with root package name */
    private int f22042e1 = 0;

    /* renamed from: f1  reason: collision with root package name */
    private boolean f22043f1 = false;

    /* renamed from: g1  reason: collision with root package name */
    private int f22044g1 = 0;

    /* renamed from: h1  reason: collision with root package name */
    private int f22045h1 = 0;

    /* renamed from: i1  reason: collision with root package name */
    protected C2121b.a f22046i1 = new C2121b.a();

    /* renamed from: j1  reason: collision with root package name */
    C2121b.C0361b f22047j1 = null;

    public int A1() {
        return this.f22036Y0;
    }

    public int B1() {
        return this.f22041d1;
    }

    public int C1() {
        return this.f22042e1;
    }

    public int D1() {
        return this.f22035X0;
    }

    public boolean E1() {
        return this.f22043f1;
    }

    /* access modifiers changed from: protected */
    public void F1(boolean z10) {
        this.f22043f1 = z10;
    }

    public void b(C2064f fVar) {
        y1();
    }

    public void y1() {
        for (int i10 = 0; i10 < this.f22033W0; i10++) {
            C2063e eVar = this.f22032V0[i10];
            if (eVar != null) {
                eVar.Z0(true);
            }
        }
    }

    public boolean z1(HashSet hashSet) {
        for (int i10 = 0; i10 < this.f22033W0; i10++) {
            if (hashSet.contains(this.f22032V0[i10])) {
                return true;
            }
        }
        return false;
    }
}
