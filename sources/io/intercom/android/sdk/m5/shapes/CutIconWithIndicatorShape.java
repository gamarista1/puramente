package io.intercom.android.sdk.m5.shapes;

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
import r0.a2;
import r0.g2;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/shapes/CutIconWithIndicatorShape;", "Lr0/g2;", "Lc1/h;", "indicatorSize", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "width", "dotSize", "Lc1/t;", "layoutDirection", "Lq0/g;", "getOffset-P-0qjgQ", "(FFLc1/t;)J", "getOffset", "Lq0/m;", "size", "Lc1/d;", "density", "Lr0/O1;", "createOutline-Pq9zytI", "(JLc1/t;Lc1/d;)Lr0/O1;", "createOutline", "F", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CutIconWithIndicatorShape implements g2 {
    public static final int $stable = 0;
    private final float indicatorSize;

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
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.shapes.CutIconWithIndicatorShape.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ CutIconWithIndicatorShape(float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10);
    }

    /* renamed from: getOffset-P-0qjgQ  reason: not valid java name */
    private final long m411getOffsetP0qjgQ(float f10, float f11, t tVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[tVar.ordinal()];
        if (i10 == 1) {
            return C2422h.a(f10 - f11, 0.0f);
        }
        if (i10 == 2) {
            return C2422h.a(0.0f, 0.0f);
        }
        throw new C6535s();
    }

    /* renamed from: createOutline-Pq9zytI  reason: not valid java name */
    public O1 m412createOutlinePq9zytI(long j10, t tVar, d dVar) {
        C6496s.h(tVar, "layoutDirection");
        C6496s.h(dVar, "density");
        float t12 = dVar.t1(this.indicatorSize);
        S1 a10 = C2472Y.a();
        P1.a(a10, a2.a().m12createOutlinePq9zytI(j10, tVar, dVar));
        S1 a11 = C2472Y.a();
        P1.a(a11, g.e().m7createOutlinePq9zytI(C2428n.a(t12, t12), tVar, dVar));
        S1 a12 = C2472Y.a();
        a12.m(a11, m411getOffsetP0qjgQ(C2427m.k(j10), t12, tVar));
        S1 a13 = C2472Y.a();
        a13.l(a10, a12, W1.f25474a.a());
        return new O1.a(a13);
    }

    private CutIconWithIndicatorShape(float f10) {
        this.indicatorSize = f10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutIconWithIndicatorShape(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? h.j((float) 8) : f10, (DefaultConstructorMarker) null);
    }
}
