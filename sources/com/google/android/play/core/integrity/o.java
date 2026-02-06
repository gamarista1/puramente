package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C4746i;
import com.google.android.play.integrity.internal.C4747j;
import com.google.android.play.integrity.internal.C4748k;
import com.google.android.play.integrity.internal.m;

final class o {

    /* renamed from: a  reason: collision with root package name */
    private final o f56533a = this;

    /* renamed from: b  reason: collision with root package name */
    private final m f56534b;

    /* renamed from: c  reason: collision with root package name */
    private final m f56535c;

    /* renamed from: d  reason: collision with root package name */
    private final m f56536d;

    /* renamed from: e  reason: collision with root package name */
    private final m f56537e;

    /* synthetic */ o(Context context, n nVar) {
        C4747j b10 = C4748k.b(context);
        this.f56534b = b10;
        m b11 = C4746i.b(y.f56550a);
        this.f56535c = b11;
        m b12 = C4746i.b(new af(b10, b11));
        this.f56536d = b12;
        this.f56537e = C4746i.b(new x(b12));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f56537e.a();
    }
}
