package u8;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v8.e;

public final class j extends e {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    public static final b f48651n = new b((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final String f48652g;

    /* renamed from: h  reason: collision with root package name */
    private final String f48653h;

    /* renamed from: i  reason: collision with root package name */
    private final String f48654i;

    /* renamed from: j  reason: collision with root package name */
    private final String f48655j;

    /* renamed from: k  reason: collision with root package name */
    private final String f48656k;

    /* renamed from: l  reason: collision with root package name */
    private final String f48657l;

    /* renamed from: m  reason: collision with root package name */
    private final String f48658m;

    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public j createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new j(parcel);
        }

        /* renamed from: b */
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Parcel parcel) {
        super(parcel);
        C6496s.h(parcel, "parcel");
        this.f48652g = parcel.readString();
        this.f48653h = parcel.readString();
        this.f48654i = parcel.readString();
        this.f48655j = parcel.readString();
        this.f48656k = parcel.readString();
        this.f48657l = parcel.readString();
        this.f48658m = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public final String h() {
        return this.f48653h;
    }

    public final String i() {
        return this.f48655j;
    }

    public final String j() {
        return this.f48656k;
    }

    public final String k() {
        return this.f48654i;
    }

    public final String l() {
        return this.f48658m;
    }

    public final String n() {
        return this.f48657l;
    }

    public final String o() {
        return this.f48652g;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f48652g);
        parcel.writeString(this.f48653h);
        parcel.writeString(this.f48654i);
        parcel.writeString(this.f48655j);
        parcel.writeString(this.f48656k);
        parcel.writeString(this.f48657l);
        parcel.writeString(this.f48658m);
    }
}
