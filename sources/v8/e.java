package v8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import v8.f;

public abstract class e implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f48909a;

    /* renamed from: b  reason: collision with root package name */
    private final List f48910b;

    /* renamed from: c  reason: collision with root package name */
    private final String f48911c;

    /* renamed from: d  reason: collision with root package name */
    private final String f48912d;

    /* renamed from: e  reason: collision with root package name */
    private final String f48913e;

    /* renamed from: f  reason: collision with root package name */
    private final f f48914f;

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private Uri f48915a;

        /* renamed from: b  reason: collision with root package name */
        private List f48916b;

        /* renamed from: c  reason: collision with root package name */
        private String f48917c;

        /* renamed from: d  reason: collision with root package name */
        private String f48918d;

        /* renamed from: e  reason: collision with root package name */
        private String f48919e;

        /* renamed from: f  reason: collision with root package name */
        private f f48920f;

        public final Uri a() {
            return this.f48915a;
        }

        public final f b() {
            return this.f48920f;
        }

        public final String c() {
            return this.f48918d;
        }

        public final List d() {
            return this.f48916b;
        }

        public final String e() {
            return this.f48917c;
        }

        public final String f() {
            return this.f48919e;
        }

        public a g(e eVar) {
            if (eVar != null) {
                return h(eVar.a()).j(eVar.c()).k(eVar.d()).i(eVar.b()).l(eVar.e()).m(eVar.f());
            }
            C6496s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareContent.Builder");
            return this;
        }

        public final a h(Uri uri) {
            this.f48915a = uri;
            C6496s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareContent.Builder");
            return this;
        }

        public final a i(String str) {
            this.f48918d = str;
            C6496s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareContent.Builder");
            return this;
        }

        public final a j(List list) {
            List list2;
            if (list == null) {
                list2 = null;
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f48916b = list2;
            C6496s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareContent.Builder");
            return this;
        }

        public final a k(String str) {
            this.f48917c = str;
            C6496s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareContent.Builder");
            return this;
        }

        public final a l(String str) {
            this.f48919e = str;
            C6496s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareContent.Builder");
            return this;
        }

        public final a m(f fVar) {
            this.f48920f = fVar;
            C6496s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareContent.Builder");
            return this;
        }
    }

    protected e(a aVar) {
        C6496s.h(aVar, "builder");
        this.f48909a = aVar.a();
        this.f48910b = aVar.d();
        this.f48911c = aVar.e();
        this.f48912d = aVar.c();
        this.f48913e = aVar.f();
        this.f48914f = aVar.b();
    }

    private final List g(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Uri a() {
        return this.f48909a;
    }

    public final String b() {
        return this.f48912d;
    }

    public final List c() {
        return this.f48910b;
    }

    public final String d() {
        return this.f48911c;
    }

    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f48913e;
    }

    public final f f() {
        return this.f48914f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        parcel.writeParcelable(this.f48909a, 0);
        parcel.writeStringList(this.f48910b);
        parcel.writeString(this.f48911c);
        parcel.writeString(this.f48912d);
        parcel.writeString(this.f48913e);
        parcel.writeParcelable(this.f48914f, 0);
    }

    protected e(Parcel parcel) {
        C6496s.h(parcel, "parcel");
        this.f48909a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f48910b = g(parcel);
        this.f48911c = parcel.readString();
        this.f48912d = parcel.readString();
        this.f48913e = parcel.readString();
        this.f48914f = new f.a().d(parcel).a();
    }
}
