package y7;

import P5.e;
import P5.f;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C1767o;
import androidx.fragment.app.C1773v;
import com.facebook.C3286a;
import com.facebook.C3293h;
import com.facebook.C3459v;
import com.facebook.C3462y;
import com.facebook.FacebookActivity;
import com.facebook.I;
import com.facebook.M;
import com.facebook.P;
import com.facebook.S;
import com.facebook.T;
import h6.C3580a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import mf.O;
import o7.C3884A;
import o7.C3906w;
import o7.Q;
import o7.W;
import o7.X;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t5.C4021N;
import y7.C4214u;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 m2\u00020\u0001:\u0003nopB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#H\u0015¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0012H\u0014¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020#H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00122\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0012H\u0002¢\u0006\u0004\b5\u0010\u0003J\u000f\u00106\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u0010\u0003JC\u0010?\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u001e2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u001e2\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010>\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b?\u0010@J)\u0010C\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020A2\b\u0010>\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DJ;\u0010E\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u001e2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u001e2\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010>\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\n8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020J8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bN\u0010LR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001c\u0010_\u001a\b\u0012\u0002\b\u0003\u0018\u00010\\8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010f\u001a\u00020#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\be\u0010cR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020i8BX\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006q"}, d2 = {"Ly7/m;", "Landroidx/fragment/app/o;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "K", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", "Llf/M;", "onDismiss", "(Landroid/content/DialogInterface;)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onDestroyView", "Ly7/u$e;", "request", "v0", "(Ly7/u$e;)V", "", "", "c0", "()Ljava/util/Map;", "e0", "()Ljava/lang/String;", "", "isSmartLogin", "h0", "(Z)Landroid/view/View;", "", "f0", "(Z)I", "Lcom/facebook/v;", "ex", "l0", "(Lcom/facebook/v;)V", "k0", "j0", "()Z", "Ly7/m$c;", "currentRequestState", "u0", "(Ly7/m$c;)V", "o0", "s0", "userId", "Ly7/m$b;", "permissions", "accessToken", "name", "Ljava/util/Date;", "expirationTime", "dataAccessExpirationTime", "p0", "(Ljava/lang/String;Ly7/m$b;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "", "expiresIn", "m0", "(Ljava/lang/String;JLjava/lang/Long;)V", "d0", "(Ljava/lang/String;Ly7/m$b;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "q", "Landroid/view/View;", "progressBar", "Landroid/widget/TextView;", "r", "Landroid/widget/TextView;", "confirmationCode", "s", "instructions", "Ly7/n;", "t", "Ly7/n;", "deviceAuthMethodHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", "u", "Ljava/util/concurrent/atomic/AtomicBoolean;", "completed", "Lcom/facebook/P;", "v", "Lcom/facebook/P;", "currentGraphRequestPoll", "Ljava/util/concurrent/ScheduledFuture;", "w", "Ljava/util/concurrent/ScheduledFuture;", "scheduledPoll", "x", "Ly7/m$c;", "y", "Z", "isBeingDestroyed", "z", "isRetry", "A", "Ly7/u$e;", "Lcom/facebook/M;", "g0", "()Lcom/facebook/M;", "pollRequest", "B", "a", "b", "c", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: y7.m  reason: case insensitive filesystem */
public class C4207m extends C1767o {

    /* renamed from: B  reason: collision with root package name */
    public static final a f49752B = new a((DefaultConstructorMarker) null);

    /* renamed from: C  reason: collision with root package name */
    private static final String f49753C = "device/login";

    /* renamed from: D  reason: collision with root package name */
    private static final String f49754D = "device/login_status";

    /* renamed from: E  reason: collision with root package name */
    private static final int f49755E = 1349174;

    /* renamed from: A  reason: collision with root package name */
    private C4214u.e f49756A;

    /* renamed from: q  reason: collision with root package name */
    private View f49757q;

    /* renamed from: r  reason: collision with root package name */
    private TextView f49758r;

    /* renamed from: s  reason: collision with root package name */
    private TextView f49759s;

    /* renamed from: t  reason: collision with root package name */
    private C4208n f49760t;

    /* renamed from: u  reason: collision with root package name */
    private final AtomicBoolean f49761u = new AtomicBoolean();

    /* renamed from: v  reason: collision with root package name */
    private volatile P f49762v;

