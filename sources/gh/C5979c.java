package gh;

import java.util.List;
import kotlin.jvm.internal.C6496s;

/* renamed from: gh.c  reason: case insensitive filesystem */
public final class C5979c extends C5986j {

    /* renamed from: a  reason: collision with root package name */
    private final List f67832a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5979c(List list, String str, Throwable th2) {
        super(str, th2);
        C6496s.h(list, "missingFields");
        this.f67832a = list;
    }

    public final List a() {
        return this.f67832a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5979c(java.util.List r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "missingFields"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "serialName"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L_0x0037
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Field '"
            r0.append(r1)
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = "' is required for type with serial name '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "', but it was missing"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            goto L_0x0055
        L_0x0037:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fields "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " are required for type with serial name '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "', but they were missing"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L_0x0055:
            r0 = 0
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.C5979c.<init>(java.util.List, java.lang.String):void");
    }
}
