package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: com.google.android.gms.measurement.internal.f2  reason: case insensitive filesystem */
class C4607f2 extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final q5 f55071a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f55072b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f55073c;

    C4607f2(q5 q5Var) {
        C4536s.l(q5Var);
        this.f55071a = q5Var;
    }

    public final void b() {
        this.f55071a.q0();
        this.f55071a.zzl().i();
        if (!this.f55072b) {
            this.f55071a.zza().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f55073c = this.f55071a.g0().v();
            this.f55071a.zzj().F().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f55073c));
            this.f55072b = true;
        }
    }

    public final void c() {
        this.f55071a.q0();
        this.f55071a.zzl().i();
        this.f55071a.zzl().i();
        if (this.f55072b) {
            this.f55071a.zzj().F().a("Unregistering connectivity change receiver");
            this.f55072b = false;
            this.f55073c = false;
            try {
                this.f55071a.zza().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f55071a.zzj().B().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.f55071a.q0();
        String action = intent.getAction();
        this.f55071a.zzj().F().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean v10 = this.f55071a.g0().v();
            if (this.f55073c != v10) {
                this.f55073c = v10;
                this.f55071a.zzl().y(new C4600e2(this, v10));
                return;
            }
            return;
        }
        this.f55071a.zzj().G().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
