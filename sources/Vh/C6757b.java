package vh;

import com.revenuecat.purchases.common.UtilsKt;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;

/* renamed from: vh.b  reason: case insensitive filesystem */
public abstract class C6757b {
    public static final String b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) UtilsKt.MICROS_MULTIPLIER)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) UtilsKt.MICROS_MULTIPLIER)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        U u10 = U.f71764a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        C6496s.g(format, "format(format, *args)");
        return format;
    }

    /* access modifiers changed from: private */
    public static final void c(C6756a aVar, C6759d dVar, String str) {
        Logger a10 = C6760e.f73694h.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.f());
        sb2.append(' ');
        U u10 = U.f71764a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C6496s.g(format, "format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.b());
        a10.fine(sb2.toString());
    }
}
