package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* renamed from: com.horcrux.svg.v  reason: case insensitive filesystem */
class C4912v {

    /* renamed from: p  reason: collision with root package name */
    static final C4912v f59037p = new C4912v();

    /* renamed from: a  reason: collision with root package name */
    final double f59038a;

    /* renamed from: b  reason: collision with root package name */
    final String f59039b;

    /* renamed from: c  reason: collision with root package name */
    final c0 f59040c;

    /* renamed from: d  reason: collision with root package name */
    final ReadableMap f59041d;

    /* renamed from: e  reason: collision with root package name */
    e0 f59042e;

    /* renamed from: f  reason: collision with root package name */
    int f59043f;

    /* renamed from: g  reason: collision with root package name */
    final String f59044g;

    /* renamed from: h  reason: collision with root package name */
    final String f59045h;

    /* renamed from: i  reason: collision with root package name */
    final d0 f59046i;

    /* renamed from: j  reason: collision with root package name */
    final f0 f59047j;

    /* renamed from: k  reason: collision with root package name */
    private final g0 f59048k;

    /* renamed from: l  reason: collision with root package name */
    final double f59049l;

    /* renamed from: m  reason: collision with root package name */
    final double f59050m;

    /* renamed from: n  reason: collision with root package name */
    final double f59051n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f59052o;

    /* renamed from: com.horcrux.svg.v$a */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final e0[] f59053a;

        /* renamed from: b  reason: collision with root package name */
        private static final int[] f59054b = {400, 700, 100, 200, 300, 400, 500, 600, 700, 800, 900};

        static {
            e0 e0Var = e0.w100;
            e0 e0Var2 = e0.w200;
            e0 e0Var3 = e0.w300;
            e0 e0Var4 = e0.f58915b;
            e0 e0Var5 = e0.w500;
            e0 e0Var6 = e0.w600;
            e0 e0Var7 = e0.Bold;
            e0 e0Var8 = e0.w800;
            e0 e0Var9 = e0.w900;
            f59053a = new e0[]{e0Var, e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6, e0Var7, e0Var8, e0Var9, e0Var9};
        }

        private static int a(int i10) {
            if (i10 < 350) {
                return 400;
            }
            if (i10 < 550) {
                return 700;
            }
            if (i10 < 900) {
                return 900;
            }
            return i10;
        }

        static int b(e0 e0Var, C4912v vVar) {
            if (e0Var == e0.Bolder) {
                return a(vVar.f59043f);
            }
            if (e0Var == e0.Lighter) {
                return c(vVar.f59043f);
            }
            return f59054b[e0Var.ordinal()];
        }

        private static int c(int i10) {
            if (i10 < 100) {
                return i10;
            }
            if (i10 < 550) {
                return 100;
            }
            return i10 < 750 ? 400 : 700;
        }

        static e0 d(int i10) {
            return f59053a[Math.round(((float) i10) / 100.0f)];
        }
    }

    private C4912v() {
        this.f59041d = null;
        this.f59039b = "";
        this.f59040c = c0.f58908a;
        this.f59042e = e0.f58915b;
        this.f59043f = 400;
        this.f59044g = "";
        this.f59045h = "";
        this.f59046i = d0.f58912a;
        this.f59047j = f0.start;
        this.f59048k = g0.None;
        this.f59052o = false;
        this.f59049l = 0.0d;
        this.f59038a = 12.0d;
        this.f59050m = 0.0d;
        this.f59051n = 0.0d;
    }

    private void a(C4912v vVar, double d10) {
        long round = Math.round(d10);
        if (round < 1 || round > 1000) {
            b(vVar);
            return;
        }
        int i10 = (int) round;
        this.f59043f = i10;
        this.f59042e = a.d(i10);
    }

    private void b(C4912v vVar) {
        this.f59043f = vVar.f59043f;
        this.f59042e = vVar.f59042e;
    }

    private double c(ReadableMap readableMap, String str, double d10, double d11, double d12) {
        if (readableMap.getType(str) == ReadableType.Number) {
            return readableMap.getDouble(str);
        }
        return K.b(readableMap.getString(str), d12, d10, d11);
    }

    C4912v(ReadableMap readableMap, C4912v vVar, double d10) {
        String str;
        String str2;
        d0 d0Var;
        f0 f0Var;
        g0 g0Var;
        double d11;
        double d12;
        double d13 = vVar.f59038a;
        if (readableMap.hasKey("fontSize")) {
            this.f59038a = c(readableMap, "fontSize", 1.0d, d13, d13);
        } else {
            this.f59038a = d13;
        }
        if (!readableMap.hasKey("fontWeight")) {
            b(vVar);
        } else if (readableMap.getType("fontWeight") == ReadableType.Number) {
            a(vVar, readableMap.getDouble("fontWeight"));
        } else {
            String string = readableMap.getString("fontWeight");
            if (e0.c(string)) {
                int b10 = a.b(e0.b(string), vVar);
                this.f59043f = b10;
                this.f59042e = a.d(b10);
            } else if (string != null) {
                a(vVar, Double.parseDouble(string));
            } else {
                b(vVar);
            }
        }
        this.f59041d = readableMap.hasKey("fontData") ? readableMap.getMap("fontData") : vVar.f59041d;
        this.f59039b = readableMap.hasKey("fontFamily") ? readableMap.getString("fontFamily") : vVar.f59039b;
        this.f59040c = readableMap.hasKey("fontStyle") ? c0.valueOf(readableMap.getString("fontStyle")) : vVar.f59040c;
        if (readableMap.hasKey("fontFeatureSettings")) {
            str = readableMap.getString("fontFeatureSettings");
        } else {
            str = vVar.f59044g;
        }
        this.f59044g = str;
        if (readableMap.hasKey("fontVariationSettings")) {
            str2 = readableMap.getString("fontVariationSettings");
        } else {
            str2 = vVar.f59045h;
        }
        this.f59045h = str2;
        if (readableMap.hasKey("fontVariantLigatures")) {
            d0Var = d0.valueOf(readableMap.getString("fontVariantLigatures"));
        } else {
            d0Var = vVar.f59046i;
        }
        this.f59046i = d0Var;
        if (readableMap.hasKey("textAnchor")) {
            f0Var = f0.valueOf(readableMap.getString("textAnchor"));
        } else {
            f0Var = vVar.f59047j;
        }
        this.f59047j = f0Var;
        if (readableMap.hasKey("textDecoration")) {
            g0Var = g0.b(readableMap.getString("textDecoration"));
        } else {
            g0Var = vVar.f59048k;
        }
        this.f59048k = g0Var;
        boolean hasKey = readableMap.hasKey("kerning");
        this.f59052o = hasKey || vVar.f59052o;
        this.f59049l = hasKey ? c(readableMap, "kerning", d10, this.f59038a, 0.0d) : vVar.f59049l;
        if (readableMap.hasKey("wordSpacing")) {
            d11 = c(readableMap, "wordSpacing", d10, this.f59038a, 0.0d);
        } else {
            d11 = vVar.f59050m;
        }
        this.f59050m = d11;
        if (readableMap.hasKey("letterSpacing")) {
            d12 = c(readableMap, "letterSpacing", d10, this.f59038a, 0.0d);
        } else {
            d12 = vVar.f59051n;
        }
        this.f59051n = d12;
    }
}
