package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.AttributeType;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class u {

    /* renamed from: e  reason: collision with root package name */
    private static u f22157e;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f22158a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList f22159b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final Object f22160c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private int f22161d = 0;

    private static final class b {

        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a  reason: collision with root package name */
            private final u f22162a;

            public a(u uVar) {
                this.f22162a = uVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                boolean z10;
                int a10 = telephonyDisplayInfo.getOverrideNetworkType();
                int i10 = 5;
                if (a10 == 3 || a10 == 4 || a10 == 5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u uVar = this.f22162a;
                if (z10) {
                    i10 = 10;
                }
                uVar.k(i10);
            }
        }

        public static void a(Context context, u uVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C2076a.e((TelephonyManager) context.getSystemService(AttributeType.PHONE));
                a aVar = new a(uVar);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                uVar.k(5);
            }
        }
    }

    public interface c {
        void a(int i10);
    }

    private final class d extends BroadcastReceiver {
        private d() {
        }

        public void onReceive(Context context, Intent intent) {
            int b10 = u.g(context);
            if (L.f22072a < 31 || b10 != 5) {
                u.this.k(b10);
            } else {
                b.a(context, u.this);
            }
        }
    }

    private u(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static synchronized u d(Context context) {
        u uVar;
        synchronized (u.class) {
            try {
                if (f22157e == null) {
                    f22157e = new u(context);
                }
                uVar = f22157e;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return uVar;
    }

    private static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case StdKeyDeserializer.TYPE_URL /*14*/:
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                if (L.f22072a >= 29) {
                    return 9;
                }
                return 0;
            default:
                return 6;
        }
    }

    /* access modifiers changed from: private */
    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (!(type == 4 || type == 5)) {
                        if (type == 6) {
                            return 5;
                        }
                        if (type != 9) {
                            return 8;
                        }
                        return 7;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(c cVar) {
        cVar.a(f());
    }

    private void j() {
        Iterator it = this.f22159b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f22159b.remove(weakReference);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000e, code lost:
        r0 = r3.f22159b.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        r1 = (java.lang.ref.WeakReference) r0.next();
        r2 = (i2.u.c) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r2 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r2.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r3.f22159b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f22160c
            monitor-enter(r0)
            int r1 = r3.f22161d     // Catch:{ all -> 0x0009 }
            if (r1 != r4) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r4 = move-exception
            goto L_0x0033
        L_0x000b:
            r3.f22161d = r4     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.f22159b
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            i2.u$c r2 = (i2.u.c) r2
            if (r2 == 0) goto L_0x002c
            r2.a(r4)
            goto L_0x0014
        L_0x002c:
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.f22159b
            r2.remove(r1)
            goto L_0x0014
        L_0x0032:
            return
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.u.k(int):void");
    }

    public int f() {
        int i10;
        synchronized (this.f22160c) {
            i10 = this.f22161d;
        }
        return i10;
    }

    public void i(c cVar) {
        j();
        this.f22159b.add(new WeakReference(cVar));
        this.f22158a.post(new t(this, cVar));
    }
}
