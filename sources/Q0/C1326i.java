package Q0;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Q0.i  reason: case insensitive filesystem */
public abstract class C1326i {

    /* renamed from: Q0.i$a */
    public static final class a extends C1326i {

        /* renamed from: a  reason: collision with root package name */
        private final String f5345a;

        /* renamed from: b  reason: collision with root package name */
        private final M f5346b;

        /* renamed from: c  reason: collision with root package name */
        private final C1327j f5347c;

        public a(String str, M m10, C1327j jVar) {
            super((DefaultConstructorMarker) null);
            this.f5345a = str;
            this.f5346b = m10;
            this.f5347c = jVar;
        }

        public C1327j a() {
            return this.f5347c;
        }

        public M b() {
            return this.f5346b;
        }

        public final String c() {
            return this.f5345a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C6496s.c(this.f5345a, aVar.f5345a) && C6496s.c(b(), aVar.b()) && C6496s.c(a(), aVar.a())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int hashCode = this.f5345a.hashCode() * 31;
            M b10 = b();
            int i11 = 0;
            if (b10 != null) {
                i10 = b10.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (hashCode + i10) * 31;
            C1327j a10 = a();
            if (a10 != null) {
                i11 = a10.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.f5345a + ')';
        }
    }

    /* renamed from: Q0.i$b */
    public static final class b extends C1326i {

        /* renamed from: a  reason: collision with root package name */
        private final String f5348a;

        /* renamed from: b  reason: collision with root package name */
        private final M f5349b;

        /* renamed from: c  reason: collision with root package name */
        private final C1327j f5350c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, M m10, C1327j jVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : m10, (i10 & 4) != 0 ? null : jVar);
        }

        public C1327j a() {
            return this.f5350c;
        }

        public M b() {
            return this.f5349b;
        }

        public final String c() {
            return this.f5348a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (C6496s.c(this.f5348a, bVar.f5348a) && C6496s.c(b(), bVar.b()) && C6496s.c(a(), bVar.a())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int hashCode = this.f5348a.hashCode() * 31;
            M b10 = b();
            int i11 = 0;
            if (b10 != null) {
                i10 = b10.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (hashCode + i10) * 31;
            C1327j a10 = a();
            if (a10 != null) {
                i11 = a10.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.f5348a + ')';
        }

        public b(String str, M m10, C1327j jVar) {
            super((DefaultConstructorMarker) null);
            this.f5348a = str;
            this.f5349b = m10;
            this.f5350c = jVar;
        }
    }

    public /* synthetic */ C1326i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C1327j a();

    public abstract M b();

    private C1326i() {
    }
}
