package x3;

import android.os.Bundle;
import androidx.lifecycle.C1790m;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: x3.e  reason: case insensitive filesystem */
public final class C2913e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f28425d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C2914f f28426a;

    /* renamed from: b  reason: collision with root package name */
    private final C2912d f28427b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f28428c;

    /* renamed from: x3.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2913e a(C2914f fVar) {
            C6496s.h(fVar, "owner");
            return new C2913e(fVar, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C2913e(C2914f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    public static final C2913e a(C2914f fVar) {
        return f28425d.a(fVar);
    }

    public final C2912d b() {
        return this.f28427b;
    }

    public final void c() {
        C1790m lifecycle = this.f28426a.getLifecycle();
        if (lifecycle.b() == C1790m.b.INITIALIZED) {
            lifecycle.a(new C2910b(this.f28426a));
            this.f28427b.e(lifecycle);
            this.f28428c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void d(Bundle bundle) {
        if (!this.f28428c) {
            c();
        }
        C1790m lifecycle = this.f28426a.getLifecycle();
        if (!lifecycle.b().b(C1790m.b.STARTED)) {
            this.f28427b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle bundle) {
        C6496s.h(bundle, "outBundle");
        this.f28427b.g(bundle);
    }

    private C2913e(C2914f fVar) {
        this.f28426a = fVar;
        this.f28427b = new C2912d();
    }
}
