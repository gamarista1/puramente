package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.a;

final class i {

    /* renamed from: n  reason: collision with root package name */
    static final int f56067n = 1;

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f56068a;

    /* renamed from: b  reason: collision with root package name */
    private final TextPaint f56069b;

    /* renamed from: c  reason: collision with root package name */
    private final int f56070c;

    /* renamed from: d  reason: collision with root package name */
    private int f56071d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f56072e;

    /* renamed from: f  reason: collision with root package name */
    private Layout.Alignment f56073f;

    /* renamed from: g  reason: collision with root package name */
    private int f56074g;

    /* renamed from: h  reason: collision with root package name */
    private float f56075h;

    /* renamed from: i  reason: collision with root package name */
    private float f56076i;

    /* renamed from: j  reason: collision with root package name */
    private int f56077j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f56078k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f56079l;

    /* renamed from: m  reason: collision with root package name */
    private TextUtils.TruncateAt f56080m;

    static class a extends Exception {
    }

    private i(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f56068a = charSequence;
        this.f56069b = textPaint;
        this.f56070c = i10;
        this.f56072e = charSequence.length();
        this.f56073f = Layout.Alignment.ALIGN_NORMAL;
        this.f56074g = a.e.API_PRIORITY_OTHER;
        this.f56075h = 0.0f;
        this.f56076i = 1.0f;
        this.f56077j = f56067n;
        this.f56078k = true;
        this.f56080m = null;
    }

    public static i b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new i(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f56068a == null) {
            this.f56068a = "";
        }
        int max = Math.max(0, this.f56070c);
        CharSequence charSequence = this.f56068a;
        if (this.f56074g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f56069b, (float) max, this.f56080m);
        }
        int min = Math.min(charSequence.length(), this.f56072e);
        this.f56072e = min;
        if (this.f56079l && this.f56074g == 1) {
            this.f56073f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f56071d, min, this.f56069b, max);
        obtain.setAlignment(this.f56073f);
        obtain.setIncludePad(this.f56078k);
        if (this.f56079l) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f56080m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f56074g);
        float f10 = this.f56075h;
        if (!(f10 == 0.0f && this.f56076i == 1.0f)) {
            obtain.setLineSpacing(f10, this.f56076i);
        }
        if (this.f56074g > 1) {
            obtain.setHyphenationFrequency(this.f56077j);
        }
        return obtain.build();
    }

    public i c(Layout.Alignment alignment) {
        this.f56073f = alignment;
        return this;
    }

    public i d(TextUtils.TruncateAt truncateAt) {
        this.f56080m = truncateAt;
        return this;
    }

    public i e(int i10) {
        this.f56077j = i10;
        return this;
    }

    public i f(boolean z10) {
        this.f56078k = z10;
        return this;
    }

    public i g(boolean z10) {
        this.f56079l = z10;
        return this;
    }

    public i h(float f10, float f11) {
        this.f56075h = f10;
        this.f56076i = f11;
        return this;
    }

    public i i(int i10) {
        this.f56074g = i10;
        return this;
    }
}
