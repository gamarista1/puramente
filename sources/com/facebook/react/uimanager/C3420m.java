package com.facebook.react.uimanager;

import android.graphics.BlendMode;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.C6496s;
import r0.C2502j0;
import r0.C2505k0;

/* renamed from: com.facebook.react.uimanager.m  reason: case insensitive filesystem */
public final class C3420m {

    /* renamed from: a  reason: collision with root package name */
    public static final C3420m f41694a = new C3420m();

    private C3420m() {
    }

    private final ColorMatrix b(float f10) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(f10, f10, f10, 1.0f);
        return colorMatrix;
    }

    private final RenderEffect d(ColorMatrix colorMatrix, RenderEffect renderEffect) {
        if (renderEffect == null) {
            RenderEffect a10 = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            C6496s.e(a10);
            return a10;
        }
        RenderEffect a11 = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), renderEffect);
        C6496s.e(a11);
        return a11;
    }

    private final ColorMatrix e(float f10) {
        float f11 = ((float) 255) * ((-(f10 / 2.0f)) + 0.5f);
        return new ColorMatrix(new float[]{f10, 0.0f, 0.0f, 0.0f, f11, 0.0f, f10, 0.0f, 0.0f, f11, 0.0f, 0.0f, f10, 0.0f, f11, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private final ColorMatrix h(float f10) {
        float f11 = ((float) 1) - f10;
        float f12 = 0.7152f - (f11 * 0.7152f);
        float f13 = 0.0722f - (f11 * 0.0722f);
        float f14 = 0.2126f - (f11 * 0.2126f);
        return new ColorMatrix(new float[]{(0.7874f * f11) + 0.2126f, f12, f13, 0.0f, 0.0f, f14, (0.2848f * f11) + 0.7152f, f13, 0.0f, 0.0f, f14, f12, (f11 * 0.9278f) + 0.0722f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private final ColorMatrix j(float f10) {
        double radians = Math.toRadians((double) f10);
        float cos = (float) Math.cos(radians);
        float sin = (float) Math.sin(radians);
        float f11 = 0.715f - (cos * 0.715f);
        float f12 = sin * 0.715f;
        float f13 = 0.072f - (cos * 0.072f);
        float f14 = 0.213f - (cos * 0.213f);
        return new ColorMatrix(new float[]{((cos * 0.787f) + 0.213f) - (sin * 0.213f), f11 - f12, (sin * 0.928f) + f13, 0.0f, 0.0f, (0.143f * sin) + f14, (0.285f * cos) + 0.715f + (0.14f * sin), f13 - (0.283f * sin), 0.0f, 0.0f, f14 - (0.787f * sin), f11 + f12, (cos * 0.928f) + 0.072f + (sin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private final ColorMatrix l(float f10) {
        float f11 = ((float) 1) - (((float) 2) * f10);
        float f12 = f10 * ((float) 255);
        return new ColorMatrix(new float[]{f11, 0.0f, 0.0f, 0.0f, f12, 0.0f, f11, 0.0f, 0.0f, f12, 0.0f, 0.0f, f11, 0.0f, f12, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private final ColorMatrix p(float f10) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(f10);
        return colorMatrix;
    }

    private final ColorMatrix r(float f10) {
        float f11 = ((float) 1) - f10;
        return new ColorMatrix(new float[]{(0.607f * f11) + 0.393f, 0.769f - (f11 * 0.769f), 0.189f - (f11 * 0.189f), 0.0f, 0.0f, 0.349f - (f11 * 0.349f), (0.314f * f11) + 0.686f, 0.168f - (f11 * 0.168f), 0.0f, 0.0f, 0.272f - (f11 * 0.272f), 0.534f - (f11 * 0.534f), (f11 * 0.869f) + 0.131f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static final boolean t(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            return false;
        }
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = readableArray.getMap(i10);
            C6496s.e(map);
            String str = (String) map.getEntryIterator().next().getKey();
            if (C6496s.c(str, "blur") || C6496s.c(str, "dropShadow")) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        r0.preConcat(r3);
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.ColorMatrixColorFilter v(com.facebook.react.bridge.ReadableArray r7) {
        /*
            if (r7 != 0) goto L_0x0004
            r7 = 0
            return r7
        L_0x0004:
            android.graphics.ColorMatrix r0 = new android.graphics.ColorMatrix
            r0.<init>()
            int r1 = r7.size()
            r2 = 0
        L_0x000e:
            if (r2 >= r1) goto L_0x00dc
            com.facebook.react.bridge.ReadableMap r3 = r7.getMap(r2)
            if (r3 == 0) goto L_0x00d4
            java.util.Iterator r3 = r3.getEntryIterator()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Double"
            kotlin.jvm.internal.C6496s.f(r3, r5)
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            float r3 = (float) r5
            int r5 = r4.hashCode()
            switch(r5) {
                case -2114203985: goto L_0x00a8;
                case -1267206133: goto L_0x0099;
                case -1183703082: goto L_0x008a;
                case -905411385: goto L_0x007b;
                case -566947070: goto L_0x006c;
                case 109324790: goto L_0x005d;
                case 648162385: goto L_0x004e;
                case 650888307: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x00bd
        L_0x003f:
            java.lang.String r5 = "hueRotate"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00bd
            com.facebook.react.uimanager.m r4 = f41694a
            android.graphics.ColorMatrix r3 = r4.j(r3)
            goto L_0x00b6
        L_0x004e:
            java.lang.String r5 = "brightness"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00bd
            com.facebook.react.uimanager.m r4 = f41694a
            android.graphics.ColorMatrix r3 = r4.b(r3)
            goto L_0x00b6
        L_0x005d:
            java.lang.String r5 = "sepia"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00bd
            com.facebook.react.uimanager.m r4 = f41694a
            android.graphics.ColorMatrix r3 = r4.r(r3)
            goto L_0x00b6
        L_0x006c:
            java.lang.String r5 = "contrast"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00bd
            com.facebook.react.uimanager.m r4 = f41694a
            android.graphics.ColorMatrix r3 = r4.e(r3)
            goto L_0x00b6
        L_0x007b:
            java.lang.String r5 = "grayscale"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00bd
            com.facebook.react.uimanager.m r4 = f41694a
            android.graphics.ColorMatrix r3 = r4.h(r3)
            goto L_0x00b6
        L_0x008a:
            java.lang.String r5 = "invert"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00bd
            com.facebook.react.uimanager.m r4 = f41694a
            android.graphics.ColorMatrix r3 = r4.l(r3)
            goto L_0x00b6
        L_0x0099:
            java.lang.String r5 = "opacity"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00bd
            com.facebook.react.uimanager.m r4 = f41694a
            android.graphics.ColorMatrix r3 = r4.n(r3)
            goto L_0x00b6
        L_0x00a8:
            java.lang.String r5 = "saturate"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00bd
            com.facebook.react.uimanager.m r4 = f41694a
            android.graphics.ColorMatrix r3 = r4.p(r3)
        L_0x00b6:
            r0.preConcat(r3)
            int r2 = r2 + 1
            goto L_0x000e
        L_0x00bd:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid color matrix filter: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00d4:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r7.<init>(r0)
            throw r7
        L_0x00dc:
            android.graphics.ColorMatrixColorFilter r7 = new android.graphics.ColorMatrixColorFilter
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C3420m.v(com.facebook.react.bridge.ReadableArray):android.graphics.ColorMatrixColorFilter");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0150, code lost:
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.RenderEffect w(com.facebook.react.bridge.ReadableArray r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r7.size()
            r2 = 0
        L_0x0009:
            if (r2 >= r1) goto L_0x0173
            com.facebook.react.bridge.ReadableMap r3 = r7.getMap(r2)
            if (r3 == 0) goto L_0x016b
            java.util.Iterator r3 = r3.getEntryIterator()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r4.hashCode()
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Double"
            switch(r5) {
                case -2114203985: goto L_0x0134;
                case -1267206133: goto L_0x0117;
                case -1183703082: goto L_0x00fa;
                case -905411385: goto L_0x00dd;
                case -566947070: goto L_0x00bf;
                case 3027047: goto L_0x00a1;
                case 109324790: goto L_0x0083;
                case 648162385: goto L_0x0065;
                case 650888307: goto L_0x0047;
                case 906978543: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0154
        L_0x002c:
            java.lang.String r5 = "dropShadow"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0154
            com.facebook.react.uimanager.m r4 = f41694a
            java.lang.Object r3 = r3.getValue()
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap"
            kotlin.jvm.internal.C6496s.f(r3, r5)
            com.facebook.react.bridge.ReadableMap r3 = (com.facebook.react.bridge.ReadableMap) r3
            android.graphics.RenderEffect r0 = r4.u(r3, r0)
            goto L_0x0150
        L_0x0047:
            java.lang.String r5 = "hueRotate"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0154
            com.facebook.react.uimanager.m r4 = f41694a
            java.lang.Object r3 = r3.getValue()
            kotlin.jvm.internal.C6496s.f(r3, r6)
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            float r3 = (float) r5
            android.graphics.RenderEffect r0 = r4.k(r3, r0)
            goto L_0x0150
        L_0x0065:
            java.lang.String r5 = "brightness"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0154
            com.facebook.react.uimanager.m r4 = f41694a
            java.lang.Object r3 = r3.getValue()
            kotlin.jvm.internal.C6496s.f(r3, r6)
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            float r3 = (float) r5
            android.graphics.RenderEffect r0 = r4.c(r3, r0)
            goto L_0x0150
        L_0x0083:
            java.lang.String r5 = "sepia"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0154
            com.facebook.react.uimanager.m r4 = f41694a
            java.lang.Object r3 = r3.getValue()
            kotlin.jvm.internal.C6496s.f(r3, r6)
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            float r3 = (float) r5
            android.graphics.RenderEffect r0 = r4.s(r3, r0)
            goto L_0x0150
        L_0x00a1:
            java.lang.String r5 = "blur"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0154
            com.facebook.react.uimanager.m r4 = f41694a
            java.lang.Object r3 = r3.getValue()
            kotlin.jvm.internal.C6496s.f(r3, r6)
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            float r3 = (float) r5
            android.graphics.RenderEffect r0 = r4.a(r3, r0)
            goto L_0x0150
        L_0x00bf:
            java.lang.String r5 = "contrast"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0154
            com.facebook.react.uimanager.m r4 = f41694a
            java.lang.Object r3 = r3.getValue()
            kotlin.jvm.internal.C6496s.f(r3, r6)
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            float r3 = (float) r5
            android.graphics.RenderEffect r0 = r4.f(r3, r0)
            goto L_0x0150
        L_0x00dd:
            java.lang.String r5 = "grayscale"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0154
            com.facebook.react.uimanager.m r4 = f41694a
            java.lang.Object r3 = r3.getValue()
            kotlin.jvm.internal.C6496s.f(r3, r6)
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            float r3 = (float) r5
            android.graphics.RenderEffect r0 = r4.i(r3, r0)
            goto L_0x0150
        L_0x00fa:
            java.lang.String r5 = "invert"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0154
            com.facebook.react.uimanager.m r4 = f41694a
            java.lang.Object r3 = r3.getValue()
            kotlin.jvm.internal.C6496s.f(r3, r6)
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            float r3 = (float) r5
            android.graphics.RenderEffect r0 = r4.m(r3, r0)
            goto L_0x0150
        L_0x0117:
            java.lang.String r5 = "opacity"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0154
            com.facebook.react.uimanager.m r4 = f41694a
            java.lang.Object r3 = r3.getValue()
            kotlin.jvm.internal.C6496s.f(r3, r6)
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            float r3 = (float) r5
            android.graphics.RenderEffect r0 = r4.o(r3, r0)
            goto L_0x0150
        L_0x0134:
            java.lang.String r5 = "saturate"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0154
            com.facebook.react.uimanager.m r4 = f41694a
            java.lang.Object r3 = r3.getValue()
            kotlin.jvm.internal.C6496s.f(r3, r6)
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            float r3 = (float) r5
            android.graphics.RenderEffect r0 = r4.q(r3, r0)
        L_0x0150:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0154:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid filter name: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x016b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r7.<init>(r0)
            throw r7
        L_0x0173:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C3420m.w(com.facebook.react.bridge.ReadableArray):android.graphics.RenderEffect");
    }

    public final RenderEffect a(float f10, RenderEffect renderEffect) {
        if (((double) f10) <= 0.5d) {
            return null;
        }
        float x10 = x(f10);
        if (renderEffect == null) {
            return RenderEffect.createBlurEffect(x10, x10, Shader.TileMode.DECAL);
        }
        return RenderEffect.createBlurEffect(x10, x10, renderEffect, Shader.TileMode.DECAL);
    }

    public final RenderEffect c(float f10, RenderEffect renderEffect) {
        return d(b(f10), renderEffect);
    }

    public final RenderEffect f(float f10, RenderEffect renderEffect) {
        return d(e(f10), renderEffect);
    }

    public final RenderEffect g(float f10, float f11, float f12, int i10, RenderEffect renderEffect) {
        RenderEffect renderEffect2;
        RenderEffect renderEffect3;
        if (renderEffect == null) {
            renderEffect2 = RenderEffect.createOffsetEffect(0.0f, 0.0f);
            renderEffect3 = RenderEffect.createOffsetEffect(f10, f11);
        } else {
            RenderEffect a10 = RenderEffect.createOffsetEffect(0.0f, 0.0f, renderEffect);
            renderEffect3 = RenderEffect.createOffsetEffect(f10, f11, renderEffect);
            renderEffect2 = a10;
        }
        C2505k0.a();
        RenderEffect a11 = RenderEffect.createColorFilterEffect(C2502j0.a(i10, BlendMode.SRC_IN), renderEffect3);
        C6496s.g(a11, "createColorFilterEffect(...)");
        RenderEffect a12 = RenderEffect.createBlurEffect(f12, f12, a11, Shader.TileMode.DECAL);
        C6496s.g(a12, "createBlurEffect(...)");
        RenderEffect a13 = RenderEffect.createBlendModeEffect(a12, renderEffect2, BlendMode.SRC_OVER);
        C6496s.g(a13, "createBlendModeEffect(...)");
        return a13;
    }

    public final RenderEffect i(float f10, RenderEffect renderEffect) {
        return d(h(f10), renderEffect);
    }

    public final RenderEffect k(float f10, RenderEffect renderEffect) {
        return d(j(f10), renderEffect);
    }

    public final RenderEffect m(float f10, RenderEffect renderEffect) {
        return d(l(f10), renderEffect);
    }

    public final ColorMatrix n(float f10) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(1.0f, 1.0f, 1.0f, f10);
        return colorMatrix;
    }

    public final RenderEffect o(float f10, RenderEffect renderEffect) {
        return d(n(f10), renderEffect);
    }

    public final RenderEffect q(float f10, RenderEffect renderEffect) {
        return d(p(f10), renderEffect);
    }

    public final RenderEffect s(float f10, RenderEffect renderEffect) {
        return d(r(f10), renderEffect);
    }

    public final RenderEffect u(ReadableMap readableMap, RenderEffect renderEffect) {
        int i10;
        float f10;
        C6496s.h(readableMap, "filterValues");
        G g10 = G.f41415a;
        float a10 = g10.a(readableMap.getDouble("offsetX"));
        float a11 = g10.a(readableMap.getDouble("offsetY"));
        if (readableMap.hasKey("color")) {
            i10 = readableMap.getInt("color");
        } else {
            i10 = -16777216;
        }
        int i11 = i10;
        if (readableMap.hasKey("standardDeviation")) {
            f10 = x((float) readableMap.getDouble("standardDeviation"));
        } else {
            f10 = 0.0f;
        }
        return g(a10, a11, f10, i11, renderEffect);
    }

    public final float x(float f10) {
        return (G.h(f10) - 0.5f) / 0.57735f;
    }
}
