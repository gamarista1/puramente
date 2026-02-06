package Sg;

import com.amazon.a.a.o.b.f;
import com.google.android.gms.common.api.a;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Sg.g  reason: case insensitive filesystem */
public final class C5544g {

    /* renamed from: d  reason: collision with root package name */
    public static final b f65051d = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C5544g f65052e;

    /* renamed from: f  reason: collision with root package name */
    private static final C5544g f65053f;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f65054a;

    /* renamed from: b  reason: collision with root package name */
    private final a f65055b;

    /* renamed from: c  reason: collision with root package name */
    private final c f65056c;

    /* renamed from: Sg.g$a */
    public static final class a {

        /* renamed from: j  reason: collision with root package name */
        public static final C0954a f65057j = new C0954a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public static final a f65058k = new a(a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER, "  ", "", "", "");

        /* renamed from: a  reason: collision with root package name */
        private final int f65059a;

        /* renamed from: b  reason: collision with root package name */
        private final int f65060b;

        /* renamed from: c  reason: collision with root package name */
        private final String f65061c;

        /* renamed from: d  reason: collision with root package name */
        private final String f65062d;

        /* renamed from: e  reason: collision with root package name */
        private final String f65063e;

        /* renamed from: f  reason: collision with root package name */
        private final String f65064f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f65065g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f65066h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f65067i;

        /* renamed from: Sg.g$a$a  reason: collision with other inner class name */
        public static final class C0954a {
            public /* synthetic */ C0954a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a() {
                return a.f65058k;
            }

            private C0954a() {
            }
        }

