package androidx.compose.ui.window;

import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.M0;
import Y.Y0;
import Y.o1;
import Y.r;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.C1613a;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.p;

final class h extends C1613a implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Window f14276a;

    /* renamed from: b  reason: collision with root package name */
    private final C1510r0 f14277b = u1.d(f.f14270a.a(), (o1) null, 2, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private boolean f14278c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14279d;

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f14280a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f14281b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, int i10) {
            super(2);
            this.f14280a = hVar;
            this.f14281b = i10;
        }

        public final void a(C1500m mVar, int i10) {
            this.f14280a.Content(mVar, M0.a(this.f14281b | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public h(Context context, Window window) {
        super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.f14276a = window;
    }

    private final p getContent() {
        return (p) this.f14277b.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(((float) getContext().getResources().getConfiguration().screenHeightDp) * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(((float) getContext().getResources().getConfiguration().screenWidthDp) * getContext().getResources().getDisplayMetrics().density);
    }

    private final void setContent(p pVar) {
        this.f14277b.setValue(pVar);
    }

    public void Content(C1500m mVar, int i10) {
        int i11;
        int i12;
        C1500m h10 = mVar.h(1735448596);
        if ((i10 & 6) == 0) {
            if (h10.C(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(1735448596, i11, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:280)");
            }
            getContent().invoke(h10, 0);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new a(this, i10));
        }
    }

    public Window a() {
        return this.f14276a;
    }

    public final boolean g() {
        return this.f14278c;
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f14279d;
    }

    public final void h(r rVar, p pVar) {
        setParentCompositionContext(rVar);
        setContent(pVar);
        this.f14279d = true;
        createComposition();
    }

    public final void i(boolean z10) {
        this.f14278c = z10;
    }

    public void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt;
        super.internalOnLayout$ui_release(z10, i10, i11, i12, i13);
        if (!this.f14278c && (childAt = getChildAt(0)) != null) {
            a().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    public void internalOnMeasure$ui_release(int i10, int i11) {
        if (this.f14278c) {
            super.internalOnMeasure$ui_release(i10, i11);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }
}
