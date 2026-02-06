package kg;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;
import yf.C6798l;

/* renamed from: kg.a  reason: case insensitive filesystem */
public abstract class C6434a {

    /* renamed from: f  reason: collision with root package name */
    public static final C1023a f71520f = new C1023a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int[] f71521a;

    /* renamed from: b  reason: collision with root package name */
    private final int f71522b;

    /* renamed from: c  reason: collision with root package name */
    private final int f71523c;

    /* renamed from: d  reason: collision with root package name */
    private final int f71524d;

    /* renamed from: e  reason: collision with root package name */
    private final List f71525e;

    /* renamed from: kg.a$a  reason: collision with other inner class name */
    public static final class C1023a {
        public /* synthetic */ C1023a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1023a() {
        }
    }

    public C6434a(int... iArr) {
        int i10;
        int i11;
        List list;
        C6496s.h(iArr, "numbers");
        this.f71521a = iArr;
        Integer l02 = C6559l.l0(iArr, 0);
        int i12 = -1;
        if (l02 != null) {
            i10 = l02.intValue();
        } else {
            i10 = -1;
        }
        this.f71522b = i10;
        Integer l03 = C6559l.l0(iArr, 1);
        if (l03 != null) {
            i11 = l03.intValue();
        } else {
            i11 = -1;
        }
        this.f71523c = i11;
        Integer l04 = C6559l.l0(iArr, 2);
        this.f71524d = l04 != null ? l04.intValue() : i12;
        if (iArr.length <= 3) {
            list = C6565s.n();
        } else if (iArr.length <= 1024) {
            list = C6565s.e1(C6559l.d(iArr).subList(3, iArr.length));
        } else {
            throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
        }
        this.f71525e = list;
    }

    public final int a() {
        return this.f71522b;
    }

    public final int b() {
        return this.f71523c;
    }

    public final boolean c(int i10, int i11, int i12) {
        int i13 = this.f71522b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f71523c;
        if (i14 > i11) {
            return true;
        }
        if (i14 < i11) {
            return false;
        }
        if (this.f71524d >= i12) {
            return true;
        }
        return false;
    }

    public final boolean d(C6434a aVar) {
        C6496s.h(aVar, DiagnosticsEntry.VERSION_KEY);
        return c(aVar.f71522b, aVar.f71523c, aVar.f71524d);
    }

    public final boolean e(int i10, int i11, int i12) {
        int i13 = this.f71522b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f71523c;
        if (i14 < i11) {
            return true;
        }
        if (i14 > i11) {
            return false;
        }
        if (this.f71524d <= i12) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && C6496s.c(getClass(), obj.getClass())) {
            C6434a aVar = (C6434a) obj;
            if (this.f71522b == aVar.f71522b && this.f71523c == aVar.f71523c && this.f71524d == aVar.f71524d && C6496s.c(this.f71525e, aVar.f71525e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean f(C6434a aVar) {
        C6496s.h(aVar, "ourVersion");
        int i10 = this.f71522b;
        if (i10 == 0) {
            if (!(aVar.f71522b == 0 && this.f71523c == aVar.f71523c)) {
                return false;
            }
        } else if (i10 != aVar.f71522b || this.f71523c > aVar.f71523c) {
            return false;
        }
        return true;
    }

    public final int[] g() {
        return this.f71521a;
    }

    public int hashCode() {
        int i10 = this.f71522b;
        int i11 = i10 + (i10 * 31) + this.f71523c;
        int i12 = i11 + (i11 * 31) + this.f71524d;
        return i12 + (i12 * 31) + this.f71525e.hashCode();
    }

    public String toString() {
        int[] g10 = g();
        ArrayList arrayList = new ArrayList();
        for (int i10 : g10) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        return C6565s.x0(arrayList, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
    }
}