        public a(int i10, int i11, String str, String str2, String str3, String str4) {
            boolean z10;
            boolean z11;
            C6496s.h(str, "groupSeparator");
            C6496s.h(str2, "byteSeparator");
            C6496s.h(str3, "bytePrefix");
            C6496s.h(str4, "byteSuffix");
            this.f65059a = i10;
            this.f65060b = i11;
            this.f65061c = str;
            this.f65062d = str2;
            this.f65063e = str3;
            this.f65064f = str4;
            boolean z12 = false;
            if (i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f65065g = z10;
            if (str3.length() == 0 && str4.length() == 0 && str2.length() <= 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f65066h = z11;
            this.f65067i = (h.a(str) || h.a(str2) || h.a(str3) || h.a(str4)) ? true : z12;
        }

        public final StringBuilder b(StringBuilder sb2, String str) {
            C6496s.h(sb2, "sb");
            C6496s.h(str, "indent");
            sb2.append(str);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f65059a);
            C6496s.g(sb2, "append(...)");
            sb2.append(f.f37529a);
            C6496s.g(sb2, "append(...)");
            sb2.append(10);
            C6496s.g(sb2, "append(...)");
            sb2.append(str);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f65060b);
            C6496s.g(sb2, "append(...)");
            sb2.append(f.f37529a);
            C6496s.g(sb2, "append(...)");
            sb2.append(10);
            C6496s.g(sb2, "append(...)");
            sb2.append(str);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f65061c);
            C6496s.g(sb2, "append(...)");
            sb2.append("\",");
            C6496s.g(sb2, "append(...)");
            sb2.append(10);
            C6496s.g(sb2, "append(...)");
            sb2.append(str);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f65062d);
            C6496s.g(sb2, "append(...)");
            sb2.append("\",");
            C6496s.g(sb2, "append(...)");
            sb2.append(10);
            C6496s.g(sb2, "append(...)");
            sb2.append(str);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f65063e);
            C6496s.g(sb2, "append(...)");
            sb2.append("\",");
            C6496s.g(sb2, "append(...)");
            sb2.append(10);
            C6496s.g(sb2, "append(...)");
            sb2.append(str);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f65064f);
            sb2.append("\"");
            return sb2;
        }

        public final String c() {
            return this.f65063e;
        }

        public final String d() {
            return this.f65062d;
        }

        public final String e() {
            return this.f65064f;
        }

        public final int f() {
            return this.f65060b;
        }

        public final int g() {
            return this.f65059a;
        }

        public final String h() {
            return this.f65061c;
        }

        public final boolean i() {
            return this.f65065g;
        }

        public final boolean j() {
            return this.f65066h;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            C6496s.g(sb2, "append(...)");
            sb2.append(10);
            C6496s.g(sb2, "append(...)");
            StringBuilder b10 = b(sb2, "    ");
            b10.append(10);
            C6496s.g(b10, "append(...)");
            sb2.append(")");
            String sb3 = sb2.toString();
            C6496s.g(sb3, "toString(...)");
            return sb3;
        }
    }

    /* renamed from: Sg.g$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5544g a() {
            return C5544g.f65052e;
        }

        private b() {
        }
    }

    /* renamed from: Sg.g$c */
    public static final class c {

        /* renamed from: h  reason: collision with root package name */
        public static final a f65068h = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public static final c f65069i = new c("", "", false, 1);

        /* renamed from: a  reason: collision with root package name */
        private final String f65070a;

        /* renamed from: b  reason: collision with root package name */
        private final String f65071b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f65072c;

        /* renamed from: d  reason: collision with root package name */
        private final int f65073d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f65074e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f65075f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f65076g;

        /* renamed from: Sg.g$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                return c.f65069i;
            }

            private a() {
            }
        }

        public c(String str, String str2, boolean z10, int i10) {
            boolean z11;
            boolean z12;
            C6496s.h(str, "prefix");
            C6496s.h(str2, "suffix");
            this.f65070a = str;
            this.f65071b = str2;
            this.f65072c = z10;
            this.f65073d = i10;
            boolean z13 = false;
            if (str.length() == 0 && str2.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f65074e = z11;
            if (!z11 || i10 != 1) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f65075f = z12;
            this.f65076g = (h.b(str) || h.b(str2)) ? true : z13;
        }

        public final StringBuilder b(StringBuilder sb2, String str) {
            C6496s.h(sb2, "sb");
            C6496s.h(str, "indent");
            sb2.append(str);
            sb2.append("prefix = \"");
            sb2.append(this.f65070a);
            C6496s.g(sb2, "append(...)");
            sb2.append("\",");
            C6496s.g(sb2, "append(...)");
            sb2.append(10);
            C6496s.g(sb2, "append(...)");
            sb2.append(str);
            sb2.append("suffix = \"");
            sb2.append(this.f65071b);
            C6496s.g(sb2, "append(...)");
            sb2.append("\",");
            C6496s.g(sb2, "append(...)");
            sb2.append(10);
            C6496s.g(sb2, "append(...)");
            sb2.append(str);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f65072c);
            C6496s.g(sb2, "append(...)");
            sb2.append(',');
            C6496s.g(sb2, "append(...)");
            sb2.append(10);
            C6496s.g(sb2, "append(...)");
            sb2.append(str);
            sb2.append("minLength = ");
            sb2.append(this.f65073d);
            return sb2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            C6496s.g(sb2, "append(...)");
            sb2.append(10);
            C6496s.g(sb2, "append(...)");
            StringBuilder b10 = b(sb2, "    ");
            b10.append(10);
            C6496s.g(b10, "append(...)");
            sb2.append(")");
            String sb3 = sb2.toString();
            C6496s.g(sb3, "toString(...)");
            return sb3;
        }
    }

    static {
        a.C0954a aVar = a.f65057j;
        a a10 = aVar.a();
        c.a aVar2 = c.f65068h;
        f65052e = new C5544g(false, a10, aVar2.a());
        f65053f = new C5544g(true, aVar.a(), aVar2.a());
    }

    public C5544g(boolean z10, a aVar, c cVar) {
        C6496s.h(aVar, "bytes");
        C6496s.h(cVar, AttributeType.NUMBER);
        this.f65054a = z10;
        this.f65055b = aVar;
        this.f65056c = cVar;
    }

    public final a b() {
        return this.f65055b;
    }

    public final boolean c() {
        return this.f65054a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        C6496s.g(sb2, "append(...)");
        sb2.append(10);
        C6496s.g(sb2, "append(...)");
        sb2.append("    upperCase = ");
        sb2.append(this.f65054a);
        C6496s.g(sb2, "append(...)");
        sb2.append(f.f37529a);
        C6496s.g(sb2, "append(...)");
        sb2.append(10);
        C6496s.g(sb2, "append(...)");
        sb2.append("    bytes = BytesHexFormat(");
        C6496s.g(sb2, "append(...)");
        sb2.append(10);
        C6496s.g(sb2, "append(...)");
        StringBuilder b10 = this.f65055b.b(sb2, "        ");
        b10.append(10);
        C6496s.g(b10, "append(...)");
        sb2.append("    ),");
        C6496s.g(sb2, "append(...)");
        sb2.append(10);
        C6496s.g(sb2, "append(...)");
        sb2.append("    number = NumberHexFormat(");
        C6496s.g(sb2, "append(...)");
        sb2.append(10);
        C6496s.g(sb2, "append(...)");
        StringBuilder b11 = this.f65056c.b(sb2, "        ");
        b11.append(10);
        C6496s.g(b11, "append(...)");
        sb2.append("    )");
        C6496s.g(sb2, "append(...)");
        sb2.append(10);
        C6496s.g(sb2, "append(...)");
        sb2.append(")");
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }
}
