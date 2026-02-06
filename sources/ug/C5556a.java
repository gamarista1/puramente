package Ug;

import qf.C6658d;
import qf.g;
import yf.C6798l;
import yf.p;

/* renamed from: Ug.a  reason: case insensitive filesystem */
public abstract class C5556a extends E0 implements C5600w0, C6658d, K {

    /* renamed from: c  reason: collision with root package name */
    private final g f65347c;

    public C5556a(g gVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            r0((C5600w0) gVar.b(C5600w0.f65416O));
        }
        this.f65347c = gVar.n1(this);
    }

    public String D0() {
        String b10 = F.b(this.f65347c);
        if (b10 == null) {
            return super.D0();
        }
        return '\"' + b10 + "\":" + super.D0();
    }

    /* access modifiers changed from: protected */
    public final void J0(Object obj) {
        if (obj instanceof B) {
            B b10 = (B) obj;
            d1(b10.f65278a, b10.a());
            return;
        }
        e1(obj);
    }

    /* access modifiers changed from: protected */
    public String R() {
        return O.a(this) + " was cancelled";
    }

    public boolean a() {
        return super.a();
    }

    /* access modifiers changed from: protected */
    public void c1(Object obj) {
        A(obj);
    }

    public final void f1(M m10, Object obj, p pVar) {
        m10.b(pVar, obj, this);
    }

    public final g getContext() {
        return this.f65347c;
    }

    public g getCoroutineContext() {
        return this.f65347c;
    }

    public final void q0(Throwable th2) {
        I.a(this.f65347c, th2);
    }

    public final void resumeWith(Object obj) {
        Object A02 = A0(E.d(obj, (C6798l) null, 1, (Object) null));
        if (A02 != F0.f65305b) {
            c1(A02);
        }
    }

    /* access modifiers changed from: protected */
    public void e1(Object obj) {
    }

    /* access modifiers changed from: protected */
    public void d1(Throwable th2, boolean z10) {
    }
}
