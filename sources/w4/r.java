package w4;

import A4.e;
import C4.t;
import D4.b;
import H4.k;
import I4.c;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import u4.L;
import u4.T;
import x4.C4155a;
import x4.m;

public class r implements C4128m, C4155a.b, C4126k {

    /* renamed from: a  reason: collision with root package name */
    private final Path f49126a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final String f49127b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f49128c;

    /* renamed from: d  reason: collision with root package name */
    private final L f49129d;

    /* renamed from: e  reason: collision with root package name */
    private final m f49130e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f49131f;

    /* renamed from: g  reason: collision with root package name */
    private final C4117b f49132g = new C4117b();

    public r(L l10, b bVar, C4.r rVar) {
        this.f49127b = rVar.b();
        this.f49128c = rVar.d();
        this.f49129d = l10;
        m a10 = rVar.c().h();
        this.f49130e = a10;
        bVar.i(a10);
        a10.a(this);
    }

    private void g() {
        this.f49131f = false;
        this.f49129d.invalidateSelf();
    }

    public void b() {
        g();
    }

    public void c(List list, List list2) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4118c cVar = (C4118c) list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f49132g.a(uVar);
                    uVar.d(this);
                }
            }
            if (cVar instanceof s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((s) cVar);
            }
        }
        this.f49130e.r(arrayList);
    }

    public void d(e eVar, int i10, List list, e eVar2) {
        k.k(eVar, i10, list, eVar2, this);
    }

    public void e(Object obj, c cVar) {
        if (obj == T.f48403P) {
            this.f49130e.o(cVar);
        }
    }

    public String getName() {
        return this.f49127b;
    }

    public Path m() {
        if (this.f49131f && !this.f49130e.k()) {
            return this.f49126a;
        }
        this.f49126a.reset();
        if (this.f49128c) {
            this.f49131f = true;
            return this.f49126a;
        }
        Path path = (Path) this.f49130e.h();
        if (path == null) {
            return this.f49126a;
        }
        this.f49126a.set(path);
        this.f49126a.setFillType(Path.FillType.EVEN_ODD);
        this.f49132g.b(this.f49126a);
        this.f49131f = true;
        return this.f49126a;
    }
}
