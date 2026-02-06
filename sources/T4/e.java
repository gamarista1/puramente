package T4;

import java.io.IOException;

public final class e extends IOException {
    private static final long serialVersionUID = 1;

    /* renamed from: a  reason: collision with root package name */
    private final int f34157a;

    public e(int i10) {
        this("Http request failed", i10);
    }

    public e(String str, int i10) {
        this(str, i10, (Throwable) null);
    }

    public e(String str, int i10, Throwable th2) {
        super(str + ", status code: " + i10, th2);
        this.f34157a = i10;
    }
}
