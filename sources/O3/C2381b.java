package o3;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.revenuecat.purchases.common.UtilsKt;

/* renamed from: o3.b  reason: case insensitive filesystem */
public final class C2381b {

    /* renamed from: a  reason: collision with root package name */
    public static final C2381b f25078a = new C2381b();

    /* renamed from: o3.b$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25079a = new a();

        private a() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(UtilsKt.MICROS_MULTIPLIER);
        }
    }

    private C2381b() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.f25079a.a();
        }
        return 0;
    }
}
