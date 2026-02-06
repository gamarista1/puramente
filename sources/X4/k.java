package x4;

import I4.a;
import I4.c;
import android.graphics.PointF;
import java.util.List;

public class k extends C4161g {

    /* renamed from: i  reason: collision with root package name */
    private final PointF f49396i = new PointF();

    public k(List list) {
        super(list);
    }

    /* renamed from: q */
    public PointF i(a aVar, float f10) {
        return j(aVar, f10, f10, f10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public PointF j(a aVar, float f10, float f11, float f12) {
        Object obj;
        Object obj2 = aVar.f31739b;
        if (obj2 == null || (obj = aVar.f31740c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        c cVar = this.f49361e;
        if (cVar != null) {
            PointF pointF3 = (PointF) cVar.b(aVar.f31744g, aVar.f31745h.floatValue(), pointF, pointF2, f10, e(), f());
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.f49396i;
        float f13 = pointF.x;
        float f14 = f13 + (f11 * (pointF2.x - f13));
        float f15 = pointF.y;
        pointF4.set(f14, f15 + (f12 * (pointF2.y - f15)));
        return this.f49396i;
    }
}
