package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1680b0;
import androidx.core.view.C1700l0;
import androidx.core.view.C1702m0;
import i.C2037a;
import i.j;

/* renamed from: androidx.appcompat.widget.a  reason: case insensitive filesystem */
abstract class C1562a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    protected final C0213a f11759a = new C0213a();

    /* renamed from: b  reason: collision with root package name */
    protected final Context f11760b;

    /* renamed from: c  reason: collision with root package name */
    protected ActionMenuView f11761c;

    /* renamed from: d  reason: collision with root package name */
    protected C1564c f11762d;

    /* renamed from: e  reason: collision with root package name */
    protected int f11763e;

    /* renamed from: f  reason: collision with root package name */
    protected C1700l0 f11764f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11765g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11766h;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    protected class C0213a implements C1702m0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f11767a = false;

        /* renamed from: b  reason: collision with root package name */
        int f11768b;

        protected C0213a() {
        }

        public void a(View view) {
            this.f11767a = true;
        }

        public void b(View view) {
            if (!this.f11767a) {
                C1562a aVar = C1562a.this;
                aVar.f11764f = null;
                C1562a.super.setVisibility(this.f11768b);
            }
        }

        public void c(View view) {
            C1562a.super.setVisibility(0);
            this.f11767a = false;
        }

        public C0213a d(C1700l0 l0Var, int i10) {
            C1562a.this.f11764f = l0Var;
            this.f11768b = i10;
            return this;
        }
    }

    C1562a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C2037a.f21258a, typedValue, true) || typedValue.resourceId == 0) {
            this.f11760b = context;
        } else {
            this.f11760b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    /* access modifiers changed from: protected */
    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    /* access modifiers changed from: protected */
    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        if (z10) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public C1700l0 f(int i10, long j10) {
        C1700l0 l0Var = this.f11764f;
        if (l0Var != null) {
            l0Var.c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C1700l0 b10 = C1680b0.e(this).b(1.0f);
            b10.f(j10);
            b10.h(this.f11759a.d(b10, i10));
            return b10;
        }
        C1700l0 b11 = C1680b0.e(this).b(0.0f);
        b11.f(j10);
        b11.h(this.f11759a.d(b11, i10));
        return b11;
    }

    public int getAnimatedVisibility() {
        if (this.f11764f != null) {
            return this.f11759a.f11768b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f11763e;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, j.f21554a, C2037a.f21260c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.f21599j, 0));
        obtainStyledAttributes.recycle();
        C1564c cVar = this.f11762d;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f11766h = false;
        }
        if (!this.f11766h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f11766h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f11766h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f11765g = false;
        }
        if (!this.f11765g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f11765g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f11765g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C1700l0 l0Var = this.f11764f;
            if (l0Var != null) {
                l0Var.c();
            }
            super.setVisibility(i10);
        }
    }
}