    /* renamed from: w  reason: collision with root package name */
    private volatile ScheduledFuture f49763w;

    /* renamed from: x  reason: collision with root package name */
    private volatile c f49764x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f49765y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f49766z;

    /* renamed from: y7.m$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final b b(JSONObject jSONObject) {
            String optString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                String optString2 = optJSONObject.optString("permission");
                C6496s.g(optString2, "permission");
                if (!(optString2.length() == 0 || C6496s.c(optString2, "installed") || (optString = optJSONObject.optString("status")) == null)) {
                    int hashCode = optString.hashCode();
                    if (hashCode != -1309235419) {
                        if (hashCode != 280295099) {
                            if (hashCode == 568196142 && optString.equals("declined")) {
                                arrayList2.add(optString2);
                            }
                        } else if (optString.equals("granted")) {
                            arrayList.add(optString2);
                        }
                    } else if (optString.equals("expired")) {
                        arrayList3.add(optString2);
                    }
                }
            }
            return new b(arrayList, arrayList2, arrayList3);
        }

        private a() {
        }
    }

    /* renamed from: y7.m$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private List f49767a;

        /* renamed from: b  reason: collision with root package name */
        private List f49768b;

        /* renamed from: c  reason: collision with root package name */
        private List f49769c;

        public b(List list, List list2, List list3) {
            C6496s.h(list, "grantedPermissions");
            C6496s.h(list2, "declinedPermissions");
            C6496s.h(list3, "expiredPermissions");
            this.f49767a = list;
            this.f49768b = list2;
            this.f49769c = list3;
        }

        public final List a() {
            return this.f49768b;
        }

        public final List b() {
            return this.f49769c;
        }

