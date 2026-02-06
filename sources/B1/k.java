package b1;

import e1.C1942a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19119b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final k f19120c = new k(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final k f19121d = new k(1);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final k f19122e = new k(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f19123a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(List list) {
            Integer num = 0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                num = Integer.valueOf(num.intValue() | ((k) list.get(i10)).e());
            }
            return new k(num.intValue());
        }

        public final k b() {
            return k.f19122e;
        }

        public final k c() {
            return k.f19120c;
        }

        public final k d() {
            return k.f19121d;
        }

        private a() {
        }
    }

    public k(int i10) {
        this.f19123a = i10;
    }

    public final boolean d(k kVar) {
        int i10 = this.f19123a;
        if ((kVar.f19123a | i10) == i10) {
            return true;
        }
        return false;
    }

    public final int e() {
        return this.f19123a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && this.f19123a == ((k) obj).f19123a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f19123a;
    }

    public String toString() {
        if (this.f19123a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f19123a & f19121d.f19123a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f19123a & f19122e.f19123a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + C1942a.e(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null) + ']';
    }
}
