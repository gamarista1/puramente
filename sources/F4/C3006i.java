package F4;

import A4.b;
import G4.c;
import android.graphics.PointF;

/* renamed from: F4.i  reason: case insensitive filesystem */
public class C3006i implements N {

    /* renamed from: a  reason: collision with root package name */
    public static final C3006i f30701a = new C3006i();

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30702b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private C3006i() {
    }

    /* renamed from: b */
    public b a(c cVar, float f10) {
        b.a aVar = b.a.CENTER;
        cVar.f();
        b.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = true;
        while (cVar.q()) {
            switch (cVar.T(f30702b)) {
                case 0:
                    str = cVar.F();
                    break;
                case 1:
                    str2 = cVar.F();
                    break;
                case 2:
                    f11 = (float) cVar.v();
                    break;
                case 3:
                    int y10 = cVar.y();
                    aVar2 = b.a.CENTER;
                    if (y10 <= aVar2.ordinal() && y10 >= 0) {
                        aVar2 = b.a.values()[y10];
                        break;
                    }
                case 4:
                    i10 = cVar.y();
                    break;
                case 5:
                    f12 = (float) cVar.v();
                    break;
                case 6:
                    f13 = (float) cVar.v();
                    break;
                case 7:
                    i11 = s.d(cVar);
                    break;
                case 8:
                    i12 = s.d(cVar);
                    break;
                case 9:
                    f14 = (float) cVar.v();
                    break;
                case 10:
                    z10 = cVar.t();
                    break;
                case 11:
                    cVar.b();
                    PointF pointF3 = new PointF(((float) cVar.v()) * f10, ((float) cVar.v()) * f10);
                    cVar.n();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.b();
                    PointF pointF4 = new PointF(((float) cVar.v()) * f10, ((float) cVar.v()) * f10);
                    cVar.n();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.U();
                    cVar.V();
                    break;
            }
        }
        c cVar2 = cVar;
        cVar.o();
        return new b(str, str2, f11, aVar2, i10, f12, f13, i11, i12, f14, z10, pointF, pointF2);
    }
}
