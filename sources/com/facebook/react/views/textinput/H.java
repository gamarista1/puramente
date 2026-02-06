package com.facebook.react.views.textinput;

import U5.a;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.view.d;
import androidx.core.view.C1680b0;
import com.facebook.react.C3371q;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.D;
import com.facebook.react.uimanager.s0;
import com.facebook.react.views.text.c;
import com.facebook.react.views.text.g;
import com.facebook.react.views.text.l;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import com.facebook.yoga.r;
import e8.C3500a;
import n7.C3863a;

public class H extends c implements o {

    /* renamed from: B  reason: collision with root package name */
    private int f42240B;

    /* renamed from: C  reason: collision with root package name */
    private EditText f42241C;

    /* renamed from: D  reason: collision with root package name */
    private r f42242D;

    /* renamed from: E  reason: collision with root package name */
    private String f42243E;

    /* renamed from: F  reason: collision with root package name */
    private String f42244F;

    public H(l lVar) {
        super(lVar);
        this.f42240B = -1;
        this.f42243E = null;
        this.f42244F = null;
        this.f42108j = 1;
        l();
    }

    private void l() {
        setMeasureFunction(this);
    }

    public long a(r rVar, float f10, p pVar, float f11, p pVar2) {
        EditText editText = (EditText) C3863a.c(this.f42241C);
        r rVar2 = this.f42242D;
        if (rVar2 != null) {
            rVar2.a(editText);
        } else {
            editText.setTextSize(0, (float) this.f42099a.c());
            int i10 = this.f42106h;
            if (i10 != -1) {
                editText.setLines(i10);
            }
            int breakStrategy = editText.getBreakStrategy();
            int i11 = this.f42108j;
            if (breakStrategy != i11) {
                editText.setBreakStrategy(i11);
            }
        }
        editText.setHint(j());
        editText.measure(com.facebook.react.views.view.c.a(f10, pVar), com.facebook.react.views.view.c.a(f11, pVar2));
        return q.b(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public EditText i() {
        return new EditText(new d((Context) getThemedContext(), C3371q.f41181g));
    }

    public boolean isVirtualAnchor() {
        return true;
    }

    public boolean isYogaLeafNode() {
        return true;
    }

    public String j() {
        return this.f42244F;
    }

    public String k() {
        return this.f42243E;
    }

    public void onCollectExtraUpdates(s0 s0Var) {
        super.onCollectExtraUpdates(s0Var);
        if (this.f42240B != -1) {
            s0Var.O(getReactTag(), new g(h(this, k(), false, (D) null), this.f42240B, this.f42124z, getPadding(0), getPadding(1), getPadding(2), getPadding(3), this.f42107i, this.f42108j, this.f42110l));
        }
    }

    public void setLocalData(Object obj) {
        C3863a.a(obj instanceof r);
        this.f42242D = (r) obj;
        dirty();
    }

    @C3500a(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i10) {
        this.f42240B = i10;
    }

    public void setPadding(int i10, float f10) {
        super.setPadding(i10, f10);
        markUpdated();
    }

    @C3500a(name = "placeholder")
    public void setPlaceholder(String str) {
        this.f42244F = str;
        markUpdated();
    }

    @C3500a(name = "text")
    public void setText(String str) {
        this.f42243E = str;
        markUpdated();
    }

    public void setTextBreakStrategy(String str) {
        if (str == null || "simple".equals(str)) {
            this.f42108j = 0;
        } else if ("highQuality".equals(str)) {
            this.f42108j = 1;
        } else if ("balanced".equals(str)) {
            this.f42108j = 2;
        } else {
            a.I("ReactNative", "Invalid textBreakStrategy: " + str);
            this.f42108j = 0;
        }
    }

    public void setThemedContext(C3415h0 h0Var) {
        super.setThemedContext(h0Var);
        EditText i10 = i();
        setDefaultPadding(4, (float) C1680b0.F(i10));
        setDefaultPadding(1, (float) i10.getPaddingTop());
        setDefaultPadding(5, (float) C1680b0.E(i10));
        setDefaultPadding(3, (float) i10.getPaddingBottom());
        this.f42241C = i10;
        i10.setPadding(0, 0, 0, 0);
        this.f42241C.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    public H() {
        this((l) null);
    }
}
