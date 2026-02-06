package o1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.Log;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Shader f24727a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f24728b;

    /* renamed from: c  reason: collision with root package name */
    private int f24729c;

    private d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f24727a = shader;
        this.f24728b = colorStateList;
        this.f24729c = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o1.d a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0008:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x0013
            r3 = 1
            if (r1 == r3) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r1 != r2) goto L_0x005c
            java.lang.String r1 = r5.getName()
            r1.hashCode()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0053
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0035
            android.content.res.ColorStateList r4 = o1.c.b(r4, r5, r0, r6)
            o1.d r4 = c(r4)
            return r4
        L_0x0035:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = ": unsupported complex color tag "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x0053:
            android.graphics.Shader r4 = o1.f.b(r4, r5, r0, r6)
            o1.d r4 = d(r4)
            return r4
        L_0x005c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.d.a(android.content.res.Resources, int, android.content.res.Resources$Theme):o1.d");
    }

    static d b(int i10) {
        return new d((Shader) null, (ColorStateList) null, i10);
    }

    static d c(ColorStateList colorStateList) {
        return new d((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, (ColorStateList) null, 0);
    }

    public static d g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception e10) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    public int e() {
        return this.f24729c;
    }

    public Shader f() {
        return this.f24727a;
    }

    public boolean h() {
        if (this.f24727a != null) {
            return true;
        }
        return false;
    }

    public boolean i() {
        if (h() || this.f24729c != 0) {
            return true;
        }
        return false;
    }
}
