package hd;

import Na.a;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.iid.FirebaseInstanceId;
import com.learnium.RNDeviceInfo.RNDeviceModule;
import java.util.UUID;

/* renamed from: hd.a  reason: case insensitive filesystem */
public class C5011a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f60667a;

    public C5011a(Context context) {
        this.f60667a = context;
    }

    /* access modifiers changed from: package-private */
    public String a() {
        int i10 = FirebaseInstanceId.f57282m;
        Object invoke = FirebaseInstanceId.class.getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        return (String) invoke.getClass().getMethod("getId", (Class[]) null).invoke(invoke, (Object[]) null);
    }

    /* access modifiers changed from: package-private */
    public String b() {
        int i10 = a.f52063d;
        Object invoke = a.class.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{this.f60667a.getApplicationContext()});
        return (String) invoke.getClass().getMethod("getId", (Class[]) null).invoke(invoke, (Object[]) null);
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return RNDeviceModule.getRNDISharedPreferences(this.f60667a).getString("instanceId", "unknown");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String d() {
        /*
            r2 = this;
            java.lang.String r0 = r2.c()
            java.lang.String r1 = "unknown"
            if (r0 == r1) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.String r0 = r2.a()     // Catch:{ ClassNotFoundException -> 0x0018, IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0011 }
            r2.f(r0)     // Catch:{ ClassNotFoundException -> 0x0018, IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0011 }
            return r0
        L_0x0011:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "N/A: Unsupported version of com.google.firebase:firebase-iid in your project."
            r0.println(r1)
        L_0x0018:
            java.lang.String r0 = r2.b()     // Catch:{ ClassNotFoundException -> 0x0027, IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0020 }
            r2.f(r0)     // Catch:{ ClassNotFoundException -> 0x0027, IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0020 }
            return r0
        L_0x0020:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "N/A: Unsupported version of com.google.android.gms.iid in your project."
            r0.println(r1)
        L_0x0027:
            java.lang.String r0 = r2.e()
            r2.f(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.C5011a.d():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return UUID.randomUUID().toString();
    }

    /* access modifiers changed from: package-private */
    public void f(String str) {
        SharedPreferences.Editor edit = RNDeviceModule.getRNDISharedPreferences(this.f60667a).edit();
        edit.putString("instanceId", str);
        edit.apply();
    }
}
