package com.facebook.react.views.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.Animation;
import com.facebook.react.C3367m;
import com.facebook.react.W;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.A;
import com.facebook.react.uimanager.C3400a;
import com.facebook.react.uimanager.C3401a0;
import com.facebook.react.uimanager.C3406d;
import com.facebook.react.uimanager.C3430x;
import com.facebook.react.uimanager.C3431y;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.K;
import com.facebook.react.uimanager.L;
import com.facebook.react.uimanager.P;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.v0;
import d8.C3481b;
import d8.C3482c;
import d8.C3483d;
import f8.C3519a;
import j8.d;
import j8.f;
import j8.m;
import j8.o;
import java.util.HashSet;
import java.util.Set;
import n7.C3863a;

public class e extends ViewGroup implements C3483d, K, Q, C3482c, C3401a0, P {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final ViewGroup.LayoutParams sDefaultLayoutParam = new ViewGroup.LayoutParams(0, 0);
    private View[] mAllChildren;
    private int mAllChildrenCount;
    private float mBackfaceOpacity;
    private String mBackfaceVisibility;
    private b mChildrenLayoutChangeListener;
    private Set<Integer> mChildrenRemovedWhileTransitioning;
    private Rect mClippingRect;
    private v0 mDrawingOrderHelper;
    private Rect mHitSlopRect;
    private boolean mNeedsOffscreenAlphaCompositing;
    private C3481b mOnInterceptTouchEventListener;
    private o mOverflow;
    private final Rect mOverflowInset = new Rect();
    private H mPointerEvents = H.AUTO;
    private int mRecycleCount = 0;
    private boolean mRemoveClippedSubviews;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f42340a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                j8.o[] r0 = j8.o.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42340a = r0
                j8.o r1 = j8.o.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42340a     // Catch:{ NoSuchFieldError -> 0x001d }
                j8.o r1 = j8.o.SCROLL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42340a     // Catch:{ NoSuchFieldError -> 0x0028 }
                j8.o r1 = j8.o.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.e.a.<clinit>():void");
        }
    }

    private static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private e f42341a;

        public void a() {
            this.f42341a = null;
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            e eVar = this.f42341a;
            if (eVar != null && eVar.getRemoveClippedSubviews()) {
                this.f42341a.k(view);
            }
        }

        private b(e eVar) {
            this.f42341a = eVar;
        }
    }

    public e(Context context) {
        super(context);
        e();
    }

    private void b(View view, int i10) {
        View[] viewArr = (View[]) C3863a.c(this.mAllChildren);
        int i11 = this.mAllChildrenCount;
        int length = viewArr.length;
        if (i10 == i11) {
            if (length == i11) {
                View[] viewArr2 = new View[(length + 12)];
                this.mAllChildren = viewArr2;
                System.arraycopy(viewArr, 0, viewArr2, 0, length);
                viewArr = this.mAllChildren;
            }
            int i12 = this.mAllChildrenCount;
            this.mAllChildrenCount = i12 + 1;
            viewArr[i12] = view;
        } else if (i10 < i11) {
            if (length == i11) {
                View[] viewArr3 = new View[(length + 12)];
                this.mAllChildren = viewArr3;
                System.arraycopy(viewArr, 0, viewArr3, 0, i10);
                System.arraycopy(viewArr, i10, this.mAllChildren, i10 + 1, i11 - i10);
                viewArr = this.mAllChildren;
            } else {
                System.arraycopy(viewArr, i10, viewArr, i10 + 1, i11 - i10);
            }
            viewArr[i10] = view;
            this.mAllChildrenCount++;
        } else {
            throw new IndexOutOfBoundsException("index=" + i10 + " count=" + i11);
        }
    }

    private boolean c() {
        if (getId() != -1 && C3519a.a(getId()) == 2) {
            return true;
        }
        return false;
    }

    private int d(View view) {
        int i10 = this.mAllChildrenCount;
        View[] viewArr = (View[]) C3863a.c(this.mAllChildren);
        for (int i11 = 0; i11 < i10; i11++) {
            if (viewArr[i11] == view) {
                return i11;
            }
        }
        return -1;
    }

    private void e() {
        setClipChildren(false);
        this.mRemoveClippedSubviews = false;
        this.mAllChildren = null;
        this.mAllChildrenCount = 0;
        this.mClippingRect = null;
        this.mHitSlopRect = null;
        this.mOverflow = o.VISIBLE;
        this.mPointerEvents = H.AUTO;
        this.mChildrenLayoutChangeListener = null;
        this.mOnInterceptTouchEventListener = null;
        this.mNeedsOffscreenAlphaCompositing = false;
        this.mDrawingOrderHelper = null;
        this.mBackfaceOpacity = 1.0f;
        this.mBackfaceVisibility = "visible";
        this.mChildrenRemovedWhileTransitioning = null;
    }

    private boolean f(View view) {
        if (view.getParent() == null) {
            return true;
        }
        return false;
    }

    private void g(int i10) {
        View[] viewArr = (View[]) C3863a.c(this.mAllChildren);
        int i11 = this.mAllChildrenCount;
        if (i10 == i11 - 1) {
            int i12 = i11 - 1;
            this.mAllChildrenCount = i12;
            viewArr[i12] = null;
        } else if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        } else {
            System.arraycopy(viewArr, i10 + 1, viewArr, i10, (i11 - i10) - 1);
            int i13 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i13;
            viewArr[i13] = null;
        }
    }

    private v0 getDrawingOrderHelper() {
        if (this.mDrawingOrderHelper == null) {
            this.mDrawingOrderHelper = new v0(this);
        }
        return this.mDrawingOrderHelper;
    }

    private void h(int i10) {
        if (this.mChildrenRemovedWhileTransitioning == null) {
            this.mChildrenRemovedWhileTransitioning = new HashSet();
        }
        this.mChildrenRemovedWhileTransitioning.add(Integer.valueOf(i10));
    }

    private void i(Rect rect) {
        C3863a.c(this.mAllChildren);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.mAllChildrenCount) {
            try {
                j(rect, i10, i11);
                if (f(this.mAllChildren[i10])) {
                    i11++;
                }
                i10++;
            } catch (IndexOutOfBoundsException e10) {
                throw new IllegalStateException("Invalid clipping state. i=" + i10 + " clippedSoFar=" + i11 + " count=" + getChildCount() + " allChildrenCount=" + this.mAllChildrenCount + " recycleCount=" + this.mRecycleCount, e10);
            }
        }
    }

    private void j(Rect rect, int i10, int i11) {
        boolean z10;
        UiThreadUtil.assertOnUiThread();
        View view = ((View[]) C3863a.c(this.mAllChildren))[i10];
        boolean intersects = rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        Animation animation = view.getAnimation();
        if (animation == null || animation.hasEnded()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!intersects && !f(view) && !z10) {
            removeViewInLayout(view);
        } else if (intersects && f(view)) {
            addViewInLayout(view, i10 - i11, sDefaultLayoutParam, true);
            invalidate();
        } else if (!intersects) {
            return;
        }
        if (view instanceof K) {
            K k10 = (K) view;
            if (k10.getRemoveClippedSubviews()) {
                k10.updateClippingRect();
            }
        }
    }

    /* access modifiers changed from: private */
    public void k(View view) {
        if (this.mRemoveClippedSubviews && getParent() != null) {
            C3863a.c(this.mClippingRect);
            C3863a.c(this.mAllChildren);
            if (this.mClippingRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) != (!f(view))) {
                int i10 = 0;
                for (int i11 = 0; i11 < this.mAllChildrenCount; i11++) {
                    View view2 = this.mAllChildren[i11];
                    if (view2 == view) {
                        j(this.mClippingRect, i11, i10);
                        return;
                    }
                    if (f(view2)) {
                        i10++;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void addViewWithSubviewClippingEnabled(View view, int i10) {
        addViewWithSubviewClippingEnabled(view, i10, sDefaultLayoutParam);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (!(this.mOverflow == o.VISIBLE && getTag(C3367m.f40938n) == null)) {
            C3400a.a(this, canvas);
        }
        super.dispatchDraw(canvas);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!H.c(this.mPointerEvents)) {
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException e10) {
            U5.a.n("ReactNative", "NullPointerException when executing dispatchProvideStructure", e10);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchSetPressed(boolean z10) {
    }

    public void draw(Canvas canvas) {
        if (Build.VERSION.SDK_INT < 29 || C3519a.c(this) != 2 || !C3406d.a(this)) {
            super.draw(canvas);
            return;
        }
        Rect overflowInset = getOverflowInset();
        canvas.saveLayer((float) overflowInset.left, (float) overflowInset.top, (float) (getWidth() + (-overflowInset.right)), (float) (getHeight() + (-overflowInset.bottom)), (Paint) null);
        super.draw(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        BlendMode blendMode;
        if (view.getElevation() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a.a(canvas, true);
        }
        if (Build.VERSION.SDK_INT < 29 || !C3406d.a(this)) {
            blendMode = null;
        } else {
            blendMode = W.a(view.getTag(C3367m.f40942r));
            if (blendMode != null) {
                Paint paint = new Paint();
                paint.setBlendMode(blendMode);
                Rect overflowInset = getOverflowInset();
                canvas.saveLayer((float) overflowInset.left, (float) overflowInset.top, (float) (getWidth() + (-overflowInset.right)), (float) (getHeight() + (-overflowInset.bottom)), paint);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (blendMode != null) {
            canvas.restore();
        }
        if (z10) {
            a.a(canvas, false);
        }
        return drawChild;
    }

    public void endViewTransition(View view) {
        super.endViewTransition(view);
        Set<Integer> set = this.mChildrenRemovedWhileTransitioning;
        if (set != null) {
            set.remove(Integer.valueOf(view.getId()));
        }
    }

    /* access modifiers changed from: package-private */
    public int getAllChildrenCount() {
        return this.mAllChildrenCount;
    }

    /* access modifiers changed from: package-private */
    public View getChildAtWithSubviewClippingEnabled(int i10) {
        if (i10 < 0 || i10 >= this.mAllChildrenCount) {
            return null;
        }
        return ((View[]) C3863a.c(this.mAllChildren))[i10];
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i10, int i11) {
        UiThreadUtil.assertOnUiThread();
        if (!c()) {
            return getDrawingOrderHelper().a(i10, i11);
        }
        return i11;
    }

    public void getClippingRect(Rect rect) {
        rect.set((Rect) C3863a.f(this.mClippingRect, "Fix in Kotlin"));
    }

    public Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    public String getOverflow() {
        int i10 = a.f42340a[this.mOverflow.ordinal()];
        if (i10 == 1) {
            return "hidden";
        }
        if (i10 == 2) {
            return "scroll";
        }
        if (i10 != 3) {
            return null;
        }
        return "visible";
    }

    public Rect getOverflowInset() {
        return this.mOverflowInset;
    }

    public H getPointerEvents() {
        return this.mPointerEvents;
    }

    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    public int getZIndexMappedChildIndex(int i10) {
        UiThreadUtil.assertOnUiThread();
        if (c() || !getDrawingOrderHelper().d()) {
            return i10;
        }
        return getDrawingOrderHelper().a(getChildCount(), i10);
    }

    public boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (ReactFeatureFlags.dispatchPointerEvents) {
            return H.b(this.mPointerEvents);
        }
        return super.onHoverEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C3481b bVar = this.mOnInterceptTouchEventListener;
        if ((bVar == null || !bVar.a(this, motionEvent)) && H.c(this.mPointerEvents)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        A.a(i10, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!H.b(this.mPointerEvents)) {
            return false;
        }
        return true;
    }

    public void onViewAdded(View view) {
        UiThreadUtil.assertOnUiThread();
        if (!c()) {
            getDrawingOrderHelper().b(view);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        } else {
            setChildrenDrawingOrderEnabled(false);
        }
        super.onViewAdded(view);
    }

    public void onViewRemoved(View view) {
        UiThreadUtil.assertOnUiThread();
        if (c()) {
            setChildrenDrawingOrderEnabled(false);
        } else if (indexOfChild(view) != -1) {
            getDrawingOrderHelper().c(view);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        } else {
            return;
        }
        if (view.getParent() != null) {
            h(view.getId());
        }
        super.onViewRemoved(view);
    }

    /* access modifiers changed from: package-private */
    public void recycleView() {
        b bVar;
        this.mRecycleCount++;
        if (!(this.mAllChildren == null || (bVar = this.mChildrenLayoutChangeListener) == null)) {
            bVar.a();
            for (int i10 = 0; i10 < this.mAllChildrenCount; i10++) {
                this.mAllChildren[i10].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
        }
        e();
        this.mOverflowInset.setEmpty();
        removeAllViews();
        updateBackgroundDrawable((Drawable) null);
        resetPointerEvents();
    }

    /* access modifiers changed from: package-private */
    public void removeAllViewsWithSubviewClippingEnabled() {
        C3863a.a(this.mRemoveClippedSubviews);
        View[] viewArr = (View[]) C3863a.c(this.mAllChildren);
        for (int i10 = 0; i10 < this.mAllChildrenCount; i10++) {
            viewArr[i10].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        removeAllViewsInLayout();
        this.mAllChildrenCount = 0;
    }

    /* access modifiers changed from: package-private */
    public void removeViewWithSubviewClippingEnabled(View view) {
        UiThreadUtil.assertOnUiThread();
        C3863a.a(this.mRemoveClippedSubviews);
        C3863a.c(this.mClippingRect);
        View[] viewArr = (View[]) C3863a.c(this.mAllChildren);
        view.removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        int d10 = d(view);
        if (!f(viewArr[d10])) {
            int i10 = 0;
            for (int i11 = 0; i11 < d10; i11++) {
                if (f(viewArr[i11])) {
                    i10++;
                }
            }
            removeViewsInLayout(d10 - i10, 1);
            invalidate();
        }
        g(d10);
    }

    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    /* access modifiers changed from: package-private */
    public void resetPointerEvents() {
        this.mPointerEvents = H.AUTO;
    }

    public void setBackfaceVisibility(String str) {
        this.mBackfaceVisibility = str;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setBackfaceVisibilityDependantOpacity() {
        if (this.mBackfaceVisibility.equals("visible")) {
            setAlpha(this.mBackfaceOpacity);
            return;
        }
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        if (rotationX < -90.0f || rotationX >= 90.0f || rotationY < -90.0f || rotationY >= 90.0f) {
            setAlpha(0.0f);
        } else {
            setAlpha(this.mBackfaceOpacity);
        }
    }

    public void setBackgroundColor(int i10) {
        C3400a.o(this, Integer.valueOf(i10));
    }

    public void setBorderColor(int i10, Integer num) {
        C3400a.q(this, m.values()[i10], num);
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setBorderRadius(float f10) {
        setBorderRadius(f10, d.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        f fVar;
        if (str == null) {
            fVar = null;
        } else {
            fVar = f.b(str);
        }
        C3400a.s(this, fVar);
    }

    public void setBorderWidth(int i10, float f10) {
        C3400a.t(this, m.values()[i10], Float.valueOf(G.f(f10)));
    }

    public void setHitSlopRect(Rect rect) {
        this.mHitSlopRect = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z10) {
        this.mNeedsOffscreenAlphaCompositing = z10;
    }

    public void setOnInterceptTouchEventListener(C3481b bVar) {
        this.mOnInterceptTouchEventListener = bVar;
    }

    public void setOpacityIfPossible(float f10) {
        this.mBackfaceOpacity = f10;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.mOverflow = o.VISIBLE;
        } else {
            o b10 = o.b(str);
            if (b10 == null) {
                b10 = o.VISIBLE;
            }
            this.mOverflow = b10;
        }
        invalidate();
    }

    public void setOverflowInset(int i10, int i11, int i12, int i13) {
        if (C3406d.a(this)) {
            Rect rect = this.mOverflowInset;
            if (!(rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13)) {
                invalidate();
            }
        }
        this.mOverflowInset.set(i10, i11, i12, i13);
    }

    public void setPointerEvents(H h10) {
        this.mPointerEvents = h10;
    }

    public void setRemoveClippedSubviews(boolean z10) {
        if (z10 != this.mRemoveClippedSubviews) {
            this.mRemoveClippedSubviews = z10;
            this.mChildrenRemovedWhileTransitioning = null;
            if (z10) {
                Rect rect = new Rect();
                this.mClippingRect = rect;
                L.a(this, rect);
                int childCount = getChildCount();
                this.mAllChildrenCount = childCount;
                this.mAllChildren = new View[Math.max(12, childCount)];
                this.mChildrenLayoutChangeListener = new b();
                for (int i10 = 0; i10 < this.mAllChildrenCount; i10++) {
                    View childAt = getChildAt(i10);
                    this.mAllChildren[i10] = childAt;
                    childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
                }
                updateClippingRect();
                return;
            }
            C3863a.c(this.mClippingRect);
            C3863a.c(this.mAllChildren);
            C3863a.c(this.mChildrenLayoutChangeListener);
            for (int i11 = 0; i11 < this.mAllChildrenCount; i11++) {
                this.mAllChildren[i11].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
            getDrawingRect(this.mClippingRect);
            i(this.mClippingRect);
            this.mAllChildren = null;
            this.mClippingRect = null;
            this.mAllChildrenCount = 0;
            this.mChildrenLayoutChangeListener = null;
        }
    }

    @Deprecated(forRemoval = true, since = "0.76.0")
    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        C3400a.w(this, drawable);
    }

    /* access modifiers changed from: package-private */
    public void updateBackgroundDrawable(Drawable drawable) {
        super.setBackground(drawable);
    }

    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            C3863a.c(this.mClippingRect);
            C3863a.c(this.mAllChildren);
            L.a(this, this.mClippingRect);
            i(this.mClippingRect);
        }
    }

    public void updateDrawingOrder() {
        if (!c()) {
            getDrawingOrderHelper().e();
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public void addViewWithSubviewClippingEnabled(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        C3863a.a(this.mRemoveClippedSubviews);
        b(view, i10);
        Rect rect = (Rect) C3863a.c(this.mClippingRect);
        View[] viewArr = (View[]) C3863a.c(this.mAllChildren);
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (f(viewArr[i12])) {
                i11++;
            }
        }
        j(rect, i10, i11);
        view.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setBorderRadius(float f10, int i10) {
        C3430x xVar;
        if (Float.isNaN(f10)) {
            xVar = null;
        } else {
            xVar = new C3430x(f10, C3431y.POINT);
        }
        C3400a.r(this, d.values()[i10], xVar);
    }

    public void setBorderRadius(d dVar, C3430x xVar) {
        C3400a.r(this, dVar, xVar);
    }
}
