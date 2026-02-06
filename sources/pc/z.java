package Pc;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

public final class z extends Number {

    /* renamed from: a  reason: collision with root package name */
    private final String f52237a;

    public z(String str) {
        this.f52237a = str;
    }

    private BigDecimal a() {
        return B.b(this.f52237a);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return a();
    }

    public double doubleValue() {
        return Double.parseDouble(this.f52237a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.f52237a.equals(((z) obj).f52237a);
        }
        return false;
    }

    public float floatValue() {
        return Float.parseFloat(this.f52237a);
    }

    public int hashCode() {
        return this.f52237a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f52237a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return a().intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f52237a     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f52237a     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r0 = (int) r0
            return r0
        L_0x000f:
            java.math.BigDecimal r0 = r2.a()
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Pc.z.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f52237a);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public String toString() {
        return this.f52237a;
    }
}
