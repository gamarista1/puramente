package j6;

import T5.f;
import T5.n;
import V6.x;
import android.content.res.Resources;
import b7.C3158a;
import java.util.concurrent.Executor;
import m6.C3777a;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private Resources f44834a;

    /* renamed from: b  reason: collision with root package name */
    private C3777a f44835b;

    /* renamed from: c  reason: collision with root package name */
    private C3158a f44836c;

    /* renamed from: d  reason: collision with root package name */
    private Executor f44837d;

    /* renamed from: e  reason: collision with root package name */
    private x f44838e;

    /* renamed from: f  reason: collision with root package name */
    private f f44839f;

    /* renamed from: g  reason: collision with root package name */
    private n f44840g;

    public void a(Resources resources, C3777a aVar, C3158a aVar2, Executor executor, x xVar, f fVar, n nVar) {
        this.f44834a = resources;
        this.f44835b = aVar;
        this.f44836c = aVar2;
        this.f44837d = executor;
        this.f44838e = xVar;
        this.f44839f = fVar;
        this.f44840g = nVar;
    }

    /* access modifiers changed from: protected */
    public e b(Resources resources, C3777a aVar, C3158a aVar2, Executor executor, x xVar, f fVar) {
        return new e(resources, aVar, aVar2, executor, xVar, fVar);
    }

    public e c() {
        e b10 = b(this.f44834a, this.f44835b, this.f44836c, this.f44837d, this.f44838e, this.f44839f);
        n nVar = this.f44840g;
        if (nVar != null) {
            b10.A0(((Boolean) nVar.get()).booleanValue());
        }
        return b10;
    }
}
