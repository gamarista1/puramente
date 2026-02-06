package V4;

import T4.d;
import T4.i;
import X4.a;
import java.io.File;

class e implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private final d f34458a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f34459b;

    /* renamed from: c  reason: collision with root package name */
    private final i f34460c;

    e(d dVar, Object obj, i iVar) {
        this.f34458a = dVar;
        this.f34459b = obj;
        this.f34460c = iVar;
    }

    public boolean a(File file) {
        return this.f34458a.a(this.f34459b, file, this.f34460c);
    }
}
