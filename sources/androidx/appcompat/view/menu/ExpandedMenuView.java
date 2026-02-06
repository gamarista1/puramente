package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.g0;

public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f11226c = {16842964, 16843049};

    /* renamed from: a  reason: collision with root package name */
    private e f11227a;

    /* renamed from: b  reason: collision with root package name */
    private int f11228b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public void a(e eVar) {
        this.f11227a = eVar;
    }

    public boolean d(g gVar) {
        return this.f11227a.M(gVar, 0);
    }

    public int getWindowAnimations() {
        return this.f11228b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        d((g) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        g0 v10 = g0.v(context, attributeSet, f11226c, i10, 0);
        if (v10.s(0)) {
            setBackgroundDrawable(v10.g(0));
        }
        if (v10.s(1)) {
            setDivider(v10.g(1));
        }
        v10.x();
    }
}
