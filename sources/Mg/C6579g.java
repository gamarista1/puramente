package mg;

import Ef.m;
import Sg.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg.C6436c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import lg.C6536a;
import mf.C6565s;
import mf.I;
import mf.O;
import yf.C6798l;

/* renamed from: mg.g  reason: case insensitive filesystem */
public abstract class C6579g implements C6436c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f72102d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final String f72103e;

    /* renamed from: f  reason: collision with root package name */
    private static final List f72104f;

    /* renamed from: g  reason: collision with root package name */
    private static final Map f72105g;

    /* renamed from: a  reason: collision with root package name */
    private final String[] f72106a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f72107b;

    /* renamed from: c  reason: collision with root package name */
    private final List f72108c;

    /* renamed from: mg.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: mg.g$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f72109a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                lg.a$e$c$c[] r0 = lg.C6536a.e.c.C1034c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                lg.a$e$c$c r1 = lg.C6536a.e.c.C1034c.NONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                lg.a$e$c$c r1 = lg.C6536a.e.c.C1034c.INTERNAL_TO_CLASS_ID     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                lg.a$e$c$c r1 = lg.C6536a.e.c.C1034c.DESC_TO_CLASS_ID     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f72109a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.C6579g.b.<clinit>():void");
        }
    }

    static {
        String x02 = C6565s.x0(C6565s.q('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
        f72103e = x02;
        List q10 = C6565s.q(x02 + "/Any", x02 + "/Nothing", x02 + "/Unit", x02 + "/Throwable", x02 + "/Number", x02 + "/Byte", x02 + "/Double", x02 + "/Float", x02 + "/Int", x02 + "/Long", x02 + "/Short", x02 + "/Boolean", x02 + "/Char", x02 + "/CharSequence", x02 + "/String", x02 + "/Comparable", x02 + "/Enum", x02 + "/Array", x02 + "/ByteArray", x02 + "/DoubleArray", x02 + "/FloatArray", x02 + "/IntArray", x02 + "/LongArray", x02 + "/ShortArray", x02 + "/BooleanArray", x02 + "/CharArray", x02 + "/Cloneable", x02 + "/Annotation", x02 + "/collections/Iterable", x02 + "/collections/MutableIterable", x02 + "/collections/Collection", x02 + "/collections/MutableCollection", x02 + "/collections/List", x02 + "/collections/MutableList", x02 + "/collections/Set", x02 + "/collections/MutableSet", x02 + "/collections/Map", x02 + "/collections/MutableMap", x02 + "/collections/Map.Entry", x02 + "/collections/MutableMap.MutableEntry", x02 + "/collections/Iterator", x02 + "/collections/MutableIterator", x02 + "/collections/ListIterator", x02 + "/collections/MutableListIterator");
        f72104f = q10;
        Iterable<I> m12 = C6565s.m1(q10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(m12, 10)), 16));
        for (I i10 : m12) {
            linkedHashMap.put((String) i10.d(), Integer.valueOf(i10.c()));
        }
        f72105g = linkedHashMap;
    }

    public C6579g(String[] strArr, Set set, List list) {
        C6496s.h(strArr, "strings");
        C6496s.h(set, "localNameIndices");
        C6496s.h(list, "records");
        this.f72106a = strArr;
        this.f72107b = set;
        this.f72108c = list;
    }

    public boolean a(int i10) {
        return this.f72107b.contains(Integer.valueOf(i10));
    }

    public String b(int i10) {
        return getString(i10);
    }

    public String getString(int i10) {
        String str;
        C6536a.e.c cVar = (C6536a.e.c) this.f72108c.get(i10);
        if (cVar.P()) {
            str = cVar.I();
        } else {
            if (cVar.N()) {
                List list = f72104f;
                int size = list.size();
                int E10 = cVar.E();
                if (E10 >= 0 && E10 < size) {
                    str = (String) list.get(cVar.E());
                }
            }
            str = this.f72106a[i10];
        }
        if (cVar.K() >= 2) {
            List L10 = cVar.L();
            C6496s.e(L10);
            Integer num = (Integer) L10.get(0);
            Integer num2 = (Integer) L10.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= str.length()) {
                C6496s.e(str);
                C6496s.e(num);
                int intValue = num.intValue();
                C6496s.e(num2);
                str = str.substring(intValue, num2.intValue());
                C6496s.g(str, "substring(...)");
            }
        }
        String str2 = str;
        if (cVar.G() >= 2) {
            List H10 = cVar.H();
            C6496s.e(H10);
            C6496s.e(str2);
            str2 = p.C(str2, (char) ((Integer) H10.get(0)).intValue(), (char) ((Integer) H10.get(1)).intValue(), false, 4, (Object) null);
        }
        String str3 = str2;
        C6536a.e.c.C1034c D10 = cVar.D();
        if (D10 == null) {
            D10 = C6536a.e.c.C1034c.NONE;
        }
        int i11 = b.f72109a[D10.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                C6496s.e(str3);
                str3 = p.C(str3, '$', '.', false, 4, (Object) null);
            } else if (i11 == 3) {
                if (str3.length() >= 2) {
                    C6496s.e(str3);
                    str3 = str3.substring(1, str3.length() - 1);
                    C6496s.g(str3, "substring(...)");
                }
                String str4 = str3;
                C6496s.e(str4);
                str3 = p.C(str4, '$', '.', false, 4, (Object) null);
            } else {
                throw new C6535s();
            }
        }
        C6496s.e(str3);
        return str3;
    }
}
