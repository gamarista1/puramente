package Q0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class y {

    /* renamed from: c  reason: collision with root package name */
    public static final a f5393c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final y f5394d = new y();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5395a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5396b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y a() {
            return y.f5394d;
        }

        private a() {
        }
    }

    public /* synthetic */ y(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10);
    }

    public final int b() {
        return this.f5396b;
    }

    public final boolean c() {
        return this.f5395a;
    }

    public final y d(y yVar) {
        if (yVar == null) {
            return this;
        }
        return yVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f5395a == yVar.f5395a && C1325h.g(this.f5396b, yVar.f5396b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f5395a) * 31) + C1325h.h(this.f5396b);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f5395a + ", emojiSupportMatch=" + C1325h.i(this.f5396b) + ')';
    }

    public y(boolean z10) {
        this.f5395a = z10;
        this.f5396b = C1325h.f5340b.b();
    }

    private y(int i10, boolean z10) {
        this.f5395a = z10;
        this.f5396b = i10;
    }

    public y() {
        this(C1325h.f5340b.b(), false, (DefaultConstructorMarker) null);
    }
}
