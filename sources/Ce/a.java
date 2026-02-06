package Ce;

import Fe.C3016e;
import Fe.C3020i;
import Fe.C3023l;
import Fe.C3028q;
import Fe.W;
import Fe.r;
import Fe.y;
import Ie.e;
import Ie.g;
import Ie.i;
import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0770a();

    /* renamed from: a  reason: collision with root package name */
    private String f50401a;

    /* renamed from: b  reason: collision with root package name */
    private String f50402b;

    /* renamed from: c  reason: collision with root package name */
    private String f50403c;

    /* renamed from: d  reason: collision with root package name */
    private String f50404d;

    /* renamed from: e  reason: collision with root package name */
    private String f50405e;

    /* renamed from: f  reason: collision with root package name */
    private Ie.d f50406f;

    /* renamed from: g  reason: collision with root package name */
    private b f50407g;

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList f50408h;

    /* renamed from: i  reason: collision with root package name */
    private long f50409i;

    /* renamed from: j  reason: collision with root package name */
    private b f50410j;

    /* renamed from: k  reason: collision with root package name */
    private long f50411k;

    /* renamed from: Ce.a$a  reason: collision with other inner class name */
    class C0770a implements Parcelable.Creator {
        C0770a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0770a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public enum b {
        PUBLIC,
        PRIVATE
    }

    private class c implements C3016e.C0512e {

        /* renamed from: a  reason: collision with root package name */
        private final C3016e.C0512e f50415a;

        /* renamed from: b  reason: collision with root package name */
        private final C3028q f50416b;

        /* renamed from: c  reason: collision with root package name */
        private final g f50417c;

        c(C3016e.C0512e eVar, C3028q qVar, g gVar) {
            this.f50415a = eVar;
            this.f50416b = qVar;
            this.f50417c = gVar;
        }

        public void a() {
            C3016e.C0512e eVar = this.f50415a;
            if (eVar != null) {
                eVar.a();
            }
        }

        public void b() {
            C3016e.C0512e eVar = this.f50415a;
            if (eVar != null) {
                eVar.b();
            }
        }

        public void c(String str, String str2, C3020i iVar) {
            Ie.c cVar = new Ie.c(Ie.a.SHARE);
            if (iVar == null) {
                cVar.c(y.SharedLink.b(), str);
                cVar.c(y.SharedChannel.b(), str2);
                cVar.b(a.this);
            } else {
                cVar.c(y.ShareError.b(), iVar.b());
            }
            cVar.f(C3016e.X().M());
            C3016e.C0512e eVar = this.f50415a;
            if (eVar != null) {
                eVar.c(str, str2, iVar);
            }
        }

        public void d(String str) {
            C3016e.C0512e eVar = this.f50415a;
            if (eVar != null) {
                eVar.d(str);
            }
        }
    }

    public interface d {
        void a(boolean z10, C3020i iVar);
    }

    /* synthetic */ a(Parcel parcel, C0770a aVar) {
        this(parcel);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: Ce.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: Ce.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: org.json.JSONArray} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Ce.a d(org.json.JSONObject r5) {
        /*
            r0 = 0
            Ce.a r1 = new Ce.a     // Catch:{ Exception -> 0x0100 }
            r1.<init>()     // Catch:{ Exception -> 0x0100 }
            Fe.u$a r2 = new Fe.u$a     // Catch:{ Exception -> 0x0065 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0065 }
            Fe.y r5 = Fe.y.ContentTitle     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = r2.h(r5)     // Catch:{ Exception -> 0x0065 }
            r1.f50403c = r5     // Catch:{ Exception -> 0x0065 }
            Fe.y r5 = Fe.y.CanonicalIdentifier     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = r2.h(r5)     // Catch:{ Exception -> 0x0065 }
            r1.f50401a = r5     // Catch:{ Exception -> 0x0065 }
            Fe.y r5 = Fe.y.CanonicalUrl     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = r2.h(r5)     // Catch:{ Exception -> 0x0065 }
            r1.f50402b = r5     // Catch:{ Exception -> 0x0065 }
            Fe.y r5 = Fe.y.ContentDesc     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = r2.h(r5)     // Catch:{ Exception -> 0x0065 }
            r1.f50404d = r5     // Catch:{ Exception -> 0x0065 }
            Fe.y r5 = Fe.y.ContentImgUrl     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = r2.h(r5)     // Catch:{ Exception -> 0x0065 }
            r1.f50405e = r5     // Catch:{ Exception -> 0x0065 }
            Fe.y r5 = Fe.y.ContentExpiryTime     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0065 }
            long r3 = r2.g(r5)     // Catch:{ Exception -> 0x0065 }
            r1.f50409i = r3     // Catch:{ Exception -> 0x0065 }
            Fe.y r5 = Fe.y.ContentKeyWords     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0065 }
            java.lang.Object r5 = r2.b(r5)     // Catch:{ Exception -> 0x0065 }
            boolean r3 = r5 instanceof org.json.JSONArray     // Catch:{ Exception -> 0x0065 }
            if (r3 == 0) goto L_0x0069
            r0 = r5
            org.json.JSONArray r0 = (org.json.JSONArray) r0     // Catch:{ Exception -> 0x0065 }
            goto L_0x0074
        L_0x0065:
            r5 = move-exception
            r0 = r1
            goto L_0x0101
        L_0x0069:
            boolean r3 = r5 instanceof java.lang.String     // Catch:{ Exception -> 0x0065 }
            if (r3 == 0) goto L_0x0074
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0065 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0065 }
        L_0x0074:
            if (r0 == 0) goto L_0x008b
            r5 = 0
        L_0x0077:
            int r3 = r0.length()     // Catch:{ Exception -> 0x0065 }
            if (r5 >= r3) goto L_0x008b
            java.util.ArrayList r3 = r1.f50408h     // Catch:{ Exception -> 0x0065 }
            java.lang.Object r4 = r0.get(r5)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0065 }
            r3.add(r4)     // Catch:{ Exception -> 0x0065 }
            int r5 = r5 + 1
            goto L_0x0077
        L_0x008b:
            Fe.y r5 = Fe.y.PublicallyIndexable     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0065 }
            java.lang.Object r5 = r2.b(r5)     // Catch:{ Exception -> 0x0065 }
            boolean r0 = r5 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0065 }
            if (r0 == 0) goto L_0x00a9
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ Exception -> 0x0065 }
            boolean r5 = r5.booleanValue()     // Catch:{ Exception -> 0x0065 }
            if (r5 == 0) goto L_0x00a4
            Ce.a$b r5 = Ce.a.b.PUBLIC     // Catch:{ Exception -> 0x0065 }
            goto L_0x00a6
        L_0x00a4:
            Ce.a$b r5 = Ce.a.b.PRIVATE     // Catch:{ Exception -> 0x0065 }
        L_0x00a6:
            r1.f50407g = r5     // Catch:{ Exception -> 0x0065 }
            goto L_0x00bd
        L_0x00a9:
            boolean r0 = r5 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0065 }
            if (r0 == 0) goto L_0x00bd
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x0065 }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0065 }
            r0 = 1
            if (r5 != r0) goto L_0x00b9
            Ce.a$b r5 = Ce.a.b.PUBLIC     // Catch:{ Exception -> 0x0065 }
            goto L_0x00bb
        L_0x00b9:
            Ce.a$b r5 = Ce.a.b.PRIVATE     // Catch:{ Exception -> 0x0065 }
        L_0x00bb:
            r1.f50407g = r5     // Catch:{ Exception -> 0x0065 }
        L_0x00bd:
            Fe.y r5 = Fe.y.LocallyIndexable     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0065 }
            boolean r5 = r2.c(r5)     // Catch:{ Exception -> 0x0065 }
            if (r5 == 0) goto L_0x00cc
            Ce.a$b r5 = Ce.a.b.PUBLIC     // Catch:{ Exception -> 0x0065 }
            goto L_0x00ce
        L_0x00cc:
            Ce.a$b r5 = Ce.a.b.PRIVATE     // Catch:{ Exception -> 0x0065 }
        L_0x00ce:
            r1.f50410j = r5     // Catch:{ Exception -> 0x0065 }
            Fe.y r5 = Fe.y.CreationTimestamp     // Catch:{ Exception -> 0x0065 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0065 }
            long r3 = r2.g(r5)     // Catch:{ Exception -> 0x0065 }
            r1.f50411k = r3     // Catch:{ Exception -> 0x0065 }
            Ie.d r5 = Ie.d.d(r2)     // Catch:{ Exception -> 0x0065 }
            r1.f50406f = r5     // Catch:{ Exception -> 0x0065 }
            org.json.JSONObject r5 = r2.a()     // Catch:{ Exception -> 0x0065 }
            java.util.Iterator r0 = r5.keys()     // Catch:{ Exception -> 0x0065 }
        L_0x00ea:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x0065 }
            if (r2 == 0) goto L_0x0109
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0065 }
            Ie.d r3 = r1.f50406f     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = r5.optString(r2)     // Catch:{ Exception -> 0x0065 }
            r3.a(r2, r4)     // Catch:{ Exception -> 0x0065 }
            goto L_0x00ea
        L_0x0100:
            r5 = move-exception
        L_0x0101:
            java.lang.String r5 = r5.getMessage()
            Fe.C3023l.a(r5)
            r1 = r0
        L_0x0109:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ce.a.d(org.json.JSONObject):Ce.a");
    }

    private r g(r rVar, g gVar) {
        if (gVar.k() != null) {
            rVar.b(gVar.k());
        }
        if (gVar.g() != null) {
            rVar.k(gVar.g());
        }
        if (gVar.c() != null) {
            rVar.g(gVar.c());
        }
        if (gVar.e() != null) {
            rVar.i(gVar.e());
        }
        if (gVar.j() != null) {
            rVar.l(gVar.j());
        }
        if (gVar.d() != null) {
            rVar.h(gVar.d());
        }
        if (gVar.h() > 0) {
            rVar.j(gVar.h());
        }
        if (!TextUtils.isEmpty(this.f50403c)) {
            rVar.a(y.ContentTitle.b(), this.f50403c);
        }
        if (!TextUtils.isEmpty(this.f50401a)) {
            rVar.a(y.CanonicalIdentifier.b(), this.f50401a);
        }
        if (!TextUtils.isEmpty(this.f50402b)) {
            rVar.a(y.CanonicalUrl.b(), this.f50402b);
        }
        JSONArray f10 = f();
        if (f10.length() > 0) {
            rVar.a(y.ContentKeyWords.b(), f10);
        }
        if (!TextUtils.isEmpty(this.f50404d)) {
            rVar.a(y.ContentDesc.b(), this.f50404d);
        }
        if (!TextUtils.isEmpty(this.f50405e)) {
            rVar.a(y.ContentImgUrl.b(), this.f50405e);
        }
        if (this.f50409i > 0) {
            String b10 = y.ContentExpiryTime.b();
            rVar.a(b10, "" + this.f50409i);
        }
        String b11 = y.PublicallyIndexable.b();
        rVar.a(b11, "" + n());
        JSONObject c10 = this.f50406f.c();
        try {
            Iterator<String> keys = c10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                rVar.a(next, c10.get(next));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        HashMap f11 = gVar.f();
        for (String str : f11.keySet()) {
            rVar.a(str, f11.get(str));
        }
        return rVar;
    }

    private r h(Context context, g gVar) {
        return g(new r(context), gVar);
    }

    public static a j() {
        C3016e X10 = C3016e.X();
        if (X10 == null) {
            return null;
        }
        try {
            if (X10.Z() == null) {
                return null;
            }
            if (X10.Z().has("+clicked_branch_link") && X10.Z().getBoolean("+clicked_branch_link")) {
                return d(X10.Z());
            }
            if (X10.S() == null || X10.S().length() <= 0) {
                return null;
            }
            return d(X10.Z());
        } catch (Exception e10) {
            C3023l.a(e10.getMessage());
            return null;
        }
    }

    public a B(Ie.d dVar) {
        this.f50406f = dVar;
        return this;
    }

    public a G(b bVar) {
        this.f50410j = bVar;
        return this;
    }

    public a K(String str) {
        this.f50403c = str;
        return this;
    }

    public void L(Activity activity, g gVar, i iVar, C3016e.C0512e eVar) {
        M(activity, gVar, iVar, eVar, (C3016e.j) null);
    }

    public void M(Activity activity, g gVar, i iVar, C3016e.C0512e eVar, C3016e.j jVar) {
        if (C3016e.X() != null) {
            C3028q qVar = new C3028q(activity, h(activity, gVar));
            qVar.B(new c(eVar, qVar, gVar)).C(jVar).N(iVar.l()).I(iVar.k());
            if (iVar.c() != null) {
                qVar.D(iVar.c(), iVar.b(), iVar.s());
            }
            if (iVar.m() != null) {
                qVar.J(iVar.m(), iVar.n());
            }
            if (iVar.d() != null) {
                qVar.E(iVar.d());
            }
            if (iVar.o().size() > 0) {
                qVar.a(iVar.o());
            }
            if (iVar.r() > 0) {
                qVar.M(iVar.r());
            }
            qVar.G(iVar.f());
            qVar.A(iVar.j());
            qVar.F(iVar.e());
            qVar.L(iVar.p());
            qVar.K(iVar.q());
            qVar.H(iVar.h());
            if (iVar.i() != null && iVar.i().size() > 0) {
                qVar.z(iVar.i());
            }
            if (iVar.g() != null && iVar.g().size() > 0) {
                qVar.c(iVar.g());
            }
            qVar.O();
        } else if (eVar != null) {
            eVar.c((String) null, (String) null, new C3020i("Trouble sharing link. ", -109));
        } else {
            C3023l.l("Sharing error. Branch instance is not created yet. Make sure you have initialised Branch.");
        }
    }

    public a a(String str, String str2) {
        this.f50406f.a(str, str2);
        return this;
    }

    public a b(String str) {
        this.f50408h.add(str);
        return this;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject c10 = this.f50406f.c();
            Iterator<String> keys = c10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, c10.get(next));
            }
            if (!TextUtils.isEmpty(this.f50403c)) {
                jSONObject.put(y.ContentTitle.b(), this.f50403c);
            }
            if (!TextUtils.isEmpty(this.f50401a)) {
                jSONObject.put(y.CanonicalIdentifier.b(), this.f50401a);
            }
            if (!TextUtils.isEmpty(this.f50402b)) {
                jSONObject.put(y.CanonicalUrl.b(), this.f50402b);
            }
            if (this.f50408h.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f50408h.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject.put(y.ContentKeyWords.b(), jSONArray);
            }
            if (!TextUtils.isEmpty(this.f50404d)) {
                jSONObject.put(y.ContentDesc.b(), this.f50404d);
            }
            if (!TextUtils.isEmpty(this.f50405e)) {
                jSONObject.put(y.ContentImgUrl.b(), this.f50405e);
            }
            if (this.f50409i > 0) {
                jSONObject.put(y.ContentExpiryTime.b(), this.f50409i);
            }
            jSONObject.put(y.PublicallyIndexable.b(), n());
            jSONObject.put(y.LocallyIndexable.b(), l());
            jSONObject.put(y.CreationTimestamp.b(), this.f50411k);
        } catch (JSONException e10) {
            C3023l.a(e10.getMessage());
        }
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public void e(Context context, g gVar, C3016e.d dVar) {
        if (!W.d(context) || dVar == null) {
            h(context, gVar).e(dVar);
        } else {
            dVar.a(h(context, gVar).f(), (C3020i) null);
        }
    }

    public JSONArray f() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f50408h.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }

    public HashMap i() {
        return this.f50406f.e();
    }

    public String k(Context context, g gVar) {
        return h(context, gVar).f();
    }

    public boolean l() {
        if (this.f50410j == b.PUBLIC) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if (this.f50407g == b.PUBLIC) {
            return true;
        }
        return false;
    }

    public void o() {
        p((d) null);
    }

    public void p(d dVar) {
        if (C3016e.X() != null) {
            C3016e.X().F0(this, dVar);
        } else if (dVar != null) {
            dVar.a(false, new C3020i("Register view error", -109));
        }
    }

    public a q(String str) {
        this.f50401a = str;
        return this;
    }

    public a s(String str) {
        this.f50402b = str;
        return this;
    }

    public a u(String str) {
        this.f50404d = str;
        return this;
    }

    public a v(Date date) {
        this.f50409i = date.getTime();
        return this;
    }

    public a w(String str) {
        this.f50405e = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f50411k);
        parcel.writeString(this.f50401a);
        parcel.writeString(this.f50402b);
        parcel.writeString(this.f50403c);
        parcel.writeString(this.f50404d);
        parcel.writeString(this.f50405e);
        parcel.writeLong(this.f50409i);
        parcel.writeInt(this.f50407g.ordinal());
        parcel.writeSerializable(this.f50408h);
        parcel.writeParcelable(this.f50406f, i10);
        parcel.writeInt(this.f50410j.ordinal());
    }

    public a y(b bVar) {
        this.f50407g = bVar;
        return this;
    }

    public a() {
        this.f50406f = new Ie.d();
        this.f50408h = new ArrayList();
        this.f50401a = "";
        this.f50402b = "";
        this.f50403c = "";
        this.f50404d = "";
        b bVar = b.PUBLIC;
        this.f50407g = bVar;
        this.f50410j = bVar;
        this.f50409i = 0;
        this.f50411k = System.currentTimeMillis();
    }

    private a(Parcel parcel) {
        this();
        this.f50411k = parcel.readLong();
        this.f50401a = parcel.readString();
        this.f50402b = parcel.readString();
        this.f50403c = parcel.readString();
        this.f50404d = parcel.readString();
        this.f50405e = parcel.readString();
        this.f50409i = parcel.readLong();
        this.f50407g = b.values()[parcel.readInt()];
        ArrayList arrayList = (ArrayList) parcel.readSerializable();
        if (arrayList != null) {
            this.f50408h.addAll(arrayList);
        }
        this.f50406f = (Ie.d) parcel.readParcelable(Ie.d.class.getClassLoader());
        this.f50410j = b.values()[parcel.readInt()];
    }

    public a F(String str) {
        return this;
    }

    public a J(double d10, e eVar) {
        return this;
    }
}
