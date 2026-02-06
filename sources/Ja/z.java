package ja;

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

public final class z {

    /* renamed from: e  reason: collision with root package name */
    private static z f45096e;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f45097a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList f45098b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final Object f45099c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private int f45100d = 0;

    private static final class b {

        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a  reason: collision with root package name */
            private final z f45101a;

            public a(z zVar) {
                this.f45101a = zVar;
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
                z zVar = this.f45101a;
                if (z10) {
                    i10 = 10;
                }
                zVar.k(i10);
            }
        }

        public static void a(Context context, z zVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C3645a.e((TelephonyManager) context.getSystemService(AttributeType.PHONE));
                a aVar = new a(zVar);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                zVar.k(5);
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
            int b10 = z.g(context);
            if (M.f44981a < 31 || b10 != 5) {
                z.this.k(b10);
            } else {
                b.a(context, z.this);
            }
        }
    }

    private z(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static synchronized z d(Context context) {
        z zVar;
        synchronized (z.class) {
            try {
                if (f45096e == null) {
                    f45096e = new z(context);
                }
                zVar = f45096e;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return zVar;
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
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                if (M.f44981a >= 29) {
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
        Iterator it = this.f45098b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f45098b.remove(weakReference);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000e, code lost:
        r0 = r3.f45098b.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        r1 = (java.lang.ref.WeakReference) r0.next();
        r2 = (ja.z.c) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r2 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r2.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r3.f45098b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f45099c
            monitor-enter(r0)
            int r1 = r3.f45100d     // Catch:{ all -> 0x0009 }
            if (r1 != r4) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r4 = move-exception
            goto L_0x0033
        L_0x000b:
            r3.f45100d = r4     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.f45098b
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            ja.z$c r2 = (ja.z.c) r2
            if (r2 == 0) goto L_0x002c
            r2.a(r4)
            goto L_0x0014
        L_0x002c:
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.f45098b
            r2.remove(r1)
            goto L_0x0014
        L_0x0032:
            return
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.z.k(int):void");
    }

    public int f() {
        int i10;
        synchronized (this.f45099c) {
            i10 = this.f45100d;
        }
        return i10;
    }

    public void i(c cVar) {
        j();
        this.f45098b.add(new WeakReference(cVar));
        this.f45097a.post(new y(this, cVar));
    }
}
