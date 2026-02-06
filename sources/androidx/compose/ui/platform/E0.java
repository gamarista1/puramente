package androidx.compose.ui.platform;

import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;

public abstract class E0 {
    public static final String a(Object obj, String str) {
        if (str == null) {
            if (obj.getClass().isAnonymousClass()) {
                str = obj.getClass().getName();
            } else {
                str = obj.getClass().getSimpleName();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('@');
        U u10 = U.f71764a;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        C6496s.g(format, "format(format, *args)");
        sb2.append(format);
        return sb2.toString();
    }
}
