package com.google.android.material.datepicker;

import Ua.a;
import Ua.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import fb.C4981b;
import fb.C4982c;

final class c {

    /* renamed from: a  reason: collision with root package name */
    final b f55800a;

    /* renamed from: b  reason: collision with root package name */
    final b f55801b;

    /* renamed from: c  reason: collision with root package name */
    final b f55802c;

    /* renamed from: d  reason: collision with root package name */
    final b f55803d;

    /* renamed from: e  reason: collision with root package name */
    final b f55804e;

    /* renamed from: f  reason: collision with root package name */
    final b f55805f;

    /* renamed from: g  reason: collision with root package name */
    final b f55806g;

    /* renamed from: h  reason: collision with root package name */
    final Paint f55807h;

    c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C4981b.c(context, a.f52742t, i.class.getCanonicalName()), j.f52988H2);
        this.f55800a = b.a(context, obtainStyledAttributes.getResourceId(j.f53009K2, 0));
        this.f55806g = b.a(context, obtainStyledAttributes.getResourceId(j.f52995I2, 0));
        this.f55801b = b.a(context, obtainStyledAttributes.getResourceId(j.f53002J2, 0));
        this.f55802c = b.a(context, obtainStyledAttributes.getResourceId(j.f53016L2, 0));
        ColorStateList a10 = C4982c.a(context, obtainStyledAttributes, j.f53023M2);
        this.f55803d = b.a(context, obtainStyledAttributes.getResourceId(j.f53037O2, 0));
        this.f55804e = b.a(context, obtainStyledAttributes.getResourceId(j.f53030N2, 0));
        this.f55805f = b.a(context, obtainStyledAttributes.getResourceId(j.f53044P2, 0));
        Paint paint = new Paint();
        this.f55807h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
