package y7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.C1773v;
import com.facebook.C3286a;
import com.facebook.C3320j;
import com.facebook.C3459v;
import com.facebook.CustomTabMainActivity;
import com.facebook.I;
import io.branch.rnbranch.RNBranchModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.C3889e;
import o7.W;
import o7.X;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: y7.u  reason: case insensitive filesystem */
public class C4214u implements Parcelable {
    public static final Parcelable.Creator<C4214u> CREATOR = new b();

    /* renamed from: m  reason: collision with root package name */
    public static final c f49807m = new c((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private E[] f49808a;

    /* renamed from: b  reason: collision with root package name */
    private int f49809b = -1;

    /* renamed from: c  reason: collision with root package name */
    private C1769q f49810c;

    /* renamed from: d  reason: collision with root package name */
    private d f49811d;

    /* renamed from: e  reason: collision with root package name */
    private a f49812e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f49813f;

    /* renamed from: g  reason: collision with root package name */
    private e f49814g;

    /* renamed from: h  reason: collision with root package name */
    private Map f49815h;

    /* renamed from: i  reason: collision with root package name */
    private Map f49816i;

    /* renamed from: j  reason: collision with root package name */
    private C4192A f49817j;

    /* renamed from: k  reason: collision with root package name */
    private int f49818k;

    /* renamed from: l  reason: collision with root package name */
    private int f49819l;

    /* renamed from: y7.u$a */
    public interface a {
        void a();

        void b();
    }

    /* renamed from: y7.u$b */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public C4214u createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new C4214u(parcel);
        }

        /* renamed from: b */
        public C4214u[] newArray(int i10) {
            return new C4214u[i10];
        }
    }

    /* renamed from: y7.u$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            C6496s.g(jSONObject2, "e2e.toString()");
            return jSONObject2;
        }

        public final int b() {
            return C3889e.c.Login.b();
        }

        private c() {
        }
    }

    /* renamed from: y7.u$d */
    public interface d {
        void a(f fVar);
    }

    /* renamed from: y7.u$e */
    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: s  reason: collision with root package name */
        public static final b f49820s = new b((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final C4213t f49821a;

        /* renamed from: b  reason: collision with root package name */
        private Set f49822b;

        /* renamed from: c  reason: collision with root package name */
        private final C4199e f49823c;

        /* renamed from: d  reason: collision with root package name */
        private final String f49824d;

        /* renamed from: e  reason: collision with root package name */
        private String f49825e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f49826f;

        /* renamed from: g  reason: collision with root package name */
        private String f49827g;

        /* renamed from: h  reason: collision with root package name */
        private String f49828h;

        /* renamed from: i  reason: collision with root package name */
        private String f49829i;

        /* renamed from: j  reason: collision with root package name */
        private String f49830j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f49831k;

        /* renamed from: l  reason: collision with root package name */
        private final G f49832l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f49833m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f49834n;

        /* renamed from: o  reason: collision with root package name */
        private final String f49835o;

        /* renamed from: p  reason: collision with root package name */
        private final String f49836p;

        /* renamed from: q  reason: collision with root package name */
        private final String f49837q;

        /* renamed from: r  reason: collision with root package name */
        private final C4195a f49838r;

        /* renamed from: y7.u$e$a */
        public static final class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "source");
                return new e(parcel, (DefaultConstructorMarker) null);
            }

