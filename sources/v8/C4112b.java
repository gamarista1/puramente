package v8;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.Y;

/* renamed from: v8.b  reason: case insensitive filesystem */
public final class C4112b implements Parcelable {
    public static final Parcelable.Creator<C4112b> CREATOR = new C0741b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f48874b = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f48875a;

    /* renamed from: v8.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Bundle f48876a = new Bundle();

        public C4112b a() {
            return new C4112b(this, (DefaultConstructorMarker) null);
        }

        public final Bundle b() {
            return this.f48876a;
        }

        public final a c(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return d((C4112b) parcel.readParcelable(C4112b.class.getClassLoader()));
        }

        public a d(C4112b bVar) {
            if (bVar != null) {
                this.f48876a.putAll(bVar.f48875a);
            }
            return this;
        }
    }

    /* renamed from: v8.b$b  reason: collision with other inner class name */
    public static final class C0741b implements Parcelable.Creator {
        C0741b() {
        }

        /* renamed from: a */
        public C4112b createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new C4112b(parcel);
        }

        /* renamed from: b */
        public C4112b[] newArray(int i10) {
            return new C4112b[i10];
        }
    }

    /* renamed from: v8.b$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ C4112b(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final Bitmap b(String str) {
        Object obj;
        Bundle bundle = this.f48875a;
        if (bundle != null) {
            obj = bundle.get(str);
        } else {
            obj = null;
        }
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    public final Uri c(String str) {
        Object obj;
        Bundle bundle = this.f48875a;
        if (bundle != null) {
            obj = bundle.get(str);
        } else {
            obj = null;
        }
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return null;
    }

    public final Set d() {
        Set<String> set;
        Bundle bundle = this.f48875a;
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
        parcel.writeBundle(this.f48875a);
    }

    private C4112b(a aVar) {
        this.f48875a = aVar.b();
    }

    public C4112b(Parcel parcel) {
        C6496s.h(parcel, "parcel");
        this.f48875a = parcel.readBundle(C4112b.class.getClassLoader());
    }
}
