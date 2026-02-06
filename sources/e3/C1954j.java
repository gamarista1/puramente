package e3;

import W2.k;
import h2.C2030a;
import i2.C2076a;
import i2.L;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: e3.j  reason: case insensitive filesystem */
final class C1954j implements k {

    /* renamed from: a  reason: collision with root package name */
    private final List f19586a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f19587b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f19588c;

    public C1954j(List list) {
        this.f19586a = Collections.unmodifiableList(new ArrayList(list));
        this.f19587b = new long[(list.size() * 2)];
        for (int i10 = 0; i10 < list.size(); i10++) {
            C1948d dVar = (C1948d) list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f19587b;
            jArr[i11] = dVar.f19557b;
            jArr[i11 + 1] = dVar.f19558c;
        }
        long[] jArr2 = this.f19587b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f19588c = copyOf;
        Arrays.sort(copyOf);
    }

    public int a(long j10) {
        int d10 = L.d(this.f19588c, j10, false, false);
        if (d10 < this.f19588c.length) {
            return d10;
        }
        return -1;
    }

    public List b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f19586a.size(); i10++) {
            long[] jArr = this.f19587b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                C1948d dVar = (C1948d) this.f19586a.get(i10);
                C2030a aVar = dVar.f19556a;
                if (aVar.f21194e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new C1953i());
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((C1948d) arrayList2.get(i12)).f19556a.a().h((float) (-1 - i12), 1).a());
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
        C2076a.a(z10);
        if (i10 < this.f19588c.length) {
            z11 = true;
        }
        C2076a.a(z11);
        return this.f19588c[i10];
    }

    public int e() {
        return this.f19588c.length;
    }
}
