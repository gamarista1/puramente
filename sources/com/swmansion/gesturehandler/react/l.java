package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C3405c0;
import com.facebook.react.views.view.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class l extends e {

    /* renamed from: c  reason: collision with root package name */
    public static final a f59602c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private boolean f59603a;

    /* renamed from: b  reason: collision with root package name */
    private k f59604b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof l) {
                    return true;
                }
                if (parent instanceof C3405c0) {
                    return false;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public l(Context context) {
        super(context);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C6496s.h(motionEvent, "event");
        if (this.f59603a) {
            k kVar = this.f59604b;
            C6496s.e(kVar);
            if (kVar.e(motionEvent)) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C6496s.h(motionEvent, "ev");
        if (this.f59603a) {
            k kVar = this.f59604b;
            C6496s.e(kVar);
            if (kVar.e(motionEvent)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void l(View view) {
        C6496s.h(view, "view");
        k kVar = this.f59604b;
        if (kVar != null) {
            kVar.d(view);
        }
    }

    public final void m() {
        k kVar = this.f59604b;
        if (kVar != null) {
            kVar.j();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean a10 = f59602c.b(this);
        this.f59603a = !a10;
        if (a10) {
            Log.i("ReactNative", "[GESTURE HANDLER] Gesture handler is already enabled for a parent view");
        }
        if (this.f59603a && this.f59604b == null) {
            Context context = getContext();
            C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            this.f59604b = new k((ReactContext) context, this);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f59603a) {
            k kVar = this.f59604b;
            C6496s.e(kVar);
            kVar.i();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
