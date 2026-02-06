package m3;

import Ef.i;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.Z;
import mf.C6565s;

public final class W {

    /* renamed from: e  reason: collision with root package name */
    public static final a f23921e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final W f23922f = new W(0, C6565s.n());

    /* renamed from: a  reason: collision with root package name */
    private final int[] f23923a;

    /* renamed from: b  reason: collision with root package name */
    private final List f23924b;

    /* renamed from: c  reason: collision with root package name */
    private final int f23925c;

    /* renamed from: d  reason: collision with root package name */
    private final List f23926d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final W a() {
            return W.f23922f;
        }

        private a() {
        }
    }

    public W(int[] iArr, List list, int i10, List list2) {
        C6496s.h(iArr, "originalPageOffsets");
        C6496s.h(list, "data");
        this.f23923a = iArr;
        this.f23924b = list;
        this.f23925c = i10;
        this.f23926d = list2;
        if (iArr.length == 0) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage");
        } else if (list2 != null && list2.size() != list.size()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("If originalIndices (size = ");
            C6496s.e(list2);
            sb2.append(list2.size());
            sb2.append(") is provided, it must be same length as data (size = ");
            sb2.append(list.size());
            sb2.append(')');
            throw new IllegalArgumentException(sb2.toString().toString());
        }
    }

    public final List b() {
        return this.f23924b;
    }

    public final List c() {
        return this.f23926d;
    }

    public final int d() {
        return this.f23925c;
    }

    public final int[] e() {
        return this.f23923a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        W w10 = (W) obj;
        if (Arrays.equals(this.f23923a, w10.f23923a) && C6496s.c(this.f23924b, w10.f23924b) && this.f23925c == w10.f23925c && C6496s.c(this.f23926d, w10.f23926d)) {
            return true;
        }
        return false;
    }

    public final Z.a f(int i10, int i11, int i12, int i13, int i14) {
        i o10;
        int i15 = this.f23925c;
        List list = this.f23926d;
        if (!(list == null || (o10 = C6565s.o(list)) == null || !o10.p(i10))) {
            i10 = ((Number) this.f23926d.get(i10)).intValue();
        }
        return new Z.a(i15, i10, i11, i12, i13, i14);
    }

    public int hashCode() {
        int i10;
        int hashCode = ((((Arrays.hashCode(this.f23923a) * 31) + this.f23924b.hashCode()) * 31) + this.f23925c) * 31;
        List list = this.f23926d;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.f23923a) + ", data=" + this.f23924b + ", hintOriginalPageOffset=" + this.f23925c + ", hintOriginalIndices=" + this.f23926d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public W(int i10, List list) {
        this(new int[]{i10}, list, i10, (List) null);
        C6496s.h(list, "data");
    }
}
