package m7;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.C6496s;

/* renamed from: m7.f  reason: case insensitive filesystem */
public final class C3786f {

    /* renamed from: a  reason: collision with root package name */
    public static final C3786f f46513a = new C3786f();

    private C3786f() {
    }

    public static final int a(int i10) {
        return h.a(i10);
    }

    public static final int b(InputStream inputStream) {
        C6496s.h(inputStream, "inputStream");
        try {
            int d10 = f46513a.d(inputStream);
            if (d10 == 0) {
                return 0;
            }
            return h.d(inputStream, d10);
        } catch (IOException unused) {
            return 0;
        }
    }

    private final boolean c(int i10) {
        switch (i10) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case RCHTTPStatusCodes.CREATED /*201*/:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            default:
                return false;
        }
    }

    private final int d(InputStream inputStream) {
        if (e(inputStream, 225)) {
            int a10 = g.a(inputStream, 2, false);
            if (a10 - 2 > 6) {
                int a11 = g.a(inputStream, 4, false);
                int a12 = g.a(inputStream, 2, false);
                int i10 = a10 - 8;
                if (a11 == 1165519206 && a12 == 0) {
                    return i10;
                }
                return 0;
            }
        }
        return 0;
    }

    public static final boolean e(InputStream inputStream, int i10) {
        C6496s.h(inputStream, "inputStream");
        while (g.a(inputStream, 1, false) == 255) {
            int i11 = 255;
            while (i11 == 255) {
                i11 = g.a(inputStream, 1, false);
            }
            if ((i10 != 192 || !f46513a.c(i11)) && i11 != i10) {
                if (!(i11 == 1 || i11 == 216)) {
                    if (i11 == 217 || i11 == 218) {
                        break;
                    }
                    inputStream.skip((long) (g.a(inputStream, 2, false) - 2));
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
