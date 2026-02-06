package xh;

import Gh.C5416q;
import Gh.H;
import Sg.p;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import rh.C;
import rh.D;
import rh.E;
import rh.F;
import rh.m;
import rh.n;
import rh.w;
import rh.y;
import sh.C6726e;

/* renamed from: xh.a  reason: case insensitive filesystem */
public final class C6785a implements w {

    /* renamed from: a  reason: collision with root package name */
    private final n f73875a;

    public C6785a(n nVar) {
        C6496s.h(nVar, "cookieJar");
        this.f73875a = nVar;
    }

    private final String a(List list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object next : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C6565s.x();
            }
            m mVar = (m) next;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(mVar.e());
            sb2.append('=');
            sb2.append(mVar.g());
            i10 = i11;
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public E intercept(w.a aVar) {
        F a10;
        C6496s.h(aVar, "chain");
        C request = aVar.request();
        C.a i10 = request.i();
        D a11 = request.a();
        if (a11 != null) {
            y contentType = a11.contentType();
            if (contentType != null) {
                i10.e("Content-Type", contentType.toString());
            }
            long contentLength = a11.contentLength();
            if (contentLength != -1) {
                i10.e("Content-Length", String.valueOf(contentLength));
                i10.i("Transfer-Encoding");
            } else {
                i10.e("Transfer-Encoding", "chunked");
                i10.i("Content-Length");
            }
        }
        boolean z10 = false;
        if (request.d("Host") == null) {
            i10.e("Host", C6726e.U(request.l(), false, 1, (Object) null));
        }
        if (request.d("Connection") == null) {
            i10.e("Connection", "Keep-Alive");
        }
        if (request.d("Accept-Encoding") == null && request.d("Range") == null) {
            i10.e("Accept-Encoding", "gzip");
            z10 = true;
        }
        List b10 = this.f73875a.b(request.l());
        if (!b10.isEmpty()) {
            i10.e("Cookie", a(b10));
        }
        if (request.d("User-Agent") == null) {
            i10.e("User-Agent", "okhttp/4.12.0");
        }
        E a12 = aVar.a(i10.b());
        e.f(this.f73875a, request.l(), a12.F());
        E.a r10 = a12.T().r(request);
        if (z10 && p.v("gzip", E.E(a12, "Content-Encoding", (String) null, 2, (Object) null), true) && e.b(a12) && (a10 = a12.a()) != null) {
            C5416q qVar = new C5416q(a10.y());
            r10.k(a12.F().n().i("Content-Encoding").i("Content-Length").f());
            r10.b(new h(E.E(a12, "Content-Type", (String) null, 2, (Object) null), -1, H.d(qVar)));
        }
        return r10.c();
    }
}
