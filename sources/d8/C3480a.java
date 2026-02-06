package d8;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: d8.a  reason: case insensitive filesystem */
public final class C3480a implements C3481b {

    /* renamed from: c  reason: collision with root package name */
    private static final C0668a f43174c = new C0668a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private volatile int f43175a = -1;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f43176b;

    /* renamed from: d8.a$a  reason: collision with other inner class name */
    private static final class C0668a {
        public /* synthetic */ C0668a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0668a() {
        }
    }

    private final void c() {
        ViewParent viewParent = this.f43176b;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
        }
        this.f43176b = null;
    }

    public boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
        C6496s.h(viewGroup, "view");
        C6496s.h(motionEvent, "event");
        int i10 = this.f43175a;
        if (i10 == -1 || motionEvent.getAction() == 1 || viewGroup.getId() != i10) {
            return false;
        }
        return true;
    }

    public final void b() {
        this.f43175a = -1;
        c();
    }

    public final void d(int i10, ViewParent viewParent) {
        this.f43175a = i10;
        c();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.f43176b = viewParent;
        }
    }
}
