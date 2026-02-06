package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    private static final C0648a f41916f = new C0648a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private Integer f41917a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f41918b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f41919c = true;

    /* renamed from: d  reason: collision with root package name */
    private double f41920d;

    /* renamed from: e  reason: collision with root package name */
    private ProgressBar f41921e;

    /* renamed from: com.facebook.react.views.progressbar.a$a  reason: collision with other inner class name */
    private static final class C0648a {
        public /* synthetic */ C0648a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0648a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        C6496s.h(context, "context");
    }

    private final void setColor(ProgressBar progressBar) {
        Drawable drawable;
        if (progressBar.isIndeterminate()) {
            drawable = progressBar.getIndeterminateDrawable();
        } else {
            drawable = progressBar.getProgressDrawable();
        }
        if (drawable != null) {
            Integer num = this.f41917a;
            if (num != null) {
                drawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    public final void a() {
        int i10;
        ProgressBar progressBar = this.f41921e;
        if (progressBar != null) {
            progressBar.setIndeterminate(this.f41918b);
            setColor(progressBar);
            progressBar.setProgress((int) (this.f41920d * ((double) 1000)));
            if (this.f41919c) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            progressBar.setVisibility(i10);
            return;
        }
        throw new JSApplicationIllegalArgumentException("setStyle() not called");
    }

    public final boolean getAnimating$ReactAndroid_release() {
        return this.f41919c;
    }

    public final Integer getColor$ReactAndroid_release() {
        return this.f41917a;
    }

    public final boolean getIndeterminate$ReactAndroid_release() {
        return this.f41918b;
    }

    public final double getProgress$ReactAndroid_release() {
        return this.f41920d;
    }

    public final void setAnimating$ReactAndroid_release(boolean z10) {
        this.f41919c = z10;
    }

    public final void setColor$ReactAndroid_release(Integer num) {
        this.f41917a = num;
    }

    public final void setIndeterminate$ReactAndroid_release(boolean z10) {
        this.f41918b = z10;
    }

    public final void setProgress$ReactAndroid_release(double d10) {
        this.f41920d = d10;
    }

    public final void setStyle$ReactAndroid_release(String str) {
        ReactProgressBarViewManager.a aVar = ReactProgressBarViewManager.Companion;
        ProgressBar a10 = aVar.a(getContext(), aVar.b(str));
        a10.setMax(1000);
        this.f41921e = a10;
        removeAllViews();
        addView(this.f41921e, new ViewGroup.LayoutParams(-1, -1));
    }
}
