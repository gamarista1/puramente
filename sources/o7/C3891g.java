package o7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.I;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import t7.C4049a;

/* renamed from: o7.g  reason: case insensitive filesystem */
public final class C3891g {

    /* renamed from: a  reason: collision with root package name */
    public static final C3891g f47256a = new C3891g();

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f47257b = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private C3891g() {
    }

    public static final String a() {
        Class<C3891g> cls = C3891g.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            Context l10 = I.l();
            List<ResolveInfo> queryIntentServices = l10.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            C6496s.g(queryIntentServices, "context.packageManager.q…ervices(serviceIntent, 0)");
            HashSet g12 = C6559l.g1(f47257b);
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && g12.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final String b() {
        Class<C3891g> cls = C3891g.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return "fbconnect://cct." + I.l().getPackageName();
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final String c(String str) {
        Class<C3891g> cls = C3891g.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(str, "developerDefinedRedirectURI");
            if (X.e(I.l(), str)) {
                return str;
            }
            if (X.e(I.l(), b())) {
                return b();
            }
            return "";
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }
}
