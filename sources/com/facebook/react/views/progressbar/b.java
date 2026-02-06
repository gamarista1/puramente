package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.C3428v;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import com.facebook.yoga.r;
import e8.C3500a;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C6496s;

public final class b extends C3428v implements o {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f41922a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private final SparseIntArray f41923b = new SparseIntArray();

    /* renamed from: c  reason: collision with root package name */
    private final Set f41924c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private String f41925d;

    public b() {
        setMeasureFunction(this);
        this.f41925d = ReactProgressBarViewManager.DEFAULT_STYLE;
    }

    public long a(r rVar, float f10, p pVar, float f11, p pVar2) {
        C6496s.h(rVar, "node");
        C6496s.h(pVar, "widthMode");
        C6496s.h(pVar2, "heightMode");
        ReactProgressBarViewManager.a aVar = ReactProgressBarViewManager.Companion;
        int b10 = aVar.b(this.f41925d);
        if (!this.f41924c.contains(Integer.valueOf(b10))) {
            ProgressBar a10 = aVar.a(getThemedContext(), b10);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            a10.measure(makeMeasureSpec, makeMeasureSpec);
            this.f41922a.put(b10, a10.getMeasuredHeight());
            this.f41923b.put(b10, a10.getMeasuredWidth());
            this.f41924c.add(Integer.valueOf(b10));
        }
        return q.b(this.f41923b.get(b10), this.f41922a.get(b10));
    }

    @C3500a(name = "styleAttr")
    public final void setStyle(String str) {
        if (str == null) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        this.f41925d = str;
    }
}
