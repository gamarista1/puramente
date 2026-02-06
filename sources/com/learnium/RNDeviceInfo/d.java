package com.learnium.RNDeviceInfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class d {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static Class f59141d = InstallReferrerClient.class;

    /* renamed from: e  reason: collision with root package name */
    private static Class f59142e = InstallReferrerStateListener.class;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static Class f59143f = ReferrerDetails.class;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f59144a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Object f59145b;

    /* renamed from: c  reason: collision with root package name */
    private Object f59146c;

    private class a implements InvocationHandler {
        public void a() {
            Log.d("RNInstallReferrerClient", "InstallReferrerService disconnected");
        }

        public void b(int i10) {
            if (i10 == 0) {
                try {
                    Log.d("InstallReferrerState", "OK");
                    Object invoke = d.f59141d.getMethod("getInstallReferrer", (Class[]) null).invoke(d.this.f59145b, (Object[]) null);
                    SharedPreferences.Editor edit = d.this.f59144a.edit();
                    edit.putString("installReferrer", (String) d.f59143f.getMethod("getInstallReferrer", (Class[]) null).invoke(invoke, (Object[]) null));
                    edit.apply();
                    d.f59141d.getMethod("endConnection", (Class[]) null).invoke(d.this.f59145b, (Object[]) null);
                } catch (Exception e10) {
                    PrintStream printStream = System.err;
                    printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e10.getMessage());
                    e10.printStackTrace(printStream);
                }
            } else if (i10 == 1) {
                Log.d("InstallReferrerState", "SERVICE_UNAVAILABLE");
            } else if (i10 == 2) {
                Log.d("InstallReferrerState", "FEATURE_NOT_SUPPORTED");
            }
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            try {
                if (name.equals("onInstallReferrerSetupFinished") && objArr != null) {
                    Integer num = objArr[0];
                    if (num instanceof Integer) {
                        b(num.intValue());
                        return null;
                    }
                }
                if (!name.equals("onInstallReferrerServiceDisconnected")) {
                    return null;
                }
                a();
                return null;
            } catch (Exception e10) {
                throw new RuntimeException("unexpected invocation exception: " + e10.getMessage());
            }
        }

        private a() {
        }
    }

    static {
        try {
        } catch (Exception unused) {
            System.err.println("RNInstallReferrerClient exception. 'installreferrer' APIs are unavailable.");
        }
    }

    d(Context context) {
        this.f59144a = context.getSharedPreferences("react-native-device-info", 0);
        Class cls = f59141d;
        if (cls != null && f59142e != null && f59143f != null) {
            try {
                Object invoke = cls.getMethod("newBuilder", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
                this.f59145b = invoke.getClass().getMethod("build", (Class[]) null).invoke(invoke, (Object[]) null);
                this.f59146c = Proxy.newProxyInstance(f59142e.getClassLoader(), new Class[]{f59142e}, new a());
                f59141d.getMethod("startConnection", new Class[]{f59142e}).invoke(this.f59145b, new Object[]{this.f59146c});
            } catch (Exception e10) {
                PrintStream printStream = System.err;
                printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e10.getMessage());
                e10.printStackTrace(printStream);
            }
        }
    }
}
