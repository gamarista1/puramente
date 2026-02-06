package u2;

import W2.e;
import com.google.common.collect.C4770v;
import com.google.common.collect.O;
import i2.C2076a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: u2.e  reason: case insensitive filesystem */
final class C2701e implements C2697a {

    /* renamed from: b  reason: collision with root package name */
    private static final O f26556b = O.d().f(new C2699c()).a(O.d().g().f(new C2700d()));

    /* renamed from: a  reason: collision with root package name */
    private final List f26557a = new ArrayList();

    public C4770v a(long j10) {
        if (!this.f26557a.isEmpty()) {
            if (j10 >= ((e) this.f26557a.get(0)).f8638b) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f26557a.size(); i10++) {
                    e eVar = (e) this.f26557a.get(i10);
                    if (j10 >= eVar.f8638b && j10 < eVar.f8640d) {
                        arrayList.add(eVar);
                    }
                    if (j10 < eVar.f8638b) {
                        break;
                    }
                }
                C4770v W10 = C4770v.W(f26556b, arrayList);
                C4770v.a t10 = C4770v.t();
                for (int i11 = 0; i11 < W10.size(); i11++) {
                    t10.j(((e) W10.get(i11)).f8637a);
                }
                return t10.k();
            }
        }
        return C4770v.E();
    }

    public long b(long j10) {
        if (this.f26557a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < ((e) this.f26557a.get(0)).f8638b) {
            return -9223372036854775807L;
        }
        long j11 = ((e) this.f26557a.get(0)).f8638b;
        for (int i10 = 0; i10 < this.f26557a.size(); i10++) {
            long j12 = ((e) this.f26557a.get(i10)).f8638b;
            long j13 = ((e) this.f26557a.get(i10)).f8640d;
            if (j13 > j10) {
                if (j12 > j10) {
                    break;
                }
                j11 = Math.max(j11, j12);
            } else {
                j11 = Math.max(j11, j13);
            }
        }
        return j11;
    }

    public long c(long j10) {
        int i10 = 0;
        long j11 = -9223372036854775807L;
        while (true) {
            if (i10 >= this.f26557a.size()) {
                break;
            }
            long j12 = ((e) this.f26557a.get(i10)).f8638b;
            long j13 = ((e) this.f26557a.get(i10)).f8640d;
            if (j10 >= j12) {
                if (j10 < j13) {
                    if (j11 == -9223372036854775807L) {
                        j11 = j13;
                    } else {
                        j11 = Math.min(j11, j13);
                    }
                }
                i10++;
            } else if (j11 == -9223372036854775807L) {
                j11 = j12;
            } else {
                j11 = Math.min(j11, j12);
            }
        }
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        return Long.MIN_VALUE;
    }

    public void clear() {
        this.f26557a.clear();
    }

    public boolean d(e eVar, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (eVar.f8638b != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        if (eVar.f8639c != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        C2076a.a(z11);
        if (eVar.f8638b > j10 || j10 >= eVar.f8640d) {
            z12 = false;
        } else {
            z12 = true;
        }
        for (int size = this.f26557a.size() - 1; size >= 0; size--) {
            if (eVar.f8638b >= ((e) this.f26557a.get(size)).f8638b) {
                this.f26557a.add(size + 1, eVar);
                return z12;
            }
        }
        this.f26557a.add(0, eVar);
        return z12;
    }

    public void e(long j10) {
        int i10 = 0;
        while (i10 < this.f26557a.size()) {
            int i11 = (j10 > ((e) this.f26557a.get(i10)).f8638b ? 1 : (j10 == ((e) this.f26557a.get(i10)).f8638b ? 0 : -1));
            if (i11 > 0 && j10 > ((e) this.f26557a.get(i10)).f8640d) {
                this.f26557a.remove(i10);
                i10--;
            } else if (i11 < 0) {
                return;
            }
            i10++;
        }
    }
}
