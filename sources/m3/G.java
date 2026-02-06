package m3;

import Sg.p;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public abstract class G {

    public static final class a extends G {

        /* renamed from: a  reason: collision with root package name */
        private final int f23784a;

        /* renamed from: b  reason: collision with root package name */
        private final List f23785b;

        /* renamed from: c  reason: collision with root package name */
        private final int f23786c;

        /* renamed from: d  reason: collision with root package name */
        private final int f23787d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i10, List list, int i11, int i12) {
            super((DefaultConstructorMarker) null);
            C6496s.h(list, "inserted");
            this.f23784a = i10;
            this.f23785b = list;
            this.f23786c = i11;
            this.f23787d = i12;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f23784a == aVar.f23784a && C6496s.c(this.f23785b, aVar.f23785b) && this.f23786c == aVar.f23786c && this.f23787d == aVar.f23787d) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f23784a) + this.f23785b.hashCode() + Integer.hashCode(this.f23786c) + Integer.hashCode(this.f23787d);
        }

        public String toString() {
            return p.h("PagingDataEvent.Append loaded " + this.f23785b.size() + " items (\n                    |   startIndex: " + this.f23784a + "\n                    |   first item: " + C6565s.q0(this.f23785b) + "\n                    |   last item: " + C6565s.B0(this.f23785b) + "\n                    |   newPlaceholdersBefore: " + this.f23786c + "\n                    |   oldPlaceholdersBefore: " + this.f23787d + "\n                    |)\n                    |", (String) null, 1, (Object) null);
        }
    }

    public static final class b extends G {

        /* renamed from: a  reason: collision with root package name */
        private final int f23788a;

        /* renamed from: b  reason: collision with root package name */
        private final int f23789b;

        /* renamed from: c  reason: collision with root package name */
        private final int f23790c;

        /* renamed from: d  reason: collision with root package name */
        private final int f23791d;

        public b(int i10, int i11, int i12, int i13) {
            super((DefaultConstructorMarker) null);
            this.f23788a = i10;
            this.f23789b = i11;
            this.f23790c = i12;
            this.f23791d = i13;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f23788a == bVar.f23788a && this.f23789b == bVar.f23789b && this.f23790c == bVar.f23790c && this.f23791d == bVar.f23791d) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f23788a) + Integer.hashCode(this.f23789b) + Integer.hashCode(this.f23790c) + Integer.hashCode(this.f23791d);
        }

        public String toString() {
            return p.h("PagingDataEvent.DropAppend dropped " + this.f23789b + " items (\n                    |   startIndex: " + this.f23788a + "\n                    |   dropCount: " + this.f23789b + "\n                    |   newPlaceholdersBefore: " + this.f23790c + "\n                    |   oldPlaceholdersBefore: " + this.f23791d + "\n                    |)\n                    |", (String) null, 1, (Object) null);
        }
    }

    public static final class c extends G {

        /* renamed from: a  reason: collision with root package name */
        private final int f23792a;

        /* renamed from: b  reason: collision with root package name */
        private final int f23793b;

        /* renamed from: c  reason: collision with root package name */
        private final int f23794c;

        public c(int i10, int i11, int i12) {
            super((DefaultConstructorMarker) null);
            this.f23792a = i10;
            this.f23793b = i11;
            this.f23794c = i12;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f23792a == cVar.f23792a && this.f23793b == cVar.f23793b && this.f23794c == cVar.f23794c) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f23792a) + Integer.hashCode(this.f23793b) + Integer.hashCode(this.f23794c);
        }

        public String toString() {
            return p.h("PagingDataEvent.DropPrepend dropped " + this.f23792a + " items (\n                    |   dropCount: " + this.f23792a + "\n                    |   newPlaceholdersBefore: " + this.f23793b + "\n                    |   oldPlaceholdersBefore: " + this.f23794c + "\n                    |)\n                    |", (String) null, 1, (Object) null);
        }
    }

    public static final class d extends G {

        /* renamed from: a  reason: collision with root package name */
        private final List f23795a;

        /* renamed from: b  reason: collision with root package name */
        private final int f23796b;

        /* renamed from: c  reason: collision with root package name */
        private final int f23797c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(List list, int i10, int i11) {
            super((DefaultConstructorMarker) null);
            C6496s.h(list, "inserted");
            this.f23795a = list;
            this.f23796b = i10;
            this.f23797c = i11;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (C6496s.c(this.f23795a, dVar.f23795a) && this.f23796b == dVar.f23796b && this.f23797c == dVar.f23797c) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return this.f23795a.hashCode() + Integer.hashCode(this.f23796b) + Integer.hashCode(this.f23797c);
        }

        public String toString() {
            return p.h("PagingDataEvent.Prepend loaded " + this.f23795a.size() + " items (\n                    |   first item: " + C6565s.q0(this.f23795a) + "\n                    |   last item: " + C6565s.B0(this.f23795a) + "\n                    |   newPlaceholdersBefore: " + this.f23796b + "\n                    |   oldPlaceholdersBefore: " + this.f23797c + "\n                    |)\n                    |", (String) null, 1, (Object) null);
        }
    }

    public static final class e extends G {

        /* renamed from: a  reason: collision with root package name */
        private final N f23798a;

        /* renamed from: b  reason: collision with root package name */
        private final N f23799b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(N n10, N n11) {
            super((DefaultConstructorMarker) null);
            C6496s.h(n10, "newList");
            C6496s.h(n11, "previousList");
            this.f23798a = n10;
            this.f23799b = n11;
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f23798a.b() == eVar.f23798a.b() && this.f23798a.c() == eVar.f23798a.c() && this.f23798a.getSize() == eVar.f23798a.getSize() && this.f23798a.a() == eVar.f23798a.a() && this.f23799b.b() == eVar.f23799b.b() && this.f23799b.c() == eVar.f23799b.c() && this.f23799b.getSize() == eVar.f23799b.getSize() && this.f23799b.a() == eVar.f23799b.a()) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return this.f23798a.hashCode() + this.f23799b.hashCode();
        }

        public String toString() {
            return p.h("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: " + this.f23798a.b() + "\n                    |       placeholdersAfter: " + this.f23798a.c() + "\n                    |       size: " + this.f23798a.getSize() + "\n                    |       dataCount: " + this.f23798a.a() + "\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: " + this.f23799b.b() + "\n                    |       placeholdersAfter: " + this.f23799b.c() + "\n                    |       size: " + this.f23799b.getSize() + "\n                    |       dataCount: " + this.f23799b.a() + "\n                    |   )\n                    |", (String) null, 1, (Object) null);
        }
    }

    public /* synthetic */ G(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private G() {
    }
}
