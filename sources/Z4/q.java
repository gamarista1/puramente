package Z4;

import T4.f;
import T4.i;
import Z4.n;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o5.k;
import x1.e;

class q implements n {

    /* renamed from: a  reason: collision with root package name */
    private final List f35909a;

    /* renamed from: b  reason: collision with root package name */
    private final e f35910b;

    static class a implements d, d.a {

        /* renamed from: a  reason: collision with root package name */
        private final List f35911a;

        /* renamed from: b  reason: collision with root package name */
        private final e f35912b;

        /* renamed from: c  reason: collision with root package name */
        private int f35913c = 0;

        /* renamed from: d  reason: collision with root package name */
        private h f35914d;

        /* renamed from: e  reason: collision with root package name */
        private d.a f35915e;

        /* renamed from: f  reason: collision with root package name */
        private List f35916f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f35917g;

        a(List list, e eVar) {
            this.f35912b = eVar;
            k.c(list);
            this.f35911a = list;
        }

        private void f() {
            if (!this.f35917g) {
                if (this.f35913c < this.f35911a.size() - 1) {
                    this.f35913c++;
                    d(this.f35914d, this.f35915e);
                    return;
                }
                k.d(this.f35916f);
                this.f35915e.c(new V4.q("Fetch failed", (List) new ArrayList(this.f35916f)));
            }
        }

        public Class a() {
            return ((d) this.f35911a.get(0)).a();
        }

        public void b() {
            List list = this.f35916f;
            if (list != null) {
                this.f35912b.a(list);
            }
            this.f35916f = null;
            for (d b10 : this.f35911a) {
                b10.b();
            }
        }

        public void c(Exception exc) {
            ((List) k.d(this.f35916f)).add(exc);
            f();
        }

        public void cancel() {
            this.f35917g = true;
            for (d cancel : this.f35911a) {
                cancel.cancel();
            }
        }

        public void d(h hVar, d.a aVar) {
            this.f35914d = hVar;
            this.f35915e = aVar;
            this.f35916f = (List) this.f35912b.b();
            ((d) this.f35911a.get(this.f35913c)).d(hVar, this);
            if (this.f35917g) {
                cancel();
            }
        }

        public void e(Object obj) {
            if (obj != null) {
                this.f35915e.e(obj);
            } else {
                f();
            }
        }

        public T4.a getDataSource() {
            return ((d) this.f35911a.get(0)).getDataSource();
        }
    }

    q(List list, e eVar) {
        this.f35909a = list;
        this.f35910b = eVar;
    }

    public n.a a(Object obj, int i10, int i11, i iVar) {
        n.a a10;
        int size = this.f35909a.size();
        ArrayList arrayList = new ArrayList(size);
        f fVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) this.f35909a.get(i12);
            if (nVar.b(obj) && (a10 = nVar.a(obj, i10, i11, iVar)) != null) {
                fVar = a10.f35902a;
                arrayList.add(a10.f35904c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new n.a(fVar, new a(arrayList, this.f35910b));
    }

    public boolean b(Object obj) {
        for (n b10 : this.f35909a) {
            if (b10.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f35909a.toArray()) + '}';
    }
}
