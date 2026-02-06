package s;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import b.C1861a;
import b.C1862b;

/* renamed from: s.c  reason: case insensitive filesystem */
public abstract class C2575c {

    /* renamed from: a  reason: collision with root package name */
    private final C1862b f25756a;

    /* renamed from: b  reason: collision with root package name */
    private final ComponentName f25757b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f25758c;

    C2575c(C1862b bVar, ComponentName componentName, Context context) {
        this.f25756a = bVar;
        this.f25757b = componentName;
        this.f25758c = context;
    }

    public static boolean a(Context context, String str, C2577e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    public static boolean b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return a(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    private C1861a.C0327a c(C2574b bVar) {
        return new b(bVar);
    }

    private f e(C2574b bVar, PendingIntent pendingIntent) {
        boolean z10;
        C1861a.C0327a c10 = c(bVar);
        if (pendingIntent != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                z10 = this.f25756a.Z(c10, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        } else {
            z10 = this.f25756a.R0(c10);
        }
        if (!z10) {
            return null;
        }
        return new f(this.f25756a, c10, this.f25757b, pendingIntent);
    }

    public f d(C2574b bVar) {
        return e(bVar, (PendingIntent) null);
    }

    public boolean f(long j10) {
        try {
            return this.f25756a.N0(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: s.c$a */
    class a extends C2577e {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f25759b;

        a(Context context) {
            this.f25759b = context;
        }

        public final void a(ComponentName componentName, C2575c cVar) {
            cVar.f(0);
            this.f25759b.unbindService(this);
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: s.c$b */
    class b extends C1861a.C0327a {

        /* renamed from: a  reason: collision with root package name */
        private Handler f25760a = new Handler(Looper.getMainLooper());

        b(C2574b bVar) {
        }

        public Bundle v(String str, Bundle bundle) {
            return null;
        }

        public void l1(Bundle bundle) {
        }

        public void U(String str, Bundle bundle) {
        }

        public void b1(int i10, Bundle bundle) {
        }

        public void j1(String str, Bundle bundle) {
        }

        public void n1(int i10, Uri uri, boolean z10, Bundle bundle) {
        }
    }
}