        public final List c() {
            return this.f49767a;
        }
    }

    /* renamed from: y7.m$c */
    private static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public static final b f49770f = new b((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private String f49771a;

        /* renamed from: b  reason: collision with root package name */
        private String f49772b;

        /* renamed from: c  reason: collision with root package name */
        private String f49773c;

        /* renamed from: d  reason: collision with root package name */
        private long f49774d;

        /* renamed from: e  reason: collision with root package name */
        private long f49775e;

        /* renamed from: y7.m$c$a */
        public static final class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                return new c(parcel);
            }

            /* renamed from: b */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        /* renamed from: y7.m$c$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public c() {
        }

        public final String a() {
            return this.f49771a;
        }

        public final long b() {
            return this.f49774d;
        }

        public final String c() {
            return this.f49773c;
        }

        public final String d() {
            return this.f49772b;
        }

        public int describeContents() {
            return 0;
        }

        public final void e(long j10) {
            this.f49774d = j10;
        }

        public final void f(long j10) {
            this.f49775e = j10;
        }

        public final void g(String str) {
            this.f49773c = str;
        }

        public final void h(String str) {
            this.f49772b = str;
            U u10 = U.f71764a;
            String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
            C6496s.g(format, "format(locale, format, *args)");
            this.f49771a = format;
        }

        public final boolean i() {
            if (this.f49775e != 0 && (new Date().getTime() - this.f49775e) - (this.f49774d * 1000) < 0) {
                return true;
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "dest");
            parcel.writeString(this.f49771a);
            parcel.writeString(this.f49772b);
            parcel.writeString(this.f49773c);
            parcel.writeLong(this.f49774d);
            parcel.writeLong(this.f49775e);
        }

        protected c(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            this.f49771a = parcel.readString();
            this.f49772b = parcel.readString();
            this.f49773c = parcel.readString();
            this.f49774d = parcel.readLong();
            this.f49775e = parcel.readLong();
        }
    }

    /* renamed from: y7.m$d */
    public static final class d extends Dialog {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4207m f49776a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C4207m mVar, C1773v vVar, int i10) {
            super(vVar, i10);
            this.f49776a = mVar;
        }

        public void onBackPressed() {
            if (this.f49776a.j0()) {
                super.onBackPressed();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void b0(C4207m mVar, S s10) {
        C3459v vVar;
        C6496s.h(mVar, "this$0");
        C6496s.h(s10, "response");
        if (!mVar.f49761u.get()) {
            C3462y b10 = s10.b();
            if (b10 != null) {
                int l10 = b10.l();
                if (l10 == f49755E || l10 == 1349172) {
                    mVar.s0();
                } else if (l10 == 1349152) {
                    c cVar = mVar.f49764x;
                    if (cVar != null) {
                        C3580a.a(cVar.d());
                    }
                    C4214u.e eVar = mVar.f49756A;
                    if (eVar != null) {
                        mVar.v0(eVar);
                    } else {
                        mVar.k0();
                    }
                } else if (l10 == 1349173) {
                    mVar.k0();
                } else {
                    C3462y b11 = s10.b();
                    if (b11 == null || (vVar = b11.h()) == null) {
                        vVar = new C3459v();
                    }
                    mVar.l0(vVar);
                }
            } else {
                try {
                    JSONObject c10 = s10.c();
                    if (c10 == null) {
                        c10 = new JSONObject();
                    }
                    String string = c10.getString("access_token");
                    C6496s.g(string, "resultObject.getString(\"access_token\")");
                    mVar.m0(string, c10.getLong("expires_in"), Long.valueOf(c10.optLong("data_access_expiration_time")));
                } catch (JSONException e10) {
                    mVar.l0(new C3459v((Throwable) e10));
                }
            }
        }
    }

    private final void d0(String str, b bVar, String str2, Date date, Date date2) {
        C4208n nVar = this.f49760t;
        if (nVar != null) {
            nVar.y(str2, I.m(), str, bVar.c(), bVar.a(), bVar.b(), C3293h.DEVICE_AUTH, date, (Date) null, date2);
        }
        Dialog H10 = H();
        if (H10 != null) {
            H10.dismiss();
        }
    }

    private final M g0() {
        String str;
        Bundle bundle = new Bundle();
        c cVar = this.f49764x;
        if (cVar != null) {
            str = cVar.c();
        } else {
            str = null;
        }
        bundle.putString("code", str);
        bundle.putString("access_token", e0());
        return M.f39311n.B((C3286a) null, f49754D, bundle, new C4202h(this));
    }

    /* access modifiers changed from: private */
    public static final void i0(C4207m mVar, View view) {
        C6496s.h(mVar, "this$0");
        mVar.k0();
    }

    private final void m0(String str, long j10, Long l10) {
        Date date;
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date2 = null;
        if (j10 != 0) {
            date = new Date(new Date().getTime() + (j10 * 1000));
        } else {
            date = null;
        }
        if ((l10 == null || l10.longValue() != 0) && l10 != null) {
            date2 = new Date(l10.longValue() * 1000);
        }
        M x10 = M.f39311n.x(new C3286a(str, I.m(), "0", (Collection) null, (Collection) null, (Collection) null, (C3293h) null, date, (Date) null, date2, (String) null, 1024, (DefaultConstructorMarker) null), "me", new C4204j(this, str, date, date2));
        x10.I(T.GET);
        x10.J(bundle);
        x10.l();
    }

    /* access modifiers changed from: private */
    public static final void n0(C4207m mVar, String str, Date date, Date date2, S s10) {
        Boolean bool;
        EnumSet x10;
        C6496s.h(mVar, "this$0");
        C6496s.h(str, "$accessToken");
        C6496s.h(s10, "response");
        if (!mVar.f49761u.get()) {
            C3462y b10 = s10.b();
            if (b10 != null) {
                C3459v h10 = b10.h();
                if (h10 == null) {
                    h10 = new C3459v();
                }
                mVar.l0(h10);
                return;
            }
            try {
                JSONObject c10 = s10.c();
                if (c10 == null) {
                    c10 = new JSONObject();
                }
                String string = c10.getString("id");
                C6496s.g(string, "jsonObject.getString(\"id\")");
                b a10 = f49752B.b(c10);
                String string2 = c10.getString("name");
                C6496s.g(string2, "jsonObject.getString(\"name\")");
                c cVar = mVar.f49764x;
                if (cVar != null) {
                    C3580a.a(cVar.d());
                }
                C3906w f10 = C3884A.f(I.m());
                if (f10 == null || (x10 = f10.x()) == null) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(x10.contains(Q.RequireConfirm));
                }
                if (!C6496s.c(bool, Boolean.TRUE) || mVar.f49766z) {
                    mVar.d0(string, a10, str, date, date2);
                    return;
                }
                mVar.f49766z = true;
                mVar.p0(string, a10, str, string2, date, date2);
            } catch (JSONException e10) {
                mVar.l0(new C3459v((Throwable) e10));
            }
        }
    }

    private final void o0() {
        c cVar = this.f49764x;
        if (cVar != null) {
            cVar.f(new Date().getTime());
        }
        this.f49762v = g0().l();
    }

    private final void p0(String str, b bVar, String str2, String str3, Date date, Date date2) {
        String string = getResources().getString(e.f33483g);
        C6496s.g(string, "resources.getString(R.st…login_confirmation_title)");
        String string2 = getResources().getString(e.f33482f);
        C6496s.g(string2, "resources.getString(R.st…confirmation_continue_as)");
        String string3 = getResources().getString(e.f33481e);
        C6496s.g(string3, "resources.getString(R.st…ogin_confirmation_cancel)");
        U u10 = U.f71764a;
        String format = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
        C6496s.g(format, "format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new C4205k(this, str, bVar, str2, date, date2)).setPositiveButton(string3, new C4206l(this));
        builder.create().show();
    }

    /* access modifiers changed from: private */
    public static final void q0(C4207m mVar, String str, b bVar, String str2, Date date, Date date2, DialogInterface dialogInterface, int i10) {
        C6496s.h(mVar, "this$0");
        C6496s.h(str, "$userId");
        C6496s.h(bVar, "$permissions");
        C6496s.h(str2, "$accessToken");
        mVar.d0(str, bVar, str2, date, date2);
    }

    /* access modifiers changed from: private */
    public static final void r0(C4207m mVar, DialogInterface dialogInterface, int i10) {
        C6496s.h(mVar, "this$0");
        View h02 = mVar.h0(false);
        Dialog H10 = mVar.H();
        if (H10 != null) {
            H10.setContentView(h02);
        }
        C4214u.e eVar = mVar.f49756A;
        if (eVar != null) {
            mVar.v0(eVar);
        }
    }

    private final void s0() {
        Long l10;
        c cVar = this.f49764x;
        if (cVar != null) {
            l10 = Long.valueOf(cVar.b());
        } else {
            l10 = null;
        }
        if (l10 != null) {
            this.f49763w = C4208n.f49777e.a().schedule(new C4201g(this), l10.longValue(), TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: private */
    public static final void t0(C4207m mVar) {
        C6496s.h(mVar, "this$0");
        mVar.o0();
    }

    private final void u0(c cVar) {
        this.f49764x = cVar;
        TextView textView = this.f49758r;
        View view = null;
        if (textView == null) {
            C6496s.v("confirmationCode");
            textView = null;
        }
        textView.setText(cVar.d());
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), C3580a.c(cVar.a()));
        TextView textView2 = this.f49759s;
        if (textView2 == null) {
            C6496s.v("instructions");
            textView2 = null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.f49758r;
        if (textView3 == null) {
            C6496s.v("confirmationCode");
            textView3 = null;
        }
        textView3.setVisibility(0);
        View view2 = this.f49757q;
        if (view2 == null) {
            C6496s.v("progressBar");
        } else {
            view = view2;
        }
        view.setVisibility(8);
        if (!this.f49766z && C3580a.f(cVar.d())) {
            new C4021N(getContext()).f("fb_smart_login_service");
        }
        if (cVar.i()) {
            s0();
        } else {
            o0();
        }
    }

    /* access modifiers changed from: private */
    public static final void w0(C4207m mVar, S s10) {
        C3459v vVar;
        C6496s.h(mVar, "this$0");
        C6496s.h(s10, "response");
        if (!mVar.f49765y) {
            if (s10.b() != null) {
                C3462y b10 = s10.b();
                if (b10 == null || (vVar = b10.h()) == null) {
                    vVar = new C3459v();
                }
                mVar.l0(vVar);
                return;
            }
            JSONObject c10 = s10.c();
            if (c10 == null) {
                c10 = new JSONObject();
            }
            c cVar = new c();
            try {
                cVar.h(c10.getString("user_code"));
                cVar.g(c10.getString("code"));
                cVar.e(c10.getLong("interval"));
                mVar.u0(cVar);
            } catch (JSONException e10) {
                mVar.l0(new C3459v((Throwable) e10));
            }
        }
    }

    public Dialog K(Bundle bundle) {
        boolean z10;
        d dVar = new d(this, requireActivity(), f.f33485b);
        if (!C3580a.e() || this.f49766z) {
            z10 = false;
        } else {
            z10 = true;
        }
        dVar.setContentView(h0(z10));
        return dVar;
    }

    public Map c0() {
        return null;
    }

    public String e0() {
        return X.b() + '|' + X.c();
    }

    /* access modifiers changed from: protected */
    public int f0(boolean z10) {
        if (z10) {
            return P5.d.f33476d;
        }
        return P5.d.f33474b;
    }

    /* access modifiers changed from: protected */
    public View h0(boolean z10) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        C6496s.g(layoutInflater, "requireActivity().layoutInflater");
        TextView textView = null;
        View inflate = layoutInflater.inflate(f0(z10), (ViewGroup) null);
        C6496s.g(inflate, "inflater.inflate(getLayo…esId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(P5.c.f33472f);
        C6496s.g(findViewById, "view.findViewById(R.id.progress_bar)");
        this.f49757q = findViewById;
        View findViewById2 = inflate.findViewById(P5.c.f33471e);
        C6496s.f(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.f49758r = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(P5.c.f33467a);
        C6496s.f(findViewById3, "null cannot be cast to non-null type android.widget.Button");
        ((Button) findViewById3).setOnClickListener(new C4200f(this));
        View findViewById4 = inflate.findViewById(P5.c.f33468b);
        C6496s.f(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById4;
        this.f49759s = textView2;
        if (textView2 == null) {
            C6496s.v("instructions");
        } else {
            textView = textView2;
        }
        textView.setText(Html.fromHtml(getString(e.f33477a)));
        return inflate;
    }

    /* access modifiers changed from: protected */
    public boolean j0() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void k0() {
        if (this.f49761u.compareAndSet(false, true)) {
            c cVar = this.f49764x;
            if (cVar != null) {
                C3580a.a(cVar.d());
            }
            C4208n nVar = this.f49760t;
            if (nVar != null) {
                nVar.v();
            }
            Dialog H10 = H();
            if (H10 != null) {
                H10.dismiss();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void l0(C3459v vVar) {
        C6496s.h(vVar, "ex");
        if (this.f49761u.compareAndSet(false, true)) {
            c cVar = this.f49764x;
            if (cVar != null) {
                C3580a.a(cVar.d());
            }
            C4208n nVar = this.f49760t;
            if (nVar != null) {
                nVar.w(vVar);
            }
            Dialog H10 = H();
            if (H10 != null) {
                H10.dismiss();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        E e10;
        c cVar;
        C4214u J10;
        C6496s.h(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C1773v requireActivity = requireActivity();
        C6496s.f(requireActivity, "null cannot be cast to non-null type com.facebook.FacebookActivity");
        y yVar = (y) ((FacebookActivity) requireActivity).C();
        if (yVar == null || (J10 = yVar.J()) == null) {
            e10 = null;
        } else {
            e10 = J10.j();
        }
        this.f49760t = (C4208n) e10;
        if (!(bundle == null || (cVar = (c) bundle.getParcelable("request_state")) == null)) {
            u0(cVar);
        }
        return onCreateView;
    }

    public void onDestroyView() {
        this.f49765y = true;
        this.f49761u.set(true);
        super.onDestroyView();
        P p10 = this.f49762v;
        if (p10 != null) {
            p10.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.f49763w;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C6496s.h(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (!this.f49765y) {
            k0();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C6496s.h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (this.f49764x != null) {
            bundle.putParcelable("request_state", this.f49764x);
        }
    }

    public void v0(C4214u.e eVar) {
        Map map;
        C6496s.h(eVar, "request");
        this.f49756A = eVar;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(com.amazon.a.a.o.b.f.f37529a, eVar.o()));
        W.t0(bundle, "redirect_uri", eVar.i());
        W.t0(bundle, "target_user_id", eVar.h());
        bundle.putString("access_token", e0());
        Map c02 = c0();
        if (c02 != null) {
            map = O.B(c02);
        } else {
            map = null;
        }
        bundle.putString("device_info", C3580a.d(map));
        M.f39311n.B((C3286a) null, f49753C, bundle, new C4203i(this)).l();
    }
}
