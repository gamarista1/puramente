package V0;

import Y.A1;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f8176b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C f8177c = new C1425f();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final t f8178d = new t("sans-serif", "FontFamily.SansSerif");

    /* renamed from: e  reason: collision with root package name */
    private static final t f8179e = new t("serif", "FontFamily.Serif");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final t f8180f = new t("monospace", "FontFamily.Monospace");

    /* renamed from: g  reason: collision with root package name */
    private static final t f8181g = new t("cursive", "FontFamily.Cursive");

    /* renamed from: a  reason: collision with root package name */
    private final boolean f8182a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a() {
            return h.f8177c;
        }

        public final t b() {
            return h.f8180f;
        }

        public final t c() {
            return h.f8178d;
        }

        private a() {
        }
    }

    public interface b {
        static /* synthetic */ A1 a(b bVar, h hVar, p pVar, int i10, int i11, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 1) != 0) {
                    hVar = null;
                }
                if ((i12 & 2) != 0) {
                    pVar = p.f8210b.c();
                }
                if ((i12 & 4) != 0) {
                    i10 = n.f8200b.b();
                }
                if ((i12 & 8) != 0) {
                    i11 = o.f8204b.a();
                }
                return bVar.b(hVar, pVar, i10, i11);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
        }

        A1 b(h hVar, p pVar, int i10, int i11);
    }

    public /* synthetic */ h(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    private h(boolean z10) {
        this.f8182a = z10;
    }
}
