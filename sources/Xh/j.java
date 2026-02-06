package xh;

import Sg.m;
import com.google.android.gms.common.api.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rh.C;
import rh.C6703A;
import rh.D;
import rh.E;
import rh.G;
import rh.v;
import rh.w;
import sh.C6726e;
import wh.C6773c;
import wh.C6775e;
import wh.C6776f;

public final class j implements w {

    /* renamed from: b  reason: collision with root package name */
    public static final a f73896b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C6703A f73897a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(C6703A a10) {
        C6496s.h(a10, "client");
        this.f73897a = a10;
    }

    private final C a(E e10, String str) {
        String E10;
        v r10;
        boolean z10;
        D d10 = null;
        if (!this.f73897a.t() || (E10 = E.E(e10, "Location", (String) null, 2, (Object) null)) == null || (r10 = e10.g0().l().r(E10)) == null) {
            return null;
        }
        if (!C6496s.c(r10.s(), e10.g0().l().s()) && !this.f73897a.u()) {
            return null;
        }
        C.a i10 = e10.g0().i();
        if (f.b(str)) {
            int o10 = e10.o();
            f fVar = f.f73882a;
            if (fVar.d(str) || o10 == 308 || o10 == 307) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!fVar.c(str) || o10 == 308 || o10 == 307) {
                if (z10) {
                    d10 = e10.g0().a();
                }
                i10.g(str, d10);
            } else {
                i10.g("GET", (D) null);
            }
            if (!z10) {
                i10.i("Transfer-Encoding");
                i10.i("Content-Length");
                i10.i("Content-Type");
            }
        }
        if (!C6726e.j(e10.g0().l(), r10)) {
            i10.i("Authorization");
        }
        return i10.n(r10).b();
    }

    private final C b(E e10, C6773c cVar) {
        G g10;
        C6776f h10;
        if (cVar == null || (h10 = cVar.h()) == null) {
            g10 = null;
        } else {
            g10 = h10.A();
        }
        int o10 = e10.o();
        String h11 = e10.g0().h();
        if (!(o10 == 307 || o10 == 308)) {
            if (o10 == 401) {
                return this.f73897a.g().a(g10, e10);
            }
            if (o10 == 421) {
                D a10 = e10.g0().a();
                if ((a10 != null && a10.isOneShot()) || cVar == null || !cVar.l()) {
                    return null;
                }
                cVar.h().y();
                return e10.g0();
            } else if (o10 == 503) {
                E U10 = e10.U();
                if ((U10 == null || U10.o() != 503) && f(e10, a.e.API_PRIORITY_OTHER) == 0) {
                    return e10.g0();
                }
                return null;
            } else if (o10 == 407) {
                C6496s.e(g10);
                if (g10.b().type() == Proxy.Type.HTTP) {
                    return this.f73897a.G().a(g10, e10);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            } else if (o10 != 408) {
                switch (o10) {
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        return null;
                }
            } else if (!this.f73897a.J()) {
                return null;
            } else {
                D a11 = e10.g0().a();
                if (a11 != null && a11.isOneShot()) {
                    return null;
                }
                E U11 = e10.U();
                if ((U11 == null || U11.o() != 408) && f(e10, 0) <= 0) {
                    return e10.g0();
                }
                return null;
            }
        }
        return a(e10, h11);
    }

    private final boolean c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z10) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean d(IOException iOException, C6775e eVar, C c10, boolean z10) {
        if (!this.f73897a.J()) {
            return false;
        }
        if ((!z10 || !e(iOException, c10)) && c(iOException, z10) && eVar.z()) {
            return true;
        }
        return false;
    }

    private final boolean e(IOException iOException, C c10) {
        D a10 = c10.a();
        if ((a10 == null || !a10.isOneShot()) && !(iOException instanceof FileNotFoundException)) {
            return false;
        }
        return true;
    }

    private final int f(E e10, int i10) {
        String E10 = E.E(e10, "Retry-After", (String) null, 2, (Object) null);
        if (E10 == null) {
            return i10;
        }
        if (!new m("\\d+").d(E10)) {
            return a.e.API_PRIORITY_OTHER;
        }
        Integer valueOf = Integer.valueOf(E10);
        C6496s.g(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = r0.T().o(r7.T().b((rh.F) null).c()).c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r0 = r1.q();
        r6 = b(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r6 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r0.m() == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r1.C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        r1.k(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0 = r6.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r0 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (r0.isOneShot() == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        r1.k(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0 = r7.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        sh.C6726e.m(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r8 > 20) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r7 == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rh.E intercept(rh.w.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.C6496s.h(r11, r0)
            xh.g r11 = (xh.g) r11
            rh.C r0 = r11.h()
            wh.e r1 = r11.d()
            java.util.List r2 = mf.C6565s.n()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L_0x0018:
            r6 = r5
        L_0x0019:
            r1.j(r0, r6)
            boolean r6 = r1.isCanceled()     // Catch:{ all -> 0x0042 }
            if (r6 != 0) goto L_0x00d3
            rh.E r0 = r11.a(r0)     // Catch:{ i -> 0x00b4, IOException -> 0x0099 }
            if (r7 == 0) goto L_0x0040
            rh.E$a r0 = r0.T()     // Catch:{ all -> 0x0042 }
            rh.E$a r6 = r7.T()     // Catch:{ all -> 0x0042 }
            rh.E$a r6 = r6.b(r4)     // Catch:{ all -> 0x0042 }
            rh.E r6 = r6.c()     // Catch:{ all -> 0x0042 }
            rh.E$a r0 = r0.o(r6)     // Catch:{ all -> 0x0042 }
            rh.E r0 = r0.c()     // Catch:{ all -> 0x0042 }
        L_0x0040:
            r7 = r0
            goto L_0x0045
        L_0x0042:
            r11 = move-exception
            goto L_0x00db
        L_0x0045:
            wh.c r0 = r1.q()     // Catch:{ all -> 0x0042 }
            rh.C r6 = r10.b(r7, r0)     // Catch:{ all -> 0x0042 }
            if (r6 != 0) goto L_0x005e
            if (r0 == 0) goto L_0x005a
            boolean r11 = r0.m()     // Catch:{ all -> 0x0042 }
            if (r11 == 0) goto L_0x005a
            r1.C()     // Catch:{ all -> 0x0042 }
        L_0x005a:
            r1.k(r3)
            return r7
        L_0x005e:
            rh.D r0 = r6.a()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x006e
            boolean r0 = r0.isOneShot()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x006e
            r1.k(r3)
            return r7
        L_0x006e:
            rh.F r0 = r7.a()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0077
            sh.C6726e.m(r0)     // Catch:{ all -> 0x0042 }
        L_0x0077:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L_0x0082
            r1.k(r5)
            r0 = r6
            goto L_0x0018
        L_0x0082:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch:{ all -> 0x0042 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r0.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch:{ all -> 0x0042 }
            r0.append(r8)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0042 }
            r11.<init>(r0)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x0099:
            r6 = move-exception
            boolean r9 = r6 instanceof zh.C6843a     // Catch:{ all -> 0x0042 }
            r9 = r9 ^ r5
            boolean r9 = r10.d(r6, r1, r0, r9)     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x00af
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0042 }
            java.util.List r2 = mf.C6565s.L0(r2, r6)     // Catch:{ all -> 0x0042 }
        L_0x00a9:
            r1.k(r5)
            r6 = r3
            goto L_0x0019
        L_0x00af:
            java.lang.Throwable r11 = sh.C6726e.b0(r6, r2)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x00b4:
            r6 = move-exception
            java.io.IOException r9 = r6.c()     // Catch:{ all -> 0x0042 }
            boolean r9 = r10.d(r9, r1, r0, r3)     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x00ca
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0042 }
            java.io.IOException r6 = r6.b()     // Catch:{ all -> 0x0042 }
            java.util.List r2 = mf.C6565s.L0(r2, r6)     // Catch:{ all -> 0x0042 }
            goto L_0x00a9
        L_0x00ca:
            java.io.IOException r11 = r6.b()     // Catch:{ all -> 0x0042 }
            java.lang.Throwable r11 = sh.C6726e.b0(r11, r2)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x00d3:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x00db:
            r1.k(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: xh.j.intercept(rh.w$a):rh.E");
    }
}
