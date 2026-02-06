package r0;

import android.graphics.ColorFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: r0.y0  reason: case insensitive filesystem */
public abstract class C2547y0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f25576b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ColorFilter f25577a;

    /* renamed from: r0.y0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C2547y0 c(a aVar, long j10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = C2490f0.f25500a.z();
            }
            return aVar.b(j10, i10);
        }

        public final C2547y0 a(float[] fArr) {
            return new C2437B0(fArr, (DefaultConstructorMarker) null);
        }

        public final C2547y0 b(long j10, int i10) {
            return new C2493g0(j10, i10, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public C2547y0(ColorFilter colorFilter) {
        this.f25577a = colorFilter;
    }

    public final ColorFilter a() {
        return this.f25577a;
    }
}
