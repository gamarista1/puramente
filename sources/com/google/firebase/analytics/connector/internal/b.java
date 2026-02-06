package com.google.firebase.analytics.connector.internal;

import Pa.n;
import Pa.s;
import Pa.x;
import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.C4536s;
import com.google.common.collect.C4770v;
import com.google.common.collect.C4773y;
import xb.C5276a;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final C4773y f56856a = C4773y.P("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b  reason: collision with root package name */
    private static final C4770v f56857b = C4770v.Q("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c  reason: collision with root package name */
    private static final C4770v f56858c = C4770v.N("auto", "app", "am");

    /* renamed from: d  reason: collision with root package name */
    private static final C4770v f56859d = C4770v.I("_r", "_dbg");

    /* renamed from: e  reason: collision with root package name */
    private static final C4770v f56860e = new C4770v.a().i(s.f52152a).i(s.f52153b).k();

    /* renamed from: f  reason: collision with root package name */
    private static final C4770v f56861f = C4770v.I("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle a(C5276a.C0916a aVar) {
        Bundle bundle = new Bundle();
        String str = aVar.f62201a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = aVar.f62202b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = aVar.f62203c;
        if (obj != null) {
            n.b(bundle, obj);
        }
        String str3 = aVar.f62204d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", aVar.f62205e);
        String str4 = aVar.f62206f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = aVar.f62207g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = aVar.f62208h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = aVar.f62209i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", aVar.f62210j);
        String str6 = aVar.f62211k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = aVar.f62212l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", aVar.f62213m);
        bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, aVar.f62214n);
        bundle.putLong("triggered_timestamp", aVar.f62215o);
        return bundle;
    }

    public static C5276a.C0916a b(Bundle bundle) {
        C4536s.l(bundle);
        C5276a.C0916a aVar = new C5276a.C0916a();
        Class<String> cls = String.class;
        aVar.f62201a = (String) C4536s.l((String) n.a(bundle, "origin", cls, (Object) null));
        aVar.f62202b = (String) C4536s.l((String) n.a(bundle, "name", cls, (Object) null));
        aVar.f62203c = n.a(bundle, "value", Object.class, (Object) null);
        aVar.f62204d = (String) n.a(bundle, "trigger_event_name", cls, (Object) null);
        Class<Long> cls2 = Long.class;
        aVar.f62205e = ((Long) n.a(bundle, "trigger_timeout", cls2, 0L)).longValue();
        aVar.f62206f = (String) n.a(bundle, "timed_out_event_name", cls, (Object) null);
        Class<Bundle> cls3 = Bundle.class;
        aVar.f62207g = (Bundle) n.a(bundle, "timed_out_event_params", cls3, (Object) null);
        aVar.f62208h = (String) n.a(bundle, "triggered_event_name", cls, (Object) null);
        aVar.f62209i = (Bundle) n.a(bundle, "triggered_event_params", cls3, (Object) null);
        aVar.f62210j = ((Long) n.a(bundle, "time_to_live", cls2, 0L)).longValue();
        aVar.f62211k = (String) n.a(bundle, "expired_event_name", cls, (Object) null);
        aVar.f62212l = (Bundle) n.a(bundle, "expired_event_params", cls3, (Object) null);
        aVar.f62214n = ((Boolean) n.a(bundle, AppStateModule.APP_STATE_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
        aVar.f62213m = ((Long) n.a(bundle, "creation_timestamp", cls2, 0L)).longValue();
        aVar.f62215o = ((Long) n.a(bundle, "triggered_timestamp", cls2, 0L)).longValue();
        return aVar;
    }

    public static void c(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }

    public static boolean d(String str, Bundle bundle) {
        if (f56857b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        C4770v vVar = f56859d;
        int size = vVar.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = vVar.get(i10);
            i10++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
            return false;
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
            return false;
        } else if (f56860e.contains(str2)) {
            return false;
        } else {
            C4770v vVar = f56861f;
            int size = vVar.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = vVar.get(i10);
                i10++;
                if (str2.matches((String) obj)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean f(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!h(str) || bundle == null) {
            return false;
        }
        C4770v vVar = f56859d;
        int size = vVar.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = vVar.get(i10);
            i10++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 101200:
                if (str.equals("fcm")) {
                    c10 = 0;
                    break;
                }
                break;
            case 101230:
                if (str.equals("fdl")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3142703:
                if (str.equals("fiam")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bundle.putString("_cis", "fcm_integration");
                return true;
            case 1:
                bundle.putString("_cis", "fdl_integration");
                return true;
            case 2:
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean g(C5276a.C0916a aVar) {
        String str;
        if (aVar == null || (str = aVar.f62201a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = aVar.f62203c;
        if ((obj != null && x.a(obj) == null) || !h(str) || !e(str, aVar.f62202b)) {
            return false;
        }
        String str2 = aVar.f62211k;
        if (str2 != null && (!d(str2, aVar.f62212l) || !f(str, aVar.f62211k, aVar.f62212l))) {
            return false;
        }
        String str3 = aVar.f62208h;
        if (str3 != null && (!d(str3, aVar.f62209i) || !f(str, aVar.f62208h, aVar.f62209i))) {
            return false;
        }
        String str4 = aVar.f62206f;
        if (str4 == null) {
            return true;
        }
        if (d(str4, aVar.f62207g) && f(str, aVar.f62206f, aVar.f62207g)) {
            return true;
        }
        return false;
    }

    public static boolean h(String str) {
        if (!f56858c.contains(str)) {
            return true;
        }
        return false;
    }
}
