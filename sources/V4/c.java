package V4;

import T4.a;
import V4.f;
import Z4.n;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import p5.C3932b;

class c implements f, d.a {

    /* renamed from: a  reason: collision with root package name */
    private final List f34447a;

    /* renamed from: b  reason: collision with root package name */
    private final g f34448b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a f34449c;

    /* renamed from: d  reason: collision with root package name */
    private int f34450d;

    /* renamed from: e  reason: collision with root package name */
    private T4.f f34451e;

    /* renamed from: f  reason: collision with root package name */
    private List f34452f;

    /* renamed from: g  reason: collision with root package name */
    private int f34453g;

    /* renamed from: h  reason: collision with root package name */
    private volatile n.a f34454h;

    /* renamed from: i  reason: collision with root package name */
    private File f34455i;

    c(g gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean a() {
        if (this.f34453g < this.f34452f.size()) {
            return true;
        }
        return false;
    }

    public boolean b() {
        C3932b.a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z10 = false;
                if (this.f34452f != null) {
                    if (a()) {
                        this.f34454h = null;
                        while (!z10 && a()) {
                            List list = this.f34452f;
                            int i10 = this.f34453g;
                            this.f34453g = i10 + 1;
                            this.f34454h = ((n) list.get(i10)).a(this.f34455i, this.f34448b.t(), this.f34448b.f(), this.f34448b.k());
                            if (this.f34454h != null && this.f34448b.u(this.f34454h.f35904c.a())) {
                                this.f34454h.f35904c.d(this.f34448b.l(), this);
                                z10 = true;
                            }
                        }
                        C3932b.e();
                        return z10;
                    }
                }
                int i11 = this.f34450d + 1;
                this.f34450d = i11;
                if (i11 >= this.f34447a.size()) {
                    return false;
                }
                T4.f fVar = (T4.f) this.f34447a.get(this.f34450d);
                File b10 = this.f34448b.d().b(new d(fVar, this.f34448b.p()));
                this.f34455i = b10;
                if (b10 != null) {
                    this.f34451e = fVar;
                    this.f34452f = this.f34448b.j(b10);
                    this.f34453g = 0;
                }
            } finally {
                C3932b.e();
            }
        }
    }

    public void c(Exception exc) {
        this.f34449c.a(this.f34451e, exc, this.f34454h.f35904c, a.DATA_DISK_CACHE);
    }

    public void cancel() {
        n.a aVar = this.f34454h;
        if (aVar != null) {
            aVar.f35904c.cancel();
        }
    }

    public void e(Object obj) {
        this.f34449c.c(this.f34451e, obj, this.f34454h.f35904c, a.DATA_DISK_CACHE, this.f34451e);
    }

    c(List list, g gVar, f.a aVar) {
        this.f34450d = -1;
        this.f34447a = list;
        this.f34448b = gVar;
        this.f34449c = aVar;
    }
}
