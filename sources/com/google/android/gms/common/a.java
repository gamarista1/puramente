package com.google.android.gms.common;

import Ea.i;
import Ea.n;
import Ga.C4290b;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ProgressBar;
import androidx.core.app.o;
import androidx.fragment.app.C1773v;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C4498j;
import com.google.android.gms.common.api.internal.S;
import com.google.android.gms.common.api.internal.T;
import com.google.android.gms.common.api.internal.X;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.internal.F;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import wa.b;
import wa.c;
import ya.C5285b;
import ya.j;

public class a extends b {

    /* renamed from: d  reason: collision with root package name */
    public static final int f53899d = b.f54100a;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f53900e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static final a f53901f = new a();

    /* renamed from: c  reason: collision with root package name */
    private String f53902c;

    public static a o() {
        return f53901f;
    }

    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    public PendingIntent c(Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    public final String e(int i10) {
        return super.e(i10);
    }

    public int g(Context context) {
        return super.g(context);
    }

    public int h(Context context, int i10) {
        return super.h(context, i10);
    }

    public final boolean j(int i10) {
        return super.j(i10);
    }

    public Dialog l(Activity activity, int i10, int i11) {
        return m(activity, i10, i11, (DialogInterface.OnCancelListener) null);
    }

    public Dialog m(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return s(activity, i10, I.b(activity, b(activity, i10, "d"), i11), onCancelListener, (DialogInterface.OnClickListener) null);
    }

    public PendingIntent n(Context context, ConnectionResult connectionResult) {
        if (connectionResult.r0()) {
            return connectionResult.q0();
        }
        return c(context, connectionResult.o0(), 0);
    }

    public Task p(Activity activity) {
        int i10 = f53899d;
        C4536s.e("makeGooglePlayServicesAvailable must be called from the main thread");
        int h10 = h(activity, i10);
        if (h10 == 0) {
            return Tasks.forResult(null);
        }
        X i11 = X.i(activity);
        i11.h(new ConnectionResult(h10, (PendingIntent) null), 0);
        return i11.j();
    }

    public boolean q(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m10 = m(activity, i10, i11, onCancelListener);
        if (m10 == null) {
            return false;
        }
        v(activity, m10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void r(Context context, int i10) {
        w(context, i10, (String) null, d(context, i10, 0, "n"));
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.DialogInterface$OnClickListener] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog s(android.content.Context r6, int r7, com.google.android.gms.common.internal.I r8, android.content.DialogInterface.OnCancelListener r9, android.content.DialogInterface.OnClickListener r10) {
        /*
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r3 = 16843529(0x1010309, float:2.3695736E-38)
            r4 = 1
            r2.resolveAttribute(r3, r1, r4)
            android.content.res.Resources r2 = r6.getResources()
            int r1 = r1.resourceId
            java.lang.String r1 = r2.getResourceEntryName(r1)
            java.lang.String r2 = "Theme.Dialog.Alert"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002c
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r1 = 5
            r0.<init>(r6, r1)
        L_0x002c:
            if (r0 != 0) goto L_0x0033
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r6)
        L_0x0033:
            java.lang.String r1 = com.google.android.gms.common.internal.F.c(r6, r7)
            r0.setMessage(r1)
            if (r9 == 0) goto L_0x003f
            r0.setOnCancelListener(r9)
        L_0x003f:
            java.lang.String r9 = com.google.android.gms.common.internal.F.b(r6, r7)
            if (r9 == 0) goto L_0x004b
            if (r8 != 0) goto L_0x0048
            r8 = r10
        L_0x0048:
            r0.setPositiveButton(r9, r8)
        L_0x004b:
            java.lang.String r6 = com.google.android.gms.common.internal.F.f(r6, r7)
            if (r6 == 0) goto L_0x0054
            r0.setTitle(r6)
        L_0x0054:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r7 = "Creating dialog for Google Play services availability issue. ConnectionResult=%s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            java.lang.String r8 = "GoogleApiAvailability"
            android.util.Log.w(r8, r6, r7)
            android.app.AlertDialog r6 = r0.create()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.a.s(android.content.Context, int, com.google.android.gms.common.internal.I, android.content.DialogInterface$OnCancelListener, android.content.DialogInterface$OnClickListener):android.app.Dialog");
    }

    public final Dialog t(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(F.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        v(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final T u(Context context, S s10) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        T t10 = new T(s10);
        zao.zaa(context, t10, intentFilter);
        t10.a(context);
        if (i(context, "com.google.android.gms")) {
            return t10;
        }
        s10.a();
        t10.b();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void v(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof C1773v) {
                j.U(dialog, onCancelListener).T(((C1773v) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        C5285b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* access modifiers changed from: package-private */
    public final void w(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i10), null}), new IllegalArgumentException());
        if (i10 == 18) {
            x(context);
        } else if (pendingIntent != null) {
            String e10 = F.e(context, i10);
            String d10 = F.d(context, i10);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) C4536s.l(context.getSystemService("notification"));
            o.f H10 = new o.f(context).w(true).f(true).o(e10).H(new o.d().h(d10));
            if (i.c(context)) {
                C4536s.o(n.e());
                H10.F(context.getApplicationInfo().icon).A(2);
                if (i.d(context)) {
                    H10.a(b.f62051a, resources.getString(c.f62070o), pendingIntent);
                } else {
                    H10.m(pendingIntent);
                }
            } else {
                H10.F(17301642).J(resources.getString(c.f62063h)).O(System.currentTimeMillis()).m(pendingIntent).n(d10);
            }
            if (n.h()) {
                C4536s.o(n.h());
                synchronized (f53900e) {
                    str2 = this.f53902c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel a10 = notificationManager.getNotificationChannel(str2);
                    String string = context.getResources().getString(c.f62062g);
                    if (a10 == null) {
                        notificationManager.createNotificationChannel(s5.i.a(str2, string, 4));
                    } else if (!string.contentEquals(a10.getName())) {
                        a10.setName(string);
                        notificationManager.createNotificationChannel(a10);
                    }
                }
                H10.i(str2);
            }
            Notification c10 = H10.c();
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                d.f54104b.set(false);
                i11 = 10436;
            } else {
                i11 = 39789;
            }
            notificationManager.notify(i11, c10);
        } else if (i10 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void x(Context context) {
        new e(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    public final boolean y(Activity activity, C4498j jVar, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog s10 = s(activity, i10, I.c(jVar, b(activity, i10, "d"), 2), onCancelListener, (DialogInterface.OnClickListener) null);
        if (s10 == null) {
            return false;
        }
        v(activity, s10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean z(Context context, ConnectionResult connectionResult, int i10) {
        PendingIntent n10;
        if (C4290b.a(context) || (n10 = n(context, connectionResult)) == null) {
            return false;
        }
        w(context, connectionResult.o0(), (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, n10, i10, true), zap.zaa | 134217728));
        return true;
    }
}
