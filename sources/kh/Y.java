package kh;

import ih.f;
import kotlin.jvm.internal.C6496s;

public abstract class Y extends y0 {
    /* access modifiers changed from: protected */
    public abstract String Z(String str, String str2);

    /* access modifiers changed from: protected */
    public String a0(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return fVar.e(i10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public final String V(f fVar, int i10) {
        C6496s.h(fVar, "<this>");
        return c0(a0(fVar, i10));
    }

    /* access modifiers changed from: protected */
    public final String c0(String str) {
        C6496s.h(str, "nestedName");
        String str2 = (String) U();
        if (str2 == null) {
            str2 = "";
        }
        return Z(str2, str);
    }
}
