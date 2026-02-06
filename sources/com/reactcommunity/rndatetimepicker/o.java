package com.reactcommunity.rndatetimepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.fragment.app.C1767o;
import androidx.fragment.app.C1773v;

public class o extends C1767o {

    /* renamed from: q  reason: collision with root package name */
    private TimePickerDialog f59220q;

    /* renamed from: r  reason: collision with root package name */
    private TimePickerDialog.OnTimeSetListener f59221r;

    /* renamed from: s  reason: collision with root package name */
    private DialogInterface.OnDismissListener f59222s;

    /* renamed from: t  reason: collision with root package name */
    private DialogInterface.OnClickListener f59223t;

    private TimePickerDialog U(Bundle bundle) {
        boolean z10;
        C1773v activity = getActivity();
        TimePickerDialog V10 = V(bundle, activity, this.f59221r);
        if (bundle != null) {
            b.n(bundle, V10, this.f59223t);
            if (activity != null) {
                if (b.g(bundle) == p.SPINNER) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                V10.setOnShowListener(b.m(activity, V10, bundle, z10));
            }
        }
        return V10;
    }

    static TimePickerDialog V(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        int i10;
        f fVar = new f(bundle);
        int b10 = fVar.b();
        int c10 = fVar.c();
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        if (bundle != null) {
            is24HourFormat = bundle.getBoolean("is24Hour", DateFormat.is24HourFormat(context));
        }
        boolean z10 = is24HourFormat;
        if (bundle == null || !d.g(bundle.getInt("minuteInterval"))) {
            i10 = 1;
        } else {
            i10 = bundle.getInt("minuteInterval");
        }
        int i11 = i10;
        p g10 = b.g(bundle);
        if (g10 != p.SPINNER) {
            return new n(context, onTimeSetListener, b10, c10, i11, z10, g10);
        }
        return new n(context, e.f59207b, onTimeSetListener, b10, c10, i11, z10, g10);
    }

    public Dialog K(Bundle bundle) {
        TimePickerDialog U10 = U(getArguments());
        this.f59220q = U10;
        return U10;
    }

    public void W(DialogInterface.OnDismissListener onDismissListener) {
        this.f59222s = onDismissListener;
    }

    /* access modifiers changed from: package-private */
    public void X(DialogInterface.OnClickListener onClickListener) {
        this.f59223t = onClickListener;
    }

    public void Y(TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.f59221r = onTimeSetListener;
    }

    public void Z(Bundle bundle) {
        f fVar = new f(bundle);
        this.f59220q.updateTime(fVar.b(), fVar.c());
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f59222s;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
