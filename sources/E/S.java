package E;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;

public abstract class S {

    /* renamed from: a  reason: collision with root package name */
    private static final a f1591a;

    static {
        a aVar;
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (C6496s.c(lowerCase, "robolectric")) {
            aVar = new a();
        } else {
            aVar = null;
        }
        f1591a = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: E.Q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final E.Q a(Y.C1500m r3, int r4) {
        /*
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:32)"
            r2 = 1141871251(0x440f9293, float:574.2902)
            Y.C1506p.Q(r2, r4, r0, r1)
        L_0x000f:
            E.S$a r4 = f1591a
            if (r4 == 0) goto L_0x001d
            r0 = 1213893039(0x485a89af, float:223782.73)
            r3.T(r0)
            r3.M()
            goto L_0x004d
        L_0x001d:
            r4 = 1213931944(0x485b21a8, float:224390.62)
            r3.T(r4)
            Y.I0 r4 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.k()
            java.lang.Object r4 = r3.m(r4)
            android.view.View r4 = (android.view.View) r4
            boolean r0 = r3.S(r4)
            java.lang.Object r1 = r3.A()
            if (r0 != 0) goto L_0x003f
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0047
        L_0x003f:
            E.a r1 = new E.a
            r1.<init>(r4)
            r3.r(r1)
        L_0x0047:
            r4 = r1
            E.a r4 = (E.C1132a) r4
            r3.M()
        L_0x004d:
            boolean r3 = Y.C1506p.H()
            if (r3 == 0) goto L_0x0056
            Y.C1506p.P()
        L_0x0056:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: E.S.a(Y.m, int):E.Q");
    }

    public static final class a implements Q {
        a() {
        }

        public void a(O o10) {
        }
    }
}
