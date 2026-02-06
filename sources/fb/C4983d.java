package fb;

import Ua.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import o1.h;

/* renamed from: fb.d  reason: case insensitive filesystem */
public class C4983d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f60502a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f60503b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f60504c;

    /* renamed from: d  reason: collision with root package name */
    public final String f60505d;

    /* renamed from: e  reason: collision with root package name */
    public final int f60506e;

    /* renamed from: f  reason: collision with root package name */
    public final int f60507f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f60508g;

    /* renamed from: h  reason: collision with root package name */
    public final float f60509h;

    /* renamed from: i  reason: collision with root package name */
    public final float f60510i;

    /* renamed from: j  reason: collision with root package name */
    public final float f60511j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f60512k;

    /* renamed from: l  reason: collision with root package name */
    public final float f60513l;

    /* renamed from: m  reason: collision with root package name */
    private ColorStateList f60514m;

    /* renamed from: n  reason: collision with root package name */
    private float f60515n;

    /* renamed from: o  reason: collision with root package name */
    private final int f60516o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f60517p = false;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public Typeface f60518q;

    /* renamed from: fb.d$a */
    class a extends h.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4985f f60519a;

        a(C4985f fVar) {
            this.f60519a = fVar;
        }

        public void h(int i10) {
            boolean unused = C4983d.this.f60517p = true;
            this.f60519a.a(i10);
        }

        public void i(Typeface typeface) {
            C4983d dVar = C4983d.this;
            Typeface unused = dVar.f60518q = Typeface.create(typeface, dVar.f60506e);
            boolean unused2 = C4983d.this.f60517p = true;
            this.f60519a.b(C4983d.this.f60518q, false);
        }
    }

    /* renamed from: fb.d$b */
    class b extends C4985f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f60521a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextPaint f60522b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4985f f60523c;

        b(Context context, TextPaint textPaint, C4985f fVar) {
            this.f60521a = context;
            this.f60522b = textPaint;
            this.f60523c = fVar;
        }

        public void a(int i10) {
            this.f60523c.a(i10);
        }

        public void b(Typeface typeface, boolean z10) {
            C4983d.this.p(this.f60521a, this.f60522b, typeface);
            this.f60523c.b(typeface, z10);
        }
    }

    public C4983d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, j.f53046P4);
        l(obtainStyledAttributes.getDimension(j.f53053Q4, 0.0f));
        k(C4982c.a(context, obtainStyledAttributes, j.f53074T4));
        this.f60502a = C4982c.a(context, obtainStyledAttributes, j.f53081U4);
        this.f60503b = C4982c.a(context, obtainStyledAttributes, j.f53088V4);
        this.f60506e = obtainStyledAttributes.getInt(j.f53067S4, 0);
        this.f60507f = obtainStyledAttributes.getInt(j.f53060R4, 1);
        int e10 = C4982c.e(obtainStyledAttributes, j.f53132b5, j.f53124a5);
        this.f60516o = obtainStyledAttributes.getResourceId(e10, 0);
        this.f60505d = obtainStyledAttributes.getString(e10);
        this.f60508g = obtainStyledAttributes.getBoolean(j.f53140c5, false);
        this.f60504c = C4982c.a(context, obtainStyledAttributes, j.f53095W4);
        this.f60509h = obtainStyledAttributes.getFloat(j.f53102X4, 0.0f);
        this.f60510i = obtainStyledAttributes.getFloat(j.f53109Y4, 0.0f);
        this.f60511j = obtainStyledAttributes.getFloat(j.f53116Z4, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, j.f53258r3);
        this.f60512k = obtainStyledAttributes2.hasValue(j.f53266s3);
        this.f60513l = obtainStyledAttributes2.getFloat(j.f53266s3, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f60518q == null && (str = this.f60505d) != null) {
            this.f60518q = Typeface.create(str, this.f60506e);
        }
        if (this.f60518q == null) {
            int i10 = this.f60507f;
            if (i10 == 1) {
                this.f60518q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f60518q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f60518q = Typeface.DEFAULT;
            } else {
                this.f60518q = Typeface.MONOSPACE;
            }
            this.f60518q = Typeface.create(this.f60518q, this.f60506e);
        }
    }

    private boolean m(Context context) {
        Typeface typeface;
        if (C4984e.a()) {
            return true;
        }
        int i10 = this.f60516o;
        if (i10 != 0) {
            typeface = h.c(context, i10);
        } else {
            typeface = null;
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public Typeface e() {
        d();
        return this.f60518q;
    }

    public Typeface f(Context context) {
        if (this.f60517p) {
            return this.f60518q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface h10 = h.h(context, this.f60516o);
                this.f60518q = h10;
                if (h10 != null) {
                    this.f60518q = Typeface.create(h10, this.f60506e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f60505d, e10);
            }
        }
        d();
        this.f60517p = true;
        return this.f60518q;
    }

    public void g(Context context, TextPaint textPaint, C4985f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(Context context, C4985f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f60516o;
        if (i10 == 0) {
            this.f60517p = true;
        }
        if (this.f60517p) {
            fVar.b(this.f60518q, true);
            return;
        }
        try {
            h.j(context, i10, new a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f60517p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f60505d, e10);
            this.f60517p = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f60514m;
    }

    public float j() {
        return this.f60515n;
    }

    public void k(ColorStateList colorStateList) {
        this.f60514m = colorStateList;
    }

    public void l(float f10) {
        this.f60515n = f10;
    }

    public void n(Context context, TextPaint textPaint, C4985f fVar) {
        int i10;
        int i11;
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f60514m;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i10 = -16777216;
        }
        textPaint.setColor(i10);
        float f10 = this.f60511j;
        float f11 = this.f60509h;
        float f12 = this.f60510i;
        ColorStateList colorStateList2 = this.f60504c;
        if (colorStateList2 != null) {
            i11 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i11 = 0;
        }
        textPaint.setShadowLayer(f10, f11, f12, i11);
    }

    public void o(Context context, TextPaint textPaint, C4985f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z10;
        float f10;
        Typeface a10 = C4987h.a(context, typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f60506e & (~typeface.getStyle());
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setFakeBoldText(z10);
        if ((i10 & 2) != 0) {
            f10 = -0.25f;
        } else {
            f10 = 0.0f;
        }
        textPaint.setTextSkewX(f10);
        textPaint.setTextSize(this.f60515n);
        if (this.f60512k) {
            textPaint.setLetterSpacing(this.f60513l);
        }
    }
}
