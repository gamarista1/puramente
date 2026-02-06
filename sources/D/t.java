package D;

import E.A;
import E.x;
import androidx.compose.foundation.lazy.layout.c;
import c1.b;
import com.google.android.gms.common.api.a;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class t implements A {

    /* renamed from: a  reason: collision with root package name */
    private final l f1350a;

    /* renamed from: b  reason: collision with root package name */
    private final x f1351b;

    /* renamed from: c  reason: collision with root package name */
    private final long f1352c;

    public /* synthetic */ t(long j10, boolean z10, l lVar, x xVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, z10, lVar, xVar);
    }

    public static /* synthetic */ s e(t tVar, int i10, long j10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                j10 = tVar.f1352c;
            }
            return tVar.d(i10, j10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
    }

    public abstract s b(int i10, Object obj, Object obj2, List list, long j10);

    /* renamed from: c */
    public s a(int i10, int i11, int i12, long j10) {
        return d(i10, j10);
    }

    public final s d(int i10, long j10) {
        return b(i10, this.f1350a.d(i10), this.f1350a.f(i10), this.f1351b.l0(i10, j10), j10);
    }

    public final long f() {
        return this.f1352c;
    }

    public final c g() {
        return this.f1350a.b();
    }

    private t(long j10, boolean z10, l lVar, x xVar) {
        this.f1350a = lVar;
        this.f1351b = xVar;
        this.f1352c = c1.c.b(0, z10 ? b.l(j10) : Integer.MAX_VALUE, 0, !z10 ? b.k(j10) : a.e.API_PRIORITY_OTHER, 5, (Object) null);
    }
}
