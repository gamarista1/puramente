package B6;

import R6.d;
import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w6.C4142b;
import w6.C4143c;

public final class b implements C4143c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f29825f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private static final Class f29826g = b.class;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C4142b f29827a;

    /* renamed from: b  reason: collision with root package name */
    private P6.a f29828b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f29829c;

    /* renamed from: d  reason: collision with root package name */
    private d f29830d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f29831e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: B6.b$b  reason: collision with other inner class name */
    public static final class C0498b implements d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f29832a;

        C0498b(b bVar) {
            this.f29832a = bVar;
        }

        public void a(int i10, Bitmap bitmap) {
            C6496s.h(bitmap, "bitmap");
        }

        public X5.a b(int i10) {
            return this.f29832a.f29827a.e(i10);
        }
    }

    public b(C4142b bVar, P6.a aVar, boolean z10) {
        C6496s.h(bVar, "bitmapFrameCache");
        C6496s.h(aVar, "animatedDrawableBackend");
        this.f29827a = bVar;
        this.f29828b = aVar;
        this.f29829c = z10;
        C0498b bVar2 = new C0498b(this);
        this.f29831e = bVar2;
        this.f29830d = new d(this.f29828b, z10, bVar2);
    }

    public boolean a(int i10, Bitmap bitmap) {
        C6496s.h(bitmap, "targetBitmap");
        try {
            this.f29830d.h(i10, bitmap);
            return true;
        } catch (IllegalStateException e10) {
            U5.a.l(f29826g, e10, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i10));
            return false;
        }
    }

    public int c() {
        return this.f29828b.d();
    }

    public void d(Rect rect) {
        P6.a h10 = this.f29828b.h(rect);
        C6496s.g(h10, "forNewBounds(...)");
        if (h10 != this.f29828b) {
            this.f29828b = h10;
            this.f29830d = new d(h10, this.f29829c, this.f29831e);
        }
    }

    public int e() {
        return this.f29828b.e();
    }
}
