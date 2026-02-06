package com.google.android.material.theme;

import Xa.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.t;
import androidx.appcompat.widget.C;
import androidx.appcompat.widget.C1565d;
import androidx.appcompat.widget.C1567f;
import androidx.appcompat.widget.C1568g;
import androidx.appcompat.widget.C1581u;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.h;
import com.google.android.material.textview.MaterialTextView;
import eb.C4948a;

public class MaterialComponentsViewInflater extends t {
    /* access modifiers changed from: protected */
    public C1565d c(Context context, AttributeSet attributeSet) {
        return new h(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C1567f d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C1568g e(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C1581u k(Context context, AttributeSet attributeSet) {
        return new C4948a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
