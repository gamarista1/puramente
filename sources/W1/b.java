package w1;

import android.text.Html;
import android.text.Spanned;

public abstract class b {

    static class a {
        static Spanned a(String str, int i10) {
            return Html.fromHtml(str, i10);
        }

        static Spanned b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i10, imageGetter, tagHandler);
        }
    }

    public static Spanned a(String str, int i10) {
        return a.a(str, i10);
    }

    public static Spanned b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return a.b(str, i10, imageGetter, tagHandler);
    }
}
