package Ph;

public class b extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    Throwable f64717a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(java.lang.String r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            if (r4 != 0) goto L_0x0003
            goto L_0x001c
        L_0x0003:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Exception while initializing "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
        L_0x001c:
            r2.<init>(r3)
            r2.f64717a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ph.b.<init>(java.lang.String, java.lang.Throwable):void");
    }

    public Throwable getCause() {
        return this.f64717a;
    }
}
