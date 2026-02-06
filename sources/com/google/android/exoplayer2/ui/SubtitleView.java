package com.google.android.exoplayer2.ui;

import W9.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import ja.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SubtitleView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private List f43009a = Collections.emptyList();

    /* renamed from: b  reason: collision with root package name */
    private ha.a f43010b = ha.a.f44133g;

    /* renamed from: c  reason: collision with root package name */
    private int f43011c = 0;

    /* renamed from: d  reason: collision with root package name */
    private float f43012d = 0.0533f;

    /* renamed from: e  reason: collision with root package name */
    private float f43013e = 0.08f;

    /* renamed from: f  reason: collision with root package name */
    private boolean f43014f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f43015g = true;

    /* renamed from: h  reason: collision with root package name */
    private int f43016h;

    /* renamed from: i  reason: collision with root package name */
    private a f43017i;

    /* renamed from: j  reason: collision with root package name */
    private View f43018j;

    interface a {
        void a(List list, ha.a aVar, float f10, int i10, float f11);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(context);
        this.f43017i = aVar;
        this.f43018j = aVar;
        addView(aVar);
        this.f43016h = 1;
    }

    private b a(b bVar) {
        b.C0565b b10 = bVar.b();
        if (!this.f43014f) {
            i.e(b10);
        } else if (!this.f43015g) {
            i.f(b10);
        }
        return b10.a();
    }

    private void c(int i10, float f10) {
        this.f43011c = i10;
        this.f43012d = f10;
        d();
    }

    private void d() {
        this.f43017i.a(getCuesWithStylingPreferencesApplied(), this.f43010b, this.f43012d, this.f43011c, this.f43013e);
    }

    private List<b> getCuesWithStylingPreferencesApplied() {
        if (this.f43014f && this.f43015g) {
            return this.f43009a;
        }
        ArrayList arrayList = new ArrayList(this.f43009a.size());
        for (int i10 = 0; i10 < this.f43009a.size(); i10++) {
            arrayList.add(a((b) this.f43009a.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (M.f44981a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private ha.a getUserCaptionStyle() {
        if (M.f44981a < 19 || isInEditMode()) {
            return ha.a.f44133g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            return ha.a.f44133g;
        }
        return ha.a.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f43018j);
        View view = this.f43018j;
        if (view instanceof j) {
            ((j) view).g();
        }
        this.f43018j = t10;
        this.f43017i = (a) t10;
        addView(t10);
    }

    public void b(float f10, boolean z10) {
        c(z10 ? 1 : 0, f10);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f43015g = z10;
        d();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f43014f = z10;
        d();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f43013e = f10;
        d();
    }

    public void setCues(List<b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f43009a = list;
        d();
    }

    public void setFractionalTextSize(float f10) {
        b(f10, false);
    }

    public void setStyle(ha.a aVar) {
        this.f43010b = aVar;
        d();
    }

    public void setViewType(int i10) {
        if (this.f43016h != i10) {
            if (i10 == 1) {
                setView(new a(getContext()));
            } else if (i10 == 2) {
                setView(new j(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
            this.f43016h = i10;
        }
    }
}
