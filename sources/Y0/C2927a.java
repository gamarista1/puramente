package y0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.d;
import o1.k;
import org.xmlpull.v1.XmlPullParser;
import x0.j;

/* renamed from: y0.a  reason: case insensitive filesystem */
public final class C2927a {

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParser f28530a;

    /* renamed from: b  reason: collision with root package name */
    private int f28531b;

    /* renamed from: c  reason: collision with root package name */
    public final j f28532c;

    public C2927a(XmlPullParser xmlPullParser, int i10) {
        this.f28530a = xmlPullParser;
        this.f28531b = i10;
        this.f28532c = new j();
    }

    private final void l(int i10) {
        this.f28531b = i10 | this.f28531b;
    }

    public final float a(TypedArray typedArray, int i10, float f10) {
        float dimension = typedArray.getDimension(i10, f10);
        l(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float b(TypedArray typedArray, int i10, float f10) {
        float f11 = typedArray.getFloat(i10, f10);
        l(typedArray.getChangingConfigurations());
        return f11;
    }

    public final int c(TypedArray typedArray, int i10, int i11) {
        int i12 = typedArray.getInt(i10, i11);
        l(typedArray.getChangingConfigurations());
        return i12;
    }

    public final boolean d(TypedArray typedArray, String str, int i10, boolean z10) {
        boolean a10 = k.a(typedArray, this.f28530a, str, i10, z10);
        l(typedArray.getChangingConfigurations());
        return a10;
    }

    public final ColorStateList e(TypedArray typedArray, Resources.Theme theme, String str, int i10) {
        ColorStateList c10 = k.c(typedArray, this.f28530a, theme, str, i10);
        l(typedArray.getChangingConfigurations());
        return c10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2927a)) {
            return false;
        }
        C2927a aVar = (C2927a) obj;
        if (C6496s.c(this.f28530a, aVar.f28530a) && this.f28531b == aVar.f28531b) {
            return true;
        }
        return false;
    }

    public final d f(TypedArray typedArray, Resources.Theme theme, String str, int i10, int i11) {
        d e10 = k.e(typedArray, this.f28530a, theme, str, i10, i11);
        l(typedArray.getChangingConfigurations());
        return e10;
    }

    public final float g(TypedArray typedArray, String str, int i10, float f10) {
        float f11 = k.f(typedArray, this.f28530a, str, i10, f10);
        l(typedArray.getChangingConfigurations());
        return f11;
    }

    public final int h(TypedArray typedArray, String str, int i10, int i11) {
        int g10 = k.g(typedArray, this.f28530a, str, i10, i11);
        l(typedArray.getChangingConfigurations());
        return g10;
    }

    public int hashCode() {
        return (this.f28530a.hashCode() * 31) + Integer.hashCode(this.f28531b);
    }

    public final String i(TypedArray typedArray, int i10) {
        String string = typedArray.getString(i10);
        l(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser j() {
        return this.f28530a;
    }

    public final TypedArray k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray i10 = k.i(resources, theme, attributeSet, iArr);
        l(i10.getChangingConfigurations());
        return i10;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f28530a + ", config=" + this.f28531b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2927a(XmlPullParser xmlPullParser, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i11 & 2) != 0 ? 0 : i10);
    }
}
