package v8;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f48921b = new c((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f48922a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f48923a;

        public f a() {
            return new f(this, (DefaultConstructorMarker) null);
        }

        public final String b() {
            return this.f48923a;
        }

        public a c(f fVar) {
            if (fVar == null) {
                return this;
            }
            return e(fVar.a());
        }

        public final a d(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return c((f) parcel.readParcelable(f.class.getClassLoader()));
        }

        public final a e(String str) {
            this.f48923a = str;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new f(parcel);
        }

        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ f(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final String a() {
        return this.f48922a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeString(this.f48922a);
    }

    private f(a aVar) {
        this.f48922a = aVar.b();
    }

    public f(Parcel parcel) {
        C6496s.h(parcel, "parcel");
        this.f48922a = parcel.readString();
    }
}
