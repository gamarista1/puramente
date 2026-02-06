package o1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public abstract class k {
    public static boolean a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, boolean z10) {
        if (!h(xmlPullParser, str)) {
            return z10;
        }
        return typedArray.getBoolean(i10, z10);
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        if (!h(xmlPullParser, str)) {
            return i11;
        }
        return typedArray.getColor(i10, i11);
    }

    public static ColorStateList c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        if (!h(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i10, typedValue);
        int i11 = typedValue.type;
        if (i11 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i10 + ": " + typedValue);
        } else if (i11 < 28 || i11 > 31) {
            return c.d(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
        } else {
            return d(typedValue);
        }
    }

    private static ColorStateList d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static d e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10, int i11) {
        if (h(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return d.b(typedValue.data);
            }
            d g10 = d.g(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            if (g10 != null) {
                return g10;
            }
        }
        return d.b(i11);
    }

    public static float f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        if (!h(xmlPullParser, str)) {
            return f10;
        }
        return typedArray.getFloat(i10, f10);
    }

    public static int g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        if (!h(xmlPullParser, str)) {
            return i11;
        }
        return typedArray.getInt(i10, i11);
    }

    public static boolean h(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static TypedArray i(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
