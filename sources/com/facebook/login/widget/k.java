package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import io.intercom.android.sdk.models.AttributeType;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t7.C4049a;
import y7.L;
import y7.M;
import y7.N;

public final class k {

    /* renamed from: i  reason: collision with root package name */
    public static final a f40177i = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f40178a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f40179b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f40180c;

    /* renamed from: d  reason: collision with root package name */
    private b f40181d;

    /* renamed from: e  reason: collision with root package name */
    private PopupWindow f40182e;

    /* renamed from: f  reason: collision with root package name */
    private c f40183f = c.BLUE;

    /* renamed from: g  reason: collision with root package name */
    private long f40184g = 6000;

    /* renamed from: h  reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f40185h = new h(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b extends FrameLayout {

        /* renamed from: a  reason: collision with root package name */
        private final ImageView f40186a;

        /* renamed from: b  reason: collision with root package name */
        private final ImageView f40187b;

        /* renamed from: c  reason: collision with root package name */
        private final View f40188c;

        /* renamed from: d  reason: collision with root package name */
        private final ImageView f40189d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f40190e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(k kVar, Context context) {
            super(context);
            C6496s.h(context, "context");
            this.f40190e = kVar;
            LayoutInflater.from(context).inflate(N.f49631a, this);
            View findViewById = findViewById(M.f49630e);
            C6496s.f(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            this.f40186a = (ImageView) findViewById;
            View findViewById2 = findViewById(M.f49628c);
            C6496s.f(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f40187b = (ImageView) findViewById2;
            View findViewById3 = findViewById(M.f49626a);
            C6496s.g(findViewById3, "findViewById(R.id.com_facebook_body_frame)");
            this.f40188c = findViewById3;
            View findViewById4 = findViewById(M.f49627b);
            C6496s.f(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            this.f40189d = (ImageView) findViewById4;
        }

        public final View a() {
            return this.f40188c;
        }

        public final ImageView b() {
            return this.f40187b;
        }

        public final ImageView c() {
            return this.f40186a;
        }

        public final ImageView d() {
            return this.f40189d;
        }

        public final void e() {
            this.f40186a.setVisibility(4);
            this.f40187b.setVisibility(0);
        }

        public final void f() {
            this.f40186a.setVisibility(0);
            this.f40187b.setVisibility(4);
        }
    }

    public enum c {
        BLUE,
        BLACK
    }

    public k(String str, View view) {
        C6496s.h(str, AttributeType.TEXT);
        C6496s.h(view, "anchor");
        this.f40178a = str;
        this.f40179b = new WeakReference(view);
        Context context = view.getContext();
        C6496s.g(context, "anchor.context");
        this.f40180c = context;
    }

    private final void e() {
        ViewTreeObserver viewTreeObserver;
        if (!C4049a.d(this)) {
            try {
                l();
                View view = (View) this.f40179b.get();
                if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f40185h);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void f(k kVar) {
        PopupWindow popupWindow;
        Class<k> cls = k.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(kVar, "this$0");
                if (kVar.f40179b.get() != null && (popupWindow = kVar.f40182e) != null && popupWindow.isShowing()) {
                    if (popupWindow.isAboveAnchor()) {
                        b bVar = kVar.f40181d;
                        if (bVar != null) {
                            bVar.e();
                            return;
                        }
                        return;
                    }
                    b bVar2 = kVar.f40181d;
                    if (bVar2 != null) {
                        bVar2.f();
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void j(k kVar) {
        Class<k> cls = k.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(kVar, "this$0");
                kVar.d();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void k(k kVar, View view) {
        Class<k> cls = k.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(kVar, "this$0");
                kVar.d();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void l() {
        ViewTreeObserver viewTreeObserver;
        if (!C4049a.d(this)) {
            try {
                View view = (View) this.f40179b.get();
                if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f40185h);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final void m() {
        if (!C4049a.d(this)) {
            try {
                PopupWindow popupWindow = this.f40182e;
                if (popupWindow != null && popupWindow.isShowing()) {
                    if (popupWindow.isAboveAnchor()) {
                        b bVar = this.f40181d;
                        if (bVar != null) {
                            bVar.e();
                            return;
                        }
                        return;
                    }
                    b bVar2 = this.f40181d;
                    if (bVar2 != null) {
                        bVar2.f();
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void d() {
        if (!C4049a.d(this)) {
            try {
                l();
                PopupWindow popupWindow = this.f40182e;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void g(long j10) {
        if (!C4049a.d(this)) {
            try {
                this.f40184g = j10;
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void h(c cVar) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(cVar, "style");
                this.f40183f = cVar;
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void i() {
        if (!C4049a.d(this)) {
            try {
                if (this.f40179b.get() != null) {
                    b bVar = new b(this, this.f40180c);
                    this.f40181d = bVar;
                    View findViewById = bVar.findViewById(M.f49629d);
                    C6496s.f(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                    ((TextView) findViewById).setText(this.f40178a);
                    if (this.f40183f == c.BLUE) {
                        bVar.a().setBackgroundResource(L.f49622e);
                        bVar.b().setImageResource(L.f49623f);
                        bVar.c().setImageResource(L.f49624g);
                        bVar.d().setImageResource(L.f49625h);
                    } else {
                        bVar.a().setBackgroundResource(L.f49618a);
                        bVar.b().setImageResource(L.f49619b);
                        bVar.c().setImageResource(L.f49620c);
                        bVar.d().setImageResource(L.f49621d);
                    }
                    Context context = this.f40180c;
                    C6496s.f(context, "null cannot be cast to non-null type android.app.Activity");
                    View decorView = ((Activity) context).getWindow().getDecorView();
                    C6496s.g(decorView, "window.decorView");
                    int width = decorView.getWidth();
                    int height = decorView.getHeight();
                    e();
                    bVar.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                    PopupWindow popupWindow = new PopupWindow(bVar, bVar.getMeasuredWidth(), bVar.getMeasuredHeight());
                    this.f40182e = popupWindow;
                    popupWindow.showAsDropDown((View) this.f40179b.get());
                    m();
                    if (this.f40184g > 0) {
                        bVar.postDelayed(new i(this), this.f40184g);
                    }
                    popupWindow.setTouchable(true);
                    bVar.setOnClickListener(new j(this));
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }
}
