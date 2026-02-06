package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import r.C2433a;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final int f12050a = getResources().getDimensionPixelOffset(C2433a.f25393b);

    /* renamed from: b  reason: collision with root package name */
    private final int f12051b = getResources().getDimensionPixelOffset(C2433a.f25392a);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f12050a * 2), this.f12051b), 1073741824), i11);
    }
}
