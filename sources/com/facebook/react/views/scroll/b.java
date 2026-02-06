package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.n0;
import com.facebook.react.views.scroll.i;
import com.facebook.react.views.view.e;
import f8.C3519a;
import java.lang.ref.WeakReference;
import n7.C3863a;

class b implements UIManagerListener {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f41931a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f41932b;

    /* renamed from: c  reason: collision with root package name */
    private C0649b f41933c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference f41934d = null;

    /* renamed from: e  reason: collision with root package name */
    private Rect f41935e = null;

    /* renamed from: f  reason: collision with root package name */
    private boolean f41936f = false;

    class a implements Runnable {
        a() {
        }

        public void run() {
            b.this.b();
        }
    }

    /* renamed from: com.facebook.react.views.scroll.b$b  reason: collision with other inner class name */
    public static class C0649b {

        /* renamed from: a  reason: collision with root package name */
        public final int f41938a;

        /* renamed from: b  reason: collision with root package name */
        public final Integer f41939b;

        C0649b(int i10, Integer num) {
            this.f41938a = i10;
            this.f41939b = num;
        }

        static C0649b a(ReadableMap readableMap) {
            Integer num;
            int i10 = readableMap.getInt("minIndexForVisible");
            if (readableMap.hasKey("autoscrollToTopThreshold")) {
                num = Integer.valueOf(readableMap.getInt("autoscrollToTopThreshold"));
            } else {
                num = null;
            }
            return new C0649b(i10, num);
        }
    }

    public b(ViewGroup viewGroup, boolean z10) {
        this.f41931a = viewGroup;
        this.f41932b = z10;
    }

    /* access modifiers changed from: private */
    public void b() {
        e c10;
        int i10;
        float y10;
        int height;
        if (this.f41933c != null && (c10 = c()) != null) {
            if (this.f41932b) {
                i10 = this.f41931a.getScrollX();
            } else {
                i10 = this.f41931a.getScrollY();
            }
            for (int i11 = this.f41933c.f41938a; i11 < c10.getChildCount(); i11++) {
                View childAt = c10.getChildAt(i11);
                if (this.f41932b) {
                    y10 = childAt.getX();
                    height = childAt.getWidth();
                } else {
                    y10 = childAt.getY();
                    height = childAt.getHeight();
                }
                if (y10 + ((float) height) > ((float) i10) || i11 == c10.getChildCount() - 1) {
                    this.f41934d = new WeakReference(childAt);
                    Rect rect = new Rect();
                    childAt.getHitRect(rect);
                    this.f41935e = rect;
                    return;
                }
            }
        }
    }

    private e c() {
        return (e) this.f41931a.getChildAt(0);
    }

    private UIManager d() {
        return (UIManager) C3863a.c(n0.g((ReactContext) this.f41931a.getContext(), C3519a.a(this.f41931a.getId())));
    }

    private void i() {
        WeakReference weakReference;
        View view;
        if (this.f41933c != null && (weakReference = this.f41934d) != null && this.f41935e != null && (view = (View) weakReference.get()) != null) {
            Rect rect = new Rect();
            view.getHitRect(rect);
            if (this.f41932b) {
                int i10 = rect.left - this.f41935e.left;
                if (i10 != 0) {
                    int scrollX = this.f41931a.getScrollX();
                    ViewGroup viewGroup = this.f41931a;
                    ((i.d) viewGroup).a(i10 + scrollX, viewGroup.getScrollY());
                    this.f41935e = rect;
                    Integer num = this.f41933c.f41939b;
                    if (num != null && scrollX <= num.intValue()) {
                        ViewGroup viewGroup2 = this.f41931a;
                        ((i.d) viewGroup2).b(0, viewGroup2.getScrollY());
                        return;
                    }
                    return;
                }
                return;
            }
            int i11 = rect.top - this.f41935e.top;
            if (i11 != 0) {
                int scrollY = this.f41931a.getScrollY();
                ViewGroup viewGroup3 = this.f41931a;
                ((i.d) viewGroup3).a(viewGroup3.getScrollX(), i11 + scrollY);
                this.f41935e = rect;
                Integer num2 = this.f41933c.f41939b;
                if (num2 != null && scrollY <= num2.intValue()) {
                    ViewGroup viewGroup4 = this.f41931a;
                    ((i.d) viewGroup4).b(viewGroup4.getScrollX(), 0);
                }
            }
        }
    }

    public void didDispatchMountItems(UIManager uIManager) {
    }

    public void didMountItems(UIManager uIManager) {
        i();
    }

    public void didScheduleMountItems(UIManager uIManager) {
    }

    public void e(C0649b bVar) {
        this.f41933c = bVar;
    }

    public void f() {
        if (!this.f41936f) {
            this.f41936f = true;
            d().addUIManagerEventListener(this);
        }
    }

    public void g() {
        if (this.f41936f) {
            this.f41936f = false;
            d().removeUIManagerEventListener(this);
        }
    }

    public void h() {
        if (C3519a.a(this.f41931a.getId()) != 2) {
            i();
        }
    }

    public void willDispatchViewUpdates(UIManager uIManager) {
        UiThreadUtil.runOnUiThread(new a());
    }

    public void willMountItems(UIManager uIManager) {
        b();
    }
}
