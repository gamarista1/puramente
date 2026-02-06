package x4;

import I4.a;
import I4.c;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: x4.j  reason: case insensitive filesystem */
public class C4164j extends C4161g {

    /* renamed from: i  reason: collision with root package name */
    private final PointF f49391i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    private final float[] f49392j = new float[2];

    /* renamed from: k  reason: collision with root package name */
    private final float[] f49393k = new float[2];

    /* renamed from: l  reason: collision with root package name */
    private final PathMeasure f49394l = new PathMeasure();

    /* renamed from: m  reason: collision with root package name */
    private C4163i f49395m;

    public C4164j(List list) {
        super(list);
    }

    /* renamed from: q */
    public PointF i(a aVar, float f10) {
        C4163i iVar = (C4163i) aVar;
        Path k10 = iVar.k();
        c cVar = this.f49361e;
        if (!(cVar == null || aVar.f31745h == null)) {
            PointF pointF = (PointF) cVar.b(iVar.f31744g, iVar.f31745h.floatValue(), (PointF) iVar.f31739b, (PointF) iVar.f31740c, e(), f10, f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (k10 == null) {
            return (PointF) aVar.f31739b;
        }
        if (this.f49395m != iVar) {
            this.f49394l.setPath(k10, false);
            this.f49395m = iVar;
        }
        float length = this.f49394l.getLength();
        float f11 = f10 * length;
        this.f49394l.getPosTan(f11, this.f49392j, this.f49393k);
        PointF pointF2 = this.f49391i;
        float[] fArr = this.f49392j;
        pointF2.set(fArr[0], fArr[1]);
        if (f11 < 0.0f) {
            PointF pointF3 = this.f49391i;
            float[] fArr2 = this.f49393k;
            pointF3.offset(fArr2[0] * f11, fArr2[1] * f11);
        } else if (f11 > length) {
            PointF pointF4 = this.f49391i;
            float[] fArr3 = this.f49393k;
            float f12 = f11 - length;
            pointF4.offset(fArr3[0] * f12, fArr3[1] * f12);
        }
        return this.f49391i;
    }
}
