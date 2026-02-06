package androidx.compose.ui.platform;

import J0.m0;
import Y.C1500m;
import Y.C1506p;
import Y.C1508q;
import Y.O0;
import Y.r;
import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import g0.c;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6787a;
import yf.p;

/* renamed from: androidx.compose.ui.platform.a  reason: case insensitive filesystem */
public abstract class C1613a extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<r> cachedViewTreeCompositionContext;
    private C1508q composition;
    private boolean creatingComposition;
    private C6787a disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private r parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    /* renamed from: androidx.compose.ui.platform.a$a  reason: collision with other inner class name */
    static final class C0261a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1613a f13685a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0261a(C1613a aVar) {
            super(2);
            this.f13685a = aVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-656146368, i10, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:258)");
                }
                this.f13685a.Content(mVar, 0);
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1613a(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final r b(r rVar) {
        r rVar2;
        if (e(rVar)) {
            rVar2 = rVar;
        } else {
            rVar2 = null;
        }
        if (rVar2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(rVar2);
        }
        return rVar;
    }

    private final void c() {
        if (!this.creatingComposition) {
            throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
        }
    }

    /* JADX INFO: finally extract failed */
    private final void d() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = M1.c(this, f(), c.c(-656146368, true, new C0261a(this)));
                this.creatingComposition = false;
            } catch (Throwable th2) {
                this.creatingComposition = false;
                throw th2;
            }
        }
    }

    private final boolean e(r rVar) {
        if (!(rVar instanceof O0) || ((O0.d) ((O0) rVar).d0().getValue()).compareTo(O0.d.ShuttingDown) > 0) {
            return true;
        }
        return false;
    }

    private final r f() {
        r rVar;
        r rVar2;
        r rVar3 = this.parentContext;
        if (rVar3 != null) {
            return rVar3;
        }
        r d10 = I1.d(this);
        r rVar4 = null;
        if (d10 != null) {
            rVar = b(d10);
        } else {
            rVar = null;
        }
        if (rVar != null) {
            return rVar;
        }
        WeakReference<r> weakReference = this.cachedViewTreeCompositionContext;
        if (!(weakReference == null || (rVar2 = weakReference.get()) == null || !e(rVar2))) {
            rVar4 = rVar2;
        }
        r rVar5 = rVar4;
        if (rVar5 == null) {
            return b(I1.h(this));
        }
        return rVar5;
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(r rVar) {
        if (this.parentContext != rVar) {
            this.parentContext = rVar;
            if (rVar != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            C1508q qVar = this.composition;
            if (qVar != null) {
                qVar.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    public abstract void Content(C1500m mVar, int i10);

    public void addView(View view) {
        c();
        super.addView(view);
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void createComposition() {
        if (this.parentContext != null || isAttachedToWindow()) {
            d();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
    }

    public final void disposeComposition() {
        C1508q qVar = this.composition;
        if (qVar != null) {
            qVar.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        if (this.composition != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public boolean isTransitionGroup() {
        if (!this.isTransitionGroupSet || super.isTransitionGroup()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            d();
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        internalOnLayout$ui_release(z10, i10, i11, i12, i13);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i10, int i11) {
        d();
        internalOnMeasure$ui_release(i10, i11);
    }

    public void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i10);
        }
    }

    public final void setParentCompositionContext(r rVar) {
        setParentContext(rVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.showLayoutBounds = z10;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((m0) childAt).setShowLayoutBounds(z10);
        }
    }

    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(t1 t1Var) {
        C6787a aVar = this.disposeViewCompositionStrategy;
        if (aVar != null) {
            aVar.invoke();
        }
        this.disposeViewCompositionStrategy = t1Var.a(this);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public C1613a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        this.disposeViewCompositionStrategy = t1.f13953a.a().a(this);
    }

    public void addView(View view, int i10) {
        c();
        super.addView(view, i10);
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        c();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    public void addView(View view, int i10, int i11) {
        c();
        super.addView(view, i10, i11);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i10, layoutParams);
    }
}
