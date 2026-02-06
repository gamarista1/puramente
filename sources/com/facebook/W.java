package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.C3286a;
import io.intercom.android.sdk.models.carousel.ActionType;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.D;
import o7.W;
import o7.X;
import org.json.JSONException;
import org.json.JSONObject;

public final class W implements Parcelable {
    public static final Parcelable.Creator<W> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public static final b f39382h = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final String f39383i = W.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final String f39384a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39385b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39386c;

    /* renamed from: d  reason: collision with root package name */
    private final String f39387d;

    /* renamed from: e  reason: collision with root package name */
    private final String f39388e;

    /* renamed from: f  reason: collision with root package name */
    private final Uri f39389f;

    /* renamed from: g  reason: collision with root package name */
    private final Uri f39390g;

    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public W createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new W(parcel, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public W[] newArray(int i10) {
            return new W[i10];
        }
    }

    public static final class b {

        public static final class a implements W.a {
            a() {
            }

            public void a(JSONObject jSONObject) {
                String str;
                Uri uri;
                Uri uri2 = null;
                if (jSONObject != null) {
                    str = jSONObject.optString("id");
                } else {
                    str = null;
                }
                if (str == null) {
                    Log.w(W.f39383i, "No user ID returned on Me request");
                    return;
                }
                String optString = jSONObject.optString(ActionType.LINK);
                String optString2 = jSONObject.optString("profile_picture", (String) null);
                String optString3 = jSONObject.optString("first_name");
                String optString4 = jSONObject.optString("middle_name");
                String optString5 = jSONObject.optString("last_name");
                String optString6 = jSONObject.optString("name");
                if (optString != null) {
                    uri = Uri.parse(optString);
                } else {
                    uri = null;
                }
                if (optString2 != null) {
                    uri2 = Uri.parse(optString2);
                }
                W.f39382h.c(new W(str, optString3, optString4, optString5, optString6, uri, uri2));
            }

            public void b(C3459v vVar) {
                String a10 = W.f39383i;
                Log.e(a10, "Got unexpected exception: " + vVar);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            C3286a.c cVar = C3286a.f39402l;
            C3286a e10 = cVar.e();
            if (e10 != null) {
                if (!cVar.g()) {
                    c((W) null);
                } else {
                    o7.W.H(e10.n(), new a());
                }
            }
        }

        public final W b() {
            return Y.f39393d.a().c();
        }

        public final void c(W w10) {
            Y.f39393d.a().f(w10);
        }

        private b() {
        }
    }

    public /* synthetic */ W(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public static final W b() {
        return f39382h.b();
    }

    public final String c() {
        return this.f39385b;
    }

    public final String d() {
        return this.f39384a;
    }

    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f39387d;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        String str5 = this.f39384a;
        if (((str5 != null || ((W) obj).f39384a != null) && !C6496s.c(str5, ((W) obj).f39384a)) || ((((str = this.f39385b) != null || ((W) obj).f39385b != null) && !C6496s.c(str, ((W) obj).f39385b)) || ((((str2 = this.f39386c) != null || ((W) obj).f39386c != null) && !C6496s.c(str2, ((W) obj).f39386c)) || ((((str3 = this.f39387d) != null || ((W) obj).f39387d != null) && !C6496s.c(str3, ((W) obj).f39387d)) || ((((str4 = this.f39388e) != null || ((W) obj).f39388e != null) && !C6496s.c(str4, ((W) obj).f39388e)) || ((((uri = this.f39389f) != null || ((W) obj).f39389f != null) && !C6496s.c(uri, ((W) obj).f39389f)) || (((uri2 = this.f39390g) != null || ((W) obj).f39390g != null) && !C6496s.c(uri2, ((W) obj).f39390g)))))))) {
            return false;
        }
        return true;
    }

    public final Uri f() {
        return this.f39389f;
    }

    public final String g() {
        return this.f39386c;
    }

    public final String getName() {
        return this.f39388e;
    }

