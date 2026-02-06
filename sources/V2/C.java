package v2;

import androidx.media3.exoplayer.q0;
import androidx.media3.exoplayer.r0;
import f2.C1968c;
import f2.H;
import f2.K;
import i2.C2076a;
import t2.C2615C;
import t2.j0;
import w2.C2822d;

public abstract class C {

    /* renamed from: a  reason: collision with root package name */
    private a f26963a;

    /* renamed from: b  reason: collision with root package name */
    private C2822d f26964b;

    public interface a {
        void a();

        void c(q0 q0Var);
    }

    /* access modifiers changed from: protected */
    public final C2822d a() {
        return (C2822d) C2076a.i(this.f26964b);
    }

    public abstract K b();

    public abstract r0.a d();

    public void e(a aVar, C2822d dVar) {
        this.f26963a = aVar;
        this.f26964b = dVar;
    }

    /* access modifiers changed from: protected */
    public final void f() {
        a aVar = this.f26963a;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void g(q0 q0Var) {
        a aVar = this.f26963a;
        if (aVar != null) {
            aVar.c(q0Var);
        }
    }

    public abstract boolean h();

    public abstract void i(Object obj);

    public void j() {
        this.f26963a = null;
        this.f26964b = null;
    }

    public abstract D k(r0[] r0VarArr, j0 j0Var, C2615C.b bVar, H h10);

    public abstract void l(C1968c cVar);

    public abstract void m(K k10);
}
