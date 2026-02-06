package o7;

import com.facebook.I;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;
import mf.C6565s;

public final class P {

    /* renamed from: a  reason: collision with root package name */
    public static final P f47152a = new P();

    /* renamed from: b  reason: collision with root package name */
    private static final String f47153b = P.class.getName();

    private P() {
    }

    public static final String a() {
        return "v16.0";
    }

    public static final String b() {
        U u10 = U.f71764a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{I.u()}, 1));
        C6496s.g(format, "format(format, *args)");
        return format;
    }

    public static final String c() {
        return "CONNECTION_FAILURE";
    }

    public static final Collection d() {
        return C6565s.q("service_disabled", "AndroidAuthKillSwitchException");
    }

    public static final Collection e() {
        return C6565s.q("access_denied", "OAuthAccessDeniedException");
    }

    public static final String f() {
        U u10 = U.f71764a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{I.u()}, 1));
        C6496s.g(format, "format(format, *args)");
        return format;
    }

    public static final String g() {
        U u10 = U.f71764a;
        String format = String.format("%s", Arrays.copyOf(new Object[]{I.v()}, 1));
        C6496s.g(format, "format(format, *args)");
        return format;
    }

    public static final String h() {
        U u10 = U.f71764a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{I.x()}, 1));
        C6496s.g(format, "format(format, *args)");
        return format;
    }

    public static final String i(String str) {
        C6496s.h(str, "subdomain");
        U u10 = U.f71764a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{str}, 1));
        C6496s.g(format, "format(format, *args)");
        return format;
    }

    public static final String j() {
        U u10 = U.f71764a;
        String format = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{I.x()}, 1));
        C6496s.g(format, "format(format, *args)");
        return format;
    }

    public static final String k() {
        U u10 = U.f71764a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{I.y()}, 1));
        C6496s.g(format, "format(format, *args)");
        return format;
    }
}
