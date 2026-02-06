package v8;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v8.C4111a;
import v8.C4112b;

public final class d extends e {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public static final b f48905j = new b((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private String f48906g;

    /* renamed from: h  reason: collision with root package name */
    private C4111a f48907h;

    /* renamed from: i  reason: collision with root package name */
    private C4112b f48908i;

    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new d(parcel);
        }

        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
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
    public d(Parcel parcel) {
        super(parcel);
        C6496s.h(parcel, "parcel");
        this.f48906g = parcel.readString();
        this.f48907h = new C4111a.C0740a().c(parcel).a();
        this.f48908i = new C4112b.a().c(parcel).a();
    }

    public final C4111a h() {
        return this.f48907h;
    }

    public final String i() {
        return this.f48906g;
    }

    public final C4112b j() {
        return this.f48908i;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f48906g);
        parcel.writeParcelable(this.f48907h, 0);
        parcel.writeParcelable(this.f48908i, 0);
    }
}
