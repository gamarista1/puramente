package M0;

import M0.d;
import Y.C1500m;
import Y.C1506p;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.C6496s;
import r0.H1;
import x0.C2891d;
import y0.C2929c;

public abstract class e {
    private static final H1 a(CharSequence charSequence, Resources resources, int i10) {
        try {
            return c.a(H1.f25423a, resources, i10);
        } catch (Exception e10) {
            throw new g("Error attempting to load resource: " + charSequence, e10);
        }
    }

    private static final C2891d b(Resources.Theme theme, Resources resources, int i10, int i11, C1500m mVar, int i12) {
        if (C1506p.H()) {
            C1506p.Q(21855625, i12, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:91)");
        }
        d dVar = (d) mVar.m(AndroidCompositionLocals_androidKt.h());
        d.b bVar = new d.b(theme, i10);
        d.a b10 = dVar.b(bVar);
        if (b10 == null) {
            XmlResourceParser xml = resources.getXml(i10);
            if (C6496s.c(C2929c.j(xml).getName(), "vector")) {
                b10 = j.a(theme, resources, xml, i11);
                dVar.d(bVar, b10);
            } else {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
        }
        C2891d b11 = b10.b();
        if (C1506p.H()) {
            C1506p.P();
        }
        return b11;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: r0.H1} */
    /* JADX WARNING: type inference failed for: r9v4, types: [x0.q] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final w0.C2817c c(int r9, Y.C1500m r10, int r11) {
        /*
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.ui.res.painterResource (PainterResources.android.kt:57)"
            r2 = 473971343(0x1c403a8f, float:6.3603156E-22)
            Y.C1506p.Q(r2, r11, r0, r1)
        L_0x000f:
            Y.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r10.m(r0)
            android.content.Context r0 = (android.content.Context) r0
            Y.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f()
            r10.m(r1)
            android.content.res.Resources r3 = r0.getResources()
            Y.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.i()
            java.lang.Object r1 = r10.m(r1)
            M0.f r1 = (M0.f) r1
            android.util.TypedValue r1 = r1.b(r3, r9)
            java.lang.CharSequence r2 = r1.string
            r4 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0060
            r5 = 2
            r6 = 0
            java.lang.String r7 = ".xml"
            boolean r5 = Sg.p.S(r2, r7, r8, r5, r6)
            if (r5 != r4) goto L_0x0060
            r2 = -803040357(0xffffffffd022939b, float:-1.09103299E10)
            r10.T(r2)
            android.content.res.Resources$Theme r2 = r0.getTheme()
            int r5 = r1.changingConfigurations
            int r11 = r11 << 6
            r7 = r11 & 896(0x380, float:1.256E-42)
            r4 = r9
            r6 = r10
            x0.d r9 = b(r2, r3, r4, r5, r6, r7)
            x0.q r9 = x0.r.g(r9, r10, r8)
            r10.M()
            goto L_0x00af
        L_0x0060:
            r1 = -802884675(0xffffffffd024f3bd, float:-1.10697482E10)
            r10.T(r1)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            boolean r1 = r10.S(r2)
            r5 = r11 & 14
            r5 = r5 ^ 6
            r6 = 4
            if (r5 <= r6) goto L_0x007b
            boolean r5 = r10.d(r9)
            if (r5 != 0) goto L_0x0081
        L_0x007b:
            r11 = r11 & 6
            if (r11 != r6) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r4 = r8
        L_0x0081:
            r11 = r1 | r4
            boolean r0 = r10.S(r0)
            r11 = r11 | r0
            java.lang.Object r0 = r10.A()
            if (r11 != 0) goto L_0x0096
            Y.m$a r11 = Y.C1500m.f10026a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x009d
        L_0x0096:
            r0.H1 r0 = a(r2, r3, r9)
            r10.r(r0)
        L_0x009d:
            r2 = r0
            r0.H1 r2 = (r0.H1) r2
            w0.a r9 = new w0.a
            r7 = 6
            r8 = 0
            r3 = 0
            r5 = 0
            r1 = r9
            r1.<init>(r2, r3, r5, r7, r8)
            r10.M()
        L_0x00af:
            boolean r10 = Y.C1506p.H()
            if (r10 == 0) goto L_0x00b8
            Y.C1506p.P()
        L_0x00b8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.e.c(int, Y.m, int):w0.c");
    }
}
