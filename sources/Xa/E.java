package xa;

import Ea.n;
import Ga.C4293e;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

public final class E {

    /* renamed from: a  reason: collision with root package name */
    private final Context f62146a;

    /* renamed from: b  reason: collision with root package name */
    private int f62147b;

    /* renamed from: c  reason: collision with root package name */
    private int f62148c = 0;

    public E(Context context) {
        this.f62146a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.f62147b == 0) {
            try {
                packageInfo = C4293e.a(this.f62146a).e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f62147b = packageInfo.versionCode;
            }
        }
        return this.f62147b;
    }

    public final synchronized int b() {
        int i10 = this.f62148c;
        if (i10 != 0) {
            return i10;
        }
        Context context = this.f62146a;
        PackageManager packageManager = context.getPackageManager();
        if (C4293e.a(context).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!n.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f62148c = i11;
                return i11;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true == n.h()) {
                i11 = 2;
            }
            this.f62148c = i11;
            return i11;
        }
        i11 = 2;
        this.f62148c = i11;
        return i11;
    }
}
