package ha;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import ja.M;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f44133g = new a(-1, -16777216, 0, 0, -1, (Typeface) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f44134a;

    /* renamed from: b  reason: collision with root package name */
    public final int f44135b;

    /* renamed from: c  reason: collision with root package name */
    public final int f44136c;

    /* renamed from: d  reason: collision with root package name */
    public final int f44137d;

    /* renamed from: e  reason: collision with root package name */
    public final int f44138e;

    /* renamed from: f  reason: collision with root package name */
    public final Typeface f44139f;

    public a(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f44134a = i10;
        this.f44135b = i11;
        this.f44136c = i12;
        this.f44137d = i13;
        this.f44138e = i14;
        this.f44139f = typeface;
    }

    public static a a(CaptioningManager.CaptionStyle captionStyle) {
        if (M.f44981a >= 21) {
            return c(captionStyle);
        }
        return b(captionStyle);
    }

    private static a b(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static a c(CaptioningManager.CaptionStyle captionStyle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (captionStyle.hasForegroundColor()) {
            i10 = captionStyle.foregroundColor;
        } else {
            i10 = f44133g.f44134a;
        }
        int i15 = i10;
        if (captionStyle.hasBackgroundColor()) {
            i11 = captionStyle.backgroundColor;
        } else {
            i11 = f44133g.f44135b;
        }
        int i16 = i11;
        if (captionStyle.hasWindowColor()) {
            i12 = captionStyle.windowColor;
        } else {
            i12 = f44133g.f44136c;
        }
        int i17 = i12;
        if (captionStyle.hasEdgeType()) {
            i13 = captionStyle.edgeType;
        } else {
            i13 = f44133g.f44137d;
        }
        int i18 = i13;
        if (captionStyle.hasEdgeColor()) {
            i14 = captionStyle.edgeColor;
        } else {
            i14 = f44133g.f44138e;
        }
        return new a(i15, i16, i17, i18, i14, captionStyle.getTypeface());
    }
}
