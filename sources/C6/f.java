package C6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import i6.C3591a;
import kotlin.jvm.internal.C6496s;
import q6.C3955d;
import v6.C4106a;

public final class f extends Drawable implements Animatable, C3591a {

    /* renamed from: a  reason: collision with root package name */
    private C4106a f30076a;

    /* renamed from: b  reason: collision with root package name */
    private final c f30077b = new c(new E6.a(this.f30076a));

    /* renamed from: c  reason: collision with root package name */
    private d f30078c = new e();

    /* renamed from: d  reason: collision with root package name */
    private final C3955d f30079d;

    /* renamed from: e  reason: collision with root package name */
    private final a f30080e;

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f30081a;

        a(f fVar) {
            this.f30081a = fVar;
        }

        public void run() {
            this.f30081a.unscheduleSelf(this);
            this.f30081a.invalidateSelf();
        }
    }

    public f(C4106a aVar) {
        C6496s.h(aVar, "animationBackend");
        this.f30076a = aVar;
        C3955d dVar = new C3955d();
        dVar.a(this);
        this.f30079d = dVar;
        this.f30080e = new a(this);
    }

    public void a() {
        this.f30076a.clear();
    }

    public void draw(Canvas canvas) {
        C6496s.h(canvas, "canvas");
        int a10 = this.f30077b.a();
        if (a10 == -1) {
            a10 = this.f30076a.a() - 1;
            this.f30077b.g(false);
            this.f30078c.c(this);
        } else if (a10 == 0 && this.f30077b.h()) {
            this.f30078c.a(this);
        }
        if (this.f30076a.h(this, canvas, a10)) {
            this.f30078c.d(this, a10);
            this.f30077b.f(a10);
        } else {
            this.f30077b.e();
        }
        long c10 = this.f30077b.c();
        if (c10 != -1) {
            scheduleSelf(this.f30080e, c10);
            return;
        }
        this.f30078c.c(this);
        this.f30077b.g(false);
    }

    public int getIntrinsicHeight() {
        return this.f30076a.c();
    }

    public int getIntrinsicWidth() {
        return this.f30076a.e();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f30077b.b();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        C6496s.h(rect, "bounds");
        this.f30076a.d(rect);
    }

    public void setAlpha(int i10) {
        this.f30079d.b(i10);
        this.f30076a.m(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f30079d.c(colorFilter);
        this.f30076a.f(colorFilter);
    }

    public void start() {
        if (this.f30076a.a() > 0) {
            this.f30077b.i();
            this.f30078c.b(this);
            invalidateSelf();
        }
    }

    public void stop() {
        this.f30077b.j();
        this.f30078c.c(this);
        unscheduleSelf(this.f30080e);
    }
}
