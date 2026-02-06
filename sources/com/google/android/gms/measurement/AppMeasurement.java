package com.google.android.gms.measurement;

import Pa.n;
import Pa.w;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.measurement.internal.E2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {

    /* renamed from: b  reason: collision with root package name */
    private static volatile AppMeasurement f54417b;

    /* renamed from: a  reason: collision with root package name */
    private final a f54418a;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        ConditionalUserProperty(Bundle bundle) {
            C4536s.l(bundle);
            Class<String> cls = String.class;
            this.mAppId = (String) n.a(bundle, "app_id", cls, (Object) null);
            this.mOrigin = (String) n.a(bundle, "origin", cls, (Object) null);
            this.mName = (String) n.a(bundle, "name", cls, (Object) null);
            this.mValue = n.a(bundle, "value", Object.class, (Object) null);
            this.mTriggerEventName = (String) n.a(bundle, "trigger_event_name", cls, (Object) null);
            Class<Long> cls2 = Long.class;
            this.mTriggerTimeout = ((Long) n.a(bundle, "trigger_timeout", cls2, 0L)).longValue();
            this.mTimedOutEventName = (String) n.a(bundle, "timed_out_event_name", cls, (Object) null);
            Class<Bundle> cls3 = Bundle.class;
            this.mTimedOutEventParams = (Bundle) n.a(bundle, "timed_out_event_params", cls3, (Object) null);
            this.mTriggeredEventName = (String) n.a(bundle, "triggered_event_name", cls, (Object) null);
            this.mTriggeredEventParams = (Bundle) n.a(bundle, "triggered_event_params", cls3, (Object) null);
            this.mTimeToLive = ((Long) n.a(bundle, "time_to_live", cls2, 0L)).longValue();
            this.mExpiredEventName = (String) n.a(bundle, "expired_event_name", cls, (Object) null);
            this.mExpiredEventParams = (Bundle) n.a(bundle, "expired_event_params", cls3, (Object) null);
            this.mActive = ((Boolean) n.a(bundle, AppStateModule.APP_STATE_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) n.a(bundle, "creation_timestamp", cls2, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) n.a(bundle, "triggered_timestamp", cls2, 0L)).longValue();
        }
    }

    private static abstract class a implements w {
        private a() {
        }
    }

    private AppMeasurement(E2 e22) {
        this.f54418a = new b(e22);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static Pa.w a(android.content.Context r4, android.os.Bundle r5) {
        /*
            r5 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r0 = com.google.firebase.analytics.FirebaseAnalytics.class
            java.lang.String r1 = "getScionFrontendApiImplementation"
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3}     // Catch:{  }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{  }
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}     // Catch:{  }
            java.lang.Object r4 = r0.invoke(r5, r4)     // Catch:{  }
            Pa.w r4 = (Pa.w) r4     // Catch:{  }
            return r4
        L_0x001c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.a(android.content.Context, android.os.Bundle):Pa.w");
    }

    private static AppMeasurement b(Context context, String str, String str2) {
        if (f54417b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f54417b == null) {
                        w a10 = a(context, (Bundle) null);
                        if (a10 != null) {
                            f54417b = new AppMeasurement(a10);
                        } else {
                            f54417b = new AppMeasurement(E2.a(context, new zzdo(0, 0, true, (String) null, (String) null, (String) null, (Bundle) null, (String) null), (Long) null));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f54417b;
    }

    @Deprecated
    @Keep
    public static AppMeasurement getInstance(Context context) {
        return b(context, (String) null, (String) null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f54418a.zzb(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f54418a.a(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f54418a.zzc(str);
    }

    @Keep
    public long generateEventId() {
        return this.f54418a.zzf();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f54418a.zzg();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int i10;
        List<Bundle> b10 = this.f54418a.b(str, str2);
        if (b10 == null) {
            i10 = 0;
        } else {
            i10 = b10.size();
        }
        ArrayList arrayList = new ArrayList(i10);
        for (Bundle conditionalUserProperty : b10) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f54418a.zzh();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f54418a.zzi();
    }

    @Keep
    public String getGmpAppId() {
        return this.f54418a.zzj();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f54418a.zza(str);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f54418a.d(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f54418a.c(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C4536s.l(conditionalUserProperty);
        a aVar = this.f54418a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            n.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        aVar.zza(bundle);
    }

    private AppMeasurement(w wVar) {
        this.f54418a = new a(wVar);
    }
}