    public final Uri h(int i10, int i11) {
        String str;
        Uri uri = this.f39390g;
        if (uri != null) {
            return uri;
        }
        C3286a.c cVar = C3286a.f39402l;
        if (cVar.g()) {
            C3286a e10 = cVar.e();
            if (e10 != null) {
                str = e10.n();
            } else {
                str = null;
            }
        } else {
            str = "";
        }
        return D.f47101a.a(this.f39384a, i10, i11, str);
    }

    public int hashCode() {
        int i10;
        String str = this.f39384a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i11 = 527 + i10;
        String str2 = this.f39385b;
        if (str2 != null) {
            i11 = (i11 * 31) + str2.hashCode();
        }
        String str3 = this.f39386c;
        if (str3 != null) {
            i11 = (i11 * 31) + str3.hashCode();
        }
        String str4 = this.f39387d;
        if (str4 != null) {
            i11 = (i11 * 31) + str4.hashCode();
        }
        String str5 = this.f39388e;
        if (str5 != null) {
            i11 = (i11 * 31) + str5.hashCode();
        }
        Uri uri = this.f39389f;
        if (uri != null) {
            i11 = (i11 * 31) + uri.hashCode();
        }
        Uri uri2 = this.f39390g;
        if (uri2 != null) {
            return (i11 * 31) + uri2.hashCode();
        }
        return i11;
    }

    public final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f39384a);
            jSONObject.put("first_name", this.f39385b);
            jSONObject.put("middle_name", this.f39386c);
            jSONObject.put("last_name", this.f39387d);
            jSONObject.put("name", this.f39388e);
            Uri uri = this.f39389f;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            Uri uri2 = this.f39390g;
            if (uri2 != null) {
                jSONObject.put("picture_uri", uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        String str;
        C6496s.h(parcel, "dest");
        parcel.writeString(this.f39384a);
        parcel.writeString(this.f39385b);
        parcel.writeString(this.f39386c);
        parcel.writeString(this.f39387d);
        parcel.writeString(this.f39388e);
        Uri uri = this.f39389f;
        String str2 = null;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        Uri uri2 = this.f39390g;
        if (uri2 != null) {
            str2 = uri2.toString();
        }
        parcel.writeString(str2);
    }

    public W(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        X.n(str, "id");
        this.f39384a = str;
        this.f39385b = str2;
        this.f39386c = str3;
        this.f39387d = str4;
        this.f39388e = str5;
        this.f39389f = uri;
        this.f39390g = uri2;
    }

    public W(JSONObject jSONObject) {
        Uri uri;
        C6496s.h(jSONObject, "jsonObject");
        Uri uri2 = null;
        this.f39384a = jSONObject.optString("id", (String) null);
        this.f39385b = jSONObject.optString("first_name", (String) null);
        this.f39386c = jSONObject.optString("middle_name", (String) null);
        this.f39387d = jSONObject.optString("last_name", (String) null);
        this.f39388e = jSONObject.optString("name", (String) null);
        String optString = jSONObject.optString("link_uri", (String) null);
        if (optString == null) {
            uri = null;
        } else {
            uri = Uri.parse(optString);
        }
        this.f39389f = uri;
        String optString2 = jSONObject.optString("picture_uri", (String) null);
        this.f39390g = optString2 != null ? Uri.parse(optString2) : uri2;
    }

    private W(Parcel parcel) {
        Uri uri;
        this.f39384a = parcel.readString();
        this.f39385b = parcel.readString();
        this.f39386c = parcel.readString();
        this.f39387d = parcel.readString();
        this.f39388e = parcel.readString();
        String readString = parcel.readString();
        Uri uri2 = null;
        if (readString == null) {
            uri = null;
        } else {
            uri = Uri.parse(readString);
        }
        this.f39389f = uri;
        String readString2 = parcel.readString();
        this.f39390g = readString2 != null ? Uri.parse(readString2) : uri2;
    }
}
