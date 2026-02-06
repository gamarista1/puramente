package p2;

import android.net.Uri;
import com.google.common.collect.g0;
import f2.w;
import i2.C2076a;
import i2.L;
import java.util.Map;
import k2.f;
import k2.l;
import p2.C2404h;
import w2.C2827i;

/* renamed from: p2.l  reason: case insensitive filesystem */
public final class C2408l implements w {

    /* renamed from: a  reason: collision with root package name */
    private final Object f25281a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private w.f f25282b;

    /* renamed from: c  reason: collision with root package name */
    private u f25283c;

    /* renamed from: d  reason: collision with root package name */
    private f.a f25284d;

    /* renamed from: e  reason: collision with root package name */
    private String f25285e;

    /* renamed from: f  reason: collision with root package name */
    private C2827i f25286f;

    private u b(w.f fVar) {
        String str;
        f.a aVar = this.f25284d;
        if (aVar == null) {
            aVar = new l.b().c(this.f25285e);
        }
        Uri uri = fVar.f20208c;
        if (uri == null) {
            str = null;
        } else {
            str = uri.toString();
        }
        J j10 = new J(str, fVar.f20213h, aVar);
        g0 m10 = fVar.f20210e.entrySet().m();
        while (m10.hasNext()) {
            Map.Entry entry = (Map.Entry) m10.next();
            j10.e((String) entry.getKey(), (String) entry.getValue());
        }
        C2404h.b e10 = new C2404h.b().f(fVar.f20206a, I.f25187d).c(fVar.f20211f).d(fVar.f20212g).e(com.google.common.primitives.f.n(fVar.f20215j));
        C2827i iVar = this.f25286f;
        if (iVar != null) {
            e10.b(iVar);
        }
        C2404h a10 = e10.a(j10);
        a10.F(0, fVar.c());
        return a10;
    }

    public u a(w wVar) {
        u uVar;
        C2076a.e(wVar.f20157b);
        w.f fVar = wVar.f20157b.f20251c;
        if (fVar == null) {
            return u.f25307a;
        }
        synchronized (this.f25281a) {
            try {
                if (!L.c(fVar, this.f25282b)) {
                    this.f25282b = fVar;
                    this.f25283c = b(fVar);
                }
                uVar = (u) C2076a.e(this.f25283c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }
}
