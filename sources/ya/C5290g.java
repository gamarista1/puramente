package ya;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: ya.g  reason: case insensitive filesystem */
public class C5290g {

    /* renamed from: c  reason: collision with root package name */
    private static C5290g f62278c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f62279a;

    /* renamed from: b  reason: collision with root package name */
    private volatile String f62280b;

    public C5290g(Context context) {
        this.f62279a = context.getApplicationContext();
    }

    public static C5290g a(Context context) {
        C4536s.l(context);
        synchronized (C5290g.class) {
            try {
                if (f62278c == null) {
                    w.d(context);
                    f62278c = new C5290g(context);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f62278c;
    }

    static final s d(PackageInfo packageInfo, s... sVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            t tVar = new t(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < sVarArr.length; i10++) {
                if (sVarArr[i10].equals(tVar)) {
                    return sVarArr[i10];
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean e(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0027
            if (r4 == 0) goto L_0x0029
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x001a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0027
        L_0x001a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L_0x0020
        L_0x001e:
            r5 = r1
            goto L_0x0027
        L_0x0020:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L_0x001e
            r5 = r0
        L_0x0027:
            r2 = r4
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            if (r4 == 0) goto L_0x0048
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L_0x0048
            if (r5 == 0) goto L_0x0039
            ya.s[] r4 = ya.v.f62297a
            ya.s r4 = d(r2, r4)
            goto L_0x0045
        L_0x0039:
            ya.s[] r4 = ya.v.f62297a
            r4 = r4[r1]
            ya.s[] r4 = new ya.s[]{r4}
            ya.s r4 = d(r2, r4)
        L_0x0045:
            if (r4 == 0) goto L_0x0048
            return r0
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.C5290g.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    private final G f(String str, boolean z10, boolean z11) {
        G g10;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return G.c("null pkg");
        }
        if (str.equals(this.f62280b)) {
            return G.b();
        }
        if (w.e()) {
            g10 = w.b(str, d.f(this.f62279a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f62279a.getPackageManager().getPackageInfo(str, 64);
                boolean f10 = d.f(this.f62279a);
                if (packageInfo == null) {
                    g10 = G.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        g10 = G.c("single cert required");
                    } else {
                        t tVar = new t(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        G a10 = w.a(str2, tVar, f10, false);
                        if (!a10.f62264a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !w.a(str2, tVar, false, true).f62264a) {
                            g10 = a10;
                        } else {
                            g10 = G.c("debuggable release cert app rejected");
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                return G.d("no pkg ".concat(str), e10);
            }
        }
        if (g10.f62264a) {
            this.f62280b = str;
        }
        return g10;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (d.f(this.f62279a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) {
        G g10;
        int length;
        String[] packagesForUid = this.f62279a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            g10 = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    C4536s.l(g10);
                    break;
                }
                g10 = f(packagesForUid[i11], false, false);
                if (g10.f62264a) {
                    break;
                }
                i11++;
            }
        } else {
            g10 = G.c("no pkgs");
        }
        g10.e();
        return g10.f62264a;
    }
}
