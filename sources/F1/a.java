package F1;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a f2127b = new C0033a();

    /* renamed from: a  reason: collision with root package name */
    private final Parcelable f2128a;

    /* renamed from: F1.a$a  reason: collision with other inner class name */
    class C0033a extends a {
        C0033a() {
            super((C0033a) null);
        }
    }

    class b implements Parcelable.ClassLoaderCreator {
        b() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f2127b;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(C0033a aVar) {
        this();
    }

    public final Parcelable a() {
        return this.f2128a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f2128a, i10);
    }

    private a() {
        this.f2128a = null;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2128a = parcelable == f2127b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2128a = readParcelable == null ? f2127b : readParcelable;
    }
}
