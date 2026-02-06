package com.facebook.react.devsupport;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.C3367m;
import com.facebook.react.C3369o;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.debug.h;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;

public final class M extends FrameLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final a f40720d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final TextView f40721a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final h f40722b;

    /* renamed from: c  reason: collision with root package name */
    private final b f40723c = new b();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private boolean f40724a;

        /* renamed from: b  reason: collision with root package name */
        private int f40725b;

        /* renamed from: c  reason: collision with root package name */
        private int f40726c;

        public b() {
        }

        public final void a() {
            this.f40724a = false;
            M.this.post(this);
        }

        public final void b() {
            this.f40724a = true;
        }

        public void run() {
            if (!this.f40724a) {
                this.f40725b += M.this.f40722b.d() - M.this.f40722b.g();
                this.f40726c += M.this.f40722b.c();
                M m10 = M.this;
                m10.c(m10.f40722b.e(), M.this.f40722b.f(), this.f40725b, this.f40726c);
                M.this.f40722b.j();
                M.this.postDelayed(this, 500);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public M(ReactContext reactContext) {
        super(reactContext);
        C6496s.e(reactContext);
        View.inflate(reactContext, C3369o.f41133c, this);
        View findViewById = findViewById(C3367m.f40939o);
        C6496s.f(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.f40721a = (TextView) findViewById;
        this.f40722b = new h(reactContext);
        c(0.0d, 0.0d, 0, 0);
    }

    /* access modifiers changed from: private */
    public final void c(double d10, double d11, int i10, int i11) {
        U u10 = U.f71764a;
        String format = String.format(Locale.US, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far\nJS: %.1f fps", Arrays.copyOf(new Object[]{Double.valueOf(d10), Integer.valueOf(i10), Integer.valueOf(i11), Double.valueOf(d11)}, 4));
        C6496s.g(format, "format(...)");
        this.f40721a.setText(format);
        U5.a.b("ReactNative", format);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40722b.j();
        h.l(this.f40722b, 0.0d, 1, (Object) null);
        this.f40723c.a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40722b.n();
        this.f40723c.b();
    }
}
