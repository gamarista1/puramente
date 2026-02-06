package com.facebook.react.views.unimplementedview;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C;
import kotlin.jvm.internal.C6496s;

public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final C f42330a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        C6496s.h(context, "context");
        C c10 = new C(context);
        this.f42330a = c10;
        c10.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        c10.setGravity(17);
        c10.setTextColor(-1);
        setBackgroundColor(1442775040);
        setGravity(1);
        setOrientation(1);
        addView(c10);
    }

    public final void setName$ReactAndroid_release(String str) {
        C6496s.h(str, "name");
        C c10 = this.f42330a;
        c10.setText("'" + str + "' is not Fabric compatible yet.");
    }
}
