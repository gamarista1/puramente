package androidx.compose.animation;

import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.O;
import v.C2724g;
import v.C2729l;
import v.C2736s;
import v.C2739v;
import v.C2743z;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12384a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final k f12385b = new l(new C2743z((C2729l) null, (C2739v) null, (C2724g) null, (C2736s) null, false, (Map) null, 63, (DefaultConstructorMarker) null));

    /* renamed from: c  reason: collision with root package name */
    private static final k f12386c = new l(new C2743z((C2729l) null, (C2739v) null, (C2724g) null, (C2736s) null, true, (Map) null, 47, (DefaultConstructorMarker) null));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a() {
            return k.f12385b;
        }

        private a() {
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C2743z b();

    public final k c(k kVar) {
        boolean z10;
        C2729l c10 = kVar.b().c();
        if (c10 == null) {
            c10 = b().c();
        }
        C2729l lVar = c10;
        C2739v f10 = kVar.b().f();
        if (f10 == null) {
            f10 = b().f();
        }
        C2739v vVar = f10;
        C2724g a10 = kVar.b().a();
        if (a10 == null) {
            a10 = b().a();
        }
        C2724g gVar = a10;
        C2736s e10 = kVar.b().e();
        if (e10 == null) {
            e10 = b().e();
        }
        C2736s sVar = e10;
        if (kVar.b().d() || b().d()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new l(new C2743z(lVar, vVar, gVar, sVar, z10, O.p(b().b(), kVar.b().b())));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k) || !C6496s.c(((k) obj).b(), b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (C6496s.c(this, f12385b)) {
            return "ExitTransition.None";
        }
        if (C6496s.c(this, f12386c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        C2743z b10 = b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExitTransition: \nFade - ");
        C2729l c10 = b10.c();
        String str4 = null;
        if (c10 != null) {
            str = c10.toString();
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(",\nSlide - ");
        C2739v f10 = b10.f();
        if (f10 != null) {
            str2 = f10.toString();
        } else {
            str2 = null;
        }
        sb2.append(str2);
        sb2.append(",\nShrink - ");
        C2724g a10 = b10.a();
        if (a10 != null) {
            str3 = a10.toString();
        } else {
            str3 = null;
        }
        sb2.append(str3);
        sb2.append(",\nScale - ");
        C2736s e10 = b10.e();
        if (e10 != null) {
            str4 = e10.toString();
        }
        sb2.append(str4);
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(b10.d());
        return sb2.toString();
    }

    private k() {
    }
}
