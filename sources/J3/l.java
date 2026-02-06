package j3;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C1790m;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final b f22827e = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f22828a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22829b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f22830c;

    /* renamed from: d  reason: collision with root package name */
    private final Bundle f22831d;

    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "inParcel");
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

    public l(k kVar) {
        C6496s.h(kVar, "entry");
        this.f22828a = kVar.f();
        this.f22829b = kVar.e().x();
        this.f22830c = kVar.c();
        Bundle bundle = new Bundle();
        this.f22831d = bundle;
        kVar.i(bundle);
    }

    public final int a() {
        return this.f22829b;
    }

    public final String b() {
        return this.f22828a;
    }

    public final k c(Context context, s sVar, C1790m.b bVar, o oVar) {
        C6496s.h(context, "context");
        C6496s.h(sVar, "destination");
        C6496s.h(bVar, "hostLifecycleState");
        Bundle bundle = this.f22830c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return k.f22809o.a(context, sVar, bundle, bVar, oVar, this.f22828a, this.f22831d);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "parcel");
        parcel.writeString(this.f22828a);
        parcel.writeInt(this.f22829b);
        parcel.writeBundle(this.f22830c);
        parcel.writeBundle(this.f22831d);
    }

    public l(Parcel parcel) {
        C6496s.h(parcel, "inParcel");
        String readString = parcel.readString();
        C6496s.e(readString);
        this.f22828a = readString;
        this.f22829b = parcel.readInt();
        Class<l> cls = l.class;
        this.f22830c = parcel.readBundle(cls.getClassLoader());
        Bundle readBundle = parcel.readBundle(cls.getClassLoader());
        C6496s.e(readBundle);
        this.f22831d = readBundle;
    }
}
