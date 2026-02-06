package v8;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v8.e;

public final class g extends e {
    public static final Parcelable.Creator<g> CREATOR = new b();

    /* renamed from: h  reason: collision with root package name */
    public static final c f48924h = new c((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final String f48925g;

    public static final class a extends e.a {

        /* renamed from: g  reason: collision with root package name */
        private String f48926g;

        public g n() {
            return new g(this, (DefaultConstructorMarker) null);
        }

        public final String o() {
            return this.f48926g;
        }

        public final a p(String str) {
            this.f48926g = str;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new g(parcel);
        }

        /* renamed from: b */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ g(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public int describeContents() {
        return 0;
    }

    public final String h() {
        return this.f48925g;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f48925g);
    }

    private g(a aVar) {
        super((e.a) aVar);
        this.f48925g = aVar.o();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Parcel parcel) {
        super(parcel);
        C6496s.h(parcel, "source");
        this.f48925g = parcel.readString();
    }
}
