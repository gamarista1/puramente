package hg;

import Of.h0;
import Xf.I;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import gg.C5974x;
import hg.C5996a;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mg.C6573a;
import mg.C6577e;
import ng.b;
import ng.f;
import tg.C6740f;

/* renamed from: hg.b  reason: case insensitive filesystem */
public class C5997b implements C5974x.c {

    /* renamed from: j  reason: collision with root package name */
    private static boolean f67870j;

    /* renamed from: k  reason: collision with root package name */
    private static final Map f67871k;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int[] f67872a = null;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f67873b = null;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f67874c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f67875d = null;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public String[] f67876e = null;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public String[] f67877f = null;

    /* renamed from: g  reason: collision with root package name */
    private String[] f67878g = null;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public C5996a.C1007a f67879h = null;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public String[] f67880i = null;

    /* renamed from: hg.b$b  reason: collision with other inner class name */
    private static abstract class C1009b implements C5974x.b {

        /* renamed from: a  reason: collision with root package name */
        private final List f67881a = new ArrayList();

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i10 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i10 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i10 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i10 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a() {
            g((String[]) this.f67881a.toArray(new String[0]));
        }

        public void b(b bVar, f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        public C5974x.a c(b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        public void d(C6740f fVar) {
            if (fVar == null) {
                f(2);
            }
        }

        public void e(Object obj) {
            if (obj instanceof String) {
                this.f67881a.add((String) obj);
            }
        }

        /* access modifiers changed from: protected */
        public abstract void g(String[] strArr);
    }

    static {
        try {
            f67870j = com.amazon.a.a.o.b.f37475af.equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f67870j = false;
        }
        HashMap hashMap = new HashMap();
        f67871k = hashMap;
        hashMap.put(b.k(new ng.c("kotlin.jvm.internal.KotlinClass")), C5996a.C1007a.CLASS);
        hashMap.put(b.k(new ng.c("kotlin.jvm.internal.KotlinFileFacade")), C5996a.C1007a.FILE_FACADE);
        hashMap.put(b.k(new ng.c("kotlin.jvm.internal.KotlinMultifileClass")), C5996a.C1007a.MULTIFILE_CLASS);
        hashMap.put(b.k(new ng.c("kotlin.jvm.internal.KotlinMultifileClassPart")), C5996a.C1007a.MULTIFILE_CLASS_PART);
        hashMap.put(b.k(new ng.c("kotlin.jvm.internal.KotlinSyntheticClass")), C5996a.C1007a.SYNTHETIC_CLASS);
    }

    private static /* synthetic */ void d(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean o() {
        C5996a.C1007a aVar = this.f67879h;
        if (aVar == C5996a.C1007a.CLASS || aVar == C5996a.C1007a.FILE_FACADE || aVar == C5996a.C1007a.MULTIFILE_CLASS_PART) {
            return true;
        }
        return false;
    }

    public C5974x.a b(b bVar, h0 h0Var) {
        C5996a.C1007a aVar;
        if (bVar == null) {
            d(0);
        }
        if (h0Var == null) {
            d(1);
        }
        ng.c a10 = bVar.a();
        if (a10.equals(I.f66262a)) {
            return new c();
        }
        if (a10.equals(I.f66281t)) {
            return new d();
        }
        if (f67870j || this.f67879h != null || (aVar = (C5996a.C1007a) f67871k.get(bVar)) == null) {
            return null;
        }
        this.f67879h = aVar;
        return new e();
    }

    public C5996a m(C6577e eVar) {
        boolean z10;
        byte[] bArr = null;
        if (this.f67879h == null || this.f67872a == null) {
            return null;
        }
        int[] iArr = this.f67872a;
        if ((this.f67874c & 8) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C6577e eVar2 = new C6577e(iArr, z10);
        if (!eVar2.h(eVar)) {
            this.f67878g = this.f67876e;
            this.f67876e = null;
        } else if (o() && this.f67876e == null) {
            return null;
        }
        String[] strArr = this.f67880i;
        if (strArr != null) {
            bArr = C6573a.e(strArr);
        }
        return new C5996a(this.f67879h, eVar2, this.f67876e, this.f67878g, this.f67877f, this.f67873b, this.f67874c, this.f67875d, bArr);
    }

    public C5996a n() {
        return m(C6577e.f72097i);
    }

    /* renamed from: hg.b$c */
    private class c implements C5974x.a {

        /* renamed from: hg.b$c$a */
        class a extends C1009b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                String[] unused = C5997b.this.f67876e = strArr;
            }
        }

        /* renamed from: hg.b$c$b  reason: collision with other inner class name */
        class C1010b extends C1009b {
            C1010b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                String[] unused = C5997b.this.f67877f = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private C5974x.b h() {
            return new a();
        }

        private C5974x.b i() {
            return new C1010b();
        }

        public C5974x.b b(f fVar) {
            String str;
            if (fVar != null) {
                str = fVar.b();
            } else {
                str = null;
            }
            if ("d1".equals(str)) {
                return h();
            }
            if ("d2".equals(str)) {
                return i();
            }
            return null;
        }

        public void c(f fVar, b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        public C5974x.a d(f fVar, b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        public void e(f fVar, Object obj) {
            if (fVar != null) {
                String b10 = fVar.b();
                if ("k".equals(b10)) {
                    if (obj instanceof Integer) {
                        C5996a.C1007a unused = C5997b.this.f67879h = C5996a.C1007a.c(((Integer) obj).intValue());
                    }
                } else if ("mv".equals(b10)) {
                    if (obj instanceof int[]) {
                        int[] unused2 = C5997b.this.f67872a = (int[]) obj;
                    }
                } else if ("xs".equals(b10)) {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!str.isEmpty()) {
                            String unused3 = C5997b.this.f67873b = str;
                        }
                    }
                } else if ("xi".equals(b10)) {
                    if (obj instanceof Integer) {
                        int unused4 = C5997b.this.f67874c = ((Integer) obj).intValue();
                    }
                } else if ("pn".equals(b10) && (obj instanceof String)) {
                    String str2 = (String) obj;
                    if (!str2.isEmpty()) {
                        String unused5 = C5997b.this.f67875d = str2;
                    }
                }
            }
        }

        public void f(f fVar, C6740f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        public void a() {
        }
    }

    /* renamed from: hg.b$d */
    private class d implements C5974x.a {

        /* renamed from: hg.b$d$a */
        class a extends C1009b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                String[] unused = C5997b.this.f67880i = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private C5974x.b h() {
            return new a();
        }

        public C5974x.b b(f fVar) {
            String str;
            if (fVar != null) {
                str = fVar.b();
            } else {
                str = null;
            }
            if ("b".equals(str)) {
                return h();
            }
            return null;
        }

        public void c(f fVar, b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        public C5974x.a d(f fVar, b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        public void f(f fVar, C6740f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        public void a() {
        }

        public void e(f fVar, Object obj) {
        }
    }

    /* renamed from: hg.b$e */
    private class e implements C5974x.a {

        /* renamed from: hg.b$e$a */
        class a extends C1009b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                String[] unused = C5997b.this.f67876e = strArr;
            }
        }

        /* renamed from: hg.b$e$b  reason: collision with other inner class name */
        class C1011b extends C1009b {
            C1011b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                String[] unused = C5997b.this.f67877f = strArr;
            }
        }

        private e() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private C5974x.b h() {
            return new a();
        }

        private C5974x.b i() {
            return new C1011b();
        }

        public C5974x.b b(f fVar) {
            String str;
            if (fVar != null) {
                str = fVar.b();
            } else {
                str = null;
            }
            if ("data".equals(str) || "filePartClassNames".equals(str)) {
                return h();
            }
            if ("strings".equals(str)) {
                return i();
            }
            return null;
        }

        public void c(f fVar, b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        public C5974x.a d(f fVar, b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        public void e(f fVar, Object obj) {
            String str;
            if (fVar != null) {
                String b10 = fVar.b();
                if (DiagnosticsEntry.VERSION_KEY.equals(b10)) {
                    if (obj instanceof int[]) {
                        int[] unused = C5997b.this.f67872a = (int[]) obj;
                    }
                } else if ("multifileClassName".equals(b10)) {
                    C5997b bVar = C5997b.this;
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str = null;
                    }
                    String unused2 = bVar.f67873b = str;
                }
            }
        }

        public void f(f fVar, C6740f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        public void a() {
        }
    }

    public void a() {
    }
}
