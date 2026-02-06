package io.intercom.android.sdk.m5.shapes;

import I.f;
import I.g;
import c1.d;
import c1.h;
import c1.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import q0.C2422h;
import q0.C2427m;
import q0.C2428n;
import r0.C2472Y;
import r0.O1;
import r0.P1;
import r0.S1;
import r0.W1;
import r0.g2;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001a¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/m5/shapes/CutAvatarWithIndicatorShape;", "Lr0/g2;", "shape", "Lc1/h;", "indicatorSize", "<init>", "(Lr0/g2;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lq0/m;", "size", "", "indicatorCutSizePx", "cutDifference", "yOffset", "Lc1/t;", "layoutDirection", "Lq0/g;", "getOffset-XPhi94U", "(JFFFLc1/t;)J", "getOffset", "Lc1/d;", "density", "Lr0/O1;", "createOutline-Pq9zytI", "(JLc1/t;Lc1/d;)Lr0/O1;", "createOutline", "Lr0/g2;", "F", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CutAvatarWithIndicatorShape implements g2 {
    public static final int $stable = 0;
    private final float indicatorSize;
    private final g2 shape;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                c1.t[] r0 = c1.t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c1.t r1 = c1.t.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                c1.t r1 = c1.t.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.shapes.CutAvatarWithIndicatorShape.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ CutAvatarWithIndicatorShape(g2 g2Var, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(g2Var, f10);
    }

    /* renamed from: getOffset-XPhi94U  reason: not valid java name */
    private final long m409getOffsetXPhi94U(long j10, float f10, float f11, float f12, t tVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[tVar.ordinal()];
        if (i10 == 1) {
            return C2422h.a((C2427m.k(j10) - f10) + f11, f12);
        }
        if (i10 == 2) {
            return C2422h.a(0.0f - f11, f12);
        }
        throw new C6535s();
    }

    /* renamed from: createOutline-Pq9zytI  reason: not valid java name */
    public O1 m410createOutlinePq9zytI(long j10, t tVar, d dVar) {
        C6496s.h(tVar, "layoutDirection");
        C6496s.h(dVar, "density");
        float f10 = (float) 2;
        float t12 = dVar.t1(h.j(f10));
        float t13 = dVar.t1(this.indicatorSize) + (f10 * t12);
        f e10 = g.e();
        S1 a10 = C2472Y.a();
        P1.a(a10, this.shape.m12createOutlinePq9zytI(j10, tVar, dVar));
        S1 a11 = C2472Y.a();
        P1.a(a11, e10.m7createOutlinePq9zytI(C2428n.a(t13, t13), tVar, dVar));
        S1 a12 = C2472Y.a();
        a12.m(a11, m409getOffsetXPhi94U(j10, t13, t12, (C2427m.i(j10) - t13) + t12, tVar));
        S1 a13 = C2472Y.a();
        a13.l(a10, a12, W1.f25474a.a());
        return new O1.a(a13);
    }

    private CutAvatarWithIndicatorShape(g2 g2Var, float f10) {
        C6496s.h(g2Var, "shape");
        this.shape = g2Var;
        this.indicatorSize = f10;
    }
}
