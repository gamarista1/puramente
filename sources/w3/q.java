package W3;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;

public class q extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f8694a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static String f8695b;

    /* renamed from: c  reason: collision with root package name */
    private static q f8696c;

    /* renamed from: d  reason: collision with root package name */
    private static Callback f8697d;

    /* renamed from: e  reason: collision with root package name */
    private static Callback f8698e;

    public static IntentSender a(ReactContext reactContext) {
        synchronized (f8694a) {
            try {
                if (f8695b == null) {
                    f8695b = reactContext.getPackageName() + "/" + q.class.getName() + "_ACTION";
                }
                Context applicationContext = reactContext.getApplicationContext();
                q qVar = f8696c;
                if (qVar != null) {
                    applicationContext.unregisterReceiver(qVar);
                }
                f8696c = new q();
                if (Build.VERSION.SDK_INT < 34 || applicationContext.getApplicationInfo().targetSdkVersion < 34) {
                    applicationContext.registerReceiver(f8696c, new IntentFilter(f8695b));
                } else {
                    Intent unused = applicationContext.registerReceiver(f8696c, new IntentFilter(f8695b), 4);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        Intent intent = new Intent(f8695b);
        intent.setPackage(reactContext.getPackageName());
        intent.setClass(reactContext.getApplicationContext(), q.class);
        intent.putExtra("receiver_token", f8696c.hashCode());
        return PendingIntent.getBroadcast(reactContext, 0, intent, 1409286144).getIntentSender();
    }

    public static boolean b() {
        return true;
    }

    public static void c(Callback callback, Callback callback2) {
        f8697d = callback;
        f8698e = callback2;
    }

    public static void d(boolean z10, Object... objArr) {
        if (z10) {
            Callback callback = f8697d;
            if (callback != null) {
                callback.invoke(objArr);
            }
        } else {
            Callback callback2 = f8698e;
            if (callback2 != null) {
                callback2.invoke(objArr);
            }
        }
        f8697d = null;
        f8698e = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r4.hasExtra("receiver_token") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r4.getIntExtra("receiver_token", 0) == hashCode()) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r3 = (android.content.ComponentName) r4.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r3 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        d(true, java.lang.Boolean.TRUE, r3.flattenToString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        d(true, java.lang.Boolean.TRUE, "OK");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r3, android.content.Intent r4) {
        /*
            r2 = this;
            java.lang.Object r0 = f8694a
            monitor-enter(r0)
            W3.q r1 = f8696c     // Catch:{ all -> 0x0009 }
            if (r1 == r2) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r3 = move-exception
            goto L_0x0053
        L_0x000b:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0009 }
            W3.q r1 = f8696c     // Catch:{ all -> 0x0009 }
            r3.unregisterReceiver(r1)     // Catch:{ all -> 0x0009 }
            r3 = 0
            f8696c = r3     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            java.lang.String r3 = "receiver_token"
            boolean r3 = r4.hasExtra(r3)
            if (r3 == 0) goto L_0x0052
            java.lang.String r3 = "receiver_token"
            r0 = 0
            int r3 = r4.getIntExtra(r3, r0)
            int r0 = r2.hashCode()
            if (r3 == r0) goto L_0x002e
            goto L_0x0052
        L_0x002e:
            java.lang.String r3 = "android.intent.extra.CHOSEN_COMPONENT"
            android.os.Parcelable r3 = r4.getParcelableExtra(r3)
            android.content.ComponentName r3 = (android.content.ComponentName) r3
            r4 = 1
            if (r3 == 0) goto L_0x0047
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r3 = r3.flattenToString()
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3}
            d(r4, r3)
            goto L_0x0052
        L_0x0047:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.String r0 = "OK"
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            d(r4, r3)
        L_0x0052:
            return
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.q.onReceive(android.content.Context, android.content.Intent):void");
    }
}
