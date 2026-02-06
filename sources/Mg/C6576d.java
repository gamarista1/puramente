package mg;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: mg.d  reason: case insensitive filesystem */
public abstract class C6576d {

    /* renamed from: mg.d$a */
    public static final class a extends C6576d {

        /* renamed from: a  reason: collision with root package name */
        private final String f72092a;

        /* renamed from: b  reason: collision with root package name */
        private final String f72093b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "name");
            C6496s.h(str2, "desc");
            this.f72092a = str;
            this.f72093b = str2;
        }

        public String a() {
            return e() + ':' + d();
        }

        public final String b() {
            return this.f72092a;
        }

        public final String c() {
            return this.f72093b;
        }

        public String d() {
            return this.f72093b;
        }

        public String e() {
            return this.f72092a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C6496s.c(this.f72092a, aVar.f72092a) && C6496s.c(this.f72093b, aVar.f72093b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f72092a.hashCode() * 31) + this.f72093b.hashCode();
        }
    }

    /* renamed from: mg.d$b */
    public static final class b extends C6576d {

        /* renamed from: a  reason: collision with root package name */
        private final String f72094a;

        /* renamed from: b  reason: collision with root package name */
        private final String f72095b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "name");
            C6496s.h(str2, "desc");
            this.f72094a = str;
            this.f72095b = str2;
        }

        public static /* synthetic */ b c(b bVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f72094a;
            }
            if ((i10 & 2) != 0) {
                str2 = bVar.f72095b;
            }
            return bVar.b(str, str2);
        }

        public String a() {
            return e() + d();
        }

        public final b b(String str, String str2) {
            C6496s.h(str, "name");
            C6496s.h(str2, "desc");
            return new b(str, str2);
        }

        public String d() {
            return this.f72095b;
        }

        public String e() {
            return this.f72094a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (C6496s.c(this.f72094a, bVar.f72094a) && C6496s.c(this.f72095b, bVar.f72095b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f72094a.hashCode() * 31) + this.f72095b.hashCode();
        }
    }

    public /* synthetic */ C6576d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    public final String toString() {
        return a();
    }

    private C6576d() {
    }
}
