package ya;

import Ea.C4278a;
import Ea.j;
import Ha.C4295b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.internal.f0;
import com.google.android.gms.common.internal.g0;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;

abstract class w {

    /* renamed from: a  reason: collision with root package name */
    static final u f62298a = new o(s.b("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b  reason: collision with root package name */
    static final u f62299b = new p(s.b("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c  reason: collision with root package name */
    static final u f62300c = new q(s.b("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d  reason: collision with root package name */
    static final u f62301d = new r(s.b("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e  reason: collision with root package name */
    private static volatile g0 f62302e;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f62303f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static Context f62304g;

    static G a(String str, s sVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, sVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static G b(String str, boolean z10, boolean z11, boolean z12) {
        return g(str, z10, false, false, true);
    }

    static /* synthetic */ String c(boolean z10, String str, s sVar) {
        String str2;
        if (z10 || !f(str, sVar, true, false).f62264a) {
            str2 = "not allowed";
        } else {
            str2 = "debug cert rejected";
        }
        MessageDigest b10 = C4278a.b("SHA-256");
        C4536s.l(b10);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", new Object[]{str2, str, j.a(b10.digest(sVar.r1())), Boolean.valueOf(z10), "12451000.false"});
    }

    static synchronized void d(Context context) {
        synchronized (w.class) {
            if (f62304g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f62304g = context.getApplicationContext();
            }
        }
    }

    static boolean e() {
        boolean z10;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            h();
            z10 = f62302e.zzi();
        } catch (RemoteException | DynamiteModule.a e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            z10 = false;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return z10;
    }

    private static G f(String str, s sVar, boolean z10, boolean z11) {
        try {
            h();
            C4536s.l(f62304g);
            try {
                if (f62302e.K0(new B(str, sVar, z10, z11), C4295b.c(f62304g.getPackageManager()))) {
                    return G.b();
                }
                return new E(new n(z10, str, sVar), (D) null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return G.d("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return G.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [Ha.a, android.os.IBinder] */
    private static G g(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        G g10;
        z zVar;
        PackageManager.NameNotFoundException nameNotFoundException;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C4536s.l(f62304g);
            try {
                h();
                x xVar = new x(str, z10, false, C4295b.c(f62304g), false, true);
                if (z13) {
                    zVar = f62302e.m0(xVar);
                } else {
                    zVar = f62302e.e0(xVar);
                }
                if (zVar.o0()) {
                    g10 = G.f(zVar.p0());
                } else {
                    String zza = zVar.zza();
                    if (zVar.q0() == 4) {
                        nameNotFoundException = new PackageManager.NameNotFoundException();
                    } else {
                        nameNotFoundException = null;
                    }
                    if (zza == null) {
                        zza = "error checking package certificate";
                    }
                    g10 = G.g(zVar.p0(), zVar.q0(), zza, nameNotFoundException);
                }
            } catch (DynamiteModule.a e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                g10 = G.d("module init: ".concat(String.valueOf(e10.getMessage())), e10);
            }
        } catch (RemoteException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            g10 = G.d("module call", e11);
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return g10;
    }

    private static void h() {
        if (f62302e == null) {
            C4536s.l(f62304g);
            synchronized (f62303f) {
                try {
                    if (f62302e == null) {
                        f62302e = f0.a(DynamiteModule.e(f62304g, DynamiteModule.f54295f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
