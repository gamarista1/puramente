package y7;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1773v;
import com.facebook.C3286a;
import com.facebook.C3293h;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y7.C4214u;

/* renamed from: y7.n  reason: case insensitive filesystem */
public class C4208n extends E {
    public static final Parcelable.Creator<C4208n> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final b f49777e = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f49778f;

    /* renamed from: d  reason: collision with root package name */
    private final String f49779d = "device_auth";

    /* renamed from: y7.n$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C4208n createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new C4208n(parcel);
        }

        /* renamed from: b */
        public C4208n[] newArray(int i10) {
            return new C4208n[i10];
        }
    }

    /* renamed from: y7.n$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized ScheduledThreadPoolExecutor a() {
            ScheduledThreadPoolExecutor q10;
            try {
                if (C4208n.f49778f == null) {
                    C4208n.f49778f = new ScheduledThreadPoolExecutor(1);
                }
                q10 = C4208n.f49778f;
                if (q10 == null) {
                    C6496s.v("backgroundExecutor");
                    q10 = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
            return q10;
        }

        private b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4208n(C4214u uVar) {
        super(uVar);
        C6496s.h(uVar, "loginClient");
    }

    private final void B(C4214u.e eVar) {
        C1773v i10 = d().i();
        if (i10 != null && !i10.isFinishing()) {
            C4207m u10 = u();
            u10.T(i10.getSupportFragmentManager(), "login_with_facebook");
            u10.v0(eVar);
        }
    }

    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.f49779d;
    }

    public int p(C4214u.e eVar) {
        C6496s.h(eVar, "request");
        B(eVar);
        return 1;
    }

    /* access modifiers changed from: protected */
    public C4207m u() {
        return new C4207m();
    }

    public void v() {
        d().g(C4214u.f.f49839i.a(d().p(), "User canceled log in."));
    }

    public void w(Exception exc) {
        C6496s.h(exc, "ex");
        d().g(C4214u.f.c.d(C4214u.f.f49839i, d().p(), (String) null, exc.getMessage(), (String) null, 8, (Object) null));
    }

    public void y(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, C3293h hVar, Date date, Date date2, Date date3) {
        String str4 = str;
        C6496s.h(str4, "accessToken");
        String str5 = str2;
        C6496s.h(str5, "applicationId");
        String str6 = str3;
        C6496s.h(str6, "userId");
        d().g(C4214u.f.f49839i.e(d().p(), new C3286a(str4, str5, str6, collection, collection2, collection3, hVar, date, date2, date3, (String) null, 1024, (DefaultConstructorMarker) null)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C4208n(Parcel parcel) {
        super(parcel);
        C6496s.h(parcel, "parcel");
    }
}
