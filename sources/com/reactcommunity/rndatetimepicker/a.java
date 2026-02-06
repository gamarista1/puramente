package com.reactcommunity.rndatetimepicker;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public final /* synthetic */ class a implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AlertDialog f59187a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f59188b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bundle f59189c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f59190d;

    public /* synthetic */ a(AlertDialog alertDialog, Context context, Bundle bundle, boolean z10) {
        this.f59187a = alertDialog;
        this.f59188b = context;
        this.f59189c = bundle;
        this.f59190d = z10;
    }

    public final void onShow(DialogInterface dialogInterface) {
        b.i(this.f59187a, this.f59188b, this.f59189c, this.f59190d, dialogInterface);
    }
}
