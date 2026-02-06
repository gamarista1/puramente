package o9;

import android.net.Uri;
import com.google.common.collect.g0;
import com.google.common.primitives.f;
import ia.C3612j;
import ia.t;
import ja.C3645a;
import ja.M;
import java.util.Map;
import k9.C3732y0;
import o9.C3921h;

/* renamed from: o9.l  reason: case insensitive filesystem */
public final class C3925l implements x {

    /* renamed from: a  reason: collision with root package name */
    private final Object f47513a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private C3732y0.f f47514b;

    /* renamed from: c  reason: collision with root package name */
    private v f47515c;

    /* renamed from: d  reason: collision with root package name */
    private C3612j.a f47516d;

    /* renamed from: e  reason: collision with root package name */
    private String f47517e;

    private v b(C3732y0.f fVar) {
        String str;
        C3612j.a aVar = this.f47516d;
        if (aVar == null) {
            aVar = new t.b().c(this.f47517e);
        }
        Uri uri = fVar.f45890c;
        if (uri == null) {
            str = null;
        } else {
            str = uri.toString();
        }
        G g10 = new G(str, fVar.f45895h, aVar);
        g0 m10 = fVar.f45892e.entrySet().m();
        while (m10.hasNext()) {
            Map.Entry entry = (Map.Entry) m10.next();
            g10.e((String) entry.getKey(), (String) entry.getValue());
        }
        C3921h a10 = new C3921h.b().e(fVar.f45888a, F.f47421d).b(fVar.f45893f).c(fVar.f45894g).d(f.n(fVar.f45897j)).a(g10);
        a10.F(0, fVar.c());
        return a10;
    }

    public v a(C3732y0 y0Var) {
        v vVar;
        C3645a.e(y0Var.f45856b);
        C3732y0.f fVar = y0Var.f45856b.f45921c;
        if (fVar == null || M.f44981a < 18) {
            return v.f47547a;
        }
        synchronized (this.f47513a) {
            try {
                if (!M.c(fVar, this.f47514b)) {
                    this.f47514b = fVar;
                    this.f47515c = b(fVar);
                }
                vVar = (v) C3645a.e(this.f47515c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vVar;
    }
}
