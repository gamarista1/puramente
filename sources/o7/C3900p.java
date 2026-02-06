package o7;

import Sg.p;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.Y;

/* renamed from: o7.p  reason: case insensitive filesystem */
public final class C3900p {

    /* renamed from: a  reason: collision with root package name */
    public static final C3900p f47284a = new C3900p();

    /* renamed from: b  reason: collision with root package name */
    private static final HashSet f47285b = Y.f("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    private C3900p() {
    }

    public static final boolean a(Context context, String str) {
        C6496s.h(context, "context");
        C6496s.h(str, "packageName");
        String str2 = Build.BRAND;
        int i10 = context.getApplicationInfo().flags;
        C6496s.g(str2, "brand");
        if (p.J(str2, "generic", false, 2, (Object) null) && (i10 & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                return false;
            }
            C6496s.g(signatureArr, "packageInfo.signatures");
            if (signatureArr.length == 0) {
                return false;
            }
            Signature[] signatureArr2 = packageInfo.signatures;
            C6496s.g(signatureArr2, "packageInfo.signatures");
            for (Signature byteArray : signatureArr2) {
                HashSet hashSet = f47285b;
                byte[] byteArray2 = byteArray.toByteArray();
                C6496s.g(byteArray2, "it.toByteArray()");
                if (!C6565s.e0(hashSet, W.I0(byteArray2))) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
