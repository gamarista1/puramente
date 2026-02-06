package com.facebook;

import P5.a;
import P5.f;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.core.content.c;
import androidx.fragment.app.C1769q;
import g.C2003f;
import kotlin.jvm.internal.C6496s;
import o7.B;
import t5.C4021N;
import t7.C4049a;

/* renamed from: com.facebook.q  reason: case insensitive filesystem */
public abstract class C3327q extends Button {

    /* renamed from: a  reason: collision with root package name */
    private final String f40204a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40205b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnClickListener f40206c;

    /* renamed from: d  reason: collision with root package name */
    private View.OnClickListener f40207d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f40208e;

    /* renamed from: f  reason: collision with root package name */
    private int f40209f;

    /* renamed from: g  reason: collision with root package name */
    private int f40210g;

    /* renamed from: h  reason: collision with root package name */
    private B f40211h;

    /* renamed from: i  reason: collision with root package name */
    private final int f40212i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C3327q(Context context, AttributeSet attributeSet, int i10, int i11, String str, String str2) {
        super(context, attributeSet, 0);
        C6496s.h(context, "context");
        C6496s.h(str, "analyticsButtonCreatedEventName");
        C6496s.h(str2, "analyticsButtonTappedEventName");
        i11 = i11 == 0 ? getDefaultStyleResource() : i11;
        c(context, attributeSet, i10, i11 == 0 ? f.f33486c : i11);
        this.f40204a = str;
        this.f40205b = str2;
        setClickable(true);
        setFocusable(true);
    }

    private final void g(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes;
        if (!C4049a.d(this)) {
            try {
                if (!isInEditMode()) {
                    obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842964}, i10, i11);
                    C6496s.g(obtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
                    if (obtainStyledAttributes.hasValue(0)) {
                        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                        if (resourceId != 0) {
                            setBackgroundResource(resourceId);
                        } else {
                            setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                        }
                    } else {
                        setBackgroundColor(c.getColor(context, a.f33464a));
                    }
                    obtainStyledAttributes.recycle();
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final void h(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes;
        if (!C4049a.d(this)) {
            try {
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843119, 16843117, 16843120, 16843118, 16843121}, i10, i11);
                C6496s.g(obtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
                setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), obtainStyledAttributes.getResourceId(2, 0), obtainStyledAttributes.getResourceId(3, 0));
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
                obtainStyledAttributes.recycle();
                setCompoundDrawablePadding(dimensionPixelSize);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final void i(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes;
        if (!C4049a.d(this)) {
            try {
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842966, 16842967, 16842968, 16842969}, i10, i11);
                C6496s.g(obtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
                setPadding(obtainStyledAttributes.getDimensionPixelSize(0, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getDimensionPixelSize(3, 0));
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final void j(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes;
        TypedArray obtainStyledAttributes2;
        TypedArray obtainStyledAttributes3;
        if (!C4049a.d(this)) {
            try {
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842904}, i10, i11);
                C6496s.g(obtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
                setTextColor(obtainStyledAttributes.getColorStateList(0));
                obtainStyledAttributes.recycle();
                obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842927}, i10, i11);
                C6496s.g(obtainStyledAttributes2, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
                int i12 = obtainStyledAttributes2.getInt(0, 17);
                obtainStyledAttributes2.recycle();
                setGravity(i12);
                obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842901, 16842903, 16843087}, i10, i11);
                C6496s.g(obtainStyledAttributes3, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
                setTextSize(0, (float) obtainStyledAttributes3.getDimensionPixelSize(0, 0));
                setTypeface(Typeface.create(getTypeface(), 1));
                String string = obtainStyledAttributes3.getString(2);
                obtainStyledAttributes3.recycle();
                setText(string);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final void k() {
        if (!C4049a.d(this)) {
            try {
                super.setOnClickListener(new C3326p(this));
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void l(C3327q qVar, View view) {
        Class<C3327q> cls = C3327q.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(qVar, "this$0");
                qVar.e(qVar.getContext());
                View.OnClickListener onClickListener = qVar.f40207d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                View.OnClickListener onClickListener2 = qVar.f40206c;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(View view) {
        if (!C4049a.d(this)) {
            try {
                View.OnClickListener onClickListener = this.f40206c;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(context, "context");
                g(context, attributeSet, i10, i11);
                h(context, attributeSet, i10, i11);
                i(context, attributeSet, i10, i11);
                j(context, attributeSet, i10, i11);
                k();
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void d(Context context) {
        if (!C4049a.d(this)) {
            try {
                C4021N.f48172b.a(context, (String) null).f(this.f40204a);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void e(Context context) {
        if (!C4049a.d(this)) {
            try {
                C4021N.f48172b.a(context, (String) null).f(this.f40205b);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int f(String str) {
        if (C4049a.d(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil((double) getPaint().measureText(str));
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public Activity getActivity() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new C3459v("Unable to get Activity.");
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String getAnalyticsButtonCreatedEventName() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return this.f40204a;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String getAnalyticsButtonTappedEventName() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return this.f40205b;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final C2003f getAndroidxActivityResultRegistryOwner() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            Activity activity = getActivity();
            if (activity instanceof C2003f) {
                return (C2003f) activity;
            }
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public int getCompoundPaddingLeft() {
        if (C4049a.d(this)) {
            return 0;
        }
        try {
            if (this.f40208e) {
                return this.f40209f;
            }
            return super.getCompoundPaddingLeft();
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return 0;
        }
    }

    public int getCompoundPaddingRight() {
        if (C4049a.d(this)) {
            return 0;
        }
        try {
            if (this.f40208e) {
                return this.f40210g;
            }
            return super.getCompoundPaddingRight();
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public abstract int getDefaultRequestCode();

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        if (C4049a.d(this)) {
            return 0;
        }
        try {
            return this.f40212i;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return 0;
        }
    }

    public final C1769q getFragment() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            B b10 = this.f40211h;
            if (b10 != null) {
                return b10.c();
            }
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final Fragment getNativeFragment() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            B b10 = this.f40211h;
            if (b10 != null) {
                return b10.b();
            }
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public int getRequestCode() {
        if (C4049a.d(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        if (!C4049a.d(this)) {
            try {
                super.onAttachedToWindow();
                if (!isInEditMode()) {
                    d(getContext());
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(canvas, "canvas");
                if ((getGravity() & 1) != 0) {
                    int compoundPaddingLeft = getCompoundPaddingLeft();
                    int compoundPaddingRight = getCompoundPaddingRight();
                    int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - f(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                    this.f40209f = compoundPaddingLeft - min;
                    this.f40210g = compoundPaddingRight + min;
                    this.f40208e = true;
                }
                super.onDraw(canvas);
                this.f40208e = false;
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void setFragment(Fragment fragment) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(fragment, "fragment");
                this.f40211h = new B(fragment);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setInternalOnClickListener(View.OnClickListener onClickListener) {
        if (!C4049a.d(this)) {
            try {
                this.f40207d = onClickListener;
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (!C4049a.d(this)) {
            try {
                this.f40206c = onClickListener;
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void setFragment(C1769q qVar) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(qVar, "fragment");
                this.f40211h = new B(qVar);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }
}
