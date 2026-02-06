package tg;

import Fg.C5366d0;
import Of.H;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

/* renamed from: tg.e  reason: case insensitive filesystem */
public final class C6739e extends r {
    public C6739e(char c10) {
        super(Character.valueOf(c10));
    }

    private final String c(char c10) {
        switch (c10) {
            case 8:
                return "\\b";
            case 9:
                return "\\t";
            case 10:
                return "\\n";
            case 12:
                return "\\f";
            case 13:
                return "\\r";
            default:
                if (e(c10)) {
                    return String.valueOf(c10);
                }
                return "?";
        }
    }

    private final boolean e(char c10) {
        byte type = (byte) Character.getType(c10);
        if (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public C5366d0 a(H h10) {
        C6496s.h(h10, "module");
        C5366d0 u10 = h10.m().u();
        C6496s.g(u10, "getCharType(...)");
        return u10;
    }

    public String toString() {
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(((Character) b()).charValue()), c(((Character) b()).charValue())}, 2));
        C6496s.g(format, "format(...)");
        return format;
    }
}
