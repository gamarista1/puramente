package com.facebook.react.devsupport;

import I7.c;
import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.react.C3369o;
import com.facebook.react.bridge.UiThreadUtil;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;

/* renamed from: com.facebook.react.devsupport.h  reason: case insensitive filesystem */
public final class C3341h implements c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f40810d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static boolean f40811e = true;

    /* renamed from: a  reason: collision with root package name */
    private final e0 f40812a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f40813b;

    /* renamed from: c  reason: collision with root package name */
    private PopupWindow f40814c;

    /* renamed from: com.facebook.react.devsupport.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3341h(e0 e0Var) {
        C6496s.h(e0Var, "reactInstanceDevHelper");
        this.f40812a = e0Var;
    }

    /* access modifiers changed from: private */
    public static final void g(C3341h hVar) {
        hVar.h();
    }

    private final void h() {
        PopupWindow popupWindow = this.f40814c;
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
            this.f40814c = null;
            this.f40813b = null;
        }
    }

    private final void i(String str) {
        PopupWindow popupWindow = this.f40814c;
        if (popupWindow == null || !popupWindow.isShowing()) {
            Activity a10 = this.f40812a.a();
            if (a10 == null) {
                U5.a.m("ReactNative", "Unable to display loading message because react activity isn't available");
                return;
            }
            try {
                Rect rect = new Rect();
                a10.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                int i10 = rect.top;
                Object systemService = a10.getSystemService("layout_inflater");
                C6496s.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(C3369o.f41132b, (ViewGroup) null);
                C6496s.f(inflate, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) inflate;
                textView.setText(str);
                PopupWindow popupWindow2 = new PopupWindow(textView, -1, -2);
                popupWindow2.setTouchable(false);
                popupWindow2.showAtLocation(a10.getWindow().getDecorView(), 0, 0, i10);
                this.f40813b = textView;
                this.f40814c = popupWindow2;
            } catch (WindowManager.BadTokenException unused) {
                U5.a.m("ReactNative", "Unable to display loading message because react activity isn't active, message: " + str);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void j(C3341h hVar, String str) {
        hVar.i(str);
    }

    /* access modifiers changed from: private */
    public static final void k(Integer num, Integer num2, C3341h hVar, String str) {
        String str2;
        if (num == null || num2 == null || num2.intValue() <= 0) {
            str2 = "";
        } else {
            U u10 = U.f71764a;
            str2 = String.format(Locale.getDefault(), " %.1f%%", Arrays.copyOf(new Object[]{Float.valueOf((((float) num.intValue()) / ((float) num2.intValue())) * ((float) 100))}, 1));
            C6496s.g(str2, "format(...)");
        }
        TextView textView = hVar.f40813b;
        if (textView != null) {
            if (str == null) {
                str = "Loading";
            }
            textView.setText(str + str2 + "…");
        }
    }

    public void a() {
        if (f40811e) {
            UiThreadUtil.runOnUiThread(new C3338e(this));
        }
    }

    public void b(String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        if (f40811e) {
            UiThreadUtil.runOnUiThread(new C3339f(this, str));
        }
    }

    public void c(String str, Integer num, Integer num2) {
        if (f40811e) {
            UiThreadUtil.runOnUiThread(new C3340g(num, num2, this, str));
        }
    }
}
