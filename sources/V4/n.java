package V4;

import T4.f;
import T4.i;
import java.security.MessageDigest;
import java.util.Map;
import o5.k;

class n implements f {

    /* renamed from: b  reason: collision with root package name */
    private final Object f34602b;

    /* renamed from: c  reason: collision with root package name */
    private final int f34603c;

    /* renamed from: d  reason: collision with root package name */
    private final int f34604d;

    /* renamed from: e  reason: collision with root package name */
    private final Class f34605e;

    /* renamed from: f  reason: collision with root package name */
    private final Class f34606f;

    /* renamed from: g  reason: collision with root package name */
    private final f f34607g;

    /* renamed from: h  reason: collision with root package name */
    private final Map f34608h;

    /* renamed from: i  reason: collision with root package name */
    private final i f34609i;

    /* renamed from: j  reason: collision with root package name */
    private int f34610j;

    n(Object obj, f fVar, int i10, int i11, Map map, Class cls, Class cls2, i iVar) {
        this.f34602b = k.d(obj);
        this.f34607g = (f) k.e(fVar, "Signature must not be null");
        this.f34603c = i10;
        this.f34604d = i11;
        this.f34608h = (Map) k.d(map);
        this.f34605e = (Class) k.e(cls, "Resource class must not be null");
        this.f34606f = (Class) k.e(cls2, "Transcode class must not be null");
        this.f34609i = (i) k.d(iVar);
    }

    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f34602b.equals(nVar.f34602b) || !this.f34607g.equals(nVar.f34607g) || this.f34604d != nVar.f34604d || this.f34603c != nVar.f34603c || !this.f34608h.equals(nVar.f34608h) || !this.f34605e.equals(nVar.f34605e) || !this.f34606f.equals(nVar.f34606f) || !this.f34609i.equals(nVar.f34609i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f34610j == 0) {
            int hashCode = this.f34602b.hashCode();
            this.f34610j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f34607g.hashCode()) * 31) + this.f34603c) * 31) + this.f34604d;
            this.f34610j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f34608h.hashCode();
            this.f34610j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f34605e.hashCode();
            this.f34610j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f34606f.hashCode();
            this.f34610j = hashCode5;
            this.f34610j = (hashCode5 * 31) + this.f34609i.hashCode();
        }
        return this.f34610j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f34602b + ", width=" + this.f34603c + ", height=" + this.f34604d + ", resourceClass=" + this.f34605e + ", transcodeClass=" + this.f34606f + ", signature=" + this.f34607g + ", hashCode=" + this.f34610j + ", transformations=" + this.f34608h + ", options=" + this.f34609i + '}';
    }
}
