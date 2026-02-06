package com.facebook;

import Sg.C5541d;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.JwsHeader;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.X;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.m  reason: case insensitive filesystem */
public final class C3323m implements Parcelable {
    public static final Parcelable.Creator<C3323m> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final b f40194d = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f40195a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40196b;

    /* renamed from: c  reason: collision with root package name */
    private final String f40197c;

    /* renamed from: com.facebook.m$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C3323m createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new C3323m(parcel);
        }

        /* renamed from: b */
        public C3323m[] newArray(int i10) {
            return new C3323m[i10];
        }
    }

    /* renamed from: com.facebook.m$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C3323m(String str) {
        C6496s.h(str, "encodedHeaderString");
        if (b(str)) {
            byte[] decode = Base64.decode(str, 0);
            C6496s.g(decode, "decodedBytes");
            JSONObject jSONObject = new JSONObject(new String(decode, C5541d.f65029b));
            String string = jSONObject.getString(JwsHeader.ALGORITHM);
            C6496s.g(string, "jsonObj.getString(\"alg\")");
            this.f40195a = string;
            String string2 = jSONObject.getString(Header.TYPE);
            C6496s.g(string2, "jsonObj.getString(\"typ\")");
            this.f40196b = string2;
            String string3 = jSONObject.getString(JwsHeader.KEY_ID);
            C6496s.g(string3, "jsonObj.getString(\"kid\")");
            this.f40197c = string3;
            return;
        }
        throw new IllegalArgumentException("Invalid Header");
    }

    private final boolean b(String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        X.j(str, "encodedHeaderString");
        byte[] decode = Base64.decode(str, 0);
        C6496s.g(decode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, C5541d.f65029b));
            String optString = jSONObject.optString(JwsHeader.ALGORITHM);
            C6496s.g(optString, JwsHeader.ALGORITHM);
            if (optString.length() <= 0 || !C6496s.c(optString, "RS256")) {
                z10 = false;
            } else {
                z10 = true;
            }
            String optString2 = jSONObject.optString(JwsHeader.KEY_ID);
            C6496s.g(optString2, "jsonObj.optString(\"kid\")");
            if (optString2.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            String optString3 = jSONObject.optString(Header.TYPE);
            C6496s.g(optString3, "jsonObj.optString(\"typ\")");
            if (optString3.length() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z10 || !z11 || !z12) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public final String a() {
        return this.f40197c;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(JwsHeader.ALGORITHM, this.f40195a);
        jSONObject.put(Header.TYPE, this.f40196b);
        jSONObject.put(JwsHeader.KEY_ID, this.f40197c);
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3323m)) {
            return false;
        }
        C3323m mVar = (C3323m) obj;
        if (!C6496s.c(this.f40195a, mVar.f40195a) || !C6496s.c(this.f40196b, mVar.f40196b) || !C6496s.c(this.f40197c, mVar.f40197c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((527 + this.f40195a.hashCode()) * 31) + this.f40196b.hashCode()) * 31) + this.f40197c.hashCode();
    }

    public String toString() {
        String jSONObject = c().toString();
        C6496s.g(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeString(this.f40195a);
        parcel.writeString(this.f40196b);
        parcel.writeString(this.f40197c);
    }

    public C3323m(Parcel parcel) {
        C6496s.h(parcel, "parcel");
        this.f40195a = X.n(parcel.readString(), JwsHeader.ALGORITHM);
        this.f40196b = X.n(parcel.readString(), Header.TYPE);
        this.f40197c = X.n(parcel.readString(), JwsHeader.KEY_ID);
    }
}
