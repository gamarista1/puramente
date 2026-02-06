package com.reactnativecommunity.webview;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class r extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public static final a f59416b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final f f59417a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(WebView webView) {
            View view;
            C6496s.h(webView, "webView");
            ViewParent parent = webView.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
            if (view != null) {
                return view.getId();
            }
            return -1;
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Context context, f fVar) {
        super(context);
        C6496s.h(context, "context");
        C6496s.h(fVar, "webView");
        fVar.setBackgroundColor(0);
        addView(fVar);
        View childAt = getChildAt(0);
        C6496s.f(childAt, "null cannot be cast to non-null type com.reactnativecommunity.webview.RNCWebView");
        this.f59417a = (f) childAt;
    }

    public static final int a(WebView webView) {
        return f59416b.a(webView);
    }

    public final f getWebView() {
        return this.f59417a;
    }
}