            /* renamed from: b */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        /* renamed from: y7.u$e$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public /* synthetic */ e(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        public final void B(String str) {
            this.f49830j = str;
        }

        public final void F(Set set) {
            C6496s.h(set, "<set-?>");
            this.f49822b = set;
        }

        public final void G(boolean z10) {
            this.f49826f = z10;
        }

        public final void J(boolean z10) {
            this.f49831k = z10;
        }

        public final void K(boolean z10) {
            this.f49834n = z10;
        }

        public final boolean L() {
            return this.f49834n;
        }

        public final String a() {
            return this.f49824d;
        }

        public final String b() {
            return this.f49825e;
        }

        public final String c() {
            return this.f49828h;
        }

        public final String d() {
            return this.f49837q;
        }

        public int describeContents() {
            return 0;
        }

        public final C4195a e() {
            return this.f49838r;
        }

        public final String f() {
            return this.f49836p;
        }

        public final C4199e g() {
            return this.f49823c;
        }

        public final String h() {
            return this.f49829i;
        }

        public final String i() {
            return this.f49827g;
        }

        public final C4213t j() {
            return this.f49821a;
        }

        public final G k() {
            return this.f49832l;
        }

        public final String l() {
            return this.f49830j;
        }

        public final String n() {
            return this.f49835o;
        }

        public final Set o() {
            return this.f49822b;
        }

        public final boolean p() {
            return this.f49831k;
        }

        public final boolean q() {
            for (String e10 : this.f49822b) {
                if (D.f49579j.e(e10)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean s() {
            return this.f49833m;
        }

        public final boolean u() {
            if (this.f49832l == G.INSTAGRAM) {
                return true;
            }
            return false;
        }

        public final boolean v() {
            return this.f49826f;
        }

        public final void w(String str) {
            C6496s.h(str, "<set-?>");
            this.f49825e = str;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            String str;
            C6496s.h(parcel, "dest");
            parcel.writeString(this.f49821a.name());
            parcel.writeStringList(new ArrayList(this.f49822b));
            parcel.writeString(this.f49823c.name());
            parcel.writeString(this.f49824d);
            parcel.writeString(this.f49825e);
            parcel.writeByte(this.f49826f ? (byte) 1 : 0);
            parcel.writeString(this.f49827g);
            parcel.writeString(this.f49828h);
            parcel.writeString(this.f49829i);
            parcel.writeString(this.f49830j);
            parcel.writeByte(this.f49831k ? (byte) 1 : 0);
            parcel.writeString(this.f49832l.name());
            parcel.writeByte(this.f49833m ? (byte) 1 : 0);
            parcel.writeByte(this.f49834n ? (byte) 1 : 0);
            parcel.writeString(this.f49835o);
            parcel.writeString(this.f49836p);
            parcel.writeString(this.f49837q);
            C4195a aVar = this.f49838r;
            if (aVar != null) {
                str = aVar.name();
            } else {
                str = null;
            }
            parcel.writeString(str);
        }

        public final void y(boolean z10) {
            this.f49833m = z10;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ e(y7.C4213t r15, java.util.Set r16, y7.C4199e r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, y7.G r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, y7.C4195a r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
            /*
                r14 = this;
                r0 = r26
                r1 = r0 & 64
                if (r1 == 0) goto L_0x000a
                y7.G r1 = y7.G.FACEBOOK
                r9 = r1
                goto L_0x000c
            L_0x000a:
                r9 = r21
            L_0x000c:
                r1 = r0 & 128(0x80, float:1.794E-43)
                r2 = 0
                if (r1 == 0) goto L_0x0013
                r10 = r2
                goto L_0x0015
            L_0x0013:
                r10 = r22
            L_0x0015:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x001b
                r11 = r2
                goto L_0x001d
            L_0x001b:
                r11 = r23
            L_0x001d:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0023
                r12 = r2
                goto L_0x0025
            L_0x0023:
                r12 = r24
            L_0x0025:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x002b
                r13 = r2
                goto L_0x002d
            L_0x002b:
                r13 = r25
            L_0x002d:
                r2 = r14
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y7.C4214u.e.<init>(y7.t, java.util.Set, y7.e, java.lang.String, java.lang.String, java.lang.String, y7.G, java.lang.String, java.lang.String, java.lang.String, y7.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public e(C4213t tVar, Set set, C4199e eVar, String str, String str2, String str3, G g10, String str4, String str5, String str6, C4195a aVar) {
            C6496s.h(tVar, "loginBehavior");
            C6496s.h(eVar, "defaultAudience");
            C6496s.h(str, "authType");
            C6496s.h(str2, "applicationId");
            C6496s.h(str3, "authId");
            this.f49821a = tVar;
            this.f49822b = set == null ? new HashSet() : set;
            this.f49823c = eVar;
            this.f49828h = str;
            this.f49824d = str2;
            this.f49825e = str3;
            this.f49832l = g10 == null ? G.FACEBOOK : g10;
            if (str4 == null || str4.length() == 0) {
                String uuid = UUID.randomUUID().toString();
                C6496s.g(uuid, "randomUUID().toString()");
                this.f49835o = uuid;
            } else {
                this.f49835o = str4;
            }
            this.f49836p = str5;
            this.f49837q = str6;
            this.f49838r = aVar;
        }

        private e(Parcel parcel) {
            C4199e eVar;
            G g10;
            this.f49821a = C4213t.valueOf(X.n(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f49822b = new HashSet(arrayList);
            String readString = parcel.readString();
            if (readString != null) {
                eVar = C4199e.valueOf(readString);
            } else {
                eVar = C4199e.NONE;
            }
            this.f49823c = eVar;
            this.f49824d = X.n(parcel.readString(), "applicationId");
            this.f49825e = X.n(parcel.readString(), "authId");
            boolean z10 = false;
            this.f49826f = parcel.readByte() != 0;
            this.f49827g = parcel.readString();
            this.f49828h = X.n(parcel.readString(), "authType");
            this.f49829i = parcel.readString();
            this.f49830j = parcel.readString();
            this.f49831k = parcel.readByte() != 0;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                g10 = G.valueOf(readString2);
            } else {
                g10 = G.FACEBOOK;
            }
            this.f49832l = g10;
            this.f49833m = parcel.readByte() != 0;
            this.f49834n = parcel.readByte() != 0 ? true : z10;
            this.f49835o = X.n(parcel.readString(), "nonce");
            this.f49836p = parcel.readString();
            this.f49837q = parcel.readString();
            String readString3 = parcel.readString();
            this.f49838r = readString3 != null ? C4195a.valueOf(readString3) : null;
        }
    }

    /* renamed from: y7.u$f */
    public static final class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new b();

        /* renamed from: i  reason: collision with root package name */
        public static final c f49839i = new c((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        public final a f49840a;

        /* renamed from: b  reason: collision with root package name */
        public final C3286a f49841b;

        /* renamed from: c  reason: collision with root package name */
        public final C3320j f49842c;

        /* renamed from: d  reason: collision with root package name */
        public final String f49843d;

        /* renamed from: e  reason: collision with root package name */
        public final String f49844e;

        /* renamed from: f  reason: collision with root package name */
        public final e f49845f;

        /* renamed from: g  reason: collision with root package name */
        public Map f49846g;

        /* renamed from: h  reason: collision with root package name */
        public Map f49847h;

        /* renamed from: y7.u$f$a */
        public enum a {
            SUCCESS(com.amazon.device.simplesignin.a.a.a.f38020s),
            CANCEL("cancel"),
            ERROR(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            

            /* renamed from: a  reason: collision with root package name */
            private final String f49852a;

            private a(String str) {
                this.f49852a = str;
            }

            public final String b() {
                return this.f49852a;
            }
        }

        /* renamed from: y7.u$f$b */
        public static final class b implements Parcelable.Creator {
            b() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "source");
                return new f(parcel, (DefaultConstructorMarker) null);
            }

            /* renamed from: b */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        /* renamed from: y7.u$f$c */
        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ f d(c cVar, e eVar, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 8) != 0) {
                    str3 = null;
                }
                return cVar.c(eVar, str, str2, str3);
            }

            public final f a(e eVar, String str) {
                return new f(eVar, a.CANCEL, (C3286a) null, str, (String) null);
            }

            public final f b(e eVar, C3286a aVar, C3320j jVar) {
                return new f(eVar, a.SUCCESS, aVar, jVar, (String) null, (String) null);
            }

            public final f c(e eVar, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new f(eVar, a.ERROR, (C3286a) null, TextUtils.join(": ", arrayList), str3);
            }

            public final f e(e eVar, C3286a aVar) {
                C6496s.h(aVar, "token");
                return new f(eVar, a.SUCCESS, aVar, (String) null, (String) null);
            }

            private c() {
            }
        }

        public /* synthetic */ f(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "dest");
            parcel.writeString(this.f49840a.name());
            parcel.writeParcelable(this.f49841b, i10);
            parcel.writeParcelable(this.f49842c, i10);
            parcel.writeString(this.f49843d);
            parcel.writeString(this.f49844e);
            parcel.writeParcelable(this.f49845f, i10);
            W.L0(parcel, this.f49846g);
            W.L0(parcel, this.f49847h);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public f(e eVar, a aVar, C3286a aVar2, String str, String str2) {
            this(eVar, aVar, aVar2, (C3320j) null, str, str2);
            C6496s.h(aVar, "code");
        }

        public f(e eVar, a aVar, C3286a aVar2, C3320j jVar, String str, String str2) {
            C6496s.h(aVar, "code");
            this.f49845f = eVar;
            this.f49841b = aVar2;
            this.f49842c = jVar;
            this.f49843d = str;
            this.f49840a = aVar;
            this.f49844e = str2;
        }

        private f(Parcel parcel) {
            String readString = parcel.readString();
            this.f49840a = a.valueOf(readString == null ? RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR : readString);
            this.f49841b = (C3286a) parcel.readParcelable(C3286a.class.getClassLoader());
            this.f49842c = (C3320j) parcel.readParcelable(C3320j.class.getClassLoader());
            this.f49843d = parcel.readString();
            this.f49844e = parcel.readString();
            this.f49845f = (e) parcel.readParcelable(e.class.getClassLoader());
            this.f49846g = W.v0(parcel);
            this.f49847h = W.v0(parcel);
        }
    }

    public C4214u(C1769q qVar) {
        C6496s.h(qVar, "fragment");
        F(qVar);
    }

    private final void a(String str, String str2, boolean z10) {
        Map map = this.f49815h;
        if (map == null) {
            map = new HashMap();
        }
        if (this.f49815h == null) {
            this.f49815h = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = ((String) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    private final void h() {
        f(f.c.d(f.f49839i, this.f49814g, "Login attempt failed.", (String) null, (String) null, 8, (Object) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (kotlin.jvm.internal.C6496s.c(r1, r2) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final y7.C4192A o() {
        /*
            r3 = this;
            y7.A r0 = r3.f49817j
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = r0.b()
            y7.u$e r2 = r3.f49814g
            if (r2 == 0) goto L_0x0011
            java.lang.String r2 = r2.a()
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r2)
            if (r1 != 0) goto L_0x0038
        L_0x0018:
            y7.A r0 = new y7.A
            androidx.fragment.app.v r1 = r3.i()
            if (r1 == 0) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            android.content.Context r1 = com.facebook.I.l()
        L_0x0025:
            y7.u$e r2 = r3.f49814g
            if (r2 == 0) goto L_0x002f
            java.lang.String r2 = r2.a()
            if (r2 != 0) goto L_0x0033
        L_0x002f:
            java.lang.String r2 = com.facebook.I.m()
        L_0x0033:
            r0.<init>(r1, r2)
            r3.f49817j = r0
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.C4214u.o():y7.A");
    }

    private final void q(String str, String str2, String str3, String str4, Map map) {
        e eVar = this.f49814g;
        String str5 = "fb_mobile_login_method_complete";
        if (eVar == null) {
            o().j(str5, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
            return;
        }
        C4192A o10 = o();
        String b10 = eVar.b();
        if (eVar.s()) {
            str5 = "foa_mobile_login_method_complete";
        }
        o10.c(b10, str, str2, str3, str4, map, str5);
    }

    private final void s(String str, f fVar, Map map) {
        q(str, fVar.f49840a.b(), fVar.f49843d, fVar.f49844e, map);
    }

    private final void w(f fVar) {
        d dVar = this.f49811d;
        if (dVar != null) {
            dVar.a(fVar);
        }
    }

    public final void B(a aVar) {
        this.f49812e = aVar;
    }

    public final void F(C1769q qVar) {
        if (this.f49810c == null) {
            this.f49810c = qVar;
            return;
        }
        throw new C3459v("Can't set fragment once it is already set.");
    }

    public final void G(d dVar) {
        this.f49811d = dVar;
    }

    public final void J(e eVar) {
        if (!n()) {
            b(eVar);
        }
    }

    public final boolean K() {
        String str;
        String str2;
        E j10 = j();
        if (j10 == null) {
            return false;
        }
        if (!j10.i() || d()) {
            e eVar = this.f49814g;
            if (eVar == null) {
                return false;
            }
            int p10 = j10.p(eVar);
            this.f49818k = 0;
            if (p10 > 0) {
                C4192A o10 = o();
                String b10 = eVar.b();
                String f10 = j10.f();
                if (eVar.s()) {
                    str2 = "foa_mobile_login_method_start";
                } else {
                    str2 = "fb_mobile_login_method_start";
                }
                o10.e(b10, f10, str2);
                this.f49819l = p10;
            } else {
                C4192A o11 = o();
                String b11 = eVar.b();
                String f11 = j10.f();
                if (eVar.s()) {
                    str = "foa_mobile_login_method_not_tried";
                } else {
                    str = "fb_mobile_login_method_not_tried";
                }
                o11.d(b11, f11, str);
                a("not_tried", j10.f(), true);
            }
            if (p10 > 0) {
                return true;
            }
            return false;
        }
        a("no_internet_permission", "1", false);
        return false;
    }

    public final void L() {
        E j10 = j();
        if (j10 != null) {
            q(j10.f(), "skipped", (String) null, (String) null, j10.e());
        }
        E[] eArr = this.f49808a;
        while (eArr != null) {
            int i10 = this.f49809b;
            if (i10 >= eArr.length - 1) {
                break;
            }
            this.f49809b = i10 + 1;
            if (K()) {
                return;
            }
        }
        if (this.f49814g != null) {
            h();
        }
    }

    public final void M(f fVar) {
        f fVar2;
        C6496s.h(fVar, "pendingResult");
        if (fVar.f49841b != null) {
            C3286a e10 = C3286a.f39402l.e();
            C3286a aVar = fVar.f49841b;
            if (e10 != null) {
                try {
                    if (C6496s.c(e10.o(), aVar.o())) {
                        fVar2 = f.f49839i.b(this.f49814g, fVar.f49841b, fVar.f49842c);
                        f(fVar2);
                        return;
                    }
                } catch (Exception e11) {
                    f(f.c.d(f.f49839i, this.f49814g, "Caught exception", e11.getMessage(), (String) null, 8, (Object) null));
                    return;
                }
            }
            fVar2 = f.c.d(f.f49839i, this.f49814g, "User logged in as different Facebook user.", (String) null, (String) null, 8, (Object) null);
            f(fVar2);
            return;
        }
        throw new C3459v("Can't validate without a token");
    }

    public final void b(e eVar) {
        if (eVar != null) {
            if (this.f49814g != null) {
                throw new C3459v("Attempted to authorize while a request is pending.");
            } else if (!C3286a.f39402l.g() || d()) {
                this.f49814g = eVar;
                this.f49808a = l(eVar);
                L();
            }
        }
    }

    public final void c() {
        E j10 = j();
        if (j10 != null) {
            j10.b();
        }
    }

    public final boolean d() {
        String str;
        if (this.f49813f) {
            return true;
        }
        if (e("android.permission.INTERNET") != 0) {
            C1773v i10 = i();
            String str2 = null;
            if (i10 != null) {
                str = i10.getString(P5.e.f33479c);
            } else {
                str = null;
            }
            if (i10 != null) {
                str2 = i10.getString(P5.e.f33478b);
            }
            f(f.c.d(f.f49839i, this.f49814g, str, str2, (String) null, 8, (Object) null));
            return false;
        }
        this.f49813f = true;
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public final int e(String str) {
        C6496s.h(str, "permission");
        C1773v i10 = i();
        if (i10 != null) {
            return i10.checkCallingOrSelfPermission(str);
        }
        return -1;
    }

    public final void f(f fVar) {
        C6496s.h(fVar, "outcome");
        E j10 = j();
        if (j10 != null) {
            s(j10.f(), fVar, j10.e());
        }
        Map map = this.f49815h;
        if (map != null) {
            fVar.f49846g = map;
        }
        Map map2 = this.f49816i;
        if (map2 != null) {
            fVar.f49847h = map2;
        }
        this.f49808a = null;
        this.f49809b = -1;
        this.f49814g = null;
        this.f49815h = null;
        this.f49818k = 0;
        this.f49819l = 0;
        w(fVar);
    }

    public final void g(f fVar) {
        C6496s.h(fVar, "outcome");
        if (fVar.f49841b == null || !C3286a.f39402l.g()) {
            f(fVar);
        } else {
            M(fVar);
        }
    }

    public final C1773v i() {
        C1769q qVar = this.f49810c;
        if (qVar != null) {
            return qVar.getActivity();
        }
        return null;
    }

    public final E j() {
        E[] eArr;
        int i10 = this.f49809b;
        if (i10 < 0 || (eArr = this.f49808a) == null) {
            return null;
        }
        return eArr[i10];
    }

    public final C1769q k() {
        return this.f49810c;
    }

    public E[] l(e eVar) {
        C6496s.h(eVar, "request");
        ArrayList arrayList = new ArrayList();
        C4213t j10 = eVar.j();
        if (!eVar.u()) {
            if (j10.e()) {
                arrayList.add(new C4211q(this));
            }
            if (!I.f39301s && j10.i()) {
                arrayList.add(new C4212s(this));
            }
        } else if (!I.f39301s && j10.f()) {
            arrayList.add(new r(this));
        }
        if (j10.b()) {
            arrayList.add(new C4197c(this));
        }
        if (j10.j()) {
            arrayList.add(new U(this));
        }
        if (!eVar.u() && j10.c()) {
            arrayList.add(new C4208n(this));
        }
        return (E[]) arrayList.toArray(new E[0]);
    }

    public final boolean n() {
        if (this.f49814g == null || this.f49809b < 0) {
            return false;
        }
        return true;
    }

    public final e p() {
        return this.f49814g;
    }

    public final void u() {
        a aVar = this.f49812e;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void v() {
        a aVar = this.f49812e;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeParcelableArray((Parcelable[]) this.f49808a, i10);
        parcel.writeInt(this.f49809b);
        parcel.writeParcelable(this.f49814g, i10);
        W.L0(parcel, this.f49815h);
        W.L0(parcel, this.f49816i);
    }

    public final boolean y(int i10, int i11, Intent intent) {
        this.f49818k++;
        if (this.f49814g != null) {
            if (intent == null || !intent.getBooleanExtra(CustomTabMainActivity.f39273j, false)) {
                E j10 = j();
                if (j10 != null && (!j10.o() || intent != null || this.f49818k >= this.f49819l)) {
                    return j10.j(i10, i11, intent);
                }
            } else {
                L();
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r5v3, types: [y7.E, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4214u(android.os.Parcel r9) {
        /*
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.C6496s.h(r9, r0)
            r8.<init>()
            r0 = -1
            r8.f49809b = r0
            java.lang.Class<y7.E> r0 = y7.E.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable[] r0 = r9.readParcelableArray(r0)
            r1 = 0
            if (r0 != 0) goto L_0x001a
            android.os.Parcelable[] r0 = new android.os.Parcelable[r1]
        L_0x001a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
            r4 = r1
        L_0x0021:
            r5 = 0
            if (r4 >= r3) goto L_0x003b
            r6 = r0[r4]
            boolean r7 = r6 instanceof y7.E
            if (r7 == 0) goto L_0x002d
            r5 = r6
            y7.E r5 = (y7.E) r5
        L_0x002d:
            if (r5 != 0) goto L_0x0030
            goto L_0x0033
        L_0x0030:
            r5.n(r8)
        L_0x0033:
            if (r5 == 0) goto L_0x0038
            r2.add(r5)
        L_0x0038:
            int r4 = r4 + 1
            goto L_0x0021
        L_0x003b:
            y7.E[] r0 = new y7.E[r1]
            java.lang.Object[] r0 = r2.toArray(r0)
            y7.E[] r0 = (y7.E[]) r0
            r8.f49808a = r0
            int r0 = r9.readInt()
            r8.f49809b = r0
            java.lang.Class<y7.u$e> r0 = y7.C4214u.e.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r9.readParcelable(r0)
            y7.u$e r0 = (y7.C4214u.e) r0
            r8.f49814g = r0
            java.util.Map r0 = o7.W.v0(r9)
            if (r0 == 0) goto L_0x0064
            java.util.Map r0 = mf.O.B(r0)
            goto L_0x0065
        L_0x0064:
            r0 = r5
        L_0x0065:
            r8.f49815h = r0
            java.util.Map r9 = o7.W.v0(r9)
            if (r9 == 0) goto L_0x0071
            java.util.Map r5 = mf.O.B(r9)
        L_0x0071:
            r8.f49816i = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.C4214u.<init>(android.os.Parcel):void");
    }
}
