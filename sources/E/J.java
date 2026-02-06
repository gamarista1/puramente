package E;

import E.C1135d;
import a0.C1538b;
import yf.C6798l;

public final class J implements C1135d {

    /* renamed from: a  reason: collision with root package name */
    private final C1538b f1577a = new C1538b(new C1135d.a[16], 0);

    /* renamed from: b  reason: collision with root package name */
    private int f1578b;

    /* renamed from: c  reason: collision with root package name */
    private C1135d.a f1579c;

    private final void c(int i10) {
        if (i10 < 0 || i10 >= getSize()) {
            throw new IndexOutOfBoundsException("Index " + i10 + ", size " + getSize());
        }
    }

    private final boolean d(C1135d.a aVar, int i10) {
        int b10 = aVar.b();
        if (i10 >= aVar.b() + aVar.a() || b10 > i10) {
            return false;
        }
        return true;
    }

    private final C1135d.a e(int i10) {
        C1135d.a aVar = this.f1579c;
        if (aVar != null && d(aVar, i10)) {
            return aVar;
        }
        C1538b bVar = this.f1577a;
        C1135d.a aVar2 = (C1135d.a) bVar.p()[C1136e.b(bVar, i10)];
        this.f1579c = aVar2;
        return aVar2;
    }

    public void a(int i10, int i11, C6798l lVar) {
        c(i10);
        c(i11);
        if (i11 >= i10) {
            int a10 = C1136e.b(this.f1577a, i10);
            int b10 = ((C1135d.a) this.f1577a.p()[a10]).b();
            while (b10 <= i11) {
                C1135d.a aVar = (C1135d.a) this.f1577a.p()[a10];
                lVar.invoke(aVar);
                b10 += aVar.a();
                a10++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i11 + ") should be not smaller than fromIndex (" + i10 + ')').toString());
    }

    public final void b(int i10, Object obj) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("size should be >=0, but was " + i10).toString());
        } else if (i10 != 0) {
            C1135d.a aVar = new C1135d.a(getSize(), i10, obj);
            this.f1578b = getSize() + i10;
            this.f1577a.b(aVar);
        }
    }

    public C1135d.a get(int i10) {
        c(i10);
        return e(i10);
    }

    public int getSize() {
        return this.f1578b;
    }
}
