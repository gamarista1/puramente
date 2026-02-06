package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public abstract class h implements Parcelable {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f48927a;

    public static abstract class a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0743a f48928b = new C0743a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private Bundle f48929a = new Bundle();

        /* renamed from: v8.h$a$a  reason: collision with other inner class name */
        public static final class C0743a {
            public /* synthetic */ C0743a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List a(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                Parcelable[] readParcelableArray = parcel.readParcelableArray(h.class.getClassLoader());
                if (readParcelableArray == null) {
                    return C6565s.n();
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : readParcelableArray) {
                    if (parcelable instanceof h) {
                        arrayList.add(parcelable);
                    }
                }
                return arrayList;
            }

            private C0743a() {
            }
        }

        public final Bundle a() {
            return this.f48929a;
        }

        public a b(h hVar) {
            if (hVar != null) {
                return c(hVar.f48927a);
            }
            C6496s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareMedia.Builder");
            return this;
        }

        public final a c(Bundle bundle) {
            C6496s.h(bundle, "parameters");
            this.f48929a.putAll(bundle);
            C6496s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareMedia.Builder");
            return this;
        }
    }

    public enum b {
        PHOTO,
        VIDEO
    }

    protected h(a aVar) {
        C6496s.h(aVar, "builder");
        this.f48927a = new Bundle(aVar.a());
    }

    public abstract b b();

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeBundle(this.f48927a);
    }

    public h(Parcel parcel) {
        C6496s.h(parcel, "parcel");
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.f48927a = readBundle == null ? new Bundle() : readBundle;
    }
}
