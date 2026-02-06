package wc;

import Ac.m;
import Bc.h;
import android.content.Context;
import com.adjust.sdk.Constants;
import java.net.URI;
import uc.C5233a;

/* renamed from: wc.c  reason: case insensitive filesystem */
final class C5265c extends e {

    /* renamed from: c  reason: collision with root package name */
    private static final C5233a f62080c = C5233a.e();

    /* renamed from: a  reason: collision with root package name */
    private final h f62081a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f62082b;

    C5265c(h hVar, Context context) {
        this.f62082b = context;
        this.f62081a = hVar;
    }

    private URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            f62080c.k("getResultUrl throws exception %s", e10.getMessage());
            return null;
        }
    }

    private boolean h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return m.a(uri, context);
    }

    private boolean i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    private boolean j(String str) {
        return i(str);
    }

    private boolean k(String str) {
        if (str == null || i(str) || str.length() > 255) {
            return false;
        }
        return true;
    }

    private boolean m(int i10) {
        if (i10 > 0) {
            return true;
        }
        return false;
    }

    private boolean n(long j10) {
        if (j10 >= 0) {
            return true;
        }
        return false;
    }

    private boolean o(int i10) {
        if (i10 == -1 || i10 > 0) {
            return true;
        }
        return false;
    }

    private boolean p(String str) {
        if (str == null) {
            return false;
        }
        if ("http".equalsIgnoreCase(str) || Constants.SCHEME.equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    private boolean q(long j10) {
        if (j10 >= 0) {
            return true;
        }
        return false;
    }

    private boolean r(String str) {
        if (str == null) {
            return true;
        }
        return false;
    }

    public boolean c() {
        h.d dVar;
        if (j(this.f62081a.x0())) {
            C5233a aVar = f62080c;
            aVar.j("URL is missing:" + this.f62081a.x0());
            return false;
        }
        URI g10 = g(this.f62081a.x0());
        if (g10 == null) {
            f62080c.j("URL cannot be parsed");
            return false;
        } else if (!h(g10, this.f62082b)) {
            C5233a aVar2 = f62080c;
            aVar2.j("URL fails allowlist rule: " + g10);
            return false;
        } else if (!k(g10.getHost())) {
            f62080c.j("URL host is null or invalid");
            return false;
        } else if (!p(g10.getScheme())) {
            f62080c.j("URL scheme is null or invalid");
            return false;
        } else if (!r(g10.getUserInfo())) {
            f62080c.j("URL user info is null");
            return false;
        } else if (!o(g10.getPort())) {
            f62080c.j("URL port is less than or equal to 0");
            return false;
        } else {
            if (this.f62081a.z0()) {
                dVar = this.f62081a.n0();
            } else {
                dVar = null;
            }
            if (!l(dVar)) {
                C5233a aVar3 = f62080c;
                aVar3.j("HTTP Method is null or invalid: " + this.f62081a.n0());
                return false;
            } else if (this.f62081a.A0() && !m(this.f62081a.o0())) {
                C5233a aVar4 = f62080c;
                aVar4.j("HTTP ResponseCode is a negative value:" + this.f62081a.o0());
                return false;
            } else if (this.f62081a.B0() && !n(this.f62081a.r0())) {
                C5233a aVar5 = f62080c;
                aVar5.j("Request Payload is a negative value:" + this.f62081a.r0());
                return false;
            } else if (this.f62081a.C0() && !n(this.f62081a.t0())) {
                C5233a aVar6 = f62080c;
                aVar6.j("Response Payload is a negative value:" + this.f62081a.t0());
                return false;
            } else if (!this.f62081a.y0() || this.f62081a.l0() <= 0) {
                C5233a aVar7 = f62080c;
                aVar7.j("Start time of the request is null, or zero, or a negative value:" + this.f62081a.l0());
                return false;
            } else if (this.f62081a.D0() && !q(this.f62081a.u0())) {
                C5233a aVar8 = f62080c;
                aVar8.j("Time to complete the request is a negative value:" + this.f62081a.u0());
                return false;
            } else if (this.f62081a.F0() && !q(this.f62081a.w0())) {
                C5233a aVar9 = f62080c;
                aVar9.j("Time from the start of the request to the start of the response is null or a negative value:" + this.f62081a.w0());
                return false;
            } else if (!this.f62081a.E0() || this.f62081a.v0() <= 0) {
                C5233a aVar10 = f62080c;
                aVar10.j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f62081a.v0());
                return false;
            } else if (this.f62081a.A0()) {
                return true;
            } else {
                f62080c.j("Did not receive a HTTP Response Code");
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean l(h.d dVar) {
        if (dVar == null || dVar == h.d.HTTP_METHOD_UNKNOWN) {
            return false;
        }
        return true;
    }
}
