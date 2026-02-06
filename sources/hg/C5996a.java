package hg;

import Ef.m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;
import mf.O;
import mg.C6577e;
import sf.C6714a;

/* renamed from: hg.a  reason: case insensitive filesystem */
public final class C5996a {

    /* renamed from: a  reason: collision with root package name */
    private final C1007a f67850a;

    /* renamed from: b  reason: collision with root package name */
    private final C6577e f67851b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f67852c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f67853d;

    /* renamed from: e  reason: collision with root package name */
    private final String[] f67854e;

    /* renamed from: f  reason: collision with root package name */
    private final String f67855f;

    /* renamed from: g  reason: collision with root package name */
    private final int f67856g;

    /* renamed from: h  reason: collision with root package name */
    private final String f67857h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f67858i;

    /* renamed from: hg.a$a  reason: collision with other inner class name */
    public enum C1007a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        

        /* renamed from: b  reason: collision with root package name */
        public static final C1008a f67859b = null;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final Map f67860c = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f67869a;

        /* renamed from: hg.a$a$a  reason: collision with other inner class name */
        public static final class C1008a {
            public /* synthetic */ C1008a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C1007a a(int i10) {
                C1007a aVar = (C1007a) C1007a.f67860c.get(Integer.valueOf(i10));
                if (aVar == null) {
                    return C1007a.UNKNOWN;
                }
                return aVar;
            }

            private C1008a() {
            }
        }

        static {
            int i10;
            C1007a[] a10;
            f67868k = C6714a.a(a10);
            f67859b = new C1008a((DefaultConstructorMarker) null);
            C1007a[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(values.length), 16));
            for (C1007a aVar : values) {
                linkedHashMap.put(Integer.valueOf(aVar.f67869a), aVar);
            }
            f67860c = linkedHashMap;
        }

        private C1007a(int i10) {
            this.f67869a = i10;
        }

        public static final C1007a c(int i10) {
            return f67859b.a(i10);
        }
    }

    public C5996a(C1007a aVar, C6577e eVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10, String str2, byte[] bArr) {
        C6496s.h(aVar, "kind");
        C6496s.h(eVar, "metadataVersion");
        this.f67850a = aVar;
        this.f67851b = eVar;
        this.f67852c = strArr;
        this.f67853d = strArr2;
        this.f67854e = strArr3;
        this.f67855f = str;
        this.f67856g = i10;
        this.f67857h = str2;
        this.f67858i = bArr;
    }

    private final boolean h(int i10, int i11) {
        if ((i10 & i11) != 0) {
            return true;
        }
        return false;
    }

    public final String[] a() {
        return this.f67852c;
    }

    public final String[] b() {
        return this.f67853d;
    }

    public final C1007a c() {
        return this.f67850a;
    }

    public final C6577e d() {
        return this.f67851b;
    }

    public final String e() {
        String str = this.f67855f;
        if (this.f67850a == C1007a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final List f() {
        String[] strArr = this.f67852c;
        List list = null;
        if (this.f67850a != C1007a.MULTIFILE_CLASS) {
            strArr = null;
        }
        if (strArr != null) {
            list = C6559l.e(strArr);
        }
        if (list == null) {
            return C6565s.n();
        }
        return list;
    }

    public final String[] g() {
        return this.f67854e;
    }

    public final boolean i() {
        return h(this.f67856g, 2);
    }

    public final boolean j() {
        if (!h(this.f67856g, 16) || h(this.f67856g, 32)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.f67850a + " version=" + this.f67851b;
    }
}
