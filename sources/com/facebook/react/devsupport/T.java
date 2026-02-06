package com.facebook.react.devsupport;

import C7.i;
import I7.e;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.C6496s;
import l8.c;
import n7.C3863a;

public final class T implements i {

    /* renamed from: a  reason: collision with root package name */
    private final e f40746a;

    /* renamed from: b  reason: collision with root package name */
    private View f40747b;

    /* renamed from: c  reason: collision with root package name */
    private S f40748c;

    public T(e eVar) {
        C6496s.h(eVar, "devSupportManager");
        this.f40746a = eVar;
    }

    public void a() {
        ViewParent viewParent;
        S s10;
        if (c() && (s10 = this.f40748c) != null) {
            s10.dismiss();
        }
        View view = this.f40747b;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        if (viewGroup != null) {
            viewGroup.removeView(this.f40747b);
        }
        this.f40748c = null;
    }

    public void b() {
        if (!c() && d()) {
            Activity a10 = this.f40746a.a();
            if (a10 == null || a10.isFinishing()) {
                c.a("Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
                return;
            }
            S s10 = new S(a10, this.f40747b);
            this.f40748c = s10;
            s10.setCancelable(false);
            s10.show();
        }
    }

    public boolean c() {
        S s10 = this.f40748c;
        if (s10 != null) {
            return s10.isShowing();
        }
        return false;
    }

    public boolean d() {
        if (this.f40747b != null) {
            return true;
        }
        return false;
    }

    public void e(String str) {
        C6496s.h(str, "appKey");
        C3863a.b(C6496s.c(str, "LogBox"), "This surface manager can only create LogBox React application");
        View c10 = this.f40746a.c("LogBox");
        this.f40747b = c10;
        if (c10 == null) {
            c.a("Unable to launch logbox because react was unable to create the root view");
        }
    }

    public void f() {
        View view = this.f40747b;
        if (view != null) {
            this.f40746a.f(view);
            this.f40747b = null;
        }
    }
}
