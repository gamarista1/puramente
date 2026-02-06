package expo.modules.kotlin.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a extends c {

    /* renamed from: d  reason: collision with root package name */
    public static final C0886a f60422d = new C0886a((DefaultConstructorMarker) null);

    /* renamed from: expo.modules.kotlin.exception.a$a  reason: collision with other inner class name */
    public static final class C0886a {
        public /* synthetic */ C0886a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i10) {
            int i11 = i10 % 100;
            String str = "th";
            if (11 > i11 || i11 >= 14) {
                int i12 = i10 % 10;
                if (i12 == 1) {
                    str = "st";
                } else if (i12 == 2) {
                    str = "nd";
                } else if (i12 == 3) {
                    str = "rd";
                }
            }
            return i10 + str;
        }

        private C0886a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(Ff.p r3, int r4, java.lang.String r5, expo.modules.kotlin.exception.CodedException r6) {
        /*
            r2 = this;
            java.lang.String r0 = "argDesiredType"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "providedType"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "cause"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            expo.modules.kotlin.exception.a$a r0 = f60422d
            int r4 = r4 + 1
            java.lang.String r4 = r0.a(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "The "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " argument cannot be cast to type "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = " (received "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.exception.a.<init>(Ff.p, int, java.lang.String, expo.modules.kotlin.exception.CodedException):void");
    }
}
