package Y;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Y.g  reason: case insensitive filesystem */
public final class C1486g extends AtomicInteger {
    public C1486g(int i10) {
        super(i10);
    }

    public final int a(int i10) {
        return addAndGet(i10);
    }

    public byte b() {
        return (byte) intValue();
    }

    public final /* bridge */ byte byteValue() {
        return b();
    }

    public /* bridge */ double c() {
        return super.doubleValue();
    }

    public /* bridge */ float d() {
        return super.floatValue();
    }

    public final /* bridge */ double doubleValue() {
        return c();
    }

    public /* bridge */ int e() {
        return super.intValue();
    }

    public /* bridge */ long f() {
        return super.longValue();
    }

    public final /* bridge */ float floatValue() {
        return d();
    }

    public short g() {
        return (short) intValue();
    }

    public final /* bridge */ int intValue() {
        return e();
    }

    public final /* bridge */ long longValue() {
        return f();
    }

    public final /* bridge */ short shortValue() {
        return g();
    }
}
