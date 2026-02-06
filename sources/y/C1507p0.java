package Y;

/* renamed from: Y.p0  reason: case insensitive filesystem */
public interface C1507p0 extends C1487g0, C1510r0 {
    long a();

    void h(long j10) {
        o(j10);
    }

    void o(long j10);

    /* bridge */ /* synthetic */ void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    Long getValue() {
        return Long.valueOf(a());
    }
}
