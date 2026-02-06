package com.facebook.react.views.scroll;

import android.content.Context;
import com.facebook.react.modules.i18nmanager.a;
import com.facebook.react.views.view.e;
import kotlin.jvm.internal.C6496s;

public final class d extends e {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f41946a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        C6496s.h(context, "context");
        this.f41946a = a.f41056a.a().i(context);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f41946a) {
            setLeft(0);
            setTop(i11);
            setRight(i12 - i10);
            setBottom(i13);
        }
    }

    public void setRemoveClippedSubviews(boolean z10) {
        if (this.f41946a) {
            super.setRemoveClippedSubviews(false);
        } else {
            super.setRemoveClippedSubviews(z10);
        }
    }
}
