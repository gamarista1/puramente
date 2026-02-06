package V0;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class n {

    /* renamed from: b  reason: collision with root package name */
    public static final a f8200b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f8201c = d(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f8202d = d(1);

    /* renamed from: a  reason: collision with root package name */
    private final int f8203a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return n.f8202d;
        }

        public final int b() {
            return n.f8201c;
        }

        private a() {
        }
    }

    private /* synthetic */ n(int i10) {
        this.f8203a = i10;
    }

    public static final /* synthetic */ n c(int i10) {
        return new n(i10);
    }

    public static boolean e(int i10, Object obj) {
        if ((obj instanceof n) && i10 == ((n) obj).i()) {
            return true;
        }
        return false;
    }

    public static final boolean f(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        if (f(i10, f8201c)) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (f(i10, f8202d)) {
            return "Italic";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.f8203a, obj);
    }

    public int hashCode() {
        return g(this.f8203a);
    }

    public final /* synthetic */ int i() {
        return this.f8203a;
    }

    public String toString() {
        return h(this.f8203a);
    }

    public static int d(int i10) {
        return i10;
    }
}
