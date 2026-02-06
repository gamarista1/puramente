package o1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import m1.C2188d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

abstract class f {
    private static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        if (aVar != null) {
            return aVar;
        }
        if (z10) {
            return new a(i10, i12, i11);
        }
        return new a(i10, i11);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray i10 = k.i(resources, theme2, attributeSet, C2188d.f23646B);
            float f10 = k.f(i10, xmlPullParser2, "startX", C2188d.f23655K, 0.0f);
            float f11 = k.f(i10, xmlPullParser2, "startY", C2188d.f23656L, 0.0f);
            float f12 = k.f(i10, xmlPullParser2, "endX", C2188d.f23657M, 0.0f);
            float f13 = k.f(i10, xmlPullParser2, "endY", C2188d.f23658N, 0.0f);
            float f14 = k.f(i10, xmlPullParser2, "centerX", C2188d.f23650F, 0.0f);
            float f15 = k.f(i10, xmlPullParser2, "centerY", C2188d.f23651G, 0.0f);
            int g10 = k.g(i10, xmlPullParser2, "type", C2188d.f23649E, 0);
            int b10 = k.b(i10, xmlPullParser2, "startColor", C2188d.f23647C, 0);
            boolean h10 = k.h(xmlPullParser2, "centerColor");
            int b11 = k.b(i10, xmlPullParser2, "centerColor", C2188d.f23654J, 0);
            int b12 = k.b(i10, xmlPullParser2, "endColor", C2188d.f23648D, 0);
            int g11 = k.g(i10, xmlPullParser2, "tileMode", C2188d.f23653I, 0);
            float f16 = f14;
            float f17 = k.f(i10, xmlPullParser2, "gradientRadius", C2188d.f23652H, 0.0f);
            i10.recycle();
            a a10 = a(c(resources, xmlPullParser, attributeSet, theme), b10, b12, h10, b11);
            if (g10 == 1) {
                float f18 = f16;
                if (f17 > 0.0f) {
                    int[] iArr = a10.f24742a;
                    return new RadialGradient(f18, f15, f17, iArr, a10.f24743b, d(g11));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (g10 != 2) {
                return new LinearGradient(f10, f11, f12, f13, a10.f24742a, a10.f24743b, d(g11));
            } else {
                return new SweepGradient(f16, f15, a10.f24742a, a10.f24743b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o1.f.a c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x0085
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0085
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = m1.C2188d.f23659O
            android.content.res.TypedArray r3 = o1.k.i(r8, r11, r10, r3)
            int r5 = m1.C2188d.f23660P
            boolean r5 = r3.hasValue(r5)
            int r6 = m1.C2188d.f23661Q
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            int r5 = m1.C2188d.f23660P
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = m1.C2188d.f23661Q
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x0085:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0091
            o1.f$a r8 = new o1.f$a
            r8.<init>((java.util.List) r4, (java.util.List) r2)
            return r8
        L_0x0091:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):o1.f$a");
    }

    private static Shader.TileMode d(int i10) {
        if (i10 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i10 != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int[] f24742a;

        /* renamed from: b  reason: collision with root package name */
        final float[] f24743b;

        a(List list, List list2) {
            int size = list.size();
            this.f24742a = new int[size];
            this.f24743b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f24742a[i10] = ((Integer) list.get(i10)).intValue();
                this.f24743b[i10] = ((Float) list2.get(i10)).floatValue();
            }
        }

        a(int i10, int i11) {
            this.f24742a = new int[]{i10, i11};
            this.f24743b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f24742a = new int[]{i10, i11, i12};
            this.f24743b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
