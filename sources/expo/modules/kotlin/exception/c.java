package expo.modules.kotlin.exception;

public abstract class c extends CodedException {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(java.lang.String r5, expo.modules.kotlin.exception.CodedException r6) {
        /*
            r4 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "cause"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            java.lang.String r0 = r6.getCode()
            java.lang.String r1 = java.lang.System.lineSeparator()
            java.lang.String r2 = r6.getLocalizedMessage()
            if (r2 == 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r2 = r6
        L_0x001a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r1)
            java.lang.String r5 = "→ Caused by: "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r5 = r3.toString()
            r4.<init>(r0, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.exception.c.<init>(java.lang.String, expo.modules.kotlin.exception.CodedException):void");
    }
}
