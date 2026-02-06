package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import v8.e;
import v8.j;

public final class k extends e {
    public static final Parcelable.Creator<k> CREATOR = new b();

    /* renamed from: h  reason: collision with root package name */
    public static final c f48946h = new c((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final List f48947g;

    public static final class a extends e.a {

        /* renamed from: g  reason: collision with root package name */
        private final List f48948g = new ArrayList();

        public final a n(j jVar) {
            if (jVar != null) {
                this.f48948g.add(new j.a().i(jVar).d());
            }
            return this;
        }

        public final a o(List list) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    n((j) it.next());
                }
            }
            return this;
        }

        public k p() {
            return new k(this, (DefaultConstructorMarker) null);
        }

        public final List q() {
            return this.f48948g;
        }

        public a r(k kVar) {
            if (kVar == null) {
                return this;
            }
            return ((a) super.g(kVar)).o(kVar.h());
        }

        public final a s(List list) {
            this.f48948g.clear();
            o(list);
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new k(parcel);
        }

        /* renamed from: b */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ k(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public int describeContents() {
        return 0;
    }

    public final List h() {
        return this.f48947g;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        super.writeToParcel(parcel, i10);
        j.a.f48941g.b(parcel, i10, this.f48947g);
    }

    private k(a aVar) {
        super((e.a) aVar);
        this.f48947g = C6565s.e1(aVar.q());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Parcel parcel) {
        super(parcel);
        C6496s.h(parcel, "parcel");
        this.f48947g = C6565s.e1(j.a.f48941g.a(parcel));
    }
}
