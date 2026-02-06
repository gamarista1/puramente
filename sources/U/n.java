package U;

import B.n;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2421g;
import q0.C2427m;
import yf.C6787a;

public final class n extends View {

    /* renamed from: f  reason: collision with root package name */
    public static final a f6265f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f6266g = 8;

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f6267h = {16842919, 16842910};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f6268i = new int[0];

    /* renamed from: a  reason: collision with root package name */
    private v f6269a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f6270b;

    /* renamed from: c  reason: collision with root package name */
    private Long f6271c;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f6272d;

    /* renamed from: e  reason: collision with root package name */
    private C6787a f6273e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public n(Context context) {
        super(context);
    }

    private final void c(boolean z10) {
        v vVar = new v(z10);
        setBackground(vVar);
        this.f6269a = vVar;
    }

    private final void setRippleState(boolean z10) {
        long j10;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f6272d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f6271c;
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = 0;
        }
        long j11 = currentAnimationTimeMillis - j10;
        if (z10 || j11 >= 5) {
            if (z10) {
                iArr = f6267h;
            } else {
                iArr = f6268i;
            }
            v vVar = this.f6269a;
            if (vVar != null) {
                vVar.setState(iArr);
            }
        } else {
            m mVar = new m(this);
            this.f6272d = mVar;
            postDelayed(mVar, 50);
        }
        this.f6271c = Long.valueOf(currentAnimationTimeMillis);
    }

    /* access modifiers changed from: private */
    public static final void setRippleState$lambda$2(n nVar) {
        v vVar = nVar.f6269a;
        if (vVar != null) {
            vVar.setState(f6268i);
        }
        nVar.f6272d = null;
    }

    public final void b(n.b bVar, boolean z10, long j10, int i10, long j11, float f10, C6787a aVar) {
        boolean z11 = z10;
        if (this.f6269a == null || !C6496s.c(Boolean.valueOf(z10), this.f6270b)) {
            c(z10);
            this.f6270b = Boolean.valueOf(z10);
        }
        v vVar = this.f6269a;
        C6496s.e(vVar);
        this.f6273e = aVar;
        int i11 = i10;
        vVar.c(i10);
        f(j10, j11, f10);
        if (z11) {
            vVar.setHotspot(C2421g.m(bVar.a()), C2421g.n(bVar.a()));
        } else {
            vVar.setHotspot((float) vVar.getBounds().centerX(), (float) vVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void d() {
        this.f6273e = null;
        Runnable runnable = this.f6272d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f6272d;
            C6496s.e(runnable2);
            runnable2.run();
        } else {
            v vVar = this.f6269a;
            if (vVar != null) {
                vVar.setState(f6268i);
            }
        }
        v vVar2 = this.f6269a;
        if (vVar2 != null) {
            vVar2.setVisible(false, false);
            unscheduleDrawable(vVar2);
        }
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j10, long j11, float f10) {
        v vVar = this.f6269a;
        if (vVar != null) {
            vVar.b(j11, f10);
            Rect rect = new Rect(0, 0, Af.a.d(C2427m.k(j10)), Af.a.d(C2427m.i(j10)));
            setLeft(rect.left);
            setTop(rect.top);
            setRight(rect.right);
            setBottom(rect.bottom);
            vVar.setBounds(rect);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        C6787a aVar = this.f6273e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void refreshDrawableState() {
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
