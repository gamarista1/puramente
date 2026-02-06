package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

public abstract class b extends androidx.core.content.c {

    static class a {
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.core.app.b$b  reason: collision with other inner class name */
    static class C0279b {
        static Uri a(Activity activity) {
            return activity.getReferrer();
        }
    }

    static class c {
        static void a(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        static boolean b(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    static class d {
        static boolean a(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[]{String.class}).invoke(activity.getApplication().getPackageManager(), new Object[]{str})).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    static class e {
        static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface f {
        void validateRequestPermissionsRequestCode(int i10);
    }

    public static void b(Activity activity) {
        activity.finishAffinity();
    }

    public static void c(Activity activity) {
        a.a(activity);
    }

    public static Uri d(Activity activity) {
        return C0279b.a(activity);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(Activity activity) {
        if (!activity.isFinishing() && !d.i(activity)) {
            activity.recreate();
        }
    }

    public static void f(Activity activity) {
        a.b(activity);
    }

    public static void g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new a(activity));
        }
    }

    public static void h(Activity activity, String[] strArr, int i10) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (i11 < strArr.length) {
            if (!TextUtils.isEmpty(strArr[i11])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i11));
                }
                i11++;
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[(strArr.length - size)];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size != strArr.length) {
                int i12 = 0;
                for (int i13 = 0; i13 < strArr.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr2[i12] = strArr[i13];
                        i12++;
                    }
                }
            } else {
                return;
            }
        }
        if (activity instanceof f) {
            ((f) activity).validateRequestPermissionsRequestCode(i10);
        }
        c.a(activity, strArr, i10);
    }

    public static void i(Activity activity, x xVar) {
        a.c(activity, (SharedElementCallback) null);
    }

    public static void j(Activity activity, x xVar) {
        a.d(activity, (SharedElementCallback) null);
    }

    public static boolean k(Activity activity, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i10 >= 32) {
            return e.a(activity, str);
        }
        if (i10 == 31) {
            return d.a(activity, str);
        }
        return c.b(activity, str);
    }

    public static void l(Activity activity, Intent intent, int i10, Bundle bundle) {
        activity.startActivityForResult(intent, i10, bundle);
    }

    public static void m(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public static void n(Activity activity) {
        a.e(activity);
    }
}
