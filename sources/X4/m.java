package x4;

import C4.o;
import H4.k;
import I4.a;
import I4.c;
import android.graphics.Path;
import java.util.List;
import w4.s;

public class m extends C4155a {

    /* renamed from: i  reason: collision with root package name */
    private final o f49398i = new o();

    /* renamed from: j  reason: collision with root package name */
    private final Path f49399j = new Path();

    /* renamed from: k  reason: collision with root package name */
    private Path f49400k;

    /* renamed from: l  reason: collision with root package name */
    private Path f49401l;

    /* renamed from: m  reason: collision with root package name */
    private List f49402m;

    public m(List list) {
        super(list);
    }

    /* renamed from: q */
    public Path i(a aVar, float f10) {
        o oVar;
        Path path;
        o oVar2 = (o) aVar.f31739b;
        o oVar3 = (o) aVar.f31740c;
        o oVar4 = this.f49398i;
        if (oVar3 == null) {
            oVar = oVar2;
        } else {
            oVar = oVar3;
        }
        oVar4.c(oVar2, oVar, f10);
        o oVar5 = this.f49398i;
        List list = this.f49402m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVar5 = ((s) this.f49402m.get(size)).a(oVar5);
            }
        }
        k.h(oVar5, this.f49399j);
        if (this.f49361e == null) {
            return this.f49399j;
        }
        if (this.f49400k == null) {
            this.f49400k = new Path();
            this.f49401l = new Path();
        }
        k.h(oVar2, this.f49400k);
        if (oVar3 != null) {
            k.h(oVar3, this.f49401l);
        }
        c cVar = this.f49361e;
        float f11 = aVar.f31744g;
        float floatValue = aVar.f31745h.floatValue();
        Path path2 = this.f49400k;
        if (oVar3 == null) {
            path = path2;
        } else {
            path = this.f49401l;
        }
        return (Path) cVar.b(f11, floatValue, path2, path, f10, e(), f());
    }

    public void r(List list) {
        this.f49402m = list;
    }
}
