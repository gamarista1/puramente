package o7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.I;
import com.facebook.J;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;

public final class X {

    /* renamed from: a  reason: collision with root package name */
    public static final X f47173a = new X();

    /* renamed from: b  reason: collision with root package name */
    private static final String f47174b = X.class.getName();

    private X() {
    }

    public static final void a(Collection collection, String str) {
        C6496s.h(collection, "container");
        C6496s.h(str, "name");
        for (Object obj : collection) {
            if (obj == null) {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    public static final String b() {
        String m10 = I.m();
        if (m10 != null) {
            return m10;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    public static final String c() {
        String r10 = I.r();
        if (r10 != null) {
            return r10;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml");
    }

    public static final void d(Context context) {
        C6496s.h(context, "context");
        String b10 = b();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            String str = "com.facebook.app.FacebookContentProvider" + b10;
            if (packageManager.resolveContentProvider(str, 0) == null) {
                U u10 = U.f71764a;
                String format = String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", Arrays.copyOf(new Object[]{str}, 1));
                C6496s.g(format, "format(format, *args)");
                throw new IllegalStateException(format.toString());
            }
        }
    }

    public static final boolean e(Context context, String str) {
        List<ResolveInfo> list;
        C6496s.h(context, "context");
        C6496s.h(str, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        boolean z10 = false;
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!C6496s.c(activityInfo.name, "com.facebook.CustomTabActivity") || !C6496s.c(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z10 = true;
        }
        return z10;
    }

    public static final void f(Context context) {
        C6496s.h(context, "context");
        g(context, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(android.content.Context r3, boolean r4) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            if (r0 == 0) goto L_0x0018
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.facebook.FacebookActivity"
            r1.<init>(r3, r2)
            r3 = 1
            android.content.pm.ActivityInfo r3 = r0.getActivityInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            if (r3 != 0) goto L_0x002b
            java.lang.String r3 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            if (r4 != 0) goto L_0x0025
            java.lang.String r4 = f47174b
            android.util.Log.w(r4, r3)
            goto L_0x002b
        L_0x0025:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r3)
            throw r4
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.X.g(android.content.Context, boolean):void");
    }

    public static final void h(Context context) {
        C6496s.h(context, "context");
        i(context, true);
    }

    public static final void i(Context context, boolean z10) {
        C6496s.h(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != -1) {
            return;
        }
        if (!z10) {
            Log.w(f47174b, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            return;
        }
        throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
    }

    public static final void j(String str, String str2) {
        C6496s.h(str, "arg");
        C6496s.h(str2, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be empty").toString());
        }
    }

    public static final void k(Collection collection, String str) {
        C6496s.h(collection, "container");
        C6496s.h(str, "name");
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(("Container '" + str + "' cannot be empty").toString());
        }
    }

    public static final void l(Collection collection, String str) {
        C6496s.h(collection, "container");
        C6496s.h(str, "name");
        a(collection, str);
        k(collection, str);
    }

    public static final void m(Object obj, String str) {
        C6496s.h(str, "name");
        if (obj == null) {
            throw new NullPointerException("Argument '" + str + "' cannot be null");
        }
    }

    public static final String n(String str, String str2) {
        C6496s.h(str2, "name");
        if (str != null && str.length() > 0) {
            return str;
        }
        throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be null or empty").toString());
    }

    public static final void o() {
        if (!I.G()) {
            throw new J("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
