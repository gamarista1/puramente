package v8;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v8.h;

public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new b();

    /* renamed from: g  reason: collision with root package name */
    public static final c f48935g = new c((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap f48936b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f48937c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f48938d;

    /* renamed from: e  reason: collision with root package name */
    private final String f48939e;

    /* renamed from: f  reason: collision with root package name */
    private final h.b f48940f;

    public static final class a extends h.a {

        /* renamed from: g  reason: collision with root package name */
        public static final C0744a f48941g = new C0744a((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        private Bitmap f48942c;

        /* renamed from: d  reason: collision with root package name */
        private Uri f48943d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f48944e;

        /* renamed from: f  reason: collision with root package name */
        private String f48945f;

        /* renamed from: v8.j$a$a  reason: collision with other inner class name */
        public static final class C0744a {
            public /* synthetic */ C0744a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List a(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                ArrayList arrayList = new ArrayList();
                for (Object next : h.a.f48928b.a(parcel)) {
                    if (next instanceof j) {
                        arrayList.add(next);
                    }
                }
                return arrayList;
            }

            public final void b(Parcel parcel, int i10, List list) {
                C6496s.h(parcel, "out");
                C6496s.h(list, "photos");
                parcel.writeParcelableArray((Parcelable[]) ((j[]) list.toArray(new j[0])), i10);
            }

            private C0744a() {
            }
        }

        public j d() {
            return new j(this, (DefaultConstructorMarker) null);
        }

        public final Bitmap e() {
            return this.f48942c;
        }

        public final String f() {
            return this.f48945f;
        }

        public final Uri g() {
            return this.f48943d;
        }

        public final boolean h() {
            return this.f48944e;
        }

        public a i(j jVar) {
            if (jVar == null) {
                return this;
            }
            return ((a) super.b(jVar)).k(jVar.c()).m(jVar.e()).n(jVar.f()).l(jVar.d());
        }

        public final a j(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return i((j) parcel.readParcelable(j.class.getClassLoader()));
        }

        public final a k(Bitmap bitmap) {
            this.f48942c = bitmap;
            return this;
        }

        public final a l(String str) {
            this.f48945f = str;
            return this;
        }

        public final a m(Uri uri) {
            this.f48943d = uri;
            return this;
        }

        public final a n(boolean z10) {
            this.f48944e = z10;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public j createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new j(parcel);
        }

        /* renamed from: b */
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ j(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public h.b b() {
        return this.f48940f;
    }

    public final Bitmap c() {
        return this.f48936b;
    }

    public final String d() {
        return this.f48939e;
    }

    public int describeContents() {
        return 0;
    }

    public final Uri e() {
        return this.f48937c;
    }

    public final boolean f() {
        return this.f48938d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f48936b, 0);
        parcel.writeParcelable(this.f48937c, 0);
        parcel.writeByte(this.f48938d ? (byte) 1 : 0);
        parcel.writeString(this.f48939e);
    }

    private j(a aVar) {
        super((h.a) aVar);
        this.f48940f = h.b.PHOTO;
        this.f48936b = aVar.e();
        this.f48937c = aVar.g();
        this.f48938d = aVar.h();
        this.f48939e = aVar.f();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Parcel parcel) {
        super(parcel);
        C6496s.h(parcel, "parcel");
        this.f48940f = h.b.PHOTO;
        this.f48936b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f48937c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f48938d = parcel.readByte() != 0;
        this.f48939e = parcel.readString();
    }
}
