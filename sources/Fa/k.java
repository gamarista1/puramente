package fa;

import W9.b;
import W9.h;
import ja.C3645a;
import ja.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class k implements h {

    /* renamed from: a  reason: collision with root package name */
    private final List f43600a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f43601b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f43602c;

    public k(List list) {
        this.f43600a = Collections.unmodifiableList(new ArrayList(list));
        this.f43601b = new long[(list.size() * 2)];
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f43601b;
            jArr[i11] = eVar.f43571b;
            jArr[i11 + 1] = eVar.f43572c;
        }
        long[] jArr2 = this.f43601b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f43602c = copyOf;
        Arrays.sort(copyOf);
    }

    public int a(long j10) {
        int e10 = M.e(this.f43602c, j10, false, false);
        if (e10 < this.f43602c.length) {
            return e10;
        }
        return -1;
    }

    public List b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f43600a.size(); i10++) {
            long[] jArr = this.f43601b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = (e) this.f43600a.get(i10);
                b bVar = eVar.f43570a;
                if (bVar.f34932e == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new j());
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((e) arrayList2.get(i12)).f43570a.b().h((float) (-1 - i12), 1).a());
        }
        return arrayList;
    }

    public long c(int i10) {
        boolean z10;
        boolean z11 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        if (i10 < this.f43602c.length) {
            z11 = true;
        }
        C3645a.a(z11);
        return this.f43602c[i10];
    }

    public int e() {
        return this.f43602c.length;
    }
}
