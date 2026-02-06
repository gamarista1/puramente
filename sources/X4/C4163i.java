package x4;

import H4.l;
import I4.a;
import android.graphics.Path;
import android.graphics.PointF;
import u4.C4071k;

/* renamed from: x4.i  reason: case insensitive filesystem */
public class C4163i extends a {

    /* renamed from: q  reason: collision with root package name */
    private Path f49389q;

    /* renamed from: r  reason: collision with root package name */
    private final a f49390r;

    public C4163i(C4071k kVar, a aVar) {
        super(kVar, (PointF) aVar.f31739b, (PointF) aVar.f31740c, aVar.f31741d, aVar.f31742e, aVar.f31743f, aVar.f31744g, aVar.f31745h);
        this.f49390r = aVar;
        j();
    }

    public void j() {
        boolean z10;
        Object obj;
        Object obj2;
        Object obj3 = this.f31740c;
        if (obj3 == null || (obj2 = this.f31739b) == null || !((PointF) obj2).equals(((PointF) obj3).x, ((PointF) obj3).y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        Object obj4 = this.f31739b;
        if (obj4 != null && (obj = this.f31740c) != null && !z10) {
            a aVar = this.f49390r;
            this.f49389q = l.d((PointF) obj4, (PointF) obj, aVar.f31752o, aVar.f31753p);
        }
    }

    /* access modifiers changed from: package-private */
    public Path k() {
        return this.f49389q;
    }
}
