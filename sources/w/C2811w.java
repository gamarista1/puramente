package w;

/* renamed from: w.w  reason: case insensitive filesystem */
public abstract class C2811w {
    public static final C2810v a(double d10) {
        if (d10 < 0.0d) {
            return new C2810v(0.0d, Math.sqrt(Math.abs(d10)));
        }
        return new C2810v(Math.sqrt(d10), 0.0d);
    }
}
