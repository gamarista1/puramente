package ya;

import Ha.C4296c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.B;
import com.google.android.gms.common.internal.Z;
import wa.d;

public final class i extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private int f62282a;

    /* renamed from: b  reason: collision with root package name */
    private int f62283b;

    /* renamed from: c  reason: collision with root package name */
    private View f62284c;

    /* renamed from: d  reason: collision with root package name */
    private View.OnClickListener f62285d;

    public i(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void b(Context context) {
        View view = this.f62284c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f62284c = Z.c(context, this.f62282a, this.f62283b);
        } catch (C4296c.a unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i10 = this.f62282a;
            int i11 = this.f62283b;
            B b10 = new B(context, (AttributeSet) null);
            b10.a(context.getResources(), i10, i11);
            this.f62284c = b10;
        }
        addView(this.f62284c);
        this.f62284c.setEnabled(isEnabled());
        this.f62284c.setOnClickListener(this);
    }

    public void a(int i10, int i11) {
        this.f62282a = i10;
        this.f62283b = i11;
        b(getContext());
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f62285d;
        if (onClickListener != null && view == this.f62284c) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i10) {
        a(this.f62282a, i10);
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f62284c.setEnabled(z10);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f62285d = onClickListener;
        View view = this.f62284c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        a(this.f62282a, this.f62283b);
    }

    public void setSize(int i10) {
        a(i10, this.f62283b);
    }

    public i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public i(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f62285d = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d.f62074b, 0, 0);
        try {
            this.f62282a = obtainStyledAttributes.getInt(d.f62075c, 0);
            this.f62283b = obtainStyledAttributes.getInt(d.f62076d, 2);
            obtainStyledAttributes.recycle();
            a(this.f62282a, this.f62283b);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
