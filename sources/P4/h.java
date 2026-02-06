package p4;

import Sg.p;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.J;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q4.C3945c;
import yf.C6798l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final J f47562a;

    /* renamed from: b  reason: collision with root package name */
    private final String f47563b;

    /* renamed from: c  reason: collision with root package name */
    private final com.RNAppleAuthentication.a f47564c;

    /* renamed from: d  reason: collision with root package name */
    private final C6798l f47565d;

    public h(J j10, String str, com.RNAppleAuthentication.a aVar, C6798l lVar) {
        C6496s.h(j10, "fragmentManager");
        C6496s.h(str, "fragmentTag");
        C6496s.h(aVar, "configuration");
        C6496s.h(lVar, "callback");
        this.f47562a = j10;
        this.f47563b = str;
        this.f47564c = aVar;
        this.f47565d = lVar;
        C1769q l02 = j10.l0(str);
        C3945c cVar = l02 instanceof C3945c ? (C3945c) l02 : null;
        if (cVar != null) {
            cVar.V(lVar);
        }
    }

    public final void a() {
        C3945c a10 = C3945c.f47604s.a(a.CREATOR.a(this.f47564c));
        a10.V(this.f47565d);
        a10.T(this.f47562a, this.f47563b);
    }

    public static final class a implements Parcelable {
        public static final C0713a CREATOR = new C0713a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f47566a;

        /* renamed from: b  reason: collision with root package name */
        private final String f47567b;

        /* renamed from: c  reason: collision with root package name */
        private final String f47568c;

        /* renamed from: p4.h$a$a  reason: collision with other inner class name */
        public static final class C0713a implements Parcelable.Creator {
            public /* synthetic */ C0713a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(com.RNAppleAuthentication.a aVar) {
                C6496s.h(aVar, "configuration");
                Uri.Builder buildUpon = Uri.parse("https://appleid.apple.com/auth/authorize").buildUpon();
                buildUpon.appendQueryParameter("client_id", aVar.a());
                buildUpon.appendQueryParameter("redirect_uri", aVar.d());
                buildUpon.appendQueryParameter("response_type", aVar.e());
                buildUpon.appendQueryParameter("scope", aVar.f());
                buildUpon.appendQueryParameter("response_mode", "form_post");
                buildUpon.appendQueryParameter("state", aVar.g());
                if (!p.d0(aVar.b())) {
                    buildUpon.appendQueryParameter("nonce", aVar.b());
                }
                String uri = buildUpon.build().toString();
                C6496s.g(uri, "toString(...)");
                return new a(uri, aVar.d(), aVar.g());
            }

            /* renamed from: b */
            public a createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                return new a(parcel);
            }

            /* renamed from: c */
            public a[] newArray(int i10) {
                return new a[i10];
            }

            private C0713a() {
            }
        }

        public a(String str, String str2, String str3) {
            C6496s.h(str, "authenticationUri");
            C6496s.h(str2, "redirectUri");
            C6496s.h(str3, "state");
            this.f47566a = str;
            this.f47567b = str2;
            this.f47568c = str3;
        }

        public final String a() {
            return this.f47566a;
        }

        public final String b() {
            return this.f47567b;
        }

        public final String c() {
            return this.f47568c;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C6496s.c(this.f47566a, aVar.f47566a) && C6496s.c(this.f47567b, aVar.f47567b) && C6496s.c(this.f47568c, aVar.f47568c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f47566a.hashCode() * 31) + this.f47567b.hashCode()) * 31) + this.f47568c.hashCode();
        }

        public String toString() {
            String str = this.f47566a;
            String str2 = this.f47567b;
            String str3 = this.f47568c;
            return "AuthenticationAttempt(authenticationUri=" + str + ", redirectUri=" + str2 + ", state=" + str3 + ")";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "parcel");
            parcel.writeString(this.f47566a);
            parcel.writeString(this.f47567b);
            parcel.writeString(this.f47568c);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.os.Parcel r4) {
            /*
                r3 = this;
                java.lang.String r0 = "parcel"
                kotlin.jvm.internal.C6496s.h(r4, r0)
                java.lang.String r0 = r4.readString()
                java.lang.String r1 = "invalid"
                if (r0 != 0) goto L_0x000e
                r0 = r1
            L_0x000e:
                java.lang.String r2 = r4.readString()
                if (r2 != 0) goto L_0x0015
                r2 = r1
            L_0x0015:
                java.lang.String r4 = r4.readString()
                if (r4 != 0) goto L_0x001c
                goto L_0x001d
            L_0x001c:
                r1 = r4
            L_0x001d:
                r3.<init>(r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p4.h.a.<init>(android.os.Parcel):void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(J j10, String str, com.RNAppleAuthentication.a aVar, C3929d dVar) {
        this(j10, str, aVar, f.b(dVar));
        C6496s.h(j10, "fragmentManager");
        C6496s.h(str, "fragmentTag");
        C6496s.h(aVar, "configuration");
        C6496s.h(dVar, "callback");
    }
}
