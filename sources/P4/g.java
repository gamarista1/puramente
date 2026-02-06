package p4;

import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.models.Participant;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class g {

    public static final class a extends g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f47556a = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f47557a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Throwable th2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(th2, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            this.f47557a = th2;
        }

        public final Throwable a() {
            return this.f47557a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && C6496s.c(this.f47557a, ((b) obj).f47557a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f47557a.hashCode();
        }

        public String toString() {
            Throwable th2 = this.f47557a;
            return "Failure(error=" + th2 + ")";
        }
    }

    public static final class c extends g {

        /* renamed from: a  reason: collision with root package name */
        private final String f47558a;

        /* renamed from: b  reason: collision with root package name */
        private final String f47559b;

        /* renamed from: c  reason: collision with root package name */
        private final String f47560c;

        /* renamed from: d  reason: collision with root package name */
        private final String f47561d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, String str4) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "code");
            C6496s.h(str2, "id_token");
            C6496s.h(str3, "state");
            C6496s.h(str4, Participant.USER_TYPE);
            this.f47558a = str;
            this.f47559b = str2;
            this.f47560c = str3;
            this.f47561d = str4;
        }

        public final String a() {
            return this.f47558a;
        }

        public final String b() {
            return this.f47559b;
        }

        public final String c() {
            return this.f47560c;
        }

        public final String d() {
            return this.f47561d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (C6496s.c(this.f47558a, cVar.f47558a) && C6496s.c(this.f47559b, cVar.f47559b) && C6496s.c(this.f47560c, cVar.f47560c) && C6496s.c(this.f47561d, cVar.f47561d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f47558a.hashCode() * 31) + this.f47559b.hashCode()) * 31) + this.f47560c.hashCode()) * 31) + this.f47561d.hashCode();
        }

        public String toString() {
            String str = this.f47558a;
            String str2 = this.f47559b;
            String str3 = this.f47560c;
            String str4 = this.f47561d;
            return "Success(code=" + str + ", id_token=" + str2 + ", state=" + str3 + ", user=" + str4 + ")";
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private g() {
    }
}
