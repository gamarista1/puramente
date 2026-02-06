package A6;

import java.io.Closeable;
import kotlin.jvm.internal.C6496s;

public final class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private int f29384a;

    /* renamed from: b  reason: collision with root package name */
    private final X5.a f29385b;

    public a(int i10, X5.a aVar) {
        C6496s.h(aVar, "bitmap");
        this.f29384a = i10;
        this.f29385b = aVar;
    }

    public final X5.a a() {
        return this.f29385b;
    }

    public final int b() {
        return this.f29384a;
    }

    public void close() {
        this.f29385b.close();
    }
}
