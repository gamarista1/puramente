package J5;

import G5.f;
import Sg.p;
import android.os.Bundle;
import android.view.View;
import com.amazon.a.a.o.b.f;
import com.facebook.C3286a;
import com.facebook.I;
import com.facebook.M;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import o7.W;
import org.json.JSONException;
import org.json.JSONObject;
import t5.C4021N;
import t7.C4049a;
import x5.C4170f;

public final class j implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public static final a f32194e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final Set f32195f = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final View.OnClickListener f32196a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f32197b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference f32198c;

    /* renamed from: d  reason: collision with root package name */
    private final String f32199d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final void e(String str, String str2, float[] fArr) {
            if (e.f(str)) {
                new C4021N(I.l()).e(str, str2);
            } else if (e.e(str)) {
                h(str, str2, fArr);
            }
        }

        /* access modifiers changed from: private */
        public final boolean f(String str, String str2) {
            String d10 = b.d(str);
            if (d10 == null) {
                return false;
            }
            if (C6496s.c(d10, "other")) {
                return true;
            }
            W.F0(new i(d10, str2));
            return true;
        }

        /* access modifiers changed from: private */
        public static final void g(String str, String str2) {
            C6496s.h(str, "$queriedEvent");
            C6496s.h(str2, "$buttonText");
            j.f32194e.e(str, str2, new float[0]);
        }

        private final void h(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb2 = new StringBuilder();
                for (float append : fArr) {
                    sb2.append(append);
                    sb2.append(f.f37529a);
                }
                jSONObject.put("dense", sb2.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                M.c cVar = M.f39311n;
                U u10 = U.f71764a;
                String format = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{I.m()}, 1));
                C6496s.g(format, "format(locale, format, *args)");
                M A10 = cVar.A((C3286a) null, format, (JSONObject) null, (M.b) null);
                A10.J(bundle);
                A10.k();
            } catch (JSONException unused) {
            }
        }

        public final void d(View view, View view2, String str) {
            C6496s.h(view, "hostView");
            C6496s.h(view2, "rootView");
            C6496s.h(str, "activityName");
            int hashCode = view.hashCode();
            if (!j.b().contains(Integer.valueOf(hashCode))) {
                C4170f.r(view, new j(view, view2, str, (DefaultConstructorMarker) null));
                j.b().add(Integer.valueOf(hashCode));
            }
        }

        private a() {
        }
    }

    public /* synthetic */ j(View view, View view2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, view2, str);
    }

    public static final /* synthetic */ Set b() {
        Class<j> cls = j.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f32195f;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    private final void c(String str, String str2, JSONObject jSONObject) {
        if (!C4049a.d(this)) {
            try {
                W.F0(new h(jSONObject, str2, this, str));
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void d(JSONObject jSONObject, String str, j jVar, String str2) {
        String[] q10;
        Class<j> cls = j.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(jSONObject, "$viewData");
                C6496s.h(str, "$buttonText");
                C6496s.h(jVar, "this$0");
                C6496s.h(str2, "$pathID");
                try {
                    String lowerCase = W.v(I.l()).toLowerCase();
                    C6496s.g(lowerCase, "this as java.lang.String).toLowerCase()");
                    float[] a10 = a.a(jSONObject, lowerCase);
                    String c10 = a.c(str, jVar.f32199d, lowerCase);
                    if (a10 != null && (q10 = G5.f.q(f.a.MTML_APP_EVENT_PREDICTION, new float[][]{a10}, new String[]{c10})) != null) {
                        String str3 = q10[0];
                        b.a(str2, str3);
                        if (!C6496s.c(str3, "other")) {
                            f32194e.e(str3, str, a10);
                        }
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void e() {
        if (!C4049a.d(this)) {
            try {
                View view = (View) this.f32197b.get();
                View view2 = (View) this.f32198c.get();
                if (view != null && view2 != null) {
                    try {
                        String d10 = c.d(view2);
                        String b10 = b.b(view2, d10);
                        if (b10 != null && !f32194e.f(b10, d10)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("view", c.b(view, view2));
                            jSONObject.put("screenname", this.f32199d);
                            c(b10, d10, jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public void onClick(View view) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(view, "view");
                View.OnClickListener onClickListener = this.f32196a;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                e();
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private j(View view, View view2, String str) {
        this.f32196a = C4170f.g(view);
        this.f32197b = new WeakReference(view2);
        this.f32198c = new WeakReference(view);
        String lowerCase = str.toLowerCase();
        C6496s.g(lowerCase, "this as java.lang.String).toLowerCase()");
        this.f32199d = p.D(lowerCase, "activity", "", false, 4, (Object) null);
    }
}
