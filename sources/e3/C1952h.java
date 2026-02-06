package e3;

import com.revenuecat.purchases.common.Constants;
import f2.C1961B;
import i2.C2073A;
import i2.L;
import java.util.regex.Pattern;

/* renamed from: e3.h  reason: case insensitive filesystem */
public abstract class C1952h {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f19585a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(C2073A a10) {
        String s10 = a10.s();
        if (s10 == null || !s10.startsWith("WEBVTT")) {
            return false;
        }
        return true;
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String[] b12 = L.b1(str, "\\.");
        long j10 = 0;
        for (String parseLong : L.a1(b12[0], Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) {
            j10 = (j10 * 60) + Long.parseLong(parseLong);
        }
        long j11 = j10 * 1000;
        if (b12.length == 2) {
            j11 += Long.parseLong(b12[1]);
        }
        return j11 * 1000;
    }

    public static void d(C2073A a10) {
        int f10 = a10.f();
        if (!a(a10)) {
            a10.U(f10);
            throw C1961B.a("Expected WEBVTT. Got " + a10.s(), (Throwable) null);
        }
    }
}
