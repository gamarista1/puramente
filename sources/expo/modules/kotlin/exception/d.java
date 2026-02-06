package expo.modules.kotlin.exception;

import kotlin.jvm.internal.C6496s;

public final class d extends CodedException {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(Ff.d r10, java.lang.Enum[] r11, java.lang.Object r12) {
        /*
            r9 = this;
            java.lang.String r0 = "enumType"
            kotlin.jvm.internal.C6496s.h(r10, r0)
            java.lang.String r0 = "enumConstants"
            kotlin.jvm.internal.C6496s.h(r11, r0)
            java.lang.String r10 = r10.w()
            he.a r6 = new he.a
            r6.<init>()
            r7 = 30
            r8 = 0
            java.lang.String r1 = ", "
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r11
            java.lang.String r11 = mf.C6559l.M0(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "'"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = "' is not present in "
            r0.append(r12)
            r0.append(r10)
            java.lang.String r10 = " enum, it must be one of: "
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = r0.toString()
            r11 = 0
            r12 = 2
            r9.<init>(r10, r11, r12, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.exception.d.<init>(Ff.d, java.lang.Enum[], java.lang.Object):void");
    }

    /* access modifiers changed from: private */
    public static final CharSequence b(Enum enumR) {
        C6496s.h(enumR, "it");
        String name = enumR.name();
        return "'" + name + "'";
    }
}
