package V4;

import T4.i;
import V4.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o5.k;
import x1.e;

public class t {

    /* renamed from: a  reason: collision with root package name */
    private final Class f34629a;

    /* renamed from: b  reason: collision with root package name */
    private final e f34630b;

    /* renamed from: c  reason: collision with root package name */
    private final List f34631c;

    /* renamed from: d  reason: collision with root package name */
    private final String f34632d;

    public t(Class cls, Class cls2, Class cls3, List list, e eVar) {
        this.f34629a = cls;
        this.f34630b = eVar;
        this.f34631c = (List) k.c(list);
        this.f34632d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v b(com.bumptech.glide.load.data.e eVar, i iVar, int i10, int i11, i.a aVar, List list) {
        List list2 = list;
        int size = this.f34631c.size();
        v vVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                vVar = ((i) this.f34631c.get(i12)).a(eVar, i10, i11, iVar, aVar);
            } catch (q e10) {
                list2.add(e10);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f34632d, (List) new ArrayList(list2));
    }

    public v a(com.bumptech.glide.load.data.e eVar, T4.i iVar, int i10, int i11, i.a aVar) {
        List list = (List) k.d(this.f34630b.b());
        try {
            return b(eVar, iVar, i10, i11, aVar, list);
        } finally {
            this.f34630b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f34631c.toArray()) + '}';
    }
}
