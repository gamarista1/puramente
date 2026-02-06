package androidx.fragment.app;

import S1.c;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C1680b0;
import androidx.core.view.D0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0010B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010\u0011J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010\u0011J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020&H\u0001¢\u0006\u0004\b-\u0010.J)\u00102\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b6\u0010\u0011J\u0017\u00107\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b7\u0010\u0011J\u001f\u0010:\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b=\u0010>J\u0019\u0010A\u001a\u00028\u0000\"\n\b\u0000\u0010@*\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\r0C8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\r0C8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u0018\u0010J\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010,\u001a\u00020&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006M"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/J;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/J;)V", "Landroid/view/View;", "v", "Llf/M;", "a", "(Landroid/view/View;)V", "Landroid/animation/LayoutTransition;", "transition", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "dispatchApplyWindowInsets", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "child", "", "drawingTime", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "view", "startViewTransition", "endViewTransition", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "removeViewAt", "(I)V", "removeViewInLayout", "removeView", "start", "count", "removeViews", "(II)V", "removeViewsInLayout", "removeAllViewsInLayout", "()V", "Landroidx/fragment/app/q;", "F", "getFragment", "()Landroidx/fragment/app/q;", "", "Ljava/util/List;", "disappearingFragmentChildren", "b", "transitioningFragmentViews", "c", "Landroid/view/View$OnApplyWindowInsetsListener;", "applyWindowInsetsListener", "d", "Z", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final List f16697a;

    /* renamed from: b  reason: collision with root package name */
    private final List f16698b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f16699c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16700d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16701a = new a();

        private a() {
        }

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            C6496s.h(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            C6496s.h(view, "v");
            C6496s.h(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            C6496s.g(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C6496s.h(context, "context");
    }

    private final void a(View view) {
        if (this.f16698b.contains(view)) {
            this.f16697a.add(view);
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        C6496s.h(view, "child");
        if (J.F0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        D0 d02;
        C6496s.h(windowInsets, "insets");
        D0 y10 = D0.y(windowInsets);
        C6496s.g(y10, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f16699c;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f16701a;
            C6496s.e(onApplyWindowInsetsListener);
            d02 = D0.y(aVar.a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            d02 = C1680b0.a0(this, y10);
        }
        C6496s.g(d02, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!d02.p()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                C1680b0.g(getChildAt(i10), d02);
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        C6496s.h(canvas, "canvas");
        if (this.f16700d) {
            for (View drawChild : this.f16697a) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        C6496s.h(canvas, "canvas");
        C6496s.h(view, "child");
        if (!this.f16700d || this.f16697a.isEmpty() || !this.f16697a.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    public void endViewTransition(View view) {
        C6496s.h(view, "view");
        this.f16698b.remove(view);
        if (this.f16697a.remove(view)) {
            this.f16700d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends C1769q> F getFragment() {
        return J.n0(this).k0(getId());
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C6496s.h(windowInsets, "insets");
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                C6496s.g(childAt, "view");
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public void removeView(View view) {
        C6496s.h(view, "view");
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        C6496s.g(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    public void removeViewInLayout(View view) {
        C6496s.h(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            C6496s.g(childAt, "view");
            a(childAt);
        }
        super.removeViews(i10, i11);
    }

    public void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            C6496s.g(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f16700d = z10;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f16699c = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        C6496s.h(view, "view");
        if (view.getParent() == this) {
            this.f16698b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        String str;
        C6496s.h(context, "context");
        this.f16697a = new ArrayList();
        this.f16698b = new ArrayList();
        this.f16700d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = c.f5849e;
            C6496s.g(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(c.f5850f);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, J j10) {
        super(context, attributeSet);
        String str;
        C6496s.h(context, "context");
        C6496s.h(attributeSet, "attrs");
        C6496s.h(j10, "fm");
        this.f16697a = new ArrayList();
        this.f16698b = new ArrayList();
        this.f16700d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = c.f5849e;
        C6496s.g(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(c.f5850f) : classAttribute;
        String string = obtainStyledAttributes.getString(c.f5851g);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        C1769q k02 = j10.k0(id2);
        if (classAttribute != null && k02 == null) {
            if (id2 == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            C1769q a10 = j10.w0().a(context.getClassLoader(), classAttribute);
            C6496s.g(a10, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a10.mFragmentId = id2;
            a10.mContainerId = id2;
            a10.mTag = string;
            a10.mFragmentManager = j10;
            a10.mHost = j10.y0();
            a10.onInflate(context, attributeSet, (Bundle) null);
            j10.p().w(true).d(this, a10, string).k();
        }
        j10.e1(this);
    }
}
