package com.google.android.gms.common.internal;

import Ea.i;
import Ga.C4293e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.Y;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.Locale;
import u1.e;
import wa.c;
import ya.C5291h;

public abstract class F {

    /* renamed from: a  reason: collision with root package name */
    private static final Y f54113a = new Y();

    /* renamed from: b  reason: collision with root package name */
    private static Locale f54114b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C4293e.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 == 1) {
            return resources.getString(c.f62059d);
        }
        if (i10 == 2) {
            return resources.getString(c.f62065j);
        }
        if (i10 != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(c.f62056a);
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 == 1) {
            return resources.getString(c.f62060e, new Object[]{a10});
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return resources.getString(c.f62057b, new Object[]{a10});
            }
            if (i10 == 5) {
                return g(context, "common_google_play_services_invalid_account_text", a10);
            }
            if (i10 == 7) {
                return g(context, "common_google_play_services_network_error_text", a10);
            }
            if (i10 == 9) {
                return resources.getString(c.f62064i, new Object[]{a10});
            }
            if (i10 == 20) {
                return g(context, "common_google_play_services_restricted_profile_text", a10);
            }
            switch (i10) {
                case 16:
                    return g(context, "common_google_play_services_api_unavailable_text", a10);
                case 17:
                    return g(context, "common_google_play_services_sign_in_failed_text", a10);
                case 18:
                    return resources.getString(c.f62068m, new Object[]{a10});
                default:
                    return resources.getString(C5291h.f62281a, new Object[]{a10});
            }
        } else if (i.d(context)) {
            return resources.getString(c.f62069n);
        } else {
            return resources.getString(c.f62066k, new Object[]{a10});
        }
    }

    public static String d(Context context, int i10) {
        if (i10 == 6 || i10 == 19) {
            return g(context, "common_google_play_services_resolution_required_text", a(context));
        }
        return c(context, i10);
    }

    public static String e(Context context, int i10) {
        String str;
        if (i10 == 6) {
            str = h(context, "common_google_play_services_resolution_required_title");
        } else {
            str = f(context, i10);
        }
        if (str == null) {
            return context.getResources().getString(c.f62063h);
        }
        return str;
    }

    public static String f(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(c.f62061f);
            case 2:
                return resources.getString(c.f62067l);
            case 3:
                return resources.getString(c.f62058c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case InboxPagingSource.PAGE_SIZE /*20*/:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i10);
                return null;
        }
    }

    private static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h10 = h(context, str);
        if (h10 == null) {
            h10 = resources.getString(C5291h.f62281a);
        }
        return String.format(resources.getConfiguration().locale, h10, new Object[]{str2});
    }

    private static String h(Context context, String str) {
        Y y10 = f54113a;
        synchronized (y10) {
            try {
                Locale c10 = e.a(context.getResources().getConfiguration()).c(0);
                if (!c10.equals(f54114b)) {
                    y10.clear();
                    f54114b = c10;
                }
                String str2 = (String) y10.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources e10 = com.google.android.gms.common.c.e(context);
                if (e10 == null) {
                    return null;
                }
                int identifier = e10.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = e10.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                    return null;
                }
                y10.put(str, string);
                return string;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
