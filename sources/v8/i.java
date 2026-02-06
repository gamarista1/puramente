package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public final class i extends e {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public static final b f48933h = new b((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final List f48934g;

    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public i createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new i(parcel);
        }

        /* renamed from: b */
        public i[] newArray(int i10) {
            return new i[i10];
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
    public i(Parcel parcel) {
        super(parcel);
        List list;
        C6496s.h(parcel, "source");
        Parcelable[] readParcelableArray = parcel.readParcelableArray(h.class.getClassLoader());
        if (readParcelableArray != null) {
            list = new ArrayList();
            for (Parcelable parcelable : readParcelableArray) {
                h hVar = (h) parcelable;
                if (hVar != null) {
                    list.add(hVar);
                }
            }
        } else {
            list = C6565s.n();
        }
        this.f48934g = list;
    }

    public int describeContents() {
        return 0;
    }

    public final List h() {
        return this.f48934g;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeParcelableArray((Parcelable[]) this.f48934g.toArray(new h[0]), i10);
    }
}
