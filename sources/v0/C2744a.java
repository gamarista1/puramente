package v0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import r0.C2448H;
import r0.C2520p0;
import r0.X1;

/* renamed from: v0.a  reason: case insensitive filesystem */
public abstract class C2744a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private boolean f26909a;

    public C2744a(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(X1.f25480a, Boolean.TRUE);
    }

    public final void a(C2520p0 p0Var, View view, long j10) {
        super.drawChild(C2448H.d(p0Var), view, j10);
    }

    public int getChildCount() {
        if (this.f26909a) {
            return super.getChildCount();
        }
        return 0;
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void forceLayout() {
    }

    public void requestLayout() {
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
