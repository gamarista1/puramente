package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.metrics.MetricTracker;
import za.C5298a;
import za.c;

public final class ConnectionResult extends C5298a {
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new f();
    public static final int SUCCESS = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final ConnectionResult f53893e = new ConnectionResult(0);

    /* renamed from: a  reason: collision with root package name */
    final int f53894a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53895b;

    /* renamed from: c  reason: collision with root package name */
    private final PendingIntent f53896c;

    /* renamed from: d  reason: collision with root package name */
    private final String f53897d;

    ConnectionResult(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f53894a = i10;
        this.f53895b = i11;
        this.f53896c = pendingIntent;
        this.f53897d = str;
    }

    static String u0(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case StdKeyDeserializer.TYPE_URL:
                        return "TIMEOUT";
                    case StdKeyDeserializer.TYPE_CLASS:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case InboxPagingSource.PAGE_SIZE /*20*/:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        if (this.f53895b != connectionResult.f53895b || !C4535q.b(this.f53896c, connectionResult.f53896c) || !C4535q.b(this.f53897d, connectionResult.f53897d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(Integer.valueOf(this.f53895b), this.f53896c, this.f53897d);
    }

    public int o0() {
        return this.f53895b;
    }

    public String p0() {
        return this.f53897d;
    }

    public PendingIntent q0() {
        return this.f53896c;
    }

    public boolean r0() {
        return (this.f53895b == 0 || this.f53896c == null) ? false : true;
    }

    public boolean s0() {
        return this.f53895b == 0;
    }

    public void t0(Activity activity, int i10) {
        if (r0()) {
            PendingIntent pendingIntent = this.f53896c;
            C4536s.l(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, (Intent) null, 0, 0, 0);
        }
    }

    public String toString() {
        C4535q.a d10 = C4535q.d(this);
        d10.a("statusCode", u0(this.f53895b));
        d10.a("resolution", this.f53896c);
        d10.a(MetricTracker.Object.MESSAGE, this.f53897d);
        return d10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f53894a;
        int a10 = c.a(parcel);
        c.t(parcel, 1, i11);
        c.t(parcel, 2, o0());
        c.B(parcel, 3, q0(), i10, false);
        c.D(parcel, 4, p0(), false);
        c.b(parcel, a10);
    }

    public ConnectionResult(int i10) {
        this(i10, (PendingIntent) null, (String) null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, (String) null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }
}
