package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.a;
import i.C2042f;
import i.j;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f11414a;

    /* renamed from: b  reason: collision with root package name */
    private View f11415b;

    /* renamed from: c  reason: collision with root package name */
    private View f11416c;

    /* renamed from: d  reason: collision with root package name */
    private View f11417d;

    /* renamed from: e  reason: collision with root package name */
    Drawable f11418e;

    /* renamed from: f  reason: collision with root package name */
    Drawable f11419f;

    /* renamed from: g  reason: collision with root package name */
    Drawable f11420g;

    /* renamed from: h  reason: collision with root package name */
    boolean f11421h;

    /* renamed from: i  reason: collision with root package name */
    boolean f11422i;

    /* renamed from: j  reason: collision with root package name */
    private int f11423j;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1563b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f21554a);
        this.f11418e = obtainStyledAttributes.getDrawable(j.f21559b);
        this.f11419f = obtainStyledAttributes.getDrawable(j.f21569d);
        this.f11423j = obtainStyledAttributes.getDimensionPixelSize(j.f21599j, -1);
        boolean z10 = true;
        if (getId() == C2042f.f21359I) {
            this.f11421h = true;
            this.f11420g = obtainStyledAttributes.getDrawable(j.f21564c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f11421h ? !(this.f11418e == null && this.f11419f == null) : this.f11420g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f11418e;
        if (drawable != null && drawable.isStateful()) {
            this.f11418e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f11419f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f11419f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f11420g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f11420g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f11415b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f11418e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f11419f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f11420g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f11416c = findViewById(C2042f.f21368a);
        this.f11417d = findViewById(C2042f.f21374g);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f11414a || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f11415b
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f11421h
            if (r6 == 0) goto L_0x004b
            android.graphics.drawable.Drawable r5 = r4.f11420g
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00be
        L_0x0048:
            r9 = r0
            goto L_0x00be
        L_0x004b:
            android.graphics.drawable.Drawable r6 = r4.f11418e
            if (r6 == 0) goto L_0x00a3
            android.view.View r6 = r4.f11416c
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0075
            android.graphics.drawable.Drawable r6 = r4.f11418e
            android.view.View r7 = r4.f11416c
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f11416c
            int r8 = r8.getTop()
            android.view.View r0 = r4.f11416c
            int r0 = r0.getRight()
            android.view.View r2 = r4.f11416c
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x0075:
            android.view.View r6 = r4.f11417d
            if (r6 == 0) goto L_0x009d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x009d
            android.graphics.drawable.Drawable r6 = r4.f11418e
            android.view.View r7 = r4.f11417d
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f11417d
            int r8 = r8.getTop()
            android.view.View r0 = r4.f11417d
            int r0 = r0.getRight()
            android.view.View r2 = r4.f11417d
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x009d:
            android.graphics.drawable.Drawable r6 = r4.f11418e
            r6.setBounds(r0, r0, r0, r0)
        L_0x00a2:
            r0 = r9
        L_0x00a3:
            r4.f11422i = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f11419f
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00be:
            if (r9 == 0) goto L_0x00c3
            r4.invalidate()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f11416c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i14 = this.f11423j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i14, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f11416c != null) {
            int mode = View.MeasureSpec.getMode(i11);
            View view = this.f11415b;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.f11416c)) {
                    i12 = a(this.f11416c);
                } else if (!b(this.f11417d)) {
                    i12 = a(this.f11417d);
                } else {
                    i12 = 0;
                }
                if (mode == Integer.MIN_VALUE) {
                    i13 = View.MeasureSpec.getSize(i11);
                } else {
                    i13 = a.e.API_PRIORITY_OTHER;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i12 + a(this.f11415b), i13));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f11418e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f11418e);
        }
        this.f11418e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f11416c;
            if (view != null) {
                this.f11418e.setBounds(view.getLeft(), this.f11416c.getTop(), this.f11416c.getRight(), this.f11416c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f11421h ? this.f11418e == null && this.f11419f == null : this.f11420g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f11420g;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f11420g);
        }
        this.f11420g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f11421h && (drawable2 = this.f11420g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f11421h ? this.f11418e == null && this.f11419f == null : this.f11420g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f11419f;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f11419f);
        }
        this.f11419f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f11422i && (drawable2 = this.f11419f) != null) {
                drawable2.setBounds(this.f11415b.getLeft(), this.f11415b.getTop(), this.f11415b.getRight(), this.f11415b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f11421h ? this.f11418e == null && this.f11419f == null : this.f11420g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(Z z10) {
        View view = this.f11415b;
        if (view != null) {
            removeView(view);
        }
        this.f11415b = z10;
    }

    public void setTransitioning(boolean z10) {
        int i10;
        this.f11414a = z10;
        if (z10) {
            i10 = 393216;
        } else {
            i10 = 262144;
        }
        setDescendantFocusability(i10);
    }

    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f11418e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f11419f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f11420g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if ((drawable != this.f11418e || this.f11421h) && ((drawable != this.f11419f || !this.f11422i) && ((drawable != this.f11420g || !this.f11421h) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
