package com.facebook;

import Sg.p;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.X;
import org.json.JSONObject;
import x7.C4176b;

/* renamed from: com.facebook.j  reason: case insensitive filesystem */
public final class C3320j implements Parcelable {
    public static final Parcelable.Creator<C3320j> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final b f40102f = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f40103a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40104b;

    /* renamed from: c  reason: collision with root package name */
    private final C3323m f40105c;

    /* renamed from: d  reason: collision with root package name */
    private final C3322l f40106d;

    /* renamed from: e  reason: collision with root package name */
    private final String f40107e;

    /* renamed from: com.facebook.j$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C3320j createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new C3320j(parcel);
        }

        /* renamed from: b */
        public C3320j[] newArray(int i10) {
            return new C3320j[i10];
        }
    }

    /* renamed from: com.facebook.j$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(C3320j jVar) {
            AuthenticationTokenManager.f39256d.a().e(jVar);
        }

        private b() {
        }
    }

    public C3320j(String str, String str2) {
        C6496s.h(str, "token");
        C6496s.h(str2, "expectedNonce");
        X.j(str, "token");
        X.j(str2, "expectedNonce");
        List F02 = p.F0(str, new String[]{"."}, false, 0, 6, (Object) null);
        if (F02.size() == 3) {
            String str3 = (String) F02.get(0);
            String str4 = (String) F02.get(1);
            String str5 = (String) F02.get(2);
            this.f40103a = str;
            this.f40104b = str2;
            C3323m mVar = new C3323m(str3);
            this.f40105c = mVar;
            this.f40106d = new C3322l(str4, str2);
            if (a(str3, str4, str5, mVar.a())) {
                this.f40107e = str5;
                return;
            }
            throw new IllegalArgumentException("Invalid Signature");
        }
        throw new IllegalArgumentException("Invalid IdToken string");
    }

    private final boolean a(String str, String str2, String str3, String str4) {
        try {
            String c10 = C4176b.c(str4);
            if (c10 == null) {
                return false;
            }
            PublicKey b10 = C4176b.b(c10);
            return C4176b.e(b10, str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f40103a);
        jSONObject.put("expected_nonce", this.f40104b);
        jSONObject.put("header", this.f40105c.c());
        jSONObject.put("claims", this.f40106d.b());
        jSONObject.put("signature", this.f40107e);
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3320j)) {
            return false;
        }
        C3320j jVar = (C3320j) obj;
        if (!C6496s.c(this.f40103a, jVar.f40103a) || !C6496s.c(this.f40104b, jVar.f40104b) || !C6496s.c(this.f40105c, jVar.f40105c) || !C6496s.c(this.f40106d, jVar.f40106d) || !C6496s.c(this.f40107e, jVar.f40107e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((527 + this.f40103a.hashCode()) * 31) + this.f40104b.hashCode()) * 31) + this.f40105c.hashCode()) * 31) + this.f40106d.hashCode()) * 31) + this.f40107e.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeString(this.f40103a);
        parcel.writeString(this.f40104b);
        parcel.writeParcelable(this.f40105c, i10);
        parcel.writeParcelable(this.f40106d, i10);
        parcel.writeString(this.f40107e);
    }

    public C3320j(Parcel parcel) {
        C6496s.h(parcel, "parcel");
        this.f40103a = X.n(parcel.readString(), "token");
        this.f40104b = X.n(parcel.readString(), "expectedNonce");
        Parcelable readParcelable = parcel.readParcelable(C3323m.class.getClassLoader());
        if (readParcelable != null) {
            this.f40105c = (C3323m) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(C3322l.class.getClassLoader());
            if (readParcelable2 != null) {
                this.f40106d = (C3322l) readParcelable2;
                this.f40107e = X.n(parcel.readString(), "signature");
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
