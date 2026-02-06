package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.adjust.sdk.network.ErrorCodes;
import i.C2040d;
import i.C2042f;
import i.C2043g;
import i.i;

class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11983a;

    /* renamed from: b  reason: collision with root package name */
    private final View f11984b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f11985c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f11986d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f11987e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f11988f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private final int[] f11989g = new int[2];

    p0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f11986d = layoutParams;
        this.f11983a = context;
        View inflate = LayoutInflater.from(context).inflate(C2043g.f21412s, (ViewGroup) null);
        this.f11984b = inflate;
        this.f11985c = (TextView) inflate.findViewById(C2042f.f21387t);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.f21428a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int i12;
        int i13;
        int i14;
        int i15;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f11983a.getResources().getDimensionPixelOffset(C2040d.f21303k);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f11983a.getResources().getDimensionPixelOffset(C2040d.f21302j);
            i13 = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            i13 = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f11983a.getResources();
        if (z10) {
            i14 = C2040d.f21305m;
        } else {
            i14 = C2040d.f21304l;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i14);
        View b10 = b(view);
        if (b10 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b10.getWindowVisibleDisplayFrame(this.f11987e);
        Rect rect = this.f11987e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources2 = this.f11983a.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier != 0) {
                i15 = resources2.getDimensionPixelSize(identifier);
            } else {
                i15 = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.f11987e.set(0, i15, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b10.getLocationOnScreen(this.f11989g);
        view.getLocationOnScreen(this.f11988f);
        int[] iArr = this.f11988f;
        int i16 = iArr[0];
        int[] iArr2 = this.f11989g;
        int i17 = i16 - iArr2[0];
        iArr[0] = i17;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i17 + i10) - (b10.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f11984b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f11984b.getMeasuredHeight();
        int i18 = this.f11988f[1];
        int i19 = ((i12 + i18) - dimensionPixelOffset3) - measuredHeight;
        int i20 = i18 + i13 + dimensionPixelOffset3;
        if (z10) {
            if (i19 >= 0) {
                layoutParams.y = i19;
            } else {
                layoutParams.y = i20;
            }
        } else if (measuredHeight + i20 <= this.f11987e.height()) {
            layoutParams.y = i20;
        } else {
            layoutParams.y = i19;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (d()) {
            ((WindowManager) this.f11983a.getSystemService("window")).removeView(this.f11984b);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        if (this.f11984b.getParent() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f11985c.setText(charSequence);
        a(view, i10, i11, z10, this.f11986d);
        ((WindowManager) this.f11983a.getSystemService("window")).addView(this.f11984b, this.f11986d);
    }
}
