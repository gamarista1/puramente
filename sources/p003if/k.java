package p003if;

/* renamed from: if.k  reason: invalid package */
public abstract class k {
    public static Double a(Double d10, Double d11, Boolean bool) {
        if (d10 != null) {
            return d10;
        }
        double d12 = l.a().d();
        if (d11 == null || bool == null) {
            return Double.valueOf(d12);
        }
        if (bool.booleanValue()) {
            return Double.valueOf(d12 * d11.doubleValue());
        }
        return Double.valueOf(d11.doubleValue() + (d12 * (1.0d - d11.doubleValue())));
    }
}
