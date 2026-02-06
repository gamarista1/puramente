package Xf;

import Ff.f;
import kotlin.jvm.internal.C6493o;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6529m;
import ng.c;
import yf.C6798l;

public final class D {

    /* renamed from: d  reason: collision with root package name */
    public static final b f66244d = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final D f66245e = new D(B.b((C6529m) null, 1, (Object) null), a.f66249a);

    /* renamed from: a  reason: collision with root package name */
    private final G f66246a;

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f66247b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f66248c;

    /* synthetic */ class a extends C6493o implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66249a = new a();

        a() {
            super(1);
        }

        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        public final f getOwner() {
            return O.d(B.class, "compiler.common.jvm");
        }

        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        /* renamed from: i */
        public final O invoke(c cVar) {
            C6496s.h(cVar, "p0");
            return B.d(cVar);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final D a() {
            return D.f66245e;
        }

        private b() {
        }
    }

    public D(G g10, C6798l lVar) {
        boolean z10;
        C6496s.h(g10, "jsr305");
        C6496s.h(lVar, "getReportLevelForAnnotation");
        this.f66246a = g10;
        this.f66247b = lVar;
        if (g10.f() || lVar.invoke(B.e()) == O.IGNORE) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f66248c = z10;
    }

    public final boolean b() {
        return this.f66248c;
    }

    public final C6798l c() {
        return this.f66247b;
    }

    public final G d() {
        return this.f66246a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f66246a + ", getReportLevelForAnnotation=" + this.f66247b + ')';
    }
}
