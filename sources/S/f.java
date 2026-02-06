package s;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import b.C1861a;
import b.C1862b;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final Object f25775a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final C1862b f25776b;

    /* renamed from: c  reason: collision with root package name */
    private final C1861a f25777c;

    /* renamed from: d  reason: collision with root package name */
    private final ComponentName f25778d;

    /* renamed from: e  reason: collision with root package name */
    private final PendingIntent f25779e;

    f(C1862b bVar, C1861a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f25776b = bVar;
        this.f25777c = aVar;
        this.f25778d = componentName;
        this.f25779e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f25779e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public IBinder c() {
        return this.f25777c.asBinder();
    }

    /* access modifiers changed from: package-private */
    public ComponentName d() {
        return this.f25778d;
    }

    /* access modifiers changed from: package-private */
    public PendingIntent e() {
        return this.f25779e;
    }

    public boolean f(Uri uri, Bundle bundle, List list) {
        try {
            return this.f25776b.I0(this.f25777c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
