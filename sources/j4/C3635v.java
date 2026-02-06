package j4;

import Ug.C5600w0;
import X3.g;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1797u;
import androidx.lifecycle.C1798v;
import java.util.concurrent.CancellationException;
import l4.C3738d;
import o4.i;
import o4.l;

/* renamed from: j4.v  reason: case insensitive filesystem */
public final class C3635v implements C3629p {

    /* renamed from: a  reason: collision with root package name */
    private final g f44787a;

    /* renamed from: b  reason: collision with root package name */
    private final C3622i f44788b;

    /* renamed from: c  reason: collision with root package name */
    private final C3738d f44789c;

    /* renamed from: d  reason: collision with root package name */
    private final C1790m f44790d;

    /* renamed from: e  reason: collision with root package name */
    private final C5600w0 f44791e;

    public C3635v(g gVar, C3622i iVar, C3738d dVar, C1790m mVar, C5600w0 w0Var) {
        this.f44787a = gVar;
        this.f44788b = iVar;
        this.f44789c = dVar;
        this.f44790d = mVar;
        this.f44791e = w0Var;
    }

    public void a() {
        C5600w0.a.a(this.f44791e, (CancellationException) null, 1, (Object) null);
        C3738d dVar = this.f44789c;
        if (dVar instanceof C1797u) {
            this.f44790d.d((C1797u) dVar);
        }
        this.f44790d.d(this);
    }

    public final void b() {
        this.f44787a.c(this.f44788b);
    }

    public void n() {
        if (!this.f44789c.a().isAttachedToWindow()) {
            l.l(this.f44789c.a()).c(this);
            throw new CancellationException("'ViewTarget.view' must be attached to a window.");
        }
    }

    public void onDestroy(C1798v vVar) {
        l.l(this.f44789c.a()).a();
    }

    public void start() {
        this.f44790d.a(this);
        C3738d dVar = this.f44789c;
        if (dVar instanceof C1797u) {
            i.b(this.f44790d, (C1797u) dVar);
        }
        l.l(this.f44789c.a()).c(this);
    }
}
