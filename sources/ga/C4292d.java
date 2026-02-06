package Ga;

import Ea.n;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;

/* renamed from: Ga.d  reason: case insensitive filesystem */
public class C4292d {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f50810a;

    public C4292d(Context context) {
        this.f50810a = context;
    }

    public int a(String str) {
        return this.f50810a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f50810a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i10) {
        return this.f50810a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence d(String str) {
        Context context = this.f50810a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo e(String str, int i10) {
        return this.f50810a.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C4290b.a(this.f50810a);
        }
        if (!n.h() || (nameForUid = this.f50810a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f50810a.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean g(int i10, String str) {
        if (n.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f50810a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i10, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f50810a.getPackageManager().getPackagesForUid(i10);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
