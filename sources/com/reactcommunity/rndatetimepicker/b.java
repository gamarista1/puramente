package com.reactcommunity.rndatetimepicker;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;
import androidx.core.content.c;
import androidx.fragment.app.C1767o;
import androidx.fragment.app.C1773v;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import java.util.Calendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public abstract class b {
    public static Bundle b(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("value") && !readableMap.isNull("value")) {
            bundle.putLong("value", (long) readableMap.getDouble("value"));
        }
        if (readableMap.hasKey("timeZoneName") && !readableMap.isNull("timeZoneName")) {
            bundle.putString("timeZoneName", readableMap.getString("timeZoneName"));
        }
        return bundle;
    }

    public static void c(C1773v vVar, String str, Promise promise) {
        boolean z10;
        if (vVar == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to close a " + str + " dialog while not attached to an Activity");
            return;
        }
        try {
            C1767o oVar = (C1767o) vVar.getSupportFragmentManager().l0(str);
            if (oVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                oVar.F();
            }
            promise.resolve(Boolean.valueOf(z10));
        } catch (Exception e10) {
            promise.reject((Throwable) e10);
        }
    }

    private static Integer d(Bundle bundle, String str) {
        Bundle bundle2;
        int i10;
        Bundle bundle3 = bundle.getBundle("dialogButtons");
        if (bundle3 == null || (bundle2 = bundle3.getBundle(str)) == null || (i10 = (int) bundle2.getDouble("textColor", 0.0d)) == 0) {
            return null;
        }
        return Integer.valueOf(i10);
    }

    public static int e(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842806, typedValue, true);
        int i10 = typedValue.resourceId;
        if (i10 != 0) {
            return c.getColor(context, i10);
        }
        return typedValue.data;
    }

    public static j f(Bundle bundle) {
        j jVar = j.DEFAULT;
        if (bundle == null || bundle.getString("display", (String) null) == null) {
            return jVar;
        }
        return j.valueOf(bundle.getString("display").toUpperCase(Locale.US));
    }

    public static p g(Bundle bundle) {
        p pVar = p.DEFAULT;
        if (bundle == null || bundle.getString("display", (String) null) == null) {
            return pVar;
        }
        return p.valueOf(bundle.getString("display").toUpperCase(Locale.US));
    }

    public static TimeZone h(Bundle bundle) {
        if (bundle != null && bundle.containsKey("timeZoneOffsetInMinutes")) {
            return new SimpleTimeZone(((int) bundle.getLong("timeZoneOffsetInMinutes")) * 60000, "GMT");
        }
        if (bundle != null && bundle.containsKey("timeZoneName")) {
            String string = bundle.getString("timeZoneName");
            if ("GMT".equals(string)) {
                return TimeZone.getTimeZone("GMT");
            }
            if (!"GMT".equals(TimeZone.getTimeZone(string).getID())) {
                return TimeZone.getTimeZone(string);
            }
            l8.c.d((ReactContext) null, "'" + string + "' does not exist in TimeZone.getAvailableIDs(). Falling back to TimeZone.getDefault()=" + TimeZone.getDefault().getID());
        }
        return TimeZone.getDefault();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void i(AlertDialog alertDialog, Context context, Bundle bundle, boolean z10, DialogInterface dialogInterface) {
        Button button = alertDialog.getButton(-1);
        Button button2 = alertDialog.getButton(-2);
        Button button3 = alertDialog.getButton(-3);
        int e10 = e(context);
        o(button, "positive", bundle, z10, e10);
        o(button2, "negative", bundle, z10, e10);
        o(button3, "neutral", bundle, z10, e10);
    }

    public static long j(Bundle bundle) {
        if (!bundle.containsKey("maximumDate")) {
            return Long.MAX_VALUE;
        }
        Calendar instance = Calendar.getInstance(h(bundle));
        instance.setTimeInMillis(bundle.getLong("maximumDate"));
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        instance.set(14, 999);
        return instance.getTimeInMillis();
    }

    public static long k(Bundle bundle) {
        if (!bundle.containsKey("minimumDate")) {
            return 0;
        }
        Calendar instance = Calendar.getInstance(h(bundle));
        instance.setTimeInMillis(bundle.getLong("minimumDate"));
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    private static void l(Bundle bundle, AlertDialog alertDialog, int i10, DialogInterface.OnClickListener onClickListener) {
        if (bundle != null && bundle.getString("label") != null) {
            alertDialog.setButton(i10, bundle.getString("label"), onClickListener);
        }
    }

    public static DialogInterface.OnShowListener m(Context context, AlertDialog alertDialog, Bundle bundle, boolean z10) {
        return new a(alertDialog, context, bundle, z10);
    }

    public static void n(Bundle bundle, AlertDialog alertDialog, DialogInterface.OnClickListener onClickListener) {
        Bundle bundle2 = bundle.getBundle("dialogButtons");
        if (bundle2 != null) {
            l(bundle2.getBundle("neutral"), alertDialog, -3, onClickListener);
            DialogInterface.OnClickListener onClickListener2 = (DialogInterface.OnClickListener) alertDialog;
            l(bundle2.getBundle("positive"), alertDialog, -1, onClickListener2);
            l(bundle2.getBundle("negative"), alertDialog, -2, onClickListener2);
        }
    }

    private static void o(Button button, String str, Bundle bundle, boolean z10, int i10) {
        if (button != null) {
            Integer d10 = d(bundle, str);
            if (z10 || d10 != null) {
                if (d10 != null) {
                    i10 = d10.intValue();
                }
                button.setTextColor(i10);
            }
        }
    }
}
