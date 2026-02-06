package com.google.android.material.datepicker;

import androidx.fragment.app.C1769q;
import java.util.LinkedHashSet;

abstract class q extends C1769q {

    /* renamed from: a  reason: collision with root package name */
    protected final LinkedHashSet f55927a = new LinkedHashSet();

    q() {
    }

    /* access modifiers changed from: package-private */
    public boolean C(p pVar) {
        return this.f55927a.add(pVar);
    }

    /* access modifiers changed from: package-private */
    public void D() {
        this.f55927a.clear();
    }
}
