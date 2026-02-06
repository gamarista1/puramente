package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class f {

    /* renamed from: a  reason: collision with root package name */
    boolean f18329a = true;

    /* renamed from: b  reason: collision with root package name */
    int f18330b;

    /* renamed from: c  reason: collision with root package name */
    int f18331c;

    /* renamed from: d  reason: collision with root package name */
    int f18332d;

    /* renamed from: e  reason: collision with root package name */
    int f18333e;

    /* renamed from: f  reason: collision with root package name */
    int f18334f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f18335g = 0;

    /* renamed from: h  reason: collision with root package name */
    boolean f18336h;

    /* renamed from: i  reason: collision with root package name */
    boolean f18337i;

    f() {
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.B b10) {
        int i10 = this.f18331c;
        if (i10 < 0 || i10 >= b10.b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public View b(RecyclerView.w wVar) {
        View o10 = wVar.o(this.f18331c);
        this.f18331c += this.f18332d;
        return o10;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f18330b + ", mCurrentPosition=" + this.f18331c + ", mItemDirection=" + this.f18332d + ", mLayoutDirection=" + this.f18333e + ", mStartLine=" + this.f18334f + ", mEndLine=" + this.f18335g + '}';
    }
}
