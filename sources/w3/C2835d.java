package w3;

import Sg.p;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u3.l;
import y3.g;

/* renamed from: w3.d  reason: case insensitive filesystem */
public final class C2835d {

    /* renamed from: e  reason: collision with root package name */
    public static final b f27789e = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f27790a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f27791b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f27792c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f27793d;

    /* renamed from: w3.d$a */
    public static final class a {

        /* renamed from: h  reason: collision with root package name */
        public static final C0463a f27794h = new C0463a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        public final String f27795a;

        /* renamed from: b  reason: collision with root package name */
        public final String f27796b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f27797c;

        /* renamed from: d  reason: collision with root package name */
        public final int f27798d;

        /* renamed from: e  reason: collision with root package name */
        public final String f27799e;

        /* renamed from: f  reason: collision with root package name */
        public final int f27800f;

        /* renamed from: g  reason: collision with root package name */
        public final int f27801g;

        /* renamed from: w3.d$a$a  reason: collision with other inner class name */
        public static final class C0463a {
            public /* synthetic */ C0463a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < str.length()) {
                    char charAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i11++;
                    } else if (charAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                        return false;
                    }
                    i10++;
                    i12 = i13;
                }
                if (i11 == 0) {
                    return true;
                }
                return false;
            }

            public final boolean b(String str, String str2) {
                C6496s.h(str, "current");
                if (C6496s.c(str, str2)) {
                    return true;
                }
                if (!a(str)) {
                    return false;
                }
                String substring = str.substring(1, str.length() - 1);
                C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return C6496s.c(p.g1(substring).toString(), str2);
            }

            private C0463a() {
            }
        }

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            C6496s.h(str, "name");
            C6496s.h(str2, "type");
            this.f27795a = str;
            this.f27796b = str2;
            this.f27797c = z10;
            this.f27798d = i10;
            this.f27799e = str3;
            this.f27800f = i11;
            this.f27801g = a(str2);
        }

        private final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            C6496s.g(locale, "US");
            String upperCase = str.toUpperCase(locale);
            C6496s.g(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (p.O(upperCase, "INT", false, 2, (Object) null)) {
                return 3;
            }
            if (p.O(upperCase, "CHAR", false, 2, (Object) null) || p.O(upperCase, "CLOB", false, 2, (Object) null) || p.O(upperCase, "TEXT", false, 2, (Object) null)) {
                return 2;
            }
            if (p.O(upperCase, "BLOB", false, 2, (Object) null)) {
                return 5;
            }
            if (p.O(upperCase, "REAL", false, 2, (Object) null) || p.O(upperCase, "FLOA", false, 2, (Object) null) || p.O(upperCase, "DOUB", false, 2, (Object) null)) {
                return 4;
            }
            return 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f27798d != ((a) obj).f27798d) {
                return false;
            }
            a aVar = (a) obj;
            if (!C6496s.c(this.f27795a, aVar.f27795a) || this.f27797c != aVar.f27797c) {
                return false;
            }
            if (this.f27800f == 1 && aVar.f27800f == 2 && (str3 = this.f27799e) != null && !f27794h.b(str3, aVar.f27799e)) {
                return false;
            }
            if (this.f27800f == 2 && aVar.f27800f == 1 && (str2 = aVar.f27799e) != null && !f27794h.b(str2, this.f27799e)) {
                return false;
            }
            int i10 = this.f27800f;
            if (i10 != 0 && i10 == aVar.f27800f && ((str = this.f27799e) == null ? aVar.f27799e != null : !f27794h.b(str, aVar.f27799e))) {
                return false;
            }
            if (this.f27801g == aVar.f27801g) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int hashCode = ((this.f27795a.hashCode() * 31) + this.f27801g) * 31;
            if (this.f27797c) {
                i10 = 1231;
            } else {
                i10 = 1237;
            }
            return ((hashCode + i10) * 31) + this.f27798d;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Column{name='");
            sb2.append(this.f27795a);
            sb2.append("', type='");
            sb2.append(this.f27796b);
            sb2.append("', affinity='");
            sb2.append(this.f27801g);
            sb2.append("', notNull=");
            sb2.append(this.f27797c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f27798d);
            sb2.append(", defaultValue='");
            String str = this.f27799e;
            if (str == null) {
                str = "undefined";
            }
            sb2.append(str);
            sb2.append("'}");
            return sb2.toString();
        }
    }

    /* renamed from: w3.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2835d a(g gVar, String str) {
            C6496s.h(gVar, "database");
            C6496s.h(str, "tableName");
            return C2836e.f(gVar, str);
        }

        private b() {
        }
    }

    /* renamed from: w3.d$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f27802a;

        /* renamed from: b  reason: collision with root package name */
        public final String f27803b;

        /* renamed from: c  reason: collision with root package name */
        public final String f27804c;

        /* renamed from: d  reason: collision with root package name */
        public final List f27805d;

        /* renamed from: e  reason: collision with root package name */
        public final List f27806e;

        public c(String str, String str2, String str3, List list, List list2) {
            C6496s.h(str, "referenceTable");
            C6496s.h(str2, "onDelete");
            C6496s.h(str3, "onUpdate");
            C6496s.h(list, "columnNames");
            C6496s.h(list2, "referenceColumnNames");
            this.f27802a = str;
            this.f27803b = str2;
            this.f27804c = str3;
            this.f27805d = list;
            this.f27806e = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (C6496s.c(this.f27802a, cVar.f27802a) && C6496s.c(this.f27803b, cVar.f27803b) && C6496s.c(this.f27804c, cVar.f27804c) && C6496s.c(this.f27805d, cVar.f27805d)) {
                return C6496s.c(this.f27806e, cVar.f27806e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f27802a.hashCode() * 31) + this.f27803b.hashCode()) * 31) + this.f27804c.hashCode()) * 31) + this.f27805d.hashCode()) * 31) + this.f27806e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f27802a + "', onDelete='" + this.f27803b + " +', onUpdate='" + this.f27804c + "', columnNames=" + this.f27805d + ", referenceColumnNames=" + this.f27806e + '}';
        }
    }

    /* renamed from: w3.d$d  reason: collision with other inner class name */
    public static final class C0464d implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        private final int f27807a;

        /* renamed from: b  reason: collision with root package name */
        private final int f27808b;

        /* renamed from: c  reason: collision with root package name */
        private final String f27809c;

        /* renamed from: d  reason: collision with root package name */
        private final String f27810d;

        public C0464d(int i10, int i11, String str, String str2) {
            C6496s.h(str, TicketDetailDestinationKt.LAUNCHED_FROM);
            C6496s.h(str2, "to");
            this.f27807a = i10;
            this.f27808b = i11;
            this.f27809c = str;
            this.f27810d = str2;
        }

        /* renamed from: a */
        public int compareTo(C0464d dVar) {
            C6496s.h(dVar, "other");
            int i10 = this.f27807a - dVar.f27807a;
            if (i10 == 0) {
                return this.f27808b - dVar.f27808b;
            }
            return i10;
        }

        public final String b() {
            return this.f27809c;
        }

        public final int c() {
            return this.f27807a;
        }

        public final String e() {
            return this.f27810d;
        }
    }

    /* renamed from: w3.d$e */
    public static final class e {

        /* renamed from: e  reason: collision with root package name */
        public static final a f27811e = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        public final String f27812a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f27813b;

        /* renamed from: c  reason: collision with root package name */
        public final List f27814c;

        /* renamed from: d  reason: collision with root package name */
        public List f27815d;

        /* renamed from: w3.d$e$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public e(String str, boolean z10, List list, List list2) {
            C6496s.h(str, "name");
            C6496s.h(list, "columns");
            C6496s.h(list2, "orders");
            this.f27812a = str;
            this.f27813b = z10;
            this.f27814c = list;
            this.f27815d = list2;
            Collection collection = list2;
            boolean isEmpty = collection.isEmpty();
            ArrayList arrayList = collection;
            if (isEmpty) {
                int size = list.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(l.ASC.name());
                }
                arrayList = arrayList2;
            }
            this.f27815d = (List) arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f27813b != eVar.f27813b || !C6496s.c(this.f27814c, eVar.f27814c) || !C6496s.c(this.f27815d, eVar.f27815d)) {
                return false;
            }
            if (p.J(this.f27812a, "index_", false, 2, (Object) null)) {
                return p.J(eVar.f27812a, "index_", false, 2, (Object) null);
            }
            return C6496s.c(this.f27812a, eVar.f27812a);
        }

        public int hashCode() {
            int i10;
            if (p.J(this.f27812a, "index_", false, 2, (Object) null)) {
                i10 = -1184239155;
            } else {
                i10 = this.f27812a.hashCode();
            }
            return (((((i10 * 31) + (this.f27813b ? 1 : 0)) * 31) + this.f27814c.hashCode()) * 31) + this.f27815d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f27812a + "', unique=" + this.f27813b + ", columns=" + this.f27814c + ", orders=" + this.f27815d + "'}";
        }
    }

    public C2835d(String str, Map map, Set set, Set set2) {
        C6496s.h(str, "name");
        C6496s.h(map, "columns");
        C6496s.h(set, "foreignKeys");
        this.f27790a = str;
        this.f27791b = map;
        this.f27792c = set;
        this.f27793d = set2;
    }

    public static final C2835d a(g gVar, String str) {
        return f27789e.a(gVar, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2835d)) {
            return false;
        }
        C2835d dVar = (C2835d) obj;
        if (!C6496s.c(this.f27790a, dVar.f27790a) || !C6496s.c(this.f27791b, dVar.f27791b) || !C6496s.c(this.f27792c, dVar.f27792c)) {
            return false;
        }
        Set set2 = this.f27793d;
        if (set2 == null || (set = dVar.f27793d) == null) {
            return true;
        }
        return C6496s.c(set2, set);
    }

    public int hashCode() {
        return (((this.f27790a.hashCode() * 31) + this.f27791b.hashCode()) * 31) + this.f27792c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f27790a + "', columns=" + this.f27791b + ", foreignKeys=" + this.f27792c + ", indices=" + this.f27793d + '}';
    }
}
