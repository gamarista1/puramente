package com.facebook.yoga;

import java.util.ArrayList;
import java.util.List;

@A8.a
public abstract class YogaNodeJNIBase extends r implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private YogaNodeJNIBase f42599a;
    @A8.a
    private float[] arr;

    /* renamed from: b  reason: collision with root package name */
    private c f42600b;

    /* renamed from: c  reason: collision with root package name */
    private List f42601c;

    /* renamed from: d  reason: collision with root package name */
    private o f42602d;

    /* renamed from: e  reason: collision with root package name */
    private b f42603e;

    /* renamed from: f  reason: collision with root package name */
    protected long f42604f;

    /* renamed from: g  reason: collision with root package name */
    private Object f42605g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f42606h;
    @A8.a
    private int mLayoutDirection;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f42607a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.yoga.j[] r0 = com.facebook.yoga.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42607a = r0
                com.facebook.yoga.j r1 = com.facebook.yoga.j.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42607a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.yoga.j r1 = com.facebook.yoga.j.TOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42607a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.yoga.j r1 = com.facebook.yoga.j.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f42607a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.yoga.j r1 = com.facebook.yoga.j.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f42607a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.yoga.j r1 = com.facebook.yoga.j.START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f42607a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.yoga.j r1 = com.facebook.yoga.j.END     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaNodeJNIBase.a.<clinit>():void");
        }
    }

    private YogaNodeJNIBase(long j10) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f42606h = true;
        if (j10 != 0) {
            this.f42604f = j10;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    private void r0(r rVar) {
        s0();
    }

    @A8.a
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List list = this.f42601c;
        if (list != null) {
            list.remove(i10);
            this.f42601c.add(i10, yogaNodeJNIBase);
            yogaNodeJNIBase.f42599a = this;
            return yogaNodeJNIBase.f42604f;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    private static YogaValue u0(long j10) {
        return new YogaValue(Float.intBitsToFloat((int) j10), (int) (j10 >> 32));
    }

    public void A(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f42604f, f10);
    }

    public void B(b bVar) {
        boolean z10;
        this.f42603e = bVar;
        long j10 = this.f42604f;
        if (bVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(j10, z10);
    }

    public void C(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f42604f, jVar.c(), f10);
    }

    public void D(Object obj) {
        this.f42605g = obj;
    }

    public void E(h hVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f42604f, hVar.c());
    }

    public void F(i iVar) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f42604f, iVar.b());
    }

    public void G(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f42604f, f10);
    }

    public void H(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f42604f, f10);
    }

    public void I() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f42604f);
    }

    public void J(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f42604f, f10);
    }

    public void K(l lVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f42604f, lVar.b());
    }

    public void L(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f42604f, f10);
    }

    public void M(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f42604f, f10);
    }

    public void N(m mVar, float f10) {
        YogaNative.jni_YGNodeStyleSetGapJNI(this.f42604f, mVar.b(), f10);
    }

    public void O(m mVar, float f10) {
        YogaNative.jni_YGNodeStyleSetGapPercentJNI(this.f42604f, mVar.b(), f10);
    }

    public void P(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f42604f, f10);
    }

    public void Q() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f42604f);
    }

    public void R(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f42604f, f10);
    }

    public void S(n nVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f42604f, nVar.b());
    }

    public void T(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f42604f, jVar.c(), f10);
    }

    public void U(j jVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f42604f, jVar.c());
    }

    public void V(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f42604f, jVar.c(), f10);
    }

    public void W(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f42604f, f10);
    }

    public void X(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f42604f, f10);
    }

    public void Y(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f42604f, f10);
    }

    public void Z(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f42604f, f10);
    }

    public void a(r rVar, int i10) {
        if (rVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) rVar;
            if (yogaNodeJNIBase.f42599a == null) {
                if (this.f42601c == null) {
                    this.f42601c = new ArrayList(4);
                }
                this.f42601c.add(i10, yogaNodeJNIBase);
                yogaNodeJNIBase.f42599a = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.f42604f, yogaNodeJNIBase.f42604f, i10);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    public void a0(o oVar) {
        boolean z10;
        this.f42602d = oVar;
        long j10 = this.f42604f;
        if (oVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(j10, z10);
    }

    public void b0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f42604f, f10);
    }

    @A8.a
    public final float baseline(float f10, float f11) {
        return this.f42603e.a(this, f10, f11);
    }

    public void c(float f10, float f11) {
        r0((r) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i10);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f42601c;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.r0(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].f42604f;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f42604f, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    public void c0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f42604f, f10);
    }

    public void d() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f42604f);
    }

    public void d0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f42604f, f10);
    }

    public float e() {
        return YogaNative.jni_YGNodeStyleGetFlexJNI(this.f42604f);
    }

    public void e0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f42604f, f10);
    }

    public YogaValue g() {
        return u0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f42604f));
    }

    public void g0(u uVar) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f42604f, uVar.b());
    }

    public h h() {
        int i10;
        float[] fArr = this.arr;
        if (fArr != null) {
            i10 = (int) fArr[5];
        } else {
            i10 = this.mLayoutDirection;
        }
        return h.b(i10);
    }

    public float i() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    public void i0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f42604f, jVar.c(), f10);
    }

    public float j(j jVar) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i10 = 0;
        float f10 = fArr[0];
        if ((((int) f10) & 2) != 2) {
            return 0.0f;
        }
        if ((((int) f10) & 1) != 1) {
            i10 = 4;
        }
        int i11 = 10 - i10;
        switch (a.f42607a[jVar.ordinal()]) {
            case 1:
                return this.arr[i11];
            case 2:
                return this.arr[11 - i10];
            case 3:
                return this.arr[12 - i10];
            case 4:
                return this.arr[13 - i10];
            case 5:
                if (h() == h.RTL) {
                    return this.arr[12 - i10];
                }
                return this.arr[i11];
            case 6:
                if (h() == h.RTL) {
                    return this.arr[i11];
                }
                return this.arr[12 - i10];
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    public void j0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f42604f, jVar.c(), f10);
    }

    public float k() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    public void k0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f42604f, jVar.c(), f10);
    }

    public float l() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    public void l0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f42604f, jVar.c(), f10);
    }

    public float m() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    public void m0(v vVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f42604f, vVar.b());
    }

    @A8.a
    public final long measure(float f10, int i10, float f11, int i11) {
        if (s()) {
            return this.f42602d.a(this, f10, p.b(i10), f11, p.b(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    public void n0(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f42604f, f10);
    }

    public YogaValue o(j jVar) {
        return u0(YogaNative.jni_YGNodeStyleGetPaddingJNI(this.f42604f, jVar.c()));
    }

    public void o0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f42604f);
    }

    public YogaValue p() {
        return u0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f42604f));
    }

    public void p0(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f42604f, f10);
    }

    public boolean q() {
        float[] fArr = this.arr;
        if (fArr == null) {
            return this.f42606h;
        }
        if ((((int) fArr[0]) & 16) == 16) {
            return true;
        }
        return false;
    }

    public void q0(x xVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f42604f, xVar.b());
    }

    public boolean r() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f42604f);
    }

    public boolean s() {
        if (this.f42602d != null) {
            return true;
        }
        return false;
    }

    public Object s0() {
        return this.f42605g;
    }

    public void t() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = (float) (((int) fArr[0]) & -17);
        }
        this.f42606h = false;
    }

    /* renamed from: t0 */
    public YogaNodeJNIBase u(int i10) {
        List list = this.f42601c;
        if (list != null) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) list.remove(i10);
            yogaNodeJNIBase.f42599a = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.f42604f, yogaNodeJNIBase.f42604f);
            return yogaNodeJNIBase;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    public void w() {
        this.f42602d = null;
        this.f42603e = null;
        this.f42605g = null;
        this.arr = null;
        this.f42606h = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f42604f);
    }

    public void x(a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f42604f, aVar.b());
    }

    public void y(a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f42604f, aVar.b());
    }

    public void z(a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f42604f, aVar.b());
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    YogaNodeJNIBase(c cVar) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((e) cVar).f42625a));
        this.f42600b = cVar;
    }
}
