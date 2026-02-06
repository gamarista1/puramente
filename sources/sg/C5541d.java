package Sg;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C6496s;

/* renamed from: Sg.d  reason: case insensitive filesystem */
public final class C5541d {

    /* renamed from: a  reason: collision with root package name */
    public static final C5541d f65028a = new C5541d();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f65029b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f65030c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f65031d;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f65032e;

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f65033f;

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f65034g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile Charset f65035h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Charset f65036i;

    static {
        Charset forName = Charset.forName(Constants.ENCODING);
        C6496s.g(forName, "forName(...)");
        f65029b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C6496s.g(forName2, "forName(...)");
        f65030c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C6496s.g(forName3, "forName(...)");
        f65031d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C6496s.g(forName4, "forName(...)");
        f65032e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C6496s.g(forName5, "forName(...)");
        f65033f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C6496s.g(forName6, "forName(...)");
        f65034g = forName6;
    }

    private C5541d() {
    }

    public final Charset a() {
        Charset charset = f65036i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        C6496s.g(forName, "forName(...)");
        f65036i = forName;
        return forName;
    }

    public final Charset b() {
        Charset charset = f65035h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        C6496s.g(forName, "forName(...)");
        f65035h = forName;
        return forName;
    }
}
