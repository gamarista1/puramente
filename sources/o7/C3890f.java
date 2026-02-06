package o7;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.I;
import java.util.ArrayList;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s.C2576d;
import t7.C4049a;
import y7.C4198d;

/* renamed from: o7.f  reason: case insensitive filesystem */
public class C3890f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f47254b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private Uri f47255a;

    /* renamed from: o7.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Uri a(String str, Bundle bundle) {
            C6496s.h(str, "action");
            String b10 = P.b();
            return W.g(b10, I.w() + "/dialog/" + str, bundle);
        }

        private a() {
        }
    }

    public C3890f(String str, Bundle bundle) {
        Uri uri;
        C6496s.h(str, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        C[] values = C.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (C b10 : values) {
            arrayList.add(b10.b());
        }
        if (arrayList.contains(str)) {
            uri = W.g(P.g(), "/dialog/" + str, bundle);
        } else {
            uri = f47254b.a(str, bundle);
        }
        this.f47255a = uri;
    }

    public final boolean a(Activity activity, String str) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            C6496s.h(activity, "activity");
            C2576d a10 = new C2576d.a(C4198d.f49727b.b()).a();
            a10.f25762a.setPackage(str);
            try {
                a10.a(activity, this.f47255a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void b(Uri uri) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(uri, "<set-?>");
                this.f47255a = uri;
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }
}
