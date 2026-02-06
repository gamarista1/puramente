package com.facebook.react.devsupport;

import I7.e;
import I7.h;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.react.C3366l;
import com.facebook.react.C3367m;
import com.facebook.react.C3369o;
import com.facebook.react.C3371q;
import com.facebook.react.bridge.UiThreadUtil;
import n7.C3863a;
import x1.i;

class c0 implements h {

    /* renamed from: a  reason: collision with root package name */
    private final i f40777a;

    /* renamed from: b  reason: collision with root package name */
    private Dialog f40778b;

    public c0(i iVar) {
        this.f40777a = iVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        Dialog dialog = this.f40778b;
        if (dialog != null) {
            dialog.dismiss();
            this.f40778b = null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(e.a aVar, String str) {
        Dialog dialog = this.f40778b;
        if (dialog != null) {
            dialog.dismiss();
        }
        Context context = (Context) this.f40777a.get();
        if (context != null) {
            View inflate = LayoutInflater.from(context).inflate(C3369o.f41134d, (ViewGroup) null);
            ((View) C3863a.c(inflate.findViewById(C3367m.f40936l))).setOnClickListener(new b0(aVar));
            ((TextView) C3863a.c((TextView) inflate.findViewById(C3367m.f40937m))).setText(str);
            Dialog dialog2 = new Dialog(context, C3371q.f41175a);
            this.f40778b = dialog2;
            dialog2.setContentView(inflate);
            this.f40778b.setCancelable(false);
            Window window = this.f40778b.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = 0.2f;
                window.setAttributes(attributes);
                window.addFlags(2);
                window.setGravity(48);
                window.setElevation(0.0f);
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.setBackgroundDrawableResource(C3366l.f40919a);
            }
            this.f40778b.show();
        }
    }

    public void b(String str, e.a aVar) {
        UiThreadUtil.runOnUiThread(new Z(this, aVar, str));
    }

    public void g() {
        UiThreadUtil.runOnUiThread(new a0(this));
    }
}
