package x4;

import C4.d;
import I4.a;
import java.util.List;

/* renamed from: x4.e  reason: case insensitive filesystem */
public class C4159e extends C4161g {

    /* renamed from: i  reason: collision with root package name */
    private final d f49385i;

    public C4159e(List list) {
        super(list);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            d dVar = (d) ((a) list.get(i11)).f31739b;
            if (dVar != null) {
                i10 = Math.max(i10, dVar.f());
            }
        }
        this.f49385i = new d(new float[i10], new int[i10]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public d i(a aVar, float f10) {
        this.f49385i.g((d) aVar.f31739b, (d) aVar.f31740c, f10);
        return this.f49385i;
    }
}
