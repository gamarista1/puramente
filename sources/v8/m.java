package v8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v8.h;

public final class m extends h {
    public static final Parcelable.Creator<m> CREATOR = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final c f48954d = new c((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final Uri f48955b;

    /* renamed from: c  reason: collision with root package name */
    private final h.b f48956c;

    public static final class a extends h.a {

        /* renamed from: c  reason: collision with root package name */
        private Uri f48957c;

        public m d() {
            return new m(this, (DefaultConstructorMarker) null);
        }

        public final Uri e() {
            return this.f48957c;
        }

        public a f(m mVar) {
            if (mVar == null) {
                return this;
            }
            return h(mVar.c());
        }

        public final a g(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return f((m) parcel.readParcelable(m.class.getClassLoader()));
        }

        public final a h(Uri uri) {
            this.f48957c = uri;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new m(parcel);
        }

        /* renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ m(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public h.b b() {
        return this.f48956c;
    }

    public final Uri c() {
        return this.f48955b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f48955b, 0);
    }

    private m(a aVar) {
        super((h.a) aVar);
        this.f48956c = h.b.VIDEO;
        this.f48955b = aVar.e();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(Parcel parcel) {
        super(parcel);
        C6496s.h(parcel, "parcel");
        this.f48956c = h.b.VIDEO;
        this.f48955b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
