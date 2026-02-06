package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.Y;

/* renamed from: v8.a  reason: case insensitive filesystem */
public final class C4111a implements Parcelable {
    public static final Parcelable.Creator<C4111a> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f48871b = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f48872a;

    /* renamed from: v8.a$a  reason: collision with other inner class name */
    public static final class C0740a {

        /* renamed from: a  reason: collision with root package name */
        private final Bundle f48873a = new Bundle();

        public C4111a a() {
            return new C4111a(this, (DefaultConstructorMarker) null);
        }

        public final Bundle b() {
            return this.f48873a;
        }

        public final C0740a c(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return d((C4111a) parcel.readParcelable(C4111a.class.getClassLoader()));
        }

        public C0740a d(C4111a aVar) {
            if (aVar != null) {
                this.f48873a.putAll(aVar.f48872a);
            }
            return this;
        }
    }

    /* renamed from: v8.a$b */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public C4111a createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new C4111a(parcel);
        }

        /* renamed from: b */
        public C4111a[] newArray(int i10) {
            return new C4111a[i10];
        }
    }

    /* renamed from: v8.a$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ C4111a(C0740a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final Object b(String str) {
        Bundle bundle = this.f48872a;
        if (bundle != null) {
            return bundle.get(str);
        }
        return null;
    }

    public final Set c() {
        Set<String> set;
        Bundle bundle = this.f48872a;
        if (bundle != null) {
            set = bundle.keySet();
        } else {
            set = null;
        }
        if (set == null) {
            return Y.e();
        }
        return set;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        parcel.writeBundle(this.f48872a);
    }

    private C4111a(C0740a aVar) {
        this.f48872a = aVar.b();
    }

    public C4111a(Parcel parcel) {
        C6496s.h(parcel, "parcel");
        this.f48872a = parcel.readBundle(C4111a.class.getClassLoader());
    }
}
