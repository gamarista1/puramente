package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: v8.c  reason: case insensitive filesystem */
public final class C4113c implements Parcelable {
    public static final Parcelable.Creator<C4113c> CREATOR = new C0742c();

    /* renamed from: j  reason: collision with root package name */
    public static final d f48877j = new d((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f48878a;

    /* renamed from: b  reason: collision with root package name */
    private final String f48879b;

    /* renamed from: c  reason: collision with root package name */
    private final List f48880c;

    /* renamed from: d  reason: collision with root package name */
    private final String f48881d;

    /* renamed from: e  reason: collision with root package name */
    private final String f48882e;

    /* renamed from: f  reason: collision with root package name */
    private final a f48883f;

    /* renamed from: g  reason: collision with root package name */
    private final String f48884g;

    /* renamed from: h  reason: collision with root package name */
    private final e f48885h;

    /* renamed from: i  reason: collision with root package name */
    private final List f48886i;

    /* renamed from: v8.c$a */
    public enum a {
        SEND,
        ASKFOR,
        TURN,
        INVITE
    }

    /* renamed from: v8.c$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f48892a;

        /* renamed from: b  reason: collision with root package name */
        private String f48893b;

        /* renamed from: c  reason: collision with root package name */
        private List f48894c;

        /* renamed from: d  reason: collision with root package name */
        private String f48895d;

        /* renamed from: e  reason: collision with root package name */
        private String f48896e;

        /* renamed from: f  reason: collision with root package name */
        private a f48897f;

        /* renamed from: g  reason: collision with root package name */
        private String f48898g;

        /* renamed from: h  reason: collision with root package name */
        private e f48899h;

        /* renamed from: i  reason: collision with root package name */
        private List f48900i;

        public C4113c a() {
            return new C4113c(this, (DefaultConstructorMarker) null);
        }

        public final a b() {
            return this.f48897f;
        }

        public final String c() {
            return this.f48893b;
        }

        public final String d() {
            return this.f48895d;
        }

        public final e e() {
            return this.f48899h;
        }

        public final String f() {
            return this.f48892a;
        }

        public final String g() {
            return this.f48898g;
        }

        public final List h() {
            return this.f48894c;
        }

        public final List i() {
            return this.f48900i;
        }

        public final String j() {
            return this.f48896e;
        }

        public final b k(a aVar) {
            this.f48897f = aVar;
            return this;
        }

        public final b l(String str) {
            this.f48895d = str;
            return this;
        }

        public final b m(e eVar) {
            this.f48899h = eVar;
            return this;
        }

        public final b n(String str) {
            this.f48892a = str;
            return this;
        }

        public final b o(String str) {
            this.f48898g = str;
            return this;
        }

        public final b p(List list) {
            this.f48894c = list;
            return this;
        }

        public final b q(List list) {
            this.f48900i = list;
            return this;
        }

        public final b r(String str) {
            this.f48896e = str;
            return this;
        }
    }

    /* renamed from: v8.c$c  reason: collision with other inner class name */
    public static final class C0742c implements Parcelable.Creator {
        C0742c() {
        }

        /* renamed from: a */
        public C4113c createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new C4113c(parcel);
        }

        /* renamed from: b */
        public C4113c[] newArray(int i10) {
            return new C4113c[i10];
        }
    }

    /* renamed from: v8.c$d */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    /* renamed from: v8.c$e */
    public enum e {
        APP_USERS,
        APP_NON_USERS,
        EVERYBODY
    }

    public /* synthetic */ C4113c(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    public final a a() {
        return this.f48883f;
    }

    public final String b() {
        return this.f48879b;
    }

    public final String c() {
        return this.f48882e;
    }

    public final e d() {
        return this.f48885h;
    }

    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f48878a;
    }

    public final String f() {
        return this.f48884g;
    }

    public final List g() {
        return this.f48880c;
    }

    public final List h() {
        return this.f48886i;
    }

    public final String i() {
        return this.f48881d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        parcel.writeString(this.f48878a);
        parcel.writeString(this.f48879b);
        parcel.writeStringList(this.f48880c);
        parcel.writeString(this.f48881d);
        parcel.writeString(this.f48882e);
        parcel.writeSerializable(this.f48883f);
        parcel.writeString(this.f48884g);
        parcel.writeSerializable(this.f48885h);
        parcel.writeStringList(this.f48886i);
    }

    private C4113c(b bVar) {
        this.f48878a = bVar.f();
        this.f48879b = bVar.c();
        this.f48880c = bVar.h();
        this.f48881d = bVar.j();
        this.f48882e = bVar.d();
        this.f48883f = bVar.b();
        this.f48884g = bVar.g();
        this.f48885h = bVar.e();
        this.f48886i = bVar.i();
    }

    public C4113c(Parcel parcel) {
        C6496s.h(parcel, "parcel");
        this.f48878a = parcel.readString();
        this.f48879b = parcel.readString();
        this.f48880c = parcel.createStringArrayList();
        this.f48881d = parcel.readString();
        this.f48882e = parcel.readString();
        this.f48883f = (a) parcel.readSerializable();
        this.f48884g = parcel.readString();
        this.f48885h = (e) parcel.readSerializable();
        this.f48886i = parcel.createStringArrayList();
    }
}
