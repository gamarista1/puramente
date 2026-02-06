package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class L {

    /* renamed from: b  reason: collision with root package name */
    private static final a f40718b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private boolean f40719a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final void c(L l10) {
        l10.f40719a = false;
    }

    public final boolean b(int i10, View view) {
        if (i10 == 46 && !(view instanceof EditText)) {
            if (this.f40719a) {
                this.f40719a = false;
                return true;
            }
            this.f40719a = true;
            new Handler(Looper.getMainLooper()).postDelayed(new K(this), 200);
        }
        return false;
    }
}
