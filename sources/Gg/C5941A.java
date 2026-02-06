package gg;

import kg.C6436c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import lg.C6536a;
import mg.C6576d;

/* renamed from: gg.A  reason: case insensitive filesystem */
public final class C5941A {

    /* renamed from: b  reason: collision with root package name */
    public static final a f67712b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f67713a;

    /* renamed from: gg.A$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5941A a(String str, String str2) {
            C6496s.h(str, "name");
            C6496s.h(str2, "desc");
            return new C5941A(str + '#' + str2, (DefaultConstructorMarker) null);
        }

        public final C5941A b(C6576d dVar) {
            C6496s.h(dVar, "signature");
            if (dVar instanceof C6576d.b) {
                C6576d.b bVar = (C6576d.b) dVar;
                return d(bVar.e(), bVar.d());
            } else if (dVar instanceof C6576d.a) {
                C6576d.a aVar = (C6576d.a) dVar;
                return a(aVar.e(), aVar.d());
            } else {
                throw new C6535s();
            }
        }

        public final C5941A c(C6436c cVar, C6536a.c cVar2) {
            C6496s.h(cVar, "nameResolver");
            C6496s.h(cVar2, "signature");
            return d(cVar.getString(cVar2.x()), cVar.getString(cVar2.w()));
        }

        public final C5941A d(String str, String str2) {
            C6496s.h(str, "name");
            C6496s.h(str2, "desc");
            return new C5941A(str + str2, (DefaultConstructorMarker) null);
        }

        public final C5941A e(C5941A a10, int i10) {
            C6496s.h(a10, "signature");
            return new C5941A(a10.a() + '@' + i10, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C5941A(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f67713a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5941A) && C6496s.c(this.f67713a, ((C5941A) obj).f67713a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f67713a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f67713a + ')';
    }

    private C5941A(String str) {
        this.f67713a = str;
    }
}
