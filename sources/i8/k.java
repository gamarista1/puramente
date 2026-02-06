package i8;

import android.view.View;
import android.view.animation.Animation;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class k extends C3596a {

    /* renamed from: f  reason: collision with root package name */
    private static final a f44333f = new a((DefaultConstructorMarker) null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: g */
    public Animation b(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        C6496s.h(view, "view");
        boolean z11 = true;
        if (((int) view.getX()) == i10 && ((int) view.getY()) == i11) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (view.getWidth() == i12 && view.getHeight() == i13) {
            z11 = false;
        }
        if (z10 || z11) {
            return new m(view, i10, i11, i12, i13);
        }
        return null;
    }

    /* renamed from: h */
    public boolean e() {
        if (this.f44303d > 0) {
            return true;
        }
        return false;
    }
}
