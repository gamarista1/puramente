package Y;

/* renamed from: Y.n0  reason: case insensitive filesystem */
public interface C1503n0 extends Q, C1510r0 {
    float c();

    void j(float f10) {
        l(f10);
    }

    void l(float f10);

    /* bridge */ /* synthetic */ void setValue(Object obj) {
        j(((Number) obj).floatValue());
    }

    Float getValue() {
        return Float.valueOf(c());
    }
}
