package androidx.compose.ui.window;

import lf.C6535s;

public abstract class u {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14340a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.window.t[] r0 = androidx.compose.ui.window.t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.window.t r1 = androidx.compose.ui.window.t.SecureOff     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.window.t r1 = androidx.compose.ui.window.t.SecureOn     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.window.t r1 = androidx.compose.ui.window.t.Inherit     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f14340a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.u.a.<clinit>():void");
        }
    }

    public static final boolean a(t tVar, boolean z10) {
        int i10 = a.f14340a[tVar.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            return z10;
        }
        throw new C6535s();
    }
}
