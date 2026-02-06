package k9;

import java.io.IOException;

public class L0 extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f45337a;

    /* renamed from: b  reason: collision with root package name */
    public final int f45338b;

    protected L0(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f45337a = z10;
        this.f45338b = i10;
    }

    public static L0 a(String str, Throwable th2) {
        return new L0(str, th2, true, 1);
    }

    public static L0 b(String str, Throwable th2) {
        return new L0(str, th2, true, 0);
    }

    public static L0 c(String str, Throwable th2) {
        return new L0(str, th2, true, 4);
    }

    public static L0 d(String str) {
        return new L0(str, (Throwable) null, false, 1);
    }
}
