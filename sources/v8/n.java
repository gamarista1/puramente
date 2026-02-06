package v8;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v8.e;
import v8.j;
import v8.m;

public final class n extends e implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new b();

    /* renamed from: k  reason: collision with root package name */
    public static final c f48958k = new c((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final String f48959g;

    /* renamed from: h  reason: collision with root package name */
    private final String f48960h;

    /* renamed from: i  reason: collision with root package name */
    private final j f48961i;

    /* renamed from: j  reason: collision with root package name */
    private final m f48962j;

    public static final class a extends e.a {

        /* renamed from: g  reason: collision with root package name */
        private String f48963g;

        /* renamed from: h  reason: collision with root package name */
        private String f48964h;

        /* renamed from: i  reason: collision with root package name */
        private j f48965i;

        /* renamed from: j  reason: collision with root package name */
        private m f48966j;

        public n n() {
            return new n(this, (DefaultConstructorMarker) null);
        }

        public final String o() {
            return this.f48963g;
        }

        public final String p() {
            return this.f48964h;
        }

        public final j q() {
            return this.f48965i;
        }

        public final m r() {
            return this.f48966j;
        }

        public final a s(String str) {
            this.f48963g = str;
            return this;
        }

        public final a t(String str) {
            this.f48964h = str;
            return this;
        }

        public final a u(j jVar) {
            j jVar2;
            if (jVar != null) {
                jVar2 = new j.a().i(jVar).d();
            } else {
                jVar2 = null;
            }
            this.f48965i = jVar2;
            return this;
        }

        public final a v(m mVar) {
            if (mVar == null) {
                return this;
            }
            this.f48966j = new m.a().f(mVar).d();
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public n createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new n(parcel);
        }

        /* renamed from: b */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ n(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public int describeContents() {
        return 0;
    }

    public final String h() {
        return this.f48959g;
    }

    public final String i() {
        return this.f48960h;
    }

    public final j j() {
        return this.f48961i;
    }

    public final m k() {
        return this.f48962j;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f48959g);
        parcel.writeString(this.f48960h);
        parcel.writeParcelable(this.f48961i, 0);
        parcel.writeParcelable(this.f48962j, 0);
    }

    private n(a aVar) {
        super((e.a) aVar);
        this.f48959g = aVar.o();
        this.f48960h = aVar.p();
        this.f48961i = aVar.q();
        this.f48962j = aVar.r();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(Parcel parcel) {
        super(parcel);
        j jVar;
        C6496s.h(parcel, "parcel");
        this.f48959g = parcel.readString();
        this.f48960h = parcel.readString();
        j.a j10 = new j.a().j(parcel);
        if (j10.g() == null && j10.e() == null) {
            jVar = null;
        } else {
            jVar = j10.d();
        }
        this.f48961i = jVar;
        this.f48962j = new m.a().g(parcel).d();
    }
}
