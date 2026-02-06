package g;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: g.a  reason: case insensitive filesystem */
public final class C1998a implements Parcelable {
    public static final Parcelable.Creator<C1998a> CREATOR = new C0345a();

    /* renamed from: c  reason: collision with root package name */
    public static final b f20797c = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f20798a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f20799b;

    /* renamed from: g.a$a  reason: collision with other inner class name */
    public static final class C0345a implements Parcelable.Creator {
        C0345a() {
        }

        /* renamed from: a */
        public C1998a createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new C1998a(parcel);
        }

        /* renamed from: b */
        public C1998a[] newArray(int i10) {
            return new C1998a[i10];
        }
    }

    /* renamed from: g.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i10) {
            if (i10 == -1) {
                return "RESULT_OK";
            }
            if (i10 != 0) {
                return String.valueOf(i10);
            }
            return "RESULT_CANCELED";
        }

        private b() {
        }
    }

    public C1998a(int i10, Intent intent) {
        this.f20798a = i10;
        this.f20799b = intent;
    }

    public final Intent a() {
        return this.f20799b;
    }

    public final int b() {
        return this.f20798a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f20797c.a(this.f20798a) + ", data=" + this.f20799b + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int i11;
        C6496s.h(parcel, "dest");
        parcel.writeInt(this.f20798a);
        if (this.f20799b == null) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        parcel.writeInt(i11);
        Intent intent = this.f20799b;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1998a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        C6496s.h(parcel, "parcel");
    }
}
