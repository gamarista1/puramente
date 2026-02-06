package com.facebook.react.views.text.frescosupport;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.G;
import com.facebook.react.views.image.d;
import i7.C3594c;
import r6.C3976a;
import r6.C3977b;
import s8.q;
import u6.C4090b;

class b extends q {

    /* renamed from: b  reason: collision with root package name */
    private Drawable f42144b;

    /* renamed from: c  reason: collision with root package name */
    private final n6.b f42145c;

    /* renamed from: d  reason: collision with root package name */
    private final C4090b f42146d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f42147e;

    /* renamed from: f  reason: collision with root package name */
    private int f42148f;

    /* renamed from: g  reason: collision with root package name */
    private int f42149g;

    /* renamed from: h  reason: collision with root package name */
    private Uri f42150h;

    /* renamed from: i  reason: collision with root package name */
    private int f42151i;

    /* renamed from: j  reason: collision with root package name */
    private ReadableMap f42152j;

    /* renamed from: k  reason: collision with root package name */
    private String f42153k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f42154l;

    public b(Resources resources, int i10, int i11, int i12, Uri uri, ReadableMap readableMap, n6.b bVar, Object obj, String str) {
        this.f42146d = new C4090b(C3977b.t(resources).a());
        this.f42145c = bVar;
        this.f42147e = obj;
        this.f42149g = i12;
        this.f42150h = uri == null ? Uri.EMPTY : uri;
        this.f42152j = readableMap;
        this.f42151i = (int) G.h((float) i11);
        this.f42148f = (int) G.h((float) i10);
        this.f42153k = str;
    }

    private q6.q i(String str) {
        return d.c(str);
    }

    public Drawable a() {
        return this.f42144b;
    }

    public int b() {
        return this.f42148f;
    }

    public void c() {
        this.f42146d.i();
    }

    public void d() {
        this.f42146d.j();
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (this.f42144b == null) {
            X7.b A10 = X7.b.A(C3594c.x(this.f42150h), this.f42152j);
            ((C3976a) this.f42146d.f()).t(i(this.f42153k));
            this.f42146d.n(this.f42145c.x().D(this.f42146d.e()).z(this.f42147e).B(A10).a());
            this.f42145c.x();
            Drawable g10 = this.f42146d.g();
            this.f42144b = g10;
            g10.setBounds(0, 0, this.f42151i, this.f42148f);
            int i15 = this.f42149g;
            if (i15 != 0) {
                this.f42144b.setColorFilter(i15, PorterDuff.Mode.SRC_IN);
            }
            this.f42144b.setCallback(this.f42154l);
        }
        canvas.save();
        canvas.translate(f10, (float) (((i13 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.f42144b.getBounds().bottom - this.f42144b.getBounds().top) / 2)));
        this.f42144b.draw(canvas);
        canvas.restore();
    }

    public void e() {
        this.f42146d.i();
    }

    public void f() {
        this.f42146d.j();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i12 = -this.f42148f;
            fontMetricsInt.ascent = i12;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i12;
            fontMetricsInt.bottom = 0;
        }
        return this.f42151i;
    }

    public void h(TextView textView) {
        this.f42154l = textView;
    }
}
