package Y;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public final class F0 {

    /* renamed from: a  reason: collision with root package name */
    private final List f9760a;

    public F0(List list) {
        this.f9760a = list;
    }

    public final void a(int i10) {
        if (!this.f9760a.isEmpty()) {
            if (((Number) this.f9760a.get(0)).intValue() != i10) {
                List list = this.f9760a;
                if (((Number) list.get(list.size() - 1)).intValue() == i10) {
                    return;
                }
            } else {
                return;
            }
        }
        int size = this.f9760a.size();
        this.f9760a.add(Integer.valueOf(i10));
        while (size > 0) {
            int i11 = ((size + 1) >>> 1) - 1;
            int intValue = ((Number) this.f9760a.get(i11)).intValue();
            if (i10 <= intValue) {
                break;
            }
            this.f9760a.set(size, Integer.valueOf(intValue));
            size = i11;
        }
        this.f9760a.set(size, Integer.valueOf(i10));
    }

    public final boolean b() {
        return !this.f9760a.isEmpty();
    }

    public final int c() {
        return ((Number) C6565s.o0(this.f9760a)).intValue();
    }

    public final int d() {
        boolean z10;
        int intValue;
        if (this.f9760a.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C1506p.r("Set is empty");
        }
        int intValue2 = ((Number) this.f9760a.get(0)).intValue();
        while (!this.f9760a.isEmpty() && ((Number) this.f9760a.get(0)).intValue() == intValue2) {
            List list = this.f9760a;
            list.set(0, C6565s.z0(list));
            List list2 = this.f9760a;
            list2.remove(list2.size() - 1);
            int size = this.f9760a.size();
            int size2 = this.f9760a.size() >>> 1;
            int i10 = 0;
            while (i10 < size2) {
                int intValue3 = ((Number) this.f9760a.get(i10)).intValue();
                int i11 = (i10 + 1) * 2;
                int i12 = i11 - 1;
                int intValue4 = ((Number) this.f9760a.get(i12)).intValue();
                if (i11 < size && (intValue = ((Number) this.f9760a.get(i11)).intValue()) > intValue4) {
                    if (intValue <= intValue3) {
                        break;
                    }
                    this.f9760a.set(i10, Integer.valueOf(intValue));
                    this.f9760a.set(i11, Integer.valueOf(intValue3));
                    i10 = i11;
                } else if (intValue4 <= intValue3) {
                    break;
                } else {
                    this.f9760a.set(i10, Integer.valueOf(intValue4));
                    this.f9760a.set(i12, Integer.valueOf(intValue3));
                    i10 = i12;
                }
            }
        }
        return intValue2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F0(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }
}
