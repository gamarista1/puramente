package androidx.compose.ui.platform;

import G0.a;
import J0.G;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.viewinterop.c;
import java.util.HashMap;

/* renamed from: androidx.compose.ui.platform.b0  reason: case insensitive filesystem */
public final class C1617b0 extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap f13689a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f13690b = new HashMap();

    public C1617b0(Context context) {
        super(context);
        setClipChildren(false);
    }

    public final void a(c cVar, Canvas canvas) {
        cVar.draw(canvas);
    }

    public Void b(int[] iArr, Rect rect) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<c, G> getHolderToLayoutNode() {
        return this.f13689a;
    }

    public final HashMap<G, c> getLayoutNodeToHolder() {
        return this.f13690b;
    }

    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) b(iArr, rect);
    }

    public void onDescendantInvalidated(View view, View view2) {
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (c cVar : this.f13689a.keySet()) {
            cVar.layout(cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11 = false;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            a.a("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            z11 = true;
        }
        if (!z11) {
            a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        for (c v10 : this.f13689a.keySet()) {
            v10.v();
        }
    }

    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            G g10 = (G) this.f13689a.get(childAt);
            if (childAt.isLayoutRequested() && g10 != null) {
                G.w1(g10, false, false, false, 7, (Object) null);
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
