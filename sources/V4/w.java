package V4;

import T4.a;
import V4.f;
import Z4.n;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import p5.C3932b;

class w implements f, d.a {

    /* renamed from: a  reason: collision with root package name */
    private final f.a f34638a;

    /* renamed from: b  reason: collision with root package name */
    private final g f34639b;

    /* renamed from: c  reason: collision with root package name */
    private int f34640c;

    /* renamed from: d  reason: collision with root package name */
    private int f34641d = -1;

    /* renamed from: e  reason: collision with root package name */
    private T4.f f34642e;

    /* renamed from: f  reason: collision with root package name */
    private List f34643f;

    /* renamed from: g  reason: collision with root package name */
    private int f34644g;

    /* renamed from: h  reason: collision with root package name */
    private volatile n.a f34645h;

    /* renamed from: i  reason: collision with root package name */
    private File f34646i;

    /* renamed from: j  reason: collision with root package name */
    private x f34647j;

    w(g gVar, f.a aVar) {
        this.f34639b = gVar;
        this.f34638a = aVar;
    }

    private boolean a() {
        if (this.f34644g < this.f34643f.size()) {
            return true;
        }
        return false;
    }

    public boolean b() {
        C3932b.a("ResourceCacheGenerator.startNext");
        try {
            List c10 = this.f34639b.c();
            boolean z10 = false;
            if (c10.isEmpty()) {
                C3932b.e();
                return false;
            }
            List m10 = this.f34639b.m();
            if (!m10.isEmpty()) {
                while (true) {
                    if (this.f34643f != null) {
                        if (a()) {
                            this.f34645h = null;
                            while (!z10 && a()) {
                                List list = this.f34643f;
                                int i10 = this.f34644g;
                                this.f34644g = i10 + 1;
                                this.f34645h = ((n) list.get(i10)).a(this.f34646i, this.f34639b.t(), this.f34639b.f(), this.f34639b.k());
                                if (this.f34645h != null && this.f34639b.u(this.f34645h.f35904c.a())) {
                                    this.f34645h.f35904c.d(this.f34639b.l(), this);
                                    z10 = true;
                                }
                            }
                            C3932b.e();
                            return z10;
                        }
                    }
                    int i11 = this.f34641d + 1;
                    this.f34641d = i11;
                    if (i11 >= m10.size()) {
                        int i12 = this.f34640c + 1;
                        this.f34640c = i12;
                        if (i12 >= c10.size()) {
                            C3932b.e();
                            return false;
                        }
                        this.f34641d = 0;
                    }
                    T4.f fVar = (T4.f) c10.get(this.f34640c);
                    Class cls = (Class) m10.get(this.f34641d);
                    this.f34647j = new x(this.f34639b.b(), fVar, this.f34639b.p(), this.f34639b.t(), this.f34639b.f(), this.f34639b.s(cls), cls, this.f34639b.k());
                    File b10 = this.f34639b.d().b(this.f34647j);
                    this.f34646i = b10;
                    if (b10 != null) {
                        this.f34642e = fVar;
                        this.f34643f = this.f34639b.j(b10);
                        this.f34644g = 0;
                    }
                }
            } else if (File.class.equals(this.f34639b.r())) {
                C3932b.e();
                return false;
            } else {
                throw new IllegalStateException("Failed to find any load path from " + this.f34639b.i() + " to " + this.f34639b.r());
            }
        } catch (Throwable th2) {
            C3932b.e();
            throw th2;
        }
    }

    public void c(Exception exc) {
        this.f34638a.a(this.f34647j, exc, this.f34645h.f35904c, a.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        n.a aVar = this.f34645h;
        if (aVar != null) {
            aVar.f35904c.cancel();
        }
    }

    public void e(Object obj) {
        this.f34638a.c(this.f34642e, obj, this.f34645h.f35904c, a.RESOURCE_DISK_CACHE, this.f34647j);
    }
}
