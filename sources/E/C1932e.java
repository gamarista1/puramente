package e;

import Y.r;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C1554j;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x3.C2915g;
import yf.p;

/* renamed from: e.e  reason: case insensitive filesystem */
public abstract class C1932e {

    /* renamed from: a  reason: collision with root package name */
    private static final ViewGroup.LayoutParams f19489a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(C1554j jVar, r rVar, p pVar) {
        ComposeView composeView;
        View childAt = ((ViewGroup) jVar.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        if (childAt instanceof ComposeView) {
            composeView = (ComposeView) childAt;
        } else {
            composeView = null;
        }
        if (composeView != null) {
            composeView.setParentCompositionContext(rVar);
            composeView.setContent(pVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(jVar, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView2.setParentCompositionContext(rVar);
        composeView2.setContent(pVar);
        c(jVar);
        jVar.setContentView(composeView2, f19489a);
    }

    public static /* synthetic */ void b(C1554j jVar, r rVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rVar = null;
        }
        a(jVar, rVar, pVar);
    }

    private static final void c(C1554j jVar) {
        View decorView = jVar.getWindow().getDecorView();
        if (f0.a(decorView) == null) {
            f0.b(decorView, jVar);
        }
        if (g0.a(decorView) == null) {
            g0.b(decorView, jVar);
        }
        if (C2915g.a(decorView) == null) {
            C2915g.b(decorView, jVar);
        }
    }
}
