package com.facebook.react.devsupport;

import C7.i;
import I7.e;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.C1680b0;
import androidx.core.view.D0;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.C3371q;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import java.util.Objects;
import p1.C2388d;

class j0 implements i {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final L f40823a = new L();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final e f40824b;

    /* renamed from: c  reason: collision with root package name */
    private Dialog f40825c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public f0 f40826d;

    class a extends Dialog {
        a(Context context, int i10) {
            super(context, i10);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ D0 b(int i10, View view, D0 d02) {
            C2388d f10 = d02.f(i10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).setMargins(f10.f25150a, f10.f25151b, f10.f25152c, f10.f25153d);
            return D0.f15980b;
        }

        /* access modifiers changed from: protected */
        public void onCreate(Bundle bundle) {
            Objects.requireNonNull(getWindow());
            getWindow().setBackgroundDrawable(new ColorDrawable(-16777216));
            C1680b0.C0(j0.this.f40826d, new i0(D0.n.h() | D0.n.b()));
        }

        public boolean onKeyUp(int i10, KeyEvent keyEvent) {
            if (i10 == 82) {
                j0.this.f40824b.D();
                return true;
            }
            if (j0.this.f40823a.b(i10, getCurrentFocus())) {
                j0.this.f40824b.z();
            }
            return super.onKeyUp(i10, keyEvent);
        }
    }

    class b implements LifecycleEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f40828a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReactContext f40829b;

        b(Runnable runnable, ReactContext reactContext) {
            this.f40828a = runnable;
            this.f40829b = reactContext;
        }

        public void onHostDestroy() {
        }

        public void onHostPause() {
        }

        public void onHostResume() {
            this.f40828a.run();
            this.f40829b.removeLifecycleEventListener(this);
        }
    }

    public j0(e eVar) {
        this.f40824b = eVar;
    }

    private static void j(ReactContext reactContext, Runnable runnable) {
        reactContext.addLifecycleEventListener(new b(runnable, reactContext));
    }

    public void a() {
        Dialog dialog = this.f40825c;
        if (dialog != null) {
            try {
                dialog.dismiss();
            } catch (IllegalArgumentException e10) {
                U5.a.n("ReactNative", "RedBoxDialogSurfaceDelegate: error while dismissing dialog: ", e10);
            }
            f();
            this.f40825c = null;
        }
    }

    public void b() {
        String m10 = this.f40824b.m();
        Activity a10 = this.f40824b.a();
        if (a10 == null || a10.isFinishing()) {
            ReactContext i10 = this.f40824b.i();
            if (i10 != null) {
                j(i10, new h0(this));
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to launch redbox because react activity and react context is not available, here is the error that redbox would've displayed: ");
            if (m10 == null) {
                m10 = "N/A";
            }
            sb2.append(m10);
            U5.a.m("ReactNative", sb2.toString());
            return;
        }
        f0 f0Var = this.f40826d;
        if (f0Var == null || f0Var.getContext() != a10) {
            e(NativeRedBoxSpec.NAME);
        }
        this.f40826d.d();
        if (this.f40825c == null) {
            a aVar = new a(a10, C3371q.f41177c);
            this.f40825c = aVar;
            aVar.requestWindowFeature(1);
            this.f40825c.setContentView(this.f40826d);
        }
        this.f40825c.show();
    }

    public boolean c() {
        Dialog dialog = this.f40825c;
        if (dialog == null || !dialog.isShowing()) {
            return false;
        }
        return true;
    }

    public boolean d() {
        if (this.f40826d != null) {
            return true;
        }
        return false;
    }

    public void e(String str) {
        this.f40824b.v();
        Activity a10 = this.f40824b.a();
        if (a10 == null || a10.isFinishing()) {
            String m10 = this.f40824b.m();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to launch redbox because react activity are not available, here is the error that redbox would've displayed: ");
            if (m10 == null) {
                m10 = "N/A";
            }
            sb2.append(m10);
            U5.a.m("ReactNative", sb2.toString());
            return;
        }
        f0 f0Var = new f0(a10);
        this.f40826d = f0Var;
        f0Var.e(this.f40824b).g((I7.i) null).c();
    }

    public void f() {
        this.f40826d = null;
    }
}
