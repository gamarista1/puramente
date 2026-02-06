package s8;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.facebook.react.views.text.m;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: s8.c  reason: case insensitive filesystem */
public final class C3994c extends MetricAffectingSpan implements j {

    /* renamed from: f  reason: collision with root package name */
    public static final a f48089f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f48090a;

    /* renamed from: b  reason: collision with root package name */
    private final int f48091b;

    /* renamed from: c  reason: collision with root package name */
    private final String f48092c;

    /* renamed from: d  reason: collision with root package name */
    private final String f48093d;

    /* renamed from: e  reason: collision with root package name */
    private final AssetManager f48094e;

    /* renamed from: s8.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final void b(Paint paint, int i10, int i11, String str, String str2, AssetManager assetManager) {
            Typeface a10 = m.a(paint.getTypeface(), i10, i11, str2, assetManager);
            paint.setFontFeatureSettings(str);
            paint.setTypeface(a10);
            paint.setSubpixelText(true);
        }

        private a() {
        }
    }

    public C3994c(int i10, int i11, String str, String str2, AssetManager assetManager) {
        C6496s.h(assetManager, "assetManager");
        this.f48090a = i10;
        this.f48091b = i11;
        this.f48092c = str;
        this.f48093d = str2;
        this.f48094e = assetManager;
    }

    public final String a() {
        return this.f48093d;
    }

    public final String b() {
        return this.f48092c;
    }

    public final int c() {
        int i10 = this.f48090a;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public final int d() {
        int i10 = this.f48091b;
        if (i10 == -1) {
            return 400;
        }
        return i10;
    }

    public void updateDrawState(TextPaint textPaint) {
        C6496s.h(textPaint, "ds");
        f48089f.b(textPaint, this.f48090a, this.f48091b, this.f48092c, this.f48093d, this.f48094e);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C6496s.h(textPaint, "paint");
        f48089f.b(textPaint, this.f48090a, this.f48091b, this.f48092c, this.f48093d, this.f48094e);
    }
}
