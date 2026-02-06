package A5;

import Rg.k;
import Sg.p;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.facebook.I;
import io.branch.rnbranch.RNBranchModule;
import java.net.URLEncoder;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import org.json.JSONObject;
import r3.i;
import r3.j;
import t5.C4028e;
import t7.C4049a;
import u1.m;
import yf.C6798l;
import z5.C4232a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f29378a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final String f29379b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f29380c;

    /* renamed from: d  reason: collision with root package name */
    private static C4232a f29381d;

    /* renamed from: e  reason: collision with root package name */
    private static String f29382e;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f29383a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject) {
            super(1);
            this.f29383a = jSONObject;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            Object opt = this.f29383a.opt(str);
            if (opt == null) {
                return null;
            }
            try {
                String encode = URLEncoder.encode(str, Constants.ENCODING);
                String encode2 = URLEncoder.encode(opt.toString(), Constants.ENCODING);
                return encode + '=' + encode2;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static final class b implements OutcomeReceiver {
        b() {
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            C6496s.h(exc, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            Log.d(c.c(), "OUTCOME_RECEIVER_TRIGGER_FAILURE");
            C4232a b10 = c.b();
            if (b10 == null) {
                C6496s.v("gpsDebugLogger");
                b10 = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_ara_failed_reason", exc.toString());
            C6514M m10 = C6514M.f71813a;
            b10.b("gps_ara_failed", bundle);
        }

        public void onResult(Object obj) {
            C6496s.h(obj, "result");
            Log.d(c.c(), "OUTCOME_RECEIVER_TRIGGER_SUCCESS");
            C4232a b10 = c.b();
            if (b10 == null) {
                C6496s.v("gpsDebugLogger");
                b10 = null;
            }
            b10.b("gps_ara_succeed", (Bundle) null);
        }
    }

    static {
        String cls = c.class.toString();
        C6496s.g(cls, "GpsAraTriggersManager::class.java.toString()");
        f29379b = cls;
    }

    private c() {
    }

    public static final /* synthetic */ C4232a b() {
        Class<c> cls = c.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f29381d;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        Class<c> cls = c.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f29379b;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    private final boolean d() {
        C4232a aVar;
        if (C4049a.d(this)) {
            return false;
        }
        try {
            if (!f29380c) {
                return false;
            }
            aVar = null;
            Class.forName("android.adservices.measurement.MeasurementManager");
            return true;
        } catch (Exception e10) {
            Log.i(f29379b, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
            C4232a aVar2 = f29381d;
            if (aVar2 == null) {
                C6496s.v("gpsDebugLogger");
            } else {
                aVar = aVar2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_ara_failed_reason", e10.toString());
            C6514M m10 = C6514M.f71813a;
            aVar.b("gps_ara_failed", bundle);
            return false;
        } catch (Error e11) {
            Log.i(f29379b, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
            C4232a aVar3 = f29381d;
            if (aVar3 == null) {
                C6496s.v("gpsDebugLogger");
            } else {
                aVar = aVar3;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("gps_ara_failed_reason", e11.toString());
            C6514M m11 = C6514M.f71813a;
            aVar.b("gps_ara_failed", bundle2);
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    public static final void e() {
        Class<c> cls = c.class;
        if (!C4049a.d(cls)) {
            try {
                f29380c = true;
                f29381d = new C4232a(I.l());
                f29382e = "https://www." + I.u() + "/privacy_sandbox/mobile/register/trigger";
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final String f(C4028e eVar) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            JSONObject c10 = eVar.c();
            if (c10 == null) {
                return "";
            }
            if (c10.length() == 0) {
                return "";
            }
            Iterator<String> keys = c10.keys();
            C6496s.g(keys, "params.keys()");
            return k.v(k.y(k.c(keys), new a(c10)), "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final boolean g(C4028e eVar) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            String string = eVar.c().getString("_eventName");
            if (C6496s.c(string, "_removed_")) {
                return false;
            }
            C6496s.g(string, "eventName");
            if (!p.O(string, "gps", false, 2, (Object) null)) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static final void j(String str, C4028e eVar) {
        Class<c> cls = c.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(str, "$applicationId");
                C6496s.h(eVar, "$event");
                f29378a.h(str, eVar);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public final void h(String str, C4028e eVar) {
        C4232a aVar;
        if (!C4049a.d(this)) {
            try {
                C6496s.h(str, "applicationId");
                C6496s.h(eVar, "event");
                if (g(eVar) && d()) {
                    Context l10 = I.l();
                    aVar = null;
                    MeasurementManager a10 = j.a(l10.getSystemService(i.a()));
                    if (a10 == null) {
                        a10 = MeasurementManager.get(l10.getApplicationContext());
                    }
                    if (a10 == null) {
                        Log.w(f29379b, "FAILURE_GET_MEASUREMENT_MANAGER");
                        C4232a aVar2 = f29381d;
                        if (aVar2 == null) {
                            C6496s.v("gpsDebugLogger");
                            aVar2 = null;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("gps_ara_failed_reason", "Failed to get measurement manager");
                        C6514M m10 = C6514M.f71813a;
                        aVar2.b("gps_ara_failed", bundle);
                        return;
                    }
                    String f10 = f(eVar);
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = f29382e;
                    if (str2 == null) {
                        C6496s.v("serverUri");
                        str2 = null;
                    }
                    sb2.append(str2);
                    sb2.append('?');
                    sb2.append("app_id");
                    sb2.append('=');
                    sb2.append(str);
                    sb2.append('&');
                    sb2.append(f10);
                    Uri parse = Uri.parse(sb2.toString());
                    C6496s.g(parse, "parse(\"$serverUri?$appId…=$applicationId&$params\")");
                    a10.registerTrigger(parse, I.t(), m.a(new b()));
                }
            } catch (Exception e10) {
                Log.w(f29379b, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                C4232a aVar3 = f29381d;
                if (aVar3 == null) {
                    C6496s.v("gpsDebugLogger");
                } else {
                    aVar = aVar3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_ara_failed_reason", e10.toString());
                C6514M m11 = C6514M.f71813a;
                aVar.b("gps_ara_failed", bundle2);
            } catch (Error e11) {
                Log.w(f29379b, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                C4232a aVar4 = f29381d;
                if (aVar4 == null) {
                    C6496s.v("gpsDebugLogger");
                } else {
                    aVar = aVar4;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString("gps_ara_failed_reason", e11.toString());
                C6514M m12 = C6514M.f71813a;
                aVar.b("gps_ara_failed", bundle3);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void i(String str, C4028e eVar) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(str, "applicationId");
                C6496s.h(eVar, "event");
                I.t().execute(new b(str, eVar));
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }
}
