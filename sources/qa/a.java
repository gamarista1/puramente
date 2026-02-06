package Qa;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.b;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import ya.C5288e;

public abstract class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final b f52238a = b.f();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f52239b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static Method f52240c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Method f52241d = null;

    /* renamed from: Qa.a$a  reason: collision with other inner class name */
    public interface C0800a {
        void a();

        void b(int i10, Intent intent);
    }

    public static void a(Context context) {
        Context context2;
        C4536s.m(context, "Context must not be null");
        f52238a.k(context, 11925000);
        synchronized (f52239b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.e(context, DynamiteModule.f54295f, "com.google.android.gms.providerinstaller.dynamite").b();
            } catch (DynamiteModule.a e10) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                e(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Context d10 = d.d(context);
            if (d10 != null) {
                try {
                    if (f52241d == null) {
                        Class cls = Long.TYPE;
                        f52241d = d(d10, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                    }
                    f52241d.invoke((Object) null, new Object[]{context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2)});
                } catch (Exception e11) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e11.getMessage())));
                }
            }
            if (d10 != null) {
                e(d10, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new C5288e(8);
            }
        }
    }

    public static void b(Context context, C0800a aVar) {
        C4536s.m(context, "Context must not be null");
        C4536s.m(aVar, "Listener must not be null");
        C4536s.e("Must be called on the UI thread");
        new b(context, aVar).execute(new Void[0]);
    }

    private static Method d(Context context, String str, String str2, Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    private static void e(Context context, Context context2, String str) {
        String str2;
        try {
            if (f52240c == null) {
                f52240c = d(context, str, "insertProvider", new Class[]{Context.class});
            }
            f52240c.invoke((Object) null, new Object[]{context});
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    str2 = e10.getMessage();
                } else {
                    str2 = cause.getMessage();
                }
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(str2)));
            }
            throw new C5288e(8);
        }
    }
}
