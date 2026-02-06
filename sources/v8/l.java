package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public final class l extends e {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    public static final b f48949k = new b((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final h f48950g;

    /* renamed from: h  reason: collision with root package name */
    private final j f48951h;

    /* renamed from: i  reason: collision with root package name */
    private final List f48952i;

    /* renamed from: j  reason: collision with root package name */
    private final String f48953j;

    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new l(parcel);
        }

        /* renamed from: b */
        public l[] newArray(int i10) {
            return new l[i10];
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
    public l(Parcel parcel) {
        super(parcel);
        C6496s.h(parcel, "parcel");
        this.f48950g = (h) parcel.readParcelable(h.class.getClassLoader());
        this.f48951h = (j) parcel.readParcelable(j.class.getClassLoader());
        this.f48952i = g(parcel);
        this.f48953j = parcel.readString();
    }

    private final List g(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return C6565s.e1(arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public final String h() {
        return this.f48953j;
    }

    public final h i() {
        return this.f48950g;
    }

    public final List j() {
        List list = this.f48952i;
        if (list != null) {
            return C6565s.e1(list);
        }
        return null;
    }

    public final j k() {
        return this.f48951h;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f48950g, 0);
        parcel.writeParcelable(this.f48951h, 0);
        parcel.writeStringList(j());
        parcel.writeString(this.f48953j);
    }
}
