package f2;

import java.io.IOException;

/* renamed from: f2.B  reason: case insensitive filesystem */
public class C1961B extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19695a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19696b;

    protected C1961B(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f19695a = z10;
        this.f19696b = i10;
    }

    public static C1961B a(String str, Throwable th2) {
        return new C1961B(str, th2, true, 1);
    }

    public static C1961B b(String str, Throwable th2) {
        return new C1961B(str, th2, true, 0);
    }

    public static C1961B c(String str) {
        return new C1961B(str, (Throwable) null, false, 1);
    }

    public String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.f19695a + ", dataType=" + this.f19696b + "}";
    }
}
