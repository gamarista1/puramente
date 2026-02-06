package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.activity.G;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.C1769q;
import com.google.android.gms.common.api.a;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.jvm.internal.C6496s;

/* renamed from: com.swmansion.rnscreens.c  reason: case insensitive filesystem */
public final class C4919c extends SearchView {

    /* renamed from: J0  reason: collision with root package name */
    private SearchView.l f59777J0;

    /* renamed from: K0  reason: collision with root package name */
    private View.OnClickListener f59778K0;

    /* renamed from: L0  reason: collision with root package name */
    private G f59779L0;

    /* renamed from: M0  reason: collision with root package name */
    private final C4923g f59780M0;

    /* renamed from: com.swmansion.rnscreens.c$a */
    public static final class a extends G {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4919c f59781d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C4919c cVar) {
            super(true);
            this.f59781d = cVar;
        }

        public void d() {
            this.f59781d.setIconified(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4919c(Context context, C1769q qVar) {
        super(context);
        C6496s.h(context, "context");
        C6496s.h(qVar, "fragment");
        a aVar = new a(this);
        this.f59779L0 = aVar;
        this.f59780M0 = new C4923g(qVar, aVar);
        super.setOnSearchClickListener(new C4917a(this));
        super.setOnCloseListener(new C4918b(this));
        setMaxWidth(a.e.API_PRIORITY_OTHER);
    }

    /* access modifiers changed from: private */
    public static final void o0(C4919c cVar, View view) {
        View.OnClickListener onClickListener = cVar.f59778K0;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        cVar.f59780M0.b();
    }

    /* access modifiers changed from: private */
    public static final boolean p0(C4919c cVar) {
        boolean z10;
        SearchView.l lVar = cVar.f59777J0;
        if (lVar != null) {
            z10 = lVar.a();
        } else {
            z10 = false;
        }
        cVar.f59780M0.c();
        return z10;
    }

    public final boolean getOverrideBackAction() {
        return this.f59780M0.a();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!L()) {
            this.f59780M0.b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f59780M0.c();
    }

    public final void q0() {
        d0("", false);
    }

    public final void r0() {
        setIconified(false);
        requestFocusFromTouch();
    }

    public void setOnCloseListener(SearchView.l lVar) {
        this.f59777J0 = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f59778K0 = onClickListener;
    }

    public final void setOverrideBackAction(boolean z10) {
        this.f59780M0.d(z10);
    }

    public final void setText(String str) {
        C6496s.h(str, AttributeType.TEXT);
        d0(str, false);
    }
}
