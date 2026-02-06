package X5;

import java.lang.ref.SoftReference;

public class f {

    /* renamed from: a  reason: collision with root package name */
    SoftReference f35036a = null;

    /* renamed from: b  reason: collision with root package name */
    SoftReference f35037b = null;

    /* renamed from: c  reason: collision with root package name */
    SoftReference f35038c = null;

    public void a() {
        SoftReference softReference = this.f35036a;
        if (softReference != null) {
            softReference.clear();
            this.f35036a = null;
        }
        SoftReference softReference2 = this.f35037b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f35037b = null;
        }
        SoftReference softReference3 = this.f35038c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f35038c = null;
        }
    }

    public Object b() {
        SoftReference softReference = this.f35036a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void c(Object obj) {
        this.f35036a = new SoftReference(obj);
        this.f35037b = new SoftReference(obj);
        this.f35038c = new SoftReference(obj);
    }
}
