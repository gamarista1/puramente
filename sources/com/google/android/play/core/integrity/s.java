package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C4746i;
import com.google.android.play.integrity.internal.C4747j;
import com.google.android.play.integrity.internal.C4748k;
import com.google.android.play.integrity.internal.m;

final class s {

    /* renamed from: a  reason: collision with root package name */
    private final s f56539a = this;

    /* renamed from: b  reason: collision with root package name */
    private final m f56540b;

    /* renamed from: c  reason: collision with root package name */
    private final m f56541c;

    /* renamed from: d  reason: collision with root package name */
    private final m f56542d;

    /* renamed from: e  reason: collision with root package name */
    private final m f56543e;

    /* renamed from: f  reason: collision with root package name */
    private final m f56544f;

    /* synthetic */ s(Context context, r rVar) {
        C4747j b10 = C4748k.b(context);
        this.f56540b = b10;
        m b11 = C4746i.b(an.f56485a);
        this.f56541c = b11;
        m b12 = C4746i.b(new az(b10, b11));
        this.f56542d = b12;
        m b13 = C4746i.b(new be(b12));
        this.f56543e = b13;
        this.f56544f = C4746i.b(new am(b12, b13));
    }

    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f56544f.a();
    }
}
