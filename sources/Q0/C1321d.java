package Q0;

import h0.C2026j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import pf.C6632a;

/* renamed from: Q0.d  reason: case insensitive filesystem */
public final class C1321d implements CharSequence {

    /* renamed from: e  reason: collision with root package name */
    public static final b f5311e = new b((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final C2026j f5312f = B.h();

    /* renamed from: a  reason: collision with root package name */
    private final String f5313a;

    /* renamed from: b  reason: collision with root package name */
    private final List f5314b;

    /* renamed from: c  reason: collision with root package name */
    private final List f5315c;

    /* renamed from: d  reason: collision with root package name */
    private final List f5316d;

    /* renamed from: Q0.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: Q0.d$d  reason: collision with other inner class name */
    public static final class C0134d implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C6632a.d(Integer.valueOf(((c) obj).h()), Integer.valueOf(((c) obj2).h()));
        }
    }

    public C1321d(String str, List list, List list2, List list3) {
        List U02;
        this.f5313a = str;
        this.f5314b = list;
        this.f5315c = list2;
        this.f5316d = list3;
        if (list2 != null && (U02 = C6565s.U0(list2, new C0134d())) != null) {
            int size = U02.size();
            int i10 = -1;
            int i11 = 0;
            while (i11 < size) {
                c cVar = (c) U02.get(i11);
                if (cVar.h() < i10) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap");
                } else if (cVar.f() <= this.f5313a.length()) {
                    i10 = cVar.f();
                    i11++;
                } else {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + cVar.h() + ", " + cVar.f() + ") is out of boundary").toString());
                }
            }
        }
    }

    public char a(int i10) {
        return this.f5313a.charAt(i10);
    }

    public final List b() {
        return this.f5316d;
    }

    public int c() {
        return this.f5313a.length();
    }

    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    public final List d(int i10, int i11) {
        List list;
        List list2 = this.f5316d;
        if (list2 != null) {
            list = new ArrayList(list2.size());
            int size = list2.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list2.get(i12);
                c cVar = (c) obj;
                if ((cVar.g() instanceof C1326i) && C1322e.l(i10, i11, cVar.h(), cVar.f())) {
                    list.add(obj);
                }
            }
        } else {
            list = C6565s.n();
        }
        C6496s.f(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return list;
    }

    public final List e() {
        List list = this.f5315c;
        if (list == null) {
            return C6565s.n();
        }
        return list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1321d)) {
            return false;
        }
        C1321d dVar = (C1321d) obj;
        if (C6496s.c(this.f5313a, dVar.f5313a) && C6496s.c(this.f5314b, dVar.f5314b) && C6496s.c(this.f5315c, dVar.f5315c) && C6496s.c(this.f5316d, dVar.f5316d)) {
            return true;
        }
        return false;
    }

    public final List f() {
        return this.f5315c;
    }

    public final List g() {
        List list = this.f5314b;
        if (list == null) {
            return C6565s.n();
        }
        return list;
    }

    public final List h() {
        return this.f5314b;
    }

    public int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f5313a.hashCode() * 31;
        List list = this.f5314b;
        int i12 = 0;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        List list2 = this.f5315c;
        if (list2 != null) {
            i11 = list2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        List list3 = this.f5316d;
        if (list3 != null) {
            i12 = list3.hashCode();
        }
        return i14 + i12;
    }

    public final List i(String str, int i10, int i11) {
        List list;
        List list2 = this.f5316d;
        if (list2 != null) {
            list = new ArrayList(list2.size());
            int size = list2.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list2.get(i12);
                c cVar = (c) obj;
                if ((cVar.g() instanceof String) && C6496s.c(str, cVar.i()) && C1322e.l(i10, i11, cVar.h(), cVar.f())) {
                    list.add(obj);
                }
            }
        } else {
            list = C6565s.n();
        }
        C6496s.f(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return list;
    }

    public final String j() {
        return this.f5313a;
    }

    public final List k(int i10, int i11) {
        List list;
        List list2 = this.f5316d;
        if (list2 != null) {
            list = new ArrayList(list2.size());
            int size = list2.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list2.get(i12);
                c cVar = (c) obj;
                if ((cVar.g() instanceof V) && C1322e.l(i10, i11, cVar.h(), cVar.f())) {
                    list.add(obj);
                }
            }
        } else {
            list = C6565s.n();
        }
        C6496s.f(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return list;
    }

    public final List l(int i10, int i11) {
        List list;
        List list2 = this.f5316d;
        if (list2 != null) {
            list = new ArrayList(list2.size());
            int size = list2.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list2.get(i12);
                c cVar = (c) obj;
                if ((cVar.g() instanceof W) && C1322e.l(i10, i11, cVar.h(), cVar.f())) {
                    list.add(obj);
                }
            }
        } else {
            list = C6565s.n();
        }
        C6496s.f(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return list;
    }

    public final /* bridge */ int length() {
        return c();
    }

    public final boolean m(C1321d dVar) {
        return C6496s.c(this.f5316d, dVar.f5316d);
    }

    public final boolean n(int i10, int i11) {
        List list = this.f5316d;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = (c) list.get(i12);
            if ((cVar.g() instanceof C1326i) && C1322e.l(i10, i11, cVar.h(), cVar.f())) {
                return true;
            }
        }
        return false;
    }

    public final boolean o(String str, int i10, int i11) {
        List list = this.f5316d;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = (c) list.get(i12);
            if ((cVar.g() instanceof String) && C6496s.c(str, cVar.i()) && C1322e.l(i10, i11, cVar.h(), cVar.f())) {
                return true;
            }
        }
        return false;
    }

    public final C1321d p(C1321d dVar) {
        a aVar = new a(this);
        aVar.f(dVar);
        return aVar.n();
    }

    /* renamed from: q */
    public C1321d subSequence(int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
        } else if (i10 == 0 && i11 == this.f5313a.length()) {
            return this;
        } else {
            String substring = this.f5313a.substring(i10, i11);
            C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new C1321d(substring, C1322e.h(this.f5314b, i10, i11), C1322e.h(this.f5315c, i10, i11), C1322e.h(this.f5316d, i10, i11));
        }
    }

    public final C1321d r(long j10) {
        return subSequence(Q.l(j10), Q.k(j10));
    }

    public String toString() {
        return this.f5313a;
    }

    /* renamed from: Q0.d$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Object f5326a;

        /* renamed from: b  reason: collision with root package name */
        private final int f5327b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5328c;

        /* renamed from: d  reason: collision with root package name */
        private final String f5329d;

        public c(Object obj, int i10, int i11, String str) {
            this.f5326a = obj;
            this.f5327b = i10;
            this.f5328c = i11;
            this.f5329d = str;
            if (i10 > i11) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public static /* synthetic */ c e(c cVar, Object obj, int i10, int i11, String str, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = cVar.f5326a;
            }
            if ((i12 & 2) != 0) {
                i10 = cVar.f5327b;
            }
            if ((i12 & 4) != 0) {
                i11 = cVar.f5328c;
            }
            if ((i12 & 8) != 0) {
                str = cVar.f5329d;
            }
            return cVar.d(obj, i10, i11, str);
        }

        public final Object a() {
            return this.f5326a;
        }

        public final int b() {
            return this.f5327b;
        }

        public final int c() {
            return this.f5328c;
        }

        public final c d(Object obj, int i10, int i11, String str) {
            return new c(obj, i10, i11, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (C6496s.c(this.f5326a, cVar.f5326a) && this.f5327b == cVar.f5327b && this.f5328c == cVar.f5328c && C6496s.c(this.f5329d, cVar.f5329d)) {
                return true;
            }
            return false;
        }

        public final int f() {
            return this.f5328c;
        }

        public final Object g() {
            return this.f5326a;
        }

        public final int h() {
            return this.f5327b;
        }

        public int hashCode() {
            int i10;
            Object obj = this.f5326a;
            if (obj == null) {
                i10 = 0;
            } else {
                i10 = obj.hashCode();
            }
            return (((((i10 * 31) + Integer.hashCode(this.f5327b)) * 31) + Integer.hashCode(this.f5328c)) * 31) + this.f5329d.hashCode();
        }

        public final String i() {
            return this.f5329d;
        }

        public String toString() {
            return "Range(item=" + this.f5326a + ", start=" + this.f5327b + ", end=" + this.f5328c + ", tag=" + this.f5329d + ')';
        }

        public c(Object obj, int i10, int i11) {
            this(obj, i10, i11, "");
        }
    }

    /* renamed from: Q0.d$a */
    public static final class a implements Appendable {

        /* renamed from: a  reason: collision with root package name */
        private final StringBuilder f5317a;

        /* renamed from: b  reason: collision with root package name */
        private final List f5318b;

        /* renamed from: c  reason: collision with root package name */
        private final List f5319c;

        /* renamed from: d  reason: collision with root package name */
        private final List f5320d;

        /* renamed from: e  reason: collision with root package name */
        private final List f5321e;

        public a(int i10) {
            this.f5317a = new StringBuilder(i10);
            this.f5318b = new ArrayList();
            this.f5319c = new ArrayList();
            this.f5320d = new ArrayList();
            this.f5321e = new ArrayList();
        }

        public final void a(C1338v vVar, int i10, int i11) {
            this.f5319c.add(new C0133a(vVar, i10, i11, (String) null, 8, (DefaultConstructorMarker) null));
        }

        public final void b(C c10, int i10, int i11) {
            this.f5318b.add(new C0133a(c10, i10, i11, (String) null, 8, (DefaultConstructorMarker) null));
        }

        /* renamed from: c */
        public a append(char c10) {
            this.f5317a.append(c10);
            return this;
        }

        /* renamed from: d */
        public a append(CharSequence charSequence) {
            if (charSequence instanceof C1321d) {
                f((C1321d) charSequence);
            } else {
                this.f5317a.append(charSequence);
            }
            return this;
        }

        /* renamed from: e */
        public a append(CharSequence charSequence, int i10, int i11) {
            if (charSequence instanceof C1321d) {
                g((C1321d) charSequence, i10, i11);
            } else {
                this.f5317a.append(charSequence, i10, i11);
            }
            return this;
        }

        public final void f(C1321d dVar) {
            int length = this.f5317a.length();
            this.f5317a.append(dVar.j());
            List h10 = dVar.h();
            if (h10 != null) {
                int size = h10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c cVar = (c) h10.get(i10);
                    b((C) cVar.g(), cVar.h() + length, cVar.f() + length);
                }
            }
            List f10 = dVar.f();
            if (f10 != null) {
                int size2 = f10.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar2 = (c) f10.get(i11);
                    a((C1338v) cVar2.g(), cVar2.h() + length, cVar2.f() + length);
                }
            }
            List b10 = dVar.b();
            if (b10 != null) {
                int size3 = b10.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    c cVar3 = (c) b10.get(i12);
                    this.f5320d.add(new C0133a(cVar3.g(), cVar3.h() + length, cVar3.f() + length, cVar3.i()));
                }
            }
        }

        public final void g(C1321d dVar, int i10, int i11) {
            int length = this.f5317a.length();
            this.f5317a.append(dVar.j(), i10, i11);
            List d10 = C1322e.k(dVar, i10, i11);
            if (d10 != null) {
                int size = d10.size();
                for (int i12 = 0; i12 < size; i12++) {
                    c cVar = (c) d10.get(i12);
                    b((C) cVar.g(), cVar.h() + length, cVar.f() + length);
                }
            }
            List c10 = C1322e.j(dVar, i10, i11);
            if (c10 != null) {
                int size2 = c10.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    c cVar2 = (c) c10.get(i13);
                    a((C1338v) cVar2.g(), cVar2.h() + length, cVar2.f() + length);
                }
            }
            List b10 = C1322e.i(dVar, i10, i11);
            if (b10 != null) {
                int size3 = b10.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    c cVar3 = (c) b10.get(i14);
                    this.f5320d.add(new C0133a(cVar3.g(), cVar3.h() + length, cVar3.f() + length, cVar3.i()));
                }
            }
        }

        public final void h(String str) {
            this.f5317a.append(str);
        }

        public final void i() {
            if (!this.f5321e.isEmpty()) {
                List list = this.f5321e;
                ((C0133a) list.remove(list.size() - 1)).a(this.f5317a.length());
                return;
            }
            throw new IllegalStateException("Nothing to pop.");
        }

        public final void j(int i10) {
            if (i10 < this.f5321e.size()) {
                while (this.f5321e.size() - 1 >= i10) {
                    i();
                }
                return;
            }
            throw new IllegalStateException((i10 + " should be less than " + this.f5321e.size()).toString());
        }

        public final int k(C1326i iVar) {
            C0133a aVar = new C0133a(iVar, this.f5317a.length(), 0, (String) null, 12, (DefaultConstructorMarker) null);
            this.f5321e.add(aVar);
            this.f5320d.add(aVar);
            return this.f5321e.size() - 1;
        }

        public final int l(C1338v vVar) {
            C0133a aVar = new C0133a(vVar, this.f5317a.length(), 0, (String) null, 12, (DefaultConstructorMarker) null);
            this.f5321e.add(aVar);
            this.f5319c.add(aVar);
            return this.f5321e.size() - 1;
        }

        public final int m(C c10) {
            C0133a aVar = new C0133a(c10, this.f5317a.length(), 0, (String) null, 12, (DefaultConstructorMarker) null);
            this.f5321e.add(aVar);
            this.f5318b.add(aVar);
            return this.f5321e.size() - 1;
        }

        public final C1321d n() {
            String sb2 = this.f5317a.toString();
            List list = this.f5318b;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((C0133a) list.get(i10)).b(this.f5317a.length()));
            }
            ArrayList arrayList2 = null;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List list2 = this.f5319c;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList3.add(((C0133a) list2.get(i11)).b(this.f5317a.length()));
            }
            if (arrayList3.isEmpty()) {
                arrayList3 = null;
            }
            List list3 = this.f5320d;
            ArrayList arrayList4 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                arrayList4.add(((C0133a) list3.get(i12)).b(this.f5317a.length()));
            }
            if (!arrayList4.isEmpty()) {
                arrayList2 = arrayList4;
            }
            return new C1321d(sb2, arrayList, arrayList3, arrayList2);
        }

        /* renamed from: Q0.d$a$a  reason: collision with other inner class name */
        private static final class C0133a {

            /* renamed from: a  reason: collision with root package name */
            private final Object f5322a;

            /* renamed from: b  reason: collision with root package name */
            private final int f5323b;

            /* renamed from: c  reason: collision with root package name */
            private int f5324c;

            /* renamed from: d  reason: collision with root package name */
            private final String f5325d;

            public C0133a(Object obj, int i10, int i11, String str) {
                this.f5322a = obj;
                this.f5323b = i10;
                this.f5324c = i11;
                this.f5325d = str;
            }

            public final void a(int i10) {
                this.f5324c = i10;
            }

            public final c b(int i10) {
                int i11 = this.f5324c;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (i10 != Integer.MIN_VALUE) {
                    return new c(this.f5322a, this.f5323b, i10, this.f5325d);
                }
                throw new IllegalStateException("Item.end should be set first");
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0133a)) {
                    return false;
                }
                C0133a aVar = (C0133a) obj;
                if (C6496s.c(this.f5322a, aVar.f5322a) && this.f5323b == aVar.f5323b && this.f5324c == aVar.f5324c && C6496s.c(this.f5325d, aVar.f5325d)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int i10;
                Object obj = this.f5322a;
                if (obj == null) {
                    i10 = 0;
                } else {
                    i10 = obj.hashCode();
                }
                return (((((i10 * 31) + Integer.hashCode(this.f5323b)) * 31) + Integer.hashCode(this.f5324c)) * 31) + this.f5325d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.f5322a + ", start=" + this.f5323b + ", end=" + this.f5324c + ", tag=" + this.f5325d + ')';
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C0133a(Object obj, int i10, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? "" : str);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        public a(C1321d dVar) {
            this(0, 1, (DefaultConstructorMarker) null);
            f(dVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1321d(String str, List list, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : list2, (i10 & 8) != 0 ? null : list3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1321d(String str, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? C6565s.n() : list, (i10 & 4) != 0 ? C6565s.n() : list2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1321d(java.lang.String r3, java.util.List r4, java.util.List r5) {
        /*
            r2 = this;
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r4 = r1
        L_0x000a:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0015
            r5 = r1
        L_0x0015:
            java.util.List r5 = (java.util.List) r5
            r2.<init>(r3, r4, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C1321d.<init>(java.lang.String, java.util.List, java.util.List):void");
    }
}
