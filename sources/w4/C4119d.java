package w4;

import A4.e;
import A4.f;
import B4.n;
import C4.c;
import C4.q;
import D4.b;
import H4.l;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import u4.C4071k;
import u4.L;
import v4.C4103a;
import x4.C4155a;
import x4.p;

/* renamed from: w4.d  reason: case insensitive filesystem */
public class C4119d implements C4120e, C4128m, C4155a.b, f {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f49011a;

    /* renamed from: b  reason: collision with root package name */
    private final RectF f49012b;

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f49013c;

    /* renamed from: d  reason: collision with root package name */
    private final Path f49014d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f49015e;

    /* renamed from: f  reason: collision with root package name */
    private final String f49016f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f49017g;

    /* renamed from: h  reason: collision with root package name */
    private final List f49018h;

    /* renamed from: i  reason: collision with root package name */
    private final L f49019i;

    /* renamed from: j  reason: collision with root package name */
    private List f49020j;

    /* renamed from: k  reason: collision with root package name */
    private p f49021k;

    public C4119d(L l10, b bVar, q qVar, C4071k kVar) {
        this(l10, bVar, qVar.c(), qVar.d(), g(l10, kVar, bVar, qVar.b()), i(qVar.b()));
    }

    private static List g(L l10, C4071k kVar, b bVar, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4118c a10 = ((c) list.get(i10)).a(l10, kVar, bVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    static n i(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = (c) list.get(i10);
            if (cVar instanceof n) {
                return (n) cVar;
            }
        }
        return null;
    }

    private boolean n() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f49018h.size(); i11++) {
            if ((this.f49018h.get(i11) instanceof C4120e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public void b() {
        this.f49019i.invalidateSelf();
    }

    public void c(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f49018h.size());
        arrayList.addAll(list);
        for (int size = this.f49018h.size() - 1; size >= 0; size--) {
            C4118c cVar = (C4118c) this.f49018h.get(size);
            cVar.c(arrayList, this.f49018h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    public void d(e eVar, int i10, List list, e eVar2) {
        if (eVar.g(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                int e10 = i10 + eVar.e(getName(), i10);
                for (int i11 = 0; i11 < this.f49018h.size(); i11++) {
                    C4118c cVar = (C4118c) this.f49018h.get(i11);
                    if (cVar instanceof f) {
                        ((f) cVar).d(eVar, e10, list, eVar2);
                    }
                }
            }
        }
    }

    public void e(Object obj, I4.c cVar) {
        p pVar = this.f49021k;
        if (pVar != null) {
            pVar.c(obj, cVar);
        }
    }

    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f49013c.set(matrix);
        p pVar = this.f49021k;
        if (pVar != null) {
            this.f49013c.preConcat(pVar.f());
        }
        this.f49015e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f49018h.size() - 1; size >= 0; size--) {
            C4118c cVar = (C4118c) this.f49018h.get(size);
            if (cVar instanceof C4120e) {
                ((C4120e) cVar).f(this.f49015e, this.f49013c, z10);
                rectF.union(this.f49015e);
            }
        }
    }

    public String getName() {
        return this.f49016f;
    }

    public void h(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        int i11;
        if (!this.f49017g) {
            this.f49013c.set(matrix);
            p pVar = this.f49021k;
            if (pVar != null) {
                this.f49013c.preConcat(pVar.f());
                if (this.f49021k.h() == null) {
                    i11 = 100;
                } else {
                    i11 = ((Integer) this.f49021k.h().h()).intValue();
                }
                i10 = (int) ((((((float) i11) / 100.0f) * ((float) i10)) / 255.0f) * 255.0f);
            }
            if (!this.f49019i.f0() || !n() || i10 == 255) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                this.f49012b.set(0.0f, 0.0f, 0.0f, 0.0f);
                f(this.f49012b, this.f49013c, true);
                this.f49011a.setAlpha(i10);
                l.n(canvas, this.f49012b, this.f49011a);
            }
            if (z10) {
                i10 = 255;
            }
            for (int size = this.f49018h.size() - 1; size >= 0; size--) {
                Object obj = this.f49018h.get(size);
                if (obj instanceof C4120e) {
                    ((C4120e) obj).h(canvas, this.f49013c, i10);
                }
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public List j() {
        return this.f49018h;
    }

    /* access modifiers changed from: package-private */
    public List k() {
        if (this.f49020j == null) {
            this.f49020j = new ArrayList();
            for (int i10 = 0; i10 < this.f49018h.size(); i10++) {
                C4118c cVar = (C4118c) this.f49018h.get(i10);
                if (cVar instanceof C4128m) {
                    this.f49020j.add((C4128m) cVar);
                }
            }
        }
        return this.f49020j;
    }

    /* access modifiers changed from: package-private */
    public Matrix l() {
        p pVar = this.f49021k;
        if (pVar != null) {
            return pVar.f();
        }
        this.f49013c.reset();
        return this.f49013c;
    }

    public Path m() {
        this.f49013c.reset();
        p pVar = this.f49021k;
        if (pVar != null) {
            this.f49013c.set(pVar.f());
        }
        this.f49014d.reset();
        if (this.f49017g) {
            return this.f49014d;
        }
        for (int size = this.f49018h.size() - 1; size >= 0; size--) {
            C4118c cVar = (C4118c) this.f49018h.get(size);
            if (cVar instanceof C4128m) {
                this.f49014d.addPath(((C4128m) cVar).m(), this.f49013c);
            }
        }
        return this.f49014d;
    }

    C4119d(L l10, b bVar, String str, boolean z10, List list, n nVar) {
        this.f49011a = new C4103a();
        this.f49012b = new RectF();
        this.f49013c = new Matrix();
        this.f49014d = new Path();
        this.f49015e = new RectF();
        this.f49016f = str;
        this.f49019i = l10;
        this.f49017g = z10;
        this.f49018h = list;
        if (nVar != null) {
            p b10 = nVar.b();
            this.f49021k = b10;
            b10.a(bVar);
            this.f49021k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            C4118c cVar = (C4118c) list.get(size);
            if (cVar instanceof C4125j) {
                arrayList.add((C4125j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((C4125j) arrayList.get(size2)).g(list.listIterator(list.size()));
        }
    }
}
