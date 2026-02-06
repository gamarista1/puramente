package Ea;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.d;
import io.intercom.android.sdk.models.Participant;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f50653a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f50654b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f50655c;

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f50656d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f50656d == null) {
            boolean z10 = false;
            if (n.h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f50656d = Boolean.valueOf(z10);
        }
        return f50656d.booleanValue();
    }

    public static boolean b() {
        int i10 = d.f54103a;
        return Participant.USER_TYPE.equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        return g(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (c(context) && !n.g()) {
            return true;
        }
        if (!e(context)) {
            return false;
        }
        if (!n.h() || n.k()) {
            return true;
        }
        return false;
    }

    public static boolean e(Context context) {
        if (f50654b == null) {
            boolean z10 = false;
            if (n.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f50654b = Boolean.valueOf(z10);
        }
        return f50654b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f50655c == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f50655c = Boolean.valueOf(z10);
        }
        return f50655c.booleanValue();
    }

    public static boolean g(PackageManager packageManager) {
        if (f50653a == null) {
            boolean z10 = false;
            if (n.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f50653a = Boolean.valueOf(z10);
        }
        return f50653a.booleanValue();
    }
}
