package com.facebook.react.uimanager;

import com.facebook.yoga.h;
import kotlin.jvm.internal.C6496s;

/* renamed from: com.facebook.react.uimanager.u  reason: case insensitive filesystem */
public final class C3427u {

    /* renamed from: a  reason: collision with root package name */
    public static final C3427u f41819a = new C3427u();

    /* renamed from: com.facebook.react.uimanager.u$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f41820a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.facebook.yoga.h[] r0 = com.facebook.yoga.h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.yoga.h r1 = com.facebook.yoga.h.LTR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.yoga.h r1 = com.facebook.yoga.h.RTL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f41820a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C3427u.a.<clinit>():void");
        }
    }

    private C3427u() {
    }

    public static final int a(h hVar) {
        C6496s.h(hVar, "direction");
        int i10 = a.f41820a[hVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return 2;
        }
        return 1;
    }
}
