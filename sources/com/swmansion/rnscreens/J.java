package com.swmansion.rnscreens;

import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.e;
import kotlin.jvm.internal.C6496s;
import sf.C6714a;

public final class J extends e {

    /* renamed from: a  reason: collision with root package name */
    private int f59707a;

    /* renamed from: b  reason: collision with root package name */
    private int f59708b;

    /* renamed from: c  reason: collision with root package name */
    private a f59709c = a.RIGHT;

    public enum a {
        LEFT,
        CENTER,
        RIGHT,
        BACK,
        SEARCH_BAR;

        static {
            a[] a10;
            f59716g = C6714a.a(a10);
        }
    }

    public J(ReactContext reactContext) {
        super(reactContext);
    }

    public final H getConfig() {
        C4920d dVar;
        ViewParent parent = getParent();
        if (parent instanceof C4920d) {
            dVar = (C4920d) parent;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            return dVar.getConfig();
        }
        return null;
    }

    public final a getType() {
        return this.f59709c;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) == 1073741824 && View.MeasureSpec.getMode(i11) == 1073741824) {
            this.f59707a = View.MeasureSpec.getSize(i10);
            this.f59708b = View.MeasureSpec.getSize(i11);
            ViewParent parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.f59707a, this.f59708b);
    }

    public final void setType(a aVar) {
        C6496s.h(aVar, "<set-?>");
        this.f59709c = aVar;
    }
}
