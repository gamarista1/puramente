package Mg;

import Mg.g;
import Of.C5507z;
import Sg.m;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.f;
import yf.C6798l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final f f64149a;

    /* renamed from: b  reason: collision with root package name */
    private final m f64150b;

    /* renamed from: c  reason: collision with root package name */
    private final Collection f64151c;

    /* renamed from: d  reason: collision with root package name */
    private final C6798l f64152d;

    /* renamed from: e  reason: collision with root package name */
    private final f[] f64153e;

    static final class a implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f64154a = new a();

        a() {
        }

        /* renamed from: a */
        public final Void invoke(C5507z zVar) {
            C6496s.h(zVar, "<this>");
            return null;
        }
    }

    static final class b implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f64155a = new b();

        b() {
        }

        /* renamed from: a */
        public final Void invoke(C5507z zVar) {
            C6496s.h(zVar, "<this>");
            return null;
        }
    }

    static final class c implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f64156a = new c();

        c() {
        }

        /* renamed from: a */
        public final Void invoke(C5507z zVar) {
            C6496s.h(zVar, "<this>");
            return null;
        }
    }

    private h(f fVar, m mVar, Collection collection, C6798l lVar, f... fVarArr) {
        this.f64149a = fVar;
        this.f64150b = mVar;
        this.f64151c = collection;
        this.f64152d = lVar;
        this.f64153e = fVarArr;
    }

    public final g a(C5507z zVar) {
        C6496s.h(zVar, "functionDescriptor");
        for (f b10 : this.f64153e) {
            String b11 = b10.b(zVar);
            if (b11 != null) {
                return new g.b(b11);
            }
        }
        String str = (String) this.f64152d.invoke(zVar);
        if (str != null) {
            return new g.b(str);
        }
        return g.c.f64148b;
    }

    public final boolean b(C5507z zVar) {
        C6496s.h(zVar, "functionDescriptor");
        if (this.f64149a != null && !C6496s.c(zVar.getName(), this.f64149a)) {
            return false;
        }
        if (this.f64150b != null) {
            String b10 = zVar.getName().b();
            C6496s.g(b10, "asString(...)");
            if (!this.f64150b.d(b10)) {
                return false;
            }
        }
        Collection collection = this.f64151c;
        if (collection == null || collection.contains(zVar.getName())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(f fVar, f[] fVarArr, C6798l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, fVarArr, (i10 & 4) != 0 ? a.f64154a : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(f fVar, f[] fVarArr, C6798l lVar) {
        this(fVar, (m) null, (Collection) null, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        C6496s.h(fVar, "name");
        C6496s.h(fVarArr, "checks");
        C6496s.h(lVar, "additionalChecks");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(m mVar, f[] fVarArr, C6798l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, fVarArr, (i10 & 4) != 0 ? b.f64155a : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(m mVar, f[] fVarArr, C6798l lVar) {
        this((f) null, mVar, (Collection) null, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        C6496s.h(mVar, "regex");
        C6496s.h(fVarArr, "checks");
        C6496s.h(lVar, "additionalChecks");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Collection collection, f[] fVarArr, C6798l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, fVarArr, (i10 & 4) != 0 ? c.f64156a : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(Collection collection, f[] fVarArr, C6798l lVar) {
        this((f) null, (m) null, collection, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        C6496s.h(collection, "nameList");
        C6496s.h(fVarArr, "checks");
        C6496s.h(lVar, "additionalChecks");
    }
}
