package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import i.C2038b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f11141a;

    private a(Context context) {
        this.f11141a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        if (this.f11141a.getApplicationInfo().targetSdkVersion < 14) {
            return true;
        }
        return false;
    }

    public int c() {
        return this.f11141a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f11141a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 > 480 && i11 > 640) {
            return 4;
        }
        if (i10 >= 360) {
            return 3;
        }
        return 2;
    }

    public boolean e() {
        return this.f11141a.getResources().getBoolean(C2038b.f21284a);
    }

    public boolean f() {
        return true;
    }
}
