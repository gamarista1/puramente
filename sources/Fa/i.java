package fa;

import com.revenuecat.purchases.common.Constants;
import ja.B;
import ja.M;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k9.L0;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f43599a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(B b10) {
        String p10;
        while (true) {
            String p11 = b10.p();
            if (p11 == null) {
                return null;
            }
            if (f43599a.matcher(p11).matches()) {
                do {
                    p10 = b10.p();
                    if (p10 == null) {
                        break;
                    }
                } while (p10.isEmpty());
            } else {
                Matcher matcher = f.f43573a.matcher(p11);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(B b10) {
        String p10 = b10.p();
        if (p10 == null || !p10.startsWith("WEBVTT")) {
            return false;
        }
        return true;
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] S02 = M.S0(str, "\\.");
        long j10 = 0;
        for (String parseLong : M.R0(S02[0], Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) {
            j10 = (j10 * 60) + Long.parseLong(parseLong);
        }
        long j11 = j10 * 1000;
        if (S02.length == 2) {
            j11 += Long.parseLong(S02[1]);
        }
        return j11 * 1000;
    }

    public static void e(B b10) {
        int e10 = b10.e();
        if (!b(b10)) {
            b10.P(e10);
            throw L0.a("Expected WEBVTT. Got " + b10.p(), (Throwable) null);
        }
    }
}
