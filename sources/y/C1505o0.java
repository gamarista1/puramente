package Y;

/* renamed from: Y.o0  reason: case insensitive filesystem */
public interface C1505o0 extends X, C1510r0 {
    int b();

    void f(int i10);

    void i(int i10) {
        f(i10);
    }

    /* bridge */ /* synthetic */ void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    Integer getValue() {
        return Integer.valueOf(b());
    }
}
