package W9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ja.C3645a;
import ja.M;
import ja.s;
import ja.w;
import java.util.Collections;
import java.util.List;
import k9.C3694f;
import k9.C3717q0;
import k9.C3718r0;
import k9.b1;

public final class o extends C3694f implements Handler.Callback {

    /* renamed from: A  reason: collision with root package name */
    private int f34979A;

    /* renamed from: B  reason: collision with root package name */
    private long f34980B;

    /* renamed from: n  reason: collision with root package name */
    private final Handler f34981n;

    /* renamed from: o  reason: collision with root package name */
    private final n f34982o;

    /* renamed from: p  reason: collision with root package name */
    private final k f34983p;

    /* renamed from: q  reason: collision with root package name */
    private final C3718r0 f34984q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f34985r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f34986s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f34987t;

    /* renamed from: u  reason: collision with root package name */
    private int f34988u;

    /* renamed from: v  reason: collision with root package name */
    private C3717q0 f34989v;

    /* renamed from: w  reason: collision with root package name */
    private i f34990w;

    /* renamed from: x  reason: collision with root package name */
    private l f34991x;

    /* renamed from: y  reason: collision with root package name */
    private m f34992y;

    /* renamed from: z  reason: collision with root package name */
    private m f34993z;

    public o(n nVar, Looper looper) {
        this(nVar, looper, k.f34975a);
    }

    private void X() {
        g0(Collections.emptyList());
    }

    private long Y() {
        if (this.f34979A == -1) {
            return Long.MAX_VALUE;
        }
        C3645a.e(this.f34992y);
        if (this.f34979A >= this.f34992y.e()) {
            return Long.MAX_VALUE;
        }
        return this.f34992y.c(this.f34979A);
    }

    private void Z(j jVar) {
        s.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f34989v, jVar);
        X();
        e0();
    }

    private void a0() {
        this.f34987t = true;
        this.f34990w = this.f34983p.b((C3717q0) C3645a.e(this.f34989v));
    }

    private void b0(List list) {
        this.f34982o.g(list);
        this.f34982o.J(new e(list));
    }

    private void c0() {
        this.f34991x = null;
        this.f34979A = -1;
        m mVar = this.f34992y;
        if (mVar != null) {
            mVar.u();
            this.f34992y = null;
        }
        m mVar2 = this.f34993z;
        if (mVar2 != null) {
            mVar2.u();
            this.f34993z = null;
        }
    }

    private void d0() {
        c0();
        ((i) C3645a.e(this.f34990w)).release();
        this.f34990w = null;
        this.f34988u = 0;
    }

    private void e0() {
        d0();
        a0();
    }

    private void g0(List list) {
        Handler handler = this.f34981n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            b0(list);
        }
    }

    /* access modifiers changed from: protected */
    public void N() {
        this.f34989v = null;
        this.f34980B = -9223372036854775807L;
        X();
        d0();
    }

    /* access modifiers changed from: protected */
    public void P(long j10, boolean z10) {
        X();
        this.f34985r = false;
        this.f34986s = false;
        this.f34980B = -9223372036854775807L;
        if (this.f34988u != 0) {
            e0();
            return;
        }
        c0();
        ((i) C3645a.e(this.f34990w)).flush();
    }

    /* access modifiers changed from: protected */
    public void T(C3717q0[] q0VarArr, long j10, long j11) {
        this.f34989v = q0VarArr[0];
        if (this.f34990w != null) {
            this.f34988u = 1;
        } else {
            a0();
        }
    }

    public int a(C3717q0 q0Var) {
        int i10;
        if (this.f34983p.a(q0Var)) {
            if (q0Var.f45757E == 0) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            return b1.o(i10);
        } else if (w.r(q0Var.f45770l)) {
            return b1.o(1);
        } else {
            return b1.o(0);
        }
    }

    public boolean b() {
        return this.f34986s;
    }

    public boolean d() {
        return true;
    }

    public void f0(long j10) {
        C3645a.f(r());
        this.f34980B = j10;
    }

    public void g(long j10, long j11) {
        boolean z10;
        if (r()) {
            long j12 = this.f34980B;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                c0();
                this.f34986s = true;
            }
        }
        if (!this.f34986s) {
            if (this.f34993z == null) {
                ((i) C3645a.e(this.f34990w)).b(j10);
                try {
                    this.f34993z = (m) ((i) C3645a.e(this.f34990w)).a();
                } catch (j e10) {
                    Z(e10);
                    return;
                }
            }
            if (getState() == 2) {
                if (this.f34992y != null) {
                    long Y10 = Y();
                    z10 = false;
                    while (Y10 <= j10) {
                        this.f34979A++;
                        Y10 = Y();
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                m mVar = this.f34993z;
                if (mVar != null) {
                    if (mVar.p()) {
                        if (!z10 && Y() == Long.MAX_VALUE) {
                            if (this.f34988u == 2) {
                                e0();
                            } else {
                                c0();
                                this.f34986s = true;
                            }
                        }
                    } else if (mVar.f46958b <= j10) {
                        m mVar2 = this.f34992y;
                        if (mVar2 != null) {
                            mVar2.u();
                        }
                        this.f34979A = mVar.a(j10);
                        this.f34992y = mVar;
                        this.f34993z = null;
                        z10 = true;
                    }
                }
                if (z10) {
                    C3645a.e(this.f34992y);
                    g0(this.f34992y.b(j10));
                }
                if (this.f34988u != 2) {
                    while (!this.f34985r) {
                        try {
                            l lVar = this.f34991x;
                            if (lVar == null) {
                                lVar = (l) ((i) C3645a.e(this.f34990w)).d();
                                if (lVar != null) {
                                    this.f34991x = lVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.f34988u == 1) {
                                lVar.t(4);
                                ((i) C3645a.e(this.f34990w)).c(lVar);
                                this.f34991x = null;
                                this.f34988u = 2;
                                return;
                            }
                            int U10 = U(this.f34984q, lVar, 0);
                            if (U10 == -4) {
                                if (lVar.p()) {
                                    this.f34985r = true;
                                    this.f34987t = false;
                                } else {
                                    C3717q0 q0Var = this.f34984q.f45824b;
                                    if (q0Var != null) {
                                        lVar.f34976i = q0Var.f45774p;
                                        lVar.y();
                                        this.f34987t &= !lVar.s();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.f34987t) {
                                    ((i) C3645a.e(this.f34990w)).c(lVar);
                                    this.f34991x = null;
                                }
                            } else if (U10 == -3) {
                                return;
                            }
                        } catch (j e11) {
                            Z(e11);
                            return;
                        }
                    }
                }
            }
        }
    }

    public String getName() {
        return "TextRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            b0((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public o(n nVar, Looper looper, k kVar) {
        super(3);
        Handler handler;
        this.f34982o = (n) C3645a.e(nVar);
        if (looper == null) {
            handler = null;
        } else {
            handler = M.v(looper, this);
        }
        this.f34981n = handler;
        this.f34983p = kVar;
        this.f34984q = new C3718r0();
        this.f34980B = -9223372036854775807L;
    }
}
