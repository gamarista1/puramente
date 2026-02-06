package M;

import Q0.L;
import W0.I;
import W0.Q;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import q0.C2423i;
import r0.C2466S;
import r0.M1;
import yf.C6798l;

public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f4237a;

    /* renamed from: b  reason: collision with root package name */
    private final l0 f4238b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f4239c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f4240d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4241e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4242f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4243g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4244h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4245i;

    /* renamed from: j  reason: collision with root package name */
    private Q f4246j;

    /* renamed from: k  reason: collision with root package name */
    private L f4247k;

    /* renamed from: l  reason: collision with root package name */
    private I f4248l;

    /* renamed from: m  reason: collision with root package name */
    private C2423i f4249m;

    /* renamed from: n  reason: collision with root package name */
    private C2423i f4250n;

    /* renamed from: o  reason: collision with root package name */
    private final CursorAnchorInfo.Builder f4251o = new CursorAnchorInfo.Builder();

    /* renamed from: p  reason: collision with root package name */
    private final float[] f4252p = M1.c((float[]) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: q  reason: collision with root package name */
    private final Matrix f4253q = new Matrix();

    public p0(C6798l lVar, l0 l0Var) {
        this.f4237a = lVar;
        this.f4238b = l0Var;
    }

    private final void c() {
        if (this.f4238b.a() && this.f4246j != null && this.f4248l != null && this.f4247k != null && this.f4249m != null && this.f4250n != null) {
            M1.h(this.f4252p);
            this.f4237a.invoke(M1.a(this.f4252p));
            float[] fArr = this.f4252p;
            C2423i iVar = this.f4250n;
            C6496s.e(iVar);
            C2423i iVar2 = this.f4250n;
            C6496s.e(iVar2);
            M1.p(fArr, -iVar.i(), -iVar2.l(), 0.0f);
            C2466S.a(this.f4253q, this.f4252p);
            l0 l0Var = this.f4238b;
            CursorAnchorInfo.Builder builder = this.f4251o;
            Q q10 = this.f4246j;
            C6496s.e(q10);
            I i10 = this.f4248l;
            C6496s.e(i10);
            L l10 = this.f4247k;
            C6496s.e(l10);
            Matrix matrix = this.f4253q;
            C2423i iVar3 = this.f4249m;
            C6496s.e(iVar3);
            C2423i iVar4 = this.f4250n;
            C6496s.e(iVar4);
            l0Var.e(o0.b(builder, q10, i10, l10, matrix, iVar3, iVar4, this.f4242f, this.f4243g, this.f4244h, this.f4245i));
            this.f4241e = false;
        }
    }

    public final void a() {
        synchronized (this.f4239c) {
            this.f4246j = null;
            this.f4248l = null;
            this.f4247k = null;
            this.f4249m = null;
            this.f4250n = null;
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final void b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        synchronized (this.f4239c) {
            try {
                this.f4242f = z12;
                this.f4243g = z13;
                this.f4244h = z14;
                this.f4245i = z15;
                if (z10) {
                    this.f4241e = true;
                    if (this.f4246j != null) {
                        c();
                    }
                }
                this.f4240d = z11;
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(Q q10, I i10, L l10, C2423i iVar, C2423i iVar2) {
        synchronized (this.f4239c) {
            try {
                this.f4246j = q10;
                this.f4248l = i10;
                this.f4247k = l10;
                this.f4249m = iVar;
                this.f4250n = iVar2;
                if (!this.f4241e) {
                    if (this.f4240d) {
                    }
                    C6514M m10 = C6514M.f71813a;
                }
                c();
                C6514M m102 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
