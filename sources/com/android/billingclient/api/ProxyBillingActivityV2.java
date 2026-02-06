package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.C1554j;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zze;
import g.C1998a;
import g.C2000c;
import g.C2004g;
import h.C2016e;

@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends C1554j {

    /* renamed from: a  reason: collision with root package name */
    private C2000c f38166a;

    /* renamed from: b  reason: collision with root package name */
    private C2000c f38167b;

    /* renamed from: c  reason: collision with root package name */
    private ResultReceiver f38168c;

    /* renamed from: d  reason: collision with root package name */
    private ResultReceiver f38169d;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38166a = registerForActivityResult(new C2016e(), new T(this));
        this.f38167b = registerForActivityResult(new C2016e(), new U(this));
        if (bundle == null) {
            zze.zzk("ProxyBillingActivityV2", "Launching Play Store billing dialog");
            if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
                this.f38168c = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                this.f38166a.b(new C2004g.a((PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")).a());
            } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
                this.f38169d = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                this.f38167b.b(new C2004g.a((PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent")).a());
            }
        } else if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
            this.f38168c = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
        } else if (bundle.containsKey("external_payment_dialog_result_receiver")) {
            this.f38169d = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f38168c;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f38169d;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void s(C1998a aVar) {
        Bundle bundle;
        Intent a10 = aVar.a();
        int b10 = zze.zzf(a10, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f38168c;
        if (resultReceiver != null) {
            if (a10 == null) {
                bundle = null;
            } else {
                bundle = a10.getExtras();
            }
            resultReceiver.send(b10, bundle);
        }
        if (!(aVar.b() == -1 && b10 == 0)) {
            int b11 = aVar.b();
            zze.zzl("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + b11 + " and billing's responseCode: " + b10);
        }
        finish();
    }

    /* access modifiers changed from: package-private */
    public final void t(C1998a aVar) {
        Bundle bundle;
        Intent a10 = aVar.a();
        int b10 = zze.zzf(a10, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f38169d;
        if (resultReceiver != null) {
            if (a10 == null) {
                bundle = null;
            } else {
                bundle = a10.getExtras();
            }
            resultReceiver.send(b10, bundle);
        }
        if (!(aVar.b() == -1 && b10 == 0)) {
            zze.zzl("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", new Object[]{Integer.valueOf(aVar.b()), Integer.valueOf(b10)}));
        }
        finish();
    }
}
