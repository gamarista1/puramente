package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: s0.g  reason: case insensitive filesystem */
public final class C2585g {

    /* renamed from: a  reason: collision with root package name */
    public static final C2585g f25794a = new C2585g();

    /* renamed from: b  reason: collision with root package name */
    private static final float[] f25795b;

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f25796c;

    /* renamed from: d  reason: collision with root package name */
    private static final y f25797d;

    /* renamed from: e  reason: collision with root package name */
    private static final y f25798e;

    /* renamed from: f  reason: collision with root package name */
    private static final x f25799f;

    /* renamed from: g  reason: collision with root package name */
    private static final x f25800g;

    /* renamed from: h  reason: collision with root package name */
    private static final x f25801h;

    /* renamed from: i  reason: collision with root package name */
    private static final x f25802i;

    /* renamed from: j  reason: collision with root package name */
    private static final x f25803j;

    /* renamed from: k  reason: collision with root package name */
    private static final x f25804k;

    /* renamed from: l  reason: collision with root package name */
    private static final x f25805l;

    /* renamed from: m  reason: collision with root package name */
    private static final x f25806m;

    /* renamed from: n  reason: collision with root package name */
    private static final x f25807n;

    /* renamed from: o  reason: collision with root package name */
    private static final x f25808o;

    /* renamed from: p  reason: collision with root package name */
    private static final x f25809p;

    /* renamed from: q  reason: collision with root package name */
    private static final x f25810q;

    /* renamed from: r  reason: collision with root package name */
    private static final x f25811r;

    /* renamed from: s  reason: collision with root package name */
    private static final x f25812s;

    /* renamed from: t  reason: collision with root package name */
    private static final C2581c f25813t;

    /* renamed from: u  reason: collision with root package name */
    private static final C2581c f25814u;

    /* renamed from: v  reason: collision with root package name */
    private static final x f25815v;

    /* renamed from: w  reason: collision with root package name */
    private static final C2581c f25816w;

    /* renamed from: x  reason: collision with root package name */
    private static final C2581c[] f25817x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f25795b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f25796c = fArr2;
        y yVar = new y(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null);
        f25797d = yVar;
        y yVar2 = new y(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null);
        f25798e = yVar2;
        k kVar = k.f25829a;
        float[] fArr3 = fArr;
        x xVar = new x("sRGB IEC61966-2.1", fArr3, kVar.e(), yVar, 0);
        f25799f = xVar;
        x xVar2 = new x("sRGB IEC61966-2.1 (Linear)", fArr3, kVar.e(), 1.0d, 0.0f, 1.0f, 1);
        f25800g = xVar2;
        x xVar3 = new x("scRGB-nl IEC 61966-2-2:2003", fArr3, kVar.e(), (float[]) null, new C2583e(), new C2584f(), -0.799f, 2.399f, yVar, 2);
        f25801h = xVar3;
        x xVar4 = new x("scRGB IEC 61966-2-2:2003", fArr3, kVar.e(), 1.0d, -0.5f, 7.499f, 3);
        f25802i = xVar4;
        x xVar5 = new x("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, kVar.e(), new y(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 4);
        f25803j = xVar5;
        x xVar6 = new x("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, kVar.e(), new y(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 5);
        f25804k = xVar6;
        x xVar7 = new x("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new z(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f25805l = xVar7;
        x xVar8 = new x("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, kVar.e(), yVar, 7);
        f25806m = xVar8;
        x xVar9 = new x("NTSC (1953)", fArr2, kVar.a(), new y(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 8);
        f25807n = xVar9;
        x xVar10 = new x("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, kVar.e(), new y(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 9);
        f25808o = xVar10;
        x xVar11 = new x("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, kVar.e(), 2.2d, 0.0f, 1.0f, 10);
        f25809p = xVar11;
        x xVar12 = new x("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, kVar.b(), new y(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 11);
        f25810q = xVar12;
        x xVar13 = new x("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, kVar.d(), 1.0d, -65504.0f, 65504.0f, 12);
        f25811r = xVar13;
        x xVar14 = new x("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, kVar.d(), 1.0d, -65504.0f, 65504.0f, 13);
        f25812s = xVar14;
        C2578A a10 = new C2578A("Generic XYZ", 14);
        f25813t = a10;
        l lVar = new l("Generic L*a*b*", 15);
        f25814u = lVar;
        float[] fArr4 = fArr;
        x xVar15 = new x("None", fArr4, kVar.e(), yVar2, 16);
        f25815v = xVar15;
        m mVar = new m("Oklab", 17);
        f25816w = mVar;
        f25817x = new C2581c[]{xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7, xVar8, xVar9, xVar10, xVar11, xVar12, xVar13, xVar14, a10, lVar, xVar15, mVar};
    }

    private C2585g() {
    }

    /* access modifiers changed from: private */
    public static final double c(double d10) {
        return C2582d.a(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* access modifiers changed from: private */
    public static final double d(double d10) {
        return C2582d.b(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final x e() {
        return f25811r;
    }

    public final x f() {
        return f25812s;
    }

    public final x g() {
        return f25809p;
    }

    public final x h() {
        return f25804k;
    }

    public final x i() {
        return f25803j;
    }

    public final C2581c j() {
        return f25814u;
    }

    public final C2581c k() {
        return f25813t;
    }

    public final C2581c[] l() {
        return f25817x;
    }

    public final x m() {
        return f25805l;
    }

    public final x n() {
        return f25806m;
    }

    public final x o() {
        return f25801h;
    }

    public final x p() {
        return f25802i;
    }

    public final x q() {
        return f25800g;
    }

    public final x r() {
        return f25807n;
    }

    public final float[] s() {
        return f25796c;
    }

    public final C2581c t() {
        return f25816w;
    }

    public final x u() {
        return f25810q;
    }

    public final x v() {
        return f25808o;
    }

    public final x w() {
        return f25799f;
    }

    public final float[] x() {
        return f25795b;
    }

    public final x y() {
        return f25815v;
    }
}
