package Md;

import java.util.Map;
import lf.C6502A;
import mf.O;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f52052a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f52053b = O.l(C6502A.a("host.exp.exponent.experience.splashscreen.legacy.SplashScreenPackage", 11), C6502A.a("expo.modules.updates.UpdatesPackage", 10));

    /* renamed from: c  reason: collision with root package name */
    public static final int f52054c = 8;

    private a() {
    }

    public final int a(String str) {
        Integer num;
        if (str == null || (num = (Integer) f52053b.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
