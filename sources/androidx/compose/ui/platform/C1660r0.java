package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import k0.m;
import kotlin.jvm.internal.C6496s;
import r0.C2448H;
import r0.C2520p0;

/* renamed from: androidx.compose.ui.platform.r0  reason: case insensitive filesystem */
public class C1660r0 extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private boolean f13937a;

    public C1660r0(Context context) {
        super(context);
        setClipChildren(false);
        setTag(m.f23101J, Boolean.TRUE);
    }

    public final void a(C2520p0 p0Var, View view, long j10) {
        super.drawChild(C2448H.d(p0Var), view, j10);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            C6496s.f(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((w1) childAt).u()) {
                this.f13937a = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f13937a = false;
                }
            } else {
                i10++;
            }
        }
    }

    public int getChildCount() {
        if (this.f13937a) {
            return super.getChildCount();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void requestLayout() {
    }
}
