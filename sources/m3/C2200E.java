package m3;

import com.google.android.gms.common.api.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: m3.E  reason: case insensitive filesystem */
public final class C2200E {

    /* renamed from: g  reason: collision with root package name */
    public static final a f23768g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f23769a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23770b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f23771c;

    /* renamed from: d  reason: collision with root package name */
    public final int f23772d;

    /* renamed from: e  reason: collision with root package name */
    public final int f23773e;

    /* renamed from: f  reason: collision with root package name */
    public final int f23774f;

    /* renamed from: m3.E$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2200E(int i10, int i11, boolean z10, int i12, int i13, int i14) {
        this.f23769a = i10;
        this.f23770b = i11;
        this.f23771c = z10;
        this.f23772d = i12;
        this.f23773e = i13;
        this.f23774f = i14;
        if (!z10 && i11 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        } else if (i13 != Integer.MAX_VALUE && i13 < (i11 * 2) + i10) {
            throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + i10 + ", prefetchDist=" + i11 + ", maxSize=" + i13);
        } else if (i14 != Integer.MIN_VALUE && i14 <= 0) {
            throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2200E(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i15 & 2) != 0 ? i10 : i11, (i15 & 4) != 0 ? true : z10, (i15 & 8) != 0 ? i10 * 3 : i12, (i15 & 16) != 0 ? a.e.API_PRIORITY_OTHER : i13, (i15 & 32) != 0 ? Integer.MIN_VALUE : i14);
    }
}
