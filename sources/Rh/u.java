package rh;

import Sg.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.jvm.internal.C6481c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import lf.C6502A;
import mf.C6565s;
import sh.C6726e;
import tf.C6729c;
import xh.c;
import zf.C6828a;

public final class u implements Iterable, C6828a {

    /* renamed from: b  reason: collision with root package name */
    public static final b f73474b = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String[] f73475a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f73476a = new ArrayList(20);

        public final a a(String str, String str2) {
            C6496s.h(str, "name");
            C6496s.h(str2, "value");
            b bVar = u.f73474b;
            bVar.d(str);
            bVar.e(str2, str);
            d(str, str2);
            return this;
        }

        public final a b(u uVar) {
            C6496s.h(uVar, "headers");
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                d(uVar.g(i10), uVar.x(i10));
            }
            return this;
        }

        public final a c(String str) {
            C6496s.h(str, "line");
            int a02 = p.a0(str, ':', 1, false, 4, (Object) null);
            if (a02 != -1) {
                String substring = str.substring(0, a02);
                C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = str.substring(a02 + 1);
                C6496s.g(substring2, "this as java.lang.String).substring(startIndex)");
                d(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                C6496s.g(substring3, "this as java.lang.String).substring(startIndex)");
                d("", substring3);
            } else {
                d("", str);
            }
            return this;
        }

        public final a d(String str, String str2) {
            C6496s.h(str, "name");
            C6496s.h(str2, "value");
            this.f73476a.add(str);
            this.f73476a.add(p.g1(str2).toString());
            return this;
        }

        public final a e(String str, String str2) {
            C6496s.h(str, "name");
            C6496s.h(str2, "value");
            u.f73474b.d(str);
            d(str, str2);
            return this;
        }

        public final u f() {
            return new u((String[]) this.f73476a.toArray(new String[0]), (DefaultConstructorMarker) null);
        }

        public final String g(String str) {
            C6496s.h(str, "name");
            int size = this.f73476a.size() - 2;
            int c10 = C6729c.c(size, 0, -2);
            if (c10 > size) {
                return null;
            }
            while (!p.v(str, (String) this.f73476a.get(size), true)) {
                if (size == c10) {
                    return null;
                }
                size -= 2;
            }
            return (String) this.f73476a.get(size + 1);
        }

        public final List h() {
            return this.f73476a;
        }

        public final a i(String str) {
            C6496s.h(str, "name");
            int i10 = 0;
            while (i10 < this.f73476a.size()) {
                if (p.v(str, (String) this.f73476a.get(i10), true)) {
                    this.f73476a.remove(i10);
                    this.f73476a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final a j(String str, String str2) {
            C6496s.h(str, "name");
            C6496s.h(str2, "value");
            b bVar = u.f73474b;
            bVar.d(str);
            bVar.e(str2, str);
            i(str);
            d(str, str2);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final void d(String str) {
            if (str.length() > 0) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if ('!' > charAt || charAt >= 127) {
                        throw new IllegalArgumentException(C6726e.t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }

        /* access modifiers changed from: private */
        public final void e(String str, String str2) {
            String str3;
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                char charAt = str.charAt(i10);
                if (charAt == 9 || (' ' <= charAt && charAt < 127)) {
                    i10++;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C6726e.t("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i10), str2));
                    if (C6726e.H(str2)) {
                        str3 = "";
                    } else {
                        str3 = ": " + str;
                    }
                    sb2.append(str3);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* access modifiers changed from: private */
        public final String f(String[] strArr, String str) {
            int length = strArr.length - 2;
            int c10 = C6729c.c(length, 0, -2);
            if (c10 > length) {
                return null;
            }
            while (!p.v(str, strArr[length], true)) {
                if (length == c10) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        public final u g(Map map) {
            C6496s.h(map, "<this>");
            String[] strArr = new String[(map.size() * 2)];
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String obj = p.g1((String) entry.getKey()).toString();
                String obj2 = p.g1((String) entry.getValue()).toString();
                d(obj);
                e(obj2, obj);
                strArr[i10] = obj;
                strArr[i10 + 1] = obj2;
                i10 += 2;
            }
            return new u(strArr, (DefaultConstructorMarker) null);
        }

        public final u h(String... strArr) {
            C6496s.h(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length;
                int i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    String str = strArr2[i11];
                    if (str != null) {
                        strArr2[i11] = p.g1(str).toString();
                        i11++;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null");
                    }
                }
                int c10 = C6729c.c(0, strArr2.length - 1, 2);
                if (c10 >= 0) {
                    while (true) {
                        String str2 = strArr2[i10];
                        String str3 = strArr2[i10 + 1];
                        d(str2);
                        e(str3, str2);
                        if (i10 == c10) {
                            break;
                        }
                        i10 += 2;
                    }
                }
                return new u(strArr2, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values");
        }

        private b() {
        }
    }

    public /* synthetic */ u(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    public static final u r(Map map) {
        return f73474b.g(map);
    }

    public static final u t(String... strArr) {
        return f73474b.h(strArr);
    }

    public final String a(String str) {
        C6496s.h(str, "name");
        return f73474b.f(this.f73475a, str);
    }

    public final Date b(String str) {
        C6496s.h(str, "name");
        String a10 = a(str);
        if (a10 != null) {
            return c.a(a10);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u) || !Arrays.equals(this.f73475a, ((u) obj).f73475a)) {
            return false;
        }
        return true;
    }

    public final String g(int i10) {
        return this.f73475a[i10 * 2];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f73475a);
    }

    public Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = C6502A.a(g(i10), x(i10));
        }
        return C6481c.a(pairArr);
    }

    public final Set k() {
        TreeSet treeSet = new TreeSet(p.x(U.f71764a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(g(i10));
        }
        Set unmodifiableSet = Collections.unmodifiableSet(treeSet);
        C6496s.g(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final a n() {
        a aVar = new a();
        C6565s.E(aVar.h(), this.f73475a);
        return aVar;
    }

    public final int size() {
        return this.f73475a.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String g10 = g(i10);
            String x10 = x(i10);
            sb2.append(g10);
            sb2.append(": ");
            if (C6726e.H(g10)) {
                x10 = "██";
            }
            sb2.append(x10);
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final Map v() {
        TreeMap treeMap = new TreeMap(p.x(U.f71764a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String g10 = g(i10);
            Locale locale = Locale.US;
            C6496s.g(locale, "US");
            String lowerCase = g10.toLowerCase(locale);
            C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(x(i10));
        }
        return treeMap;
    }

    public final String x(int i10) {
        return this.f73475a[(i10 * 2) + 1];
    }

    public final List z(String str) {
        C6496s.h(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (p.v(str, g(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(x(i10));
            }
        }
        if (arrayList == null) {
            return C6565s.n();
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        C6496s.g(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    private u(String[] strArr) {
        this.f73475a = strArr;
    }
}
