package A1;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import x1.g;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f426a = new String[0];

    private static class a {
        static void a(EditorInfo editorInfo, CharSequence charSequence, int i10) {
            editorInfo.setInitialSurroundingSubText(charSequence, i10);
        }
    }

    private static class b {
        static void a(EditorInfo editorInfo, boolean z10) {
            editorInfo.setStylusHandwritingEnabled(z10);
        }
    }

    public static String[] a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] a10 = editorInfo.contentMimeTypes;
            if (a10 != null) {
                return a10;
            }
            return f426a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f426a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        if (stringArray != null) {
            return stringArray;
        }
        return f426a;
    }

    private static boolean b(CharSequence charSequence, int i10, int i11) {
        if (i11 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i10));
        }
        if (i11 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i10));
    }

    private static boolean c(int i10) {
        int i11 = i10 & 4095;
        if (i11 == 129 || i11 == 225 || i11 == 18) {
            return true;
        }
        return false;
    }

    public static void d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static void e(EditorInfo editorInfo, CharSequence charSequence, int i10) {
        int i11;
        int i12;
        g.f(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(editorInfo, charSequence, i10);
            return;
        }
        int i13 = editorInfo.initialSelStart;
        int i14 = editorInfo.initialSelEnd;
        if (i13 > i14) {
            i11 = i14 - i10;
        } else {
            i11 = i13 - i10;
        }
        if (i13 > i14) {
            i12 = i13 - i10;
        } else {
            i12 = i14 - i10;
        }
        int length = charSequence.length();
        if (i10 < 0 || i11 < 0 || i12 > length) {
            h(editorInfo, (CharSequence) null, 0, 0);
        } else if (c(editorInfo.inputType)) {
            h(editorInfo, (CharSequence) null, 0, 0);
        } else if (length <= 2048) {
            h(editorInfo, charSequence, i11, i12);
        } else {
            i(editorInfo, charSequence, i11, i12);
        }
    }

    public static void f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(editorInfo, charSequence, 0);
        } else {
            e(editorInfo, charSequence, 0);
        }
    }

    public static void g(EditorInfo editorInfo, boolean z10) {
        if (Build.VERSION.SDK_INT >= 35) {
            b.a(editorInfo, z10);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z10);
    }

    private static void h(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }

    private static void i(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        int i12;
        CharSequence charSequence2;
        int i13 = i11 - i10;
        if (i13 > 1024) {
            i12 = 0;
        } else {
            i12 = i13;
        }
        int i14 = 2048 - i12;
        int min = Math.min(charSequence.length() - i11, i14 - Math.min(i10, (int) (((double) i14) * 0.8d)));
        int min2 = Math.min(i10, i14 - min);
        int i15 = i10 - min2;
        if (b(charSequence, i15, 0)) {
            i15++;
            min2--;
        }
        if (b(charSequence, (i11 + min) - 1, 1)) {
            min--;
        }
        int i16 = min2 + i12 + min;
        if (i12 != i13) {
            charSequence2 = TextUtils.concat(new CharSequence[]{charSequence.subSequence(i15, i15 + min2), charSequence.subSequence(i11, min + i11)});
        } else {
            charSequence2 = charSequence.subSequence(i15, i16 + i15);
        }
        h(editorInfo, charSequence2, min2, i12 + min2);
    }
}
