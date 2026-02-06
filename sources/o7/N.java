package o7;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;
import t7.C4049a;

public abstract class N implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Context f47139a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f47140b;

    /* renamed from: c  reason: collision with root package name */
    private b f47141c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f47142d;

    /* renamed from: e  reason: collision with root package name */
    private Messenger f47143e;

    /* renamed from: f  reason: collision with root package name */
    private final int f47144f;

    /* renamed from: g  reason: collision with root package name */
    private final int f47145g;

    /* renamed from: h  reason: collision with root package name */
    private final String f47146h;

    /* renamed from: i  reason: collision with root package name */
    private final int f47147i;

    /* renamed from: j  reason: collision with root package name */
    private final String f47148j;

    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f47149a;

        a(N n10) {
            this.f47149a = n10;
        }

        public void handleMessage(Message message) {
            if (!C4049a.d(this)) {
                try {
                    C6496s.h(message, MetricTracker.Object.MESSAGE);
                    this.f47149a.c(message);
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                }
            }
        }
    }

    public interface b {
        void a(Bundle bundle);
    }

    public N(Context context, int i10, int i11, int i12, String str, String str2) {
        C6496s.h(context, "context");
        C6496s.h(str, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f47139a = applicationContext != null ? applicationContext : context;
        this.f47144f = i10;
        this.f47145g = i11;
        this.f47146h = str;
        this.f47147i = i12;
        this.f47148j = str2;
        this.f47140b = new a(this);
    }

    private final void a(Bundle bundle) {
        if (this.f47142d) {
            this.f47142d = false;
            b bVar = this.f47141c;
            if (bVar != null) {
                bVar.a(bundle);
            }
        }
    }

    private final void e() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f47146h);
        String str = this.f47148j;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        d(bundle);
        Message obtain = Message.obtain((Handler) null, this.f47144f);
        obtain.arg1 = this.f47147i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f47140b);
        try {
            Messenger messenger = this.f47143e;
            if (messenger != null) {
                messenger.send(obtain);
            }
        } catch (RemoteException unused) {
            a((Bundle) null);
        }
    }

    public final void b() {
        this.f47142d = false;
    }

    /* access modifiers changed from: protected */
    public final void c(Message message) {
        C6496s.h(message, MetricTracker.Object.MESSAGE);
        if (message.what == this.f47145g) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                a((Bundle) null);
            } else {
                a(data);
            }
            try {
                this.f47139a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void d(Bundle bundle);

    public final void f(b bVar) {
        this.f47141c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f47142d     // Catch:{ all -> 0x0026 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            int r0 = r3.f47147i     // Catch:{ all -> 0x0026 }
            int r0 = o7.M.w(r0)     // Catch:{ all -> 0x0026 }
            r2 = -1
            if (r0 != r2) goto L_0x0013
            monitor-exit(r3)
            return r1
        L_0x0013:
            android.content.Context r0 = r3.f47139a     // Catch:{ all -> 0x0026 }
            android.content.Intent r0 = o7.M.m(r0)     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x001c
            goto L_0x0024
        L_0x001c:
            r1 = 1
            r3.f47142d = r1     // Catch:{ all -> 0x0026 }
            android.content.Context r2 = r3.f47139a     // Catch:{ all -> 0x0026 }
            r2.bindService(r0, r3, r1)     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r3)
            return r1
        L_0x0026:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.N.g():boolean");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C6496s.h(componentName, "name");
        C6496s.h(iBinder, "service");
        this.f47143e = new Messenger(iBinder);
        e();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C6496s.h(componentName, "name");
        this.f47143e = null;
        try {
            this.f47139a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a((Bundle) null);
    }
}
