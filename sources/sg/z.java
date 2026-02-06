package Sg;

import Ef.g;
import Ef.i;
import Ef.m;
import Rg.h;
import Rg.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6502A;
import mf.C6559l;
import mf.C6565s;
import yf.C6798l;
import yf.p;

abstract class z extends y {

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ char[] f65096a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f65097b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z10) {
            super(2);
            this.f65096a = cArr;
            this.f65097b = z10;
        }

        public final Pair a(CharSequence charSequence, int i10) {
            C6496s.h(charSequence, "$this$$receiver");
            int c02 = z.c0(charSequence, this.f65096a, i10, this.f65097b);
            if (c02 < 0) {
                return null;
            }
            return C6502A.a(Integer.valueOf(c02), 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f65098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f65099b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(List list, boolean z10) {
            super(2);
            this.f65098a = list;
            this.f65099b = z10;
        }

        public final Pair a(CharSequence charSequence, int i10) {
            C6496s.h(charSequence, "$this$$receiver");
            Pair K10 = z.T(charSequence, this.f65098a, i10, this.f65099b, false);
            if (K10 != null) {
                return C6502A.a(K10.c(), Integer.valueOf(((String) K10.d()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CharSequence f65100a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f65100a = charSequence;
        }

        /* renamed from: a */
        public final String invoke(i iVar) {
            C6496s.h(iVar, "it");
            return z.O0(this.f65100a, iVar);
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CharSequence f65101a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CharSequence charSequence) {
            super(1);
            this.f65101a = charSequence;
        }

        /* renamed from: a */
        public final String invoke(i iVar) {
            C6496s.h(iVar, "it");
            return z.O0(this.f65101a, iVar);
        }
    }

    public static final void A0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
        }
    }

    public static final List B0(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        C6496s.h(charSequence, "<this>");
        C6496s.h(cArr, "delimiters");
        if (cArr.length == 1) {
            return D0(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        Iterable<i> l10 = k.l(s0(charSequence, cArr, 0, z10, i10, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C6565s.y(l10, 10));
        for (i O02 : l10) {
            arrayList.add(O0(charSequence, O02));
        }
        return arrayList;
    }

    public static final List C0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        C6496s.h(charSequence, "<this>");
        C6496s.h(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return D0(charSequence, str, z10, i10);
            }
        }
        Iterable<i> l10 = k.l(t0(charSequence, strArr, 0, z10, i10, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C6565s.y(l10, 10));
        for (i O02 : l10) {
            arrayList.add(O0(charSequence, O02));
        }
        return arrayList;
    }

    private static final List D0(CharSequence charSequence, String str, boolean z10, int i10) {
        boolean z11;
        A0(i10);
        int i11 = 0;
        int X10 = X(charSequence, str, 0, z10);
        if (X10 == -1 || i10 == 1) {
            return C6565s.e(charSequence.toString());
        }
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = 10;
        if (z11) {
            i12 = m.h(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i12);
        do {
            arrayList.add(charSequence.subSequence(i11, X10).toString());
            i11 = str.length() + X10;
            if ((z11 && arrayList.size() == i10 - 1) || (X10 = X(charSequence, str, i11, z10)) == -1) {
                arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i11, X10).toString());
            i11 = str.length() + X10;
            break;
        } while ((X10 = X(charSequence, str, i11, z10)) == -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List E0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return B0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List F0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return C0(charSequence, strArr, z10, i10);
    }

    public static final h G0(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        C6496s.h(charSequence, "<this>");
        C6496s.h(cArr, "delimiters");
        return k.x(s0(charSequence, cArr, 0, z10, i10, 2, (Object) null), new d(charSequence));
    }

    public static final h H0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        C6496s.h(charSequence, "<this>");
        C6496s.h(strArr, "delimiters");
        return k.x(t0(charSequence, strArr, 0, z10, i10, 2, (Object) null), new c(charSequence));
    }

    public static /* synthetic */ h I0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return G0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ h J0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return H0(charSequence, strArr, z10, i10);
    }

    public static final boolean K0(CharSequence charSequence, char c10, boolean z10) {
        C6496s.h(charSequence, "<this>");
        if (charSequence.length() <= 0 || !C5540c.e(charSequence.charAt(0), c10, z10)) {
            return false;
        }
        return true;
    }

    public static final boolean L(CharSequence charSequence, char c10, boolean z10) {
        C6496s.h(charSequence, "<this>");
        if (p.a0(charSequence, c10, 0, z10, 2, (Object) null) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean L0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        C6496s.h(charSequence, "<this>");
        C6496s.h(charSequence2, "prefix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return p.J((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return u0(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
    }

    public static final boolean M(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        C6496s.h(charSequence, "<this>");
        C6496s.h(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (p.b0(charSequence, (String) charSequence2, 0, z10, 2, (Object) null) < 0) {
                return false;
            }
        } else {
            if (Z(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, (Object) null) < 0) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean M0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return K0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean N(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return L(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean N0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return L0(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ boolean O(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return M(charSequence, charSequence2, z10);
    }

    public static final String O0(CharSequence charSequence, i iVar) {
        C6496s.h(charSequence, "<this>");
        C6496s.h(iVar, "range");
        return charSequence.subSequence(iVar.a().intValue(), iVar.g().intValue() + 1).toString();
    }

    public static final boolean P(CharSequence charSequence, char c10, boolean z10) {
        C6496s.h(charSequence, "<this>");
        if (charSequence.length() <= 0 || !C5540c.e(charSequence.charAt(p.V(charSequence)), c10, z10)) {
            return false;
        }
        return true;
    }

    public static String P0(String str, char c10, String str2) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, "missingDelimiterValue");
        int a02 = p.a0(str, c10, 0, false, 6, (Object) null);
        if (a02 == -1) {
            return str2;
        }
        String substring = str.substring(a02 + 1, str.length());
        C6496s.g(substring, "substring(...)");
        return substring;
    }

    public static final boolean Q(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        C6496s.h(charSequence, "<this>");
        C6496s.h(charSequence2, "suffix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return p.u((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return u0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z10);
    }

    public static String Q0(String str, String str2, String str3) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, "delimiter");
        C6496s.h(str3, "missingDelimiterValue");
        int b02 = p.b0(str, str2, 0, false, 6, (Object) null);
        if (b02 == -1) {
            return str3;
        }
        String substring = str.substring(b02 + str2.length(), str.length());
        C6496s.g(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ boolean R(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return P(charSequence, c10, z10);
    }

    public static /* synthetic */ String R0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return p.P0(str, c10, str2);
    }

    public static /* synthetic */ boolean S(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Q(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String S0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return p.Q0(str, str2, str3);
    }

    /* access modifiers changed from: private */
    public static final Pair T(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        g gVar;
        Object obj;
        Object obj2;
        int i11;
        if (z10 || collection.size() != 1) {
            if (!z11) {
                gVar = new i(m.d(i10, 0), charSequence.length());
            } else {
                gVar = m.p(m.h(i10, p.V(charSequence)), 0);
            }
            if (charSequence instanceof String) {
                int k10 = gVar.k();
                int n10 = gVar.n();
                int r10 = gVar.r();
                if ((r10 > 0 && k10 <= n10) || (r10 < 0 && n10 <= k10)) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (p.y(str, 0, (String) charSequence, k10, str.length(), z10)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (k10 == n10) {
                                break;
                            }
                            k10 += r10;
                        } else {
                            return C6502A.a(Integer.valueOf(k10), str2);
                        }
                    }
                }
            } else {
                int k11 = gVar.k();
                int n11 = gVar.n();
                int r11 = gVar.r();
                if ((r11 > 0 && k11 <= n11) || (r11 < 0 && n11 <= k11)) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (u0(str3, 0, charSequence, k11, str3.length(), z10)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (k11 == n11) {
                                break;
                            }
                            k11 += r11;
                        } else {
                            return C6502A.a(Integer.valueOf(k11), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) C6565s.O0(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i12 = i10;
        if (!z11) {
            i11 = p.b0(charSequence2, str6, i12, false, 4, (Object) null);
        } else {
            i11 = p.h0(charSequence2, str6, i12, false, 4, (Object) null);
        }
        if (i11 < 0) {
            return null;
        }
        return C6502A.a(Integer.valueOf(i11), str5);
    }

    public static String T0(String str, char c10, String str2) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, "missingDelimiterValue");
        int g02 = p.g0(str, c10, 0, false, 6, (Object) null);
        if (g02 == -1) {
            return str2;
        }
        String substring = str.substring(g02 + 1, str.length());
        C6496s.g(substring, "substring(...)");
        return substring;
    }

    public static i U(CharSequence charSequence) {
        C6496s.h(charSequence, "<this>");
        return new i(0, charSequence.length() - 1);
    }

    public static final String U0(String str, String str2, String str3) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, "delimiter");
        C6496s.h(str3, "missingDelimiterValue");
        int h02 = p.h0(str, str2, 0, false, 6, (Object) null);
        if (h02 == -1) {
            return str3;
        }
        String substring = str.substring(h02 + str2.length(), str.length());
        C6496s.g(substring, "substring(...)");
        return substring;
    }

    public static int V(CharSequence charSequence) {
        C6496s.h(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static /* synthetic */ String V0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return p.T0(str, c10, str2);
    }

    public static final int W(CharSequence charSequence, char c10, int i10, boolean z10) {
        C6496s.h(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return c0(charSequence, new char[]{c10}, i10, z10);
    }

    public static /* synthetic */ String W0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return U0(str, str2, str3);
    }

    public static final int X(CharSequence charSequence, String str, int i10, boolean z10) {
        C6496s.h(charSequence, "<this>");
        C6496s.h(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return Z(charSequence, str, i10, charSequence.length(), z10, false, 16, (Object) null);
    }

    public static final String X0(String str, char c10, String str2) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, "missingDelimiterValue");
        int a02 = p.a0(str, c10, 0, false, 6, (Object) null);
        if (a02 == -1) {
            return str2;
        }
        String substring = str.substring(0, a02);
        C6496s.g(substring, "substring(...)");
        return substring;
    }

    private static final int Y(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        g gVar;
        if (!z11) {
            gVar = new i(m.d(i10, 0), m.h(i11, charSequence.length()));
        } else {
            gVar = m.p(m.h(i10, p.V(charSequence)), m.d(i11, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int k10 = gVar.k();
            int n10 = gVar.n();
            int r10 = gVar.r();
            if ((r10 <= 0 || k10 > n10) && (r10 >= 0 || n10 > k10)) {
                return -1;
            }
            while (true) {
                if (u0(charSequence2, 0, charSequence, k10, charSequence2.length(), z10)) {
                    return k10;
                }
                if (k10 == n10) {
                    return -1;
                }
                k10 += r10;
            }
        } else {
            int k11 = gVar.k();
            int n11 = gVar.n();
            int r11 = gVar.r();
            if ((r11 <= 0 || k11 > n11) && (r11 >= 0 || n11 > k11)) {
                return -1;
            }
            while (true) {
                if (p.y((String) charSequence2, 0, (String) charSequence, k11, charSequence2.length(), z10)) {
                    return k11;
                }
                if (k11 == n11) {
                    return -1;
                }
                k11 += r11;
            }
        }
    }

    public static String Y0(String str, String str2, String str3) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, "delimiter");
        C6496s.h(str3, "missingDelimiterValue");
        int b02 = p.b0(str, str2, 0, false, 6, (Object) null);
        if (b02 == -1) {
            return str3;
        }
        String substring = str.substring(0, b02);
        C6496s.g(substring, "substring(...)");
        return substring;
    }

    static /* synthetic */ int Z(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return Y(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ String Z0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return X0(str, c10, str2);
    }

    public static /* synthetic */ int a0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return W(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ String a1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return p.Y0(str, str2, str3);
    }

    public static /* synthetic */ int b0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return X(charSequence, str, i10, z10);
    }

    public static final String b1(String str, char c10, String str2) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, "missingDelimiterValue");
        int g02 = p.g0(str, c10, 0, false, 6, (Object) null);
        if (g02 == -1) {
            return str2;
        }
        String substring = str.substring(0, g02);
        C6496s.g(substring, "substring(...)");
        return substring;
    }

    public static final int c0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        C6496s.h(charSequence, "<this>");
        C6496s.h(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            int d10 = m.d(i10, 0);
            int V10 = p.V(charSequence);
            if (d10 > V10) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(d10);
                for (char e10 : cArr) {
                    if (C5540c.e(e10, charAt, z10)) {
                        return d10;
                    }
                }
                if (d10 == V10) {
                    return -1;
                }
                d10++;
            }
        } else {
            return ((String) charSequence).indexOf(C6559l.Y0(cArr), i10);
        }
    }

    public static String c1(String str, String str2, String str3) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, "delimiter");
        C6496s.h(str3, "missingDelimiterValue");
        int h02 = p.h0(str, str2, 0, false, 6, (Object) null);
        if (h02 == -1) {
            return str3;
        }
        String substring = str.substring(0, h02);
        C6496s.g(substring, "substring(...)");
        return substring;
    }

    public static boolean d0(CharSequence charSequence) {
        C6496s.h(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!C5538a.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String d1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return b1(str, c10, str2);
    }

    public static final int e0(CharSequence charSequence, char c10, int i10, boolean z10) {
        C6496s.h(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        return i0(charSequence, new char[]{c10}, i10, z10);
    }

    public static /* synthetic */ String e1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return p.c1(str, str2, str3);
    }

    public static final int f0(CharSequence charSequence, String str, int i10, boolean z10) {
        C6496s.h(charSequence, "<this>");
        C6496s.h(str, "string");
        if (z10 || !(charSequence instanceof String)) {
            return Y(charSequence, str, i10, 0, z10, true);
        }
        return ((String) charSequence).lastIndexOf(str, i10);
    }

    public static Boolean f1(String str) {
        C6496s.h(str, "<this>");
        if (C6496s.c(str, com.amazon.a.a.o.b.f37475af)) {
            return Boolean.TRUE;
        }
        if (C6496s.c(str, com.amazon.a.a.o.b.f37476ag)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int g0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = p.V(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return e0(charSequence, c10, i10, z10);
    }

    public static CharSequence g1(CharSequence charSequence) {
        int i10;
        C6496s.h(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i11 = 0;
        boolean z10 = false;
        while (i11 <= length) {
            if (!z10) {
                i10 = i11;
            } else {
                i10 = length;
            }
            boolean c10 = C5538a.c(charSequence.charAt(i10));
            if (!z10) {
                if (!c10) {
                    z10 = true;
                } else {
                    i11++;
                }
            } else if (!c10) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i11, length + 1);
    }

    public static /* synthetic */ int h0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = p.V(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return f0(charSequence, str, i10, z10);
    }

    public static final int i0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        C6496s.h(charSequence, "<this>");
        C6496s.h(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int h10 = m.h(i10, p.V(charSequence)); -1 < h10; h10--) {
                char charAt = charSequence.charAt(h10);
                for (char e10 : cArr) {
                    if (C5540c.e(e10, charAt, z10)) {
                        return h10;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C6559l.Y0(cArr), i10);
    }

    public static final h j0(CharSequence charSequence) {
        C6496s.h(charSequence, "<this>");
        return J0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static final List k0(CharSequence charSequence) {
        C6496s.h(charSequence, "<this>");
        return k.G(j0(charSequence));
    }

    public static final CharSequence l0(CharSequence charSequence, int i10, char c10) {
        C6496s.h(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        } else if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(charSequence);
            int length = i10 - charSequence.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(c10);
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            return sb2;
        }
    }

    public static final String m0(String str, int i10, char c10) {
        C6496s.h(str, "<this>");
        return l0(str, i10, c10).toString();
    }

    public static /* synthetic */ String n0(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return m0(str, i10, c10);
    }

    public static final CharSequence o0(CharSequence charSequence, int i10, char c10) {
        C6496s.h(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        } else if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            int length = i10 - charSequence.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(c10);
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            sb2.append(charSequence);
            return sb2;
        }
    }

    public static String p0(String str, int i10, char c10) {
        C6496s.h(str, "<this>");
        return o0(str, i10, c10).toString();
    }

    private static final h q0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        A0(i11);
        return new C5542e(charSequence, i10, i11, new a(cArr, z10));
    }

    private static final h r0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        A0(i11);
        return new C5542e(charSequence, i10, i11, new b(C6559l.e(strArr), z10));
    }

    static /* synthetic */ h s0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return q0(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ h t0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return r0(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean u0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        C6496s.h(charSequence, "<this>");
        C6496s.h(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!C5540c.e(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String v0(String str, CharSequence charSequence) {
        C6496s.h(str, "<this>");
        C6496s.h(charSequence, "prefix");
        if (!N0(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C6496s.g(substring, "substring(...)");
        return substring;
    }

    public static String w0(String str, CharSequence charSequence) {
        C6496s.h(str, "<this>");
        C6496s.h(charSequence, "suffix");
        if (!p.S(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C6496s.g(substring, "substring(...)");
        return substring;
    }

    public static String x0(String str, CharSequence charSequence) {
        C6496s.h(str, "<this>");
        C6496s.h(charSequence, "delimiter");
        return y0(str, charSequence, charSequence);
    }

    public static final String y0(String str, CharSequence charSequence, CharSequence charSequence2) {
        C6496s.h(str, "<this>");
        C6496s.h(charSequence, "prefix");
        C6496s.h(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !N0(str, charSequence, false, 2, (Object) null) || !p.S(str, charSequence2, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        C6496s.g(substring, "substring(...)");
        return substring;
    }

    public static CharSequence z0(CharSequence charSequence, int i10, int i11, CharSequence charSequence2) {
        C6496s.h(charSequence, "<this>");
        C6496s.h(charSequence2, "replacement");
        if (i11 >= i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i10);
            C6496s.g(sb2, "append(...)");
            sb2.append(charSequence2);
            sb2.append(charSequence, i11, charSequence.length());
            C6496s.g(sb2, "append(...)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }
}
