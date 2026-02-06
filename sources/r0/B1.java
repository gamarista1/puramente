package r0;

import android.graphics.ColorSpace;
import kotlin.jvm.internal.C6496s;
import s0.C2581c;
import s0.C2585g;
import s0.x;
import s0.y;
import s0.z;
import yf.C6798l;

final class B1 {

    /* renamed from: a  reason: collision with root package name */
    public static final B1 f25396a = new B1();

    private B1() {
    }

    public static final ColorSpace e(C2581c cVar) {
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace.Rgb rgb;
        C2581c cVar2 = cVar;
        C2585g gVar = C2585g.f25794a;
        if (C6496s.c(cVar2, gVar.w())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (C6496s.c(cVar2, gVar.e())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (C6496s.c(cVar2, gVar.f())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (C6496s.c(cVar2, gVar.g())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (C6496s.c(cVar2, gVar.h())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (C6496s.c(cVar2, gVar.i())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (C6496s.c(cVar2, gVar.j())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (C6496s.c(cVar2, gVar.k())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (C6496s.c(cVar2, gVar.m())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (C6496s.c(cVar2, gVar.n())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (C6496s.c(cVar2, gVar.o())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (C6496s.c(cVar2, gVar.p())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (C6496s.c(cVar2, gVar.q())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (C6496s.c(cVar2, gVar.r())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (C6496s.c(cVar2, gVar.u())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (C6496s.c(cVar2, gVar.v())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(cVar2 instanceof x)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        x xVar = (x) cVar2;
        float[] c10 = xVar.N().c();
        y L10 = xVar.L();
        if (L10 != null) {
            C2512m1.a();
            transferParameters = C2445F0.a(L10.a(), L10.b(), L10.c(), L10.d(), L10.e(), L10.f(), L10.g());
        } else {
            transferParameters = null;
        }
        if (transferParameters != null) {
            C2527r1.a();
            rgb = Q0.a(cVar.f(), xVar.K(), c10, transferParameters);
        } else {
            C2527r1.a();
            rgb = C2479b1.a(cVar.f(), xVar.K(), c10, new C2545x1(xVar.H()), new C2548y1(xVar.D()), cVar2.d(0), cVar2.c(0));
        }
        return P0.a(rgb);
    }

    /* access modifiers changed from: private */
    public static final double f(C6798l lVar, double d10) {
        return ((Number) lVar.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* access modifiers changed from: private */
    public static final double g(C6798l lVar, double d10) {
        return ((Number) lVar.invoke(Double.valueOf(d10))).doubleValue();
    }

    public static final C2581c h(ColorSpace colorSpace) {
        z zVar;
        y yVar;
        ColorSpace colorSpace2 = colorSpace;
        int a10 = colorSpace.getId();
        if (a10 == ColorSpace.Named.SRGB.ordinal()) {
            return C2585g.f25794a.w();
        }
        if (a10 == ColorSpace.Named.ACES.ordinal()) {
            return C2585g.f25794a.e();
        }
        if (a10 == ColorSpace.Named.ACESCG.ordinal()) {
            return C2585g.f25794a.f();
        }
        if (a10 == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return C2585g.f25794a.g();
        }
        if (a10 == ColorSpace.Named.BT2020.ordinal()) {
            return C2585g.f25794a.h();
        }
        if (a10 == ColorSpace.Named.BT709.ordinal()) {
            return C2585g.f25794a.i();
        }
        if (a10 == ColorSpace.Named.CIE_LAB.ordinal()) {
            return C2585g.f25794a.j();
        }
        if (a10 == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return C2585g.f25794a.k();
        }
        if (a10 == ColorSpace.Named.DCI_P3.ordinal()) {
            return C2585g.f25794a.m();
        }
        if (a10 == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return C2585g.f25794a.n();
        }
        if (a10 == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return C2585g.f25794a.o();
        }
        if (a10 == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return C2585g.f25794a.p();
        }
        if (a10 == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return C2585g.f25794a.q();
        }
        if (a10 == ColorSpace.Named.NTSC_1953.ordinal()) {
            return C2585g.f25794a.r();
        }
        if (a10 == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return C2585g.f25794a.u();
        }
        if (a10 == ColorSpace.Named.SMPTE_C.ordinal()) {
            return C2585g.f25794a.v();
        }
        if (!W0.a(colorSpace)) {
            return C2585g.f25794a.w();
        }
        ColorSpace.Rgb.TransferParameters a11 = X0.a(colorSpace).getTransferParameters();
        if (X0.a(colorSpace).getWhitePoint().length == 3) {
            zVar = new z(X0.a(colorSpace).getWhitePoint()[0], X0.a(colorSpace).getWhitePoint()[1], X0.a(colorSpace).getWhitePoint()[2]);
        } else {
            zVar = new z(X0.a(colorSpace).getWhitePoint()[0], X0.a(colorSpace).getWhitePoint()[1]);
        }
        z zVar2 = zVar;
        if (a11 != null) {
            yVar = new y(a11.g, a11.a, a11.b, a11.c, a11.d, a11.e, a11.f);
        } else {
            yVar = null;
        }
        return new x(X0.a(colorSpace).getName(), X0.a(colorSpace).getPrimaries(), zVar2, X0.a(colorSpace).getTransform(), new C2551z1(colorSpace2), new A1(colorSpace2), colorSpace2.getMinValue(0), colorSpace2.getMaxValue(0), yVar, X0.a(colorSpace).getId());
    }

    /* access modifiers changed from: private */
    public static final double i(ColorSpace colorSpace, double d10) {
        return X0.a(colorSpace).getOetf().applyAsDouble(d10);
    }

    /* access modifiers changed from: private */
    public static final double j(ColorSpace colorSpace, double d10) {
        return X0.a(colorSpace).getEotf().applyAsDouble(d10);
    }
}
