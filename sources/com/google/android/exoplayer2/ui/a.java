package com.google.android.exoplayer2.ui;

import W9.b;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class a extends View implements SubtitleView.a {

    /* renamed from: a  reason: collision with root package name */
    private final List f43035a;

    /* renamed from: b  reason: collision with root package name */
    private List f43036b;

    /* renamed from: c  reason: collision with root package name */
    private int f43037c;

    /* renamed from: d  reason: collision with root package name */
    private float f43038d;

    /* renamed from: e  reason: collision with root package name */
    private ha.a f43039e;

    /* renamed from: f  reason: collision with root package name */
    private float f43040f;

    public a(Context context) {
        this(context, (AttributeSet) null);
    }

    private static b b(b bVar) {
        b.C0565b p10 = bVar.b().k(-3.4028235E38f).l(Integer.MIN_VALUE).p((Layout.Alignment) null);
        if (bVar.f34933f == 0) {
            p10.h(1.0f - bVar.f34932e, 0);
        } else {
            p10.h((-bVar.f34932e) - 1.0f, 1);
        }
        int i10 = bVar.f34934g;
        if (i10 == 0) {
            p10.i(2);
        } else if (i10 == 2) {
            p10.i(0);
        }
        return p10.a();
    }

    public void a(List list, ha.a aVar, float f10, int i10, float f11) {
        this.f43036b = list;
        this.f43039e = aVar;
        this.f43038d = f10;
        this.f43037c = i10;
        this.f43040f = f11;
        while (this.f43035a.size() < list.size()) {
            this.f43035a.add(new f(getContext()));
        }
        invalidate();
    }

    public void dispatchDraw(Canvas canvas) {
        List list = this.f43036b;
        if (!list.isEmpty()) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int paddingBottom = height - getPaddingBottom();
            if (paddingBottom > paddingTop && width > paddingLeft) {
                int i10 = paddingBottom - paddingTop;
                float h10 = i.h(this.f43037c, this.f43038d, height, i10);
                if (h10 > 0.0f) {
                    int size = list.size();
                    int i11 = 0;
                    while (i11 < size) {
                        b bVar = (b) list.get(i11);
                        if (bVar.f34943p != Integer.MIN_VALUE) {
                            bVar = b(bVar);
                        }
                        b bVar2 = bVar;
                        int i12 = paddingBottom;
                        ((f) this.f43035a.get(i11)).b(bVar2, this.f43039e, h10, i.h(bVar2.f34941n, bVar2.f34942o, height, i10), this.f43040f, canvas, paddingLeft, paddingTop, width, i12);
                        i11++;
                        size = size;
                        i10 = i10;
                        paddingBottom = i12;
                        width = width;
                    }
                }
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43035a = new ArrayList();
        this.f43036b = Collections.emptyList();
        this.f43037c = 0;
        this.f43038d = 0.0533f;
        this.f43039e = ha.a.f44133g;
        this.f43040f = 0.08f;
    }
}
