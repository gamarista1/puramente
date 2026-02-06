package r0;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2423i;
import q0.C2425k;
import q0.C2426l;
import r0.S1;

public abstract class O1 {

    public static final class a extends O1 {

        /* renamed from: a  reason: collision with root package name */
        private final S1 f25447a;

        public a(S1 s12) {
            super((DefaultConstructorMarker) null);
            this.f25447a = s12;
        }

        public C2423i a() {
            return this.f25447a.getBounds();
        }

        public final S1 b() {
            return this.f25447a;
        }
    }

    public static final class b extends O1 {

        /* renamed from: a  reason: collision with root package name */
        private final C2423i f25448a;

        public b(C2423i iVar) {
            super((DefaultConstructorMarker) null);
            this.f25448a = iVar;
        }

        public C2423i a() {
            return this.f25448a;
        }

        public final C2423i b() {
            return this.f25448a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && C6496s.c(this.f25448a, ((b) obj).f25448a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f25448a.hashCode();
        }
    }

    public static final class c extends O1 {

        /* renamed from: a  reason: collision with root package name */
        private final C2425k f25449a;

        /* renamed from: b  reason: collision with root package name */
        private final S1 f25450b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C2425k kVar) {
            super((DefaultConstructorMarker) null);
            S1 s12 = null;
            this.f25449a = kVar;
            if (!C2426l.e(kVar)) {
                S1 a10 = C2472Y.a();
                S1.a(a10, kVar, (S1.b) null, 2, (Object) null);
                s12 = a10;
            }
            this.f25450b = s12;
        }

        public C2423i a() {
            return C2426l.d(this.f25449a);
        }

        public final C2425k b() {
            return this.f25449a;
        }

        public final S1 c() {
            return this.f25450b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && C6496s.c(this.f25449a, ((c) obj).f25449a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f25449a.hashCode();
        }
    }

    public /* synthetic */ O1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C2423i a();

    private O1() {
    }
}
