package V4;

import android.util.Log;
import h5.C3579e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o5.k;
import x1.e;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Class f34533a;

    /* renamed from: b  reason: collision with root package name */
    private final List f34534b;

    /* renamed from: c  reason: collision with root package name */
    private final C3579e f34535c;

    /* renamed from: d  reason: collision with root package name */
    private final e f34536d;

    /* renamed from: e  reason: collision with root package name */
    private final String f34537e;

    interface a {
        v a(v vVar);
    }

    public i(Class cls, Class cls2, Class cls3, List list, C3579e eVar, e eVar2) {
        this.f34533a = cls;
        this.f34534b = list;
        this.f34535c = eVar;
        this.f34536d = eVar2;
        this.f34537e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v b(com.bumptech.glide.load.data.e eVar, int i10, int i11, T4.i iVar) {
        List list = (List) k.d(this.f34536d.b());
        try {
            return c(eVar, i10, i11, iVar, list);
        } finally {
            this.f34536d.a(list);
        }
    }

    private v c(com.bumptech.glide.load.data.e eVar, int i10, int i11, T4.i iVar, List list) {
        int size = this.f34534b.size();
        v vVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            T4.k kVar = (T4.k) this.f34534b.get(i12);
            try {
                if (kVar.a(eVar.a(), iVar)) {
                    vVar = kVar.b(eVar.a(), i10, i11, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e10);
                }
                list.add(e10);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f34537e, (List) new ArrayList(list));
    }

    public v a(com.bumptech.glide.load.data.e eVar, int i10, int i11, T4.i iVar, a aVar) {
        return this.f34535c.a(aVar.a(b(eVar, i10, i11, iVar)), iVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f34533a + ", decoders=" + this.f34534b + ", transcoder=" + this.f34535c + '}';
    }
}
