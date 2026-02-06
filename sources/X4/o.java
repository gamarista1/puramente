package x4;

import I4.b;
import I4.c;
import java.util.List;

public class o extends C4161g {

    class a extends c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f49409d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f49410e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ A4.b f49411f;

        a(b bVar, c cVar, A4.b bVar2) {
            this.f49409d = bVar;
            this.f49410e = cVar;
            this.f49411f = bVar2;
        }

        /* renamed from: d */
        public A4.b a(b bVar) {
            Object g10;
            this.f49409d.h(bVar.f(), bVar.a(), ((A4.b) bVar.g()).f29338a, ((A4.b) bVar.b()).f29338a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f49410e.a(this.f49409d);
            if (bVar.c() == 1.0f) {
                g10 = bVar.b();
            } else {
                g10 = bVar.g();
            }
            A4.b bVar2 = (A4.b) g10;
            this.f49411f.a(str, bVar2.f29339b, bVar2.f29340c, bVar2.f29341d, bVar2.f29342e, bVar2.f29343f, bVar2.f29344g, bVar2.f29345h, bVar2.f29346i, bVar2.f29347j, bVar2.f29348k, bVar2.f29349l, bVar2.f29350m);
            return this.f49411f;
        }
    }

    public o(List list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public A4.b i(I4.a aVar, float f10) {
        Object obj;
        float f11;
        A4.b bVar;
        c cVar = this.f49361e;
        if (cVar != null) {
            float f12 = aVar.f31744g;
            Float f13 = aVar.f31745h;
            if (f13 == null) {
                f11 = Float.MAX_VALUE;
            } else {
                f11 = f13.floatValue();
            }
            Object obj2 = aVar.f31739b;
            A4.b bVar2 = (A4.b) obj2;
            Object obj3 = aVar.f31740c;
            if (obj3 == null) {
                bVar = (A4.b) obj2;
            } else {
                bVar = (A4.b) obj3;
            }
            return (A4.b) cVar.b(f12, f11, bVar2, bVar, f10, d(), f());
        } else if (f10 != 1.0f || (obj = aVar.f31740c) == null) {
            return (A4.b) aVar.f31739b;
        } else {
            return (A4.b) obj;
        }
    }

    public void r(c cVar) {
        super.o(new a(new b(), cVar, new A4.b()));
    }
}
