package E3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1680b0;

/* renamed from: E3.d  reason: case insensitive filesystem */
public class C1154d extends M {

    /* renamed from: E3.d$a */
    class a extends C1163m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f1827a;

        a(View view) {
            this.f1827a = view;
        }

        public void d(C1162l lVar) {
            A.g(this.f1827a, 1.0f);
            A.a(this.f1827a);
            lVar.S(this);
        }
    }

    /* renamed from: E3.d$b */
    private static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f1829a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f1830b = false;

        b(View view) {
            this.f1829a = view;
        }

        public void onAnimationEnd(Animator animator) {
            A.g(this.f1829a, 1.0f);
            if (this.f1830b) {
                this.f1829a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C1680b0.O(this.f1829a) && this.f1829a.getLayerType() == 0) {
                this.f1830b = true;
                this.f1829a.setLayerType(2, (Paint) null);
            }
        }
    }

    public C1154d(int i10) {
        n0(i10);
    }

    private Animator o0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        A.g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, A.f1762b, new float[]{f11});
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    private static float p0(s sVar, float f10) {
        Float f11;
        if (sVar == null || (f11 = (Float) sVar.f1909a.get("android:fade:transitionAlpha")) == null) {
            return f10;
        }
        return f11.floatValue();
    }

    public void k(s sVar) {
        super.k(sVar);
        sVar.f1909a.put("android:fade:transitionAlpha", Float.valueOf(A.c(sVar.f1910b)));
    }

    public Animator k0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float f10 = 0.0f;
        float p02 = p0(sVar, 0.0f);
        if (p02 != 1.0f) {
            f10 = p02;
        }
        return o0(view, f10, 1.0f);
    }

    public Animator m0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        A.e(view);
        return o0(view, p0(sVar, 1.0f), 0.0f);
    }

    public C1154d() {
    }
}
