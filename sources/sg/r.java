package Sg;

import com.amazon.a.a.o.b.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import mf.C6565s;
import yf.C6798l;

abstract class r extends q {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f65094a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C6496s.h(str, "line");
            return str;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f65095a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f65095a = str;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C6496s.h(str, "line");
            return this.f65095a + str;
        }
    }

    private static final C6798l b(String str) {
        if (str.length() == 0) {
            return a.f65094a;
        }
        return new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!C5538a.c(str.charAt(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return str.length();
        }
        return i10;
    }

    public static final String d(String str, String str2) {
        int i10;
        String str3;
        C6496s.h(str, "<this>");
        C6496s.h(str2, "newIndent");
        List k02 = z.k0(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object next : k02) {
            if (!p.d0((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
        for (String c10 : arrayList) {
            arrayList2.add(Integer.valueOf(c(c10)));
        }
        Integer num = (Integer) C6565s.F0(arrayList2);
        int i11 = 0;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        int length = str.length() + (str2.length() * k02.size());
        C6798l b10 = b(str2);
        int p10 = C6565s.p(k02);
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : k02) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C6565s.x();
            }
            String str4 = (String) next2;
            if ((i11 == 0 || i11 == p10) && p.d0(str4)) {
                str4 = null;
            } else {
                String h12 = p.h1(str4, i10);
                if (!(h12 == null || (str3 = (String) b10.invoke(h12)) == null)) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i11 = i12;
        }
        String sb2 = ((StringBuilder) C6565s.v0(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 124, (Object) null)).toString();
        C6496s.g(sb2, "toString(...)");
        return sb2;
    }

    public static final String e(String str, String str2, String str3) {
        int i10;
        String str4;
        C6496s.h(str, "<this>");
        C6496s.h(str2, "newIndent");
        C6496s.h(str3, "marginPrefix");
        if (!p.d0(str3)) {
            List k02 = z.k0(str);
            int length = str.length() + (str2.length() * k02.size());
            C6798l b10 = b(str2);
            int p10 = C6565s.p(k02);
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (Object next : k02) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C6565s.x();
                }
                String str5 = (String) next;
                String str6 = null;
                if ((i11 == 0 || i11 == p10) && p.d0(str5)) {
                    str5 = null;
                } else {
                    int length2 = str5.length();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length2) {
                            i10 = -1;
                            break;
                        } else if (!C5538a.c(str5.charAt(i13))) {
                            i10 = i13;
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (i10 != -1) {
                        int i14 = i10;
                        if (p.I(str5, str3, i10, false, 4, (Object) null)) {
                            C6496s.f(str5, "null cannot be cast to non-null type java.lang.String");
                            str6 = str5.substring(i14 + str3.length());
                            C6496s.g(str6, "substring(...)");
                        }
                    }
                    if (!(str6 == null || (str4 = (String) b10.invoke(str6)) == null)) {
                        str5 = str4;
                    }
                }
                if (str5 != null) {
                    arrayList.add(str5);
                }
                i11 = i12;
            }
            String sb2 = ((StringBuilder) C6565s.v0(arrayList, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 124, (Object) null)).toString();
            C6496s.g(sb2, "toString(...)");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }

    public static String f(String str) {
        C6496s.h(str, "<this>");
        return d(str, "");
    }

    public static final String g(String str, String str2) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, "marginPrefix");
        return e(str, "", str2);
    }

    public static /* synthetic */ String h(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = f.f37531c;
        }
        return g(str, str2);
    }
}
