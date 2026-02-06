package k7;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;

/* renamed from: k7.b  reason: case insensitive filesystem */
public final class C3675b {

    /* renamed from: a  reason: collision with root package name */
    private final int f45155a;

    public C3675b(int i10) {
        this.f45155a = i10;
    }

    public final int a() {
        return this.f45155a;
    }

    public String toString() {
        U u10 = U.f71764a;
        String format = String.format((Locale) null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f45155a)}, 1));
        C6496s.g(format, "format(...)");
        return format;
    }
}
