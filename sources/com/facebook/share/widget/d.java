package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C3324n;
import com.facebook.C3327q;
import com.facebook.I;
import t7.C4049a;
import v8.e;

public abstract class d extends C3327q {

    /* renamed from: j  reason: collision with root package name */
    private e f42395j;

    /* renamed from: k  reason: collision with root package name */
    private int f42396k = 0;

    /* renamed from: l  reason: collision with root package name */
    private boolean f42397l = false;

    /* renamed from: m  reason: collision with root package name */
    private C3324n f42398m;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            if (!C4049a.d(this)) {
                try {
                    d.this.b(view);
                    d.this.getDialog().m(d.this.getShareContent());
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                }
            }
        }
    }

    protected d(Context context, AttributeSet attributeSet, int i10, String str, String str2) {
        super(context, attributeSet, i10, 0, str, str2);
        int i11;
        if (isInEditMode()) {
            i11 = 0;
        } else {
            i11 = getDefaultRequestCode();
        }
        this.f42396k = i11;
        o(false);
    }

    private void o(boolean z10) {
        setEnabled(z10);
        this.f42397l = false;
    }

    /* access modifiers changed from: protected */
    public void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        super.c(context, attributeSet, i10, i11);
        setInternalOnClickListener(getShareOnClickListener());
    }

    /* access modifiers changed from: protected */
    public C3324n getCallbackManager() {
        return this.f42398m;
    }

    /* access modifiers changed from: protected */
    public abstract e getDialog();

    public int getRequestCode() {
        return this.f42396k;
    }

    public e getShareContent() {
        return this.f42395j;
    }

    /* access modifiers changed from: protected */
    public View.OnClickListener getShareOnClickListener() {
        return new a();
    }

    /* access modifiers changed from: protected */
    public boolean n() {
        return getDialog().b(getShareContent());
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f42397l = true;
    }

    /* access modifiers changed from: protected */
    public void setRequestCode(int i10) {
        if (!I.E(i10)) {
            this.f42396k = i10;
            return;
        }
        throw new IllegalArgumentException("Request code " + i10 + " cannot be within the range reserved by the Facebook SDK.");
    }

    public void setShareContent(e eVar) {
        this.f42395j = eVar;
        if (!this.f42397l) {
            o(n());
        }
    }
}
