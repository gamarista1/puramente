package com.reactcommunity.rndatetimepicker;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.C1767o;
import androidx.fragment.app.C1773v;
import java.util.Calendar;
import java.util.Locale;

@SuppressLint({"ValidFragment"})
public class i extends C1767o {

    /* renamed from: q  reason: collision with root package name */
    private DatePickerDialog f59213q;

    /* renamed from: r  reason: collision with root package name */
    private DatePickerDialog.OnDateSetListener f59214r;

    /* renamed from: s  reason: collision with root package name */
    private DialogInterface.OnDismissListener f59215s;

    /* renamed from: t  reason: collision with root package name */
    private DialogInterface.OnClickListener f59216t;

    private DatePickerDialog V(Bundle bundle) {
        boolean z10;
        C1773v activity = getActivity();
        DatePickerDialog W10 = W(bundle, activity, this.f59214r);
        if (bundle != null) {
            b.n(bundle, W10, this.f59216t);
            if (activity != null) {
                if (b.f(bundle) == j.SPINNER) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                W10.setOnShowListener(b.m(activity, W10, bundle, z10));
            }
        }
        DatePicker datePicker = W10.getDatePicker();
        long k10 = b.k(bundle);
        long j10 = b.j(bundle);
        if (bundle.containsKey("minimumDate")) {
            datePicker.setMinDate(k10);
        } else {
            datePicker.setMinDate(-2208988800001L);
        }
        if (bundle.containsKey("maximumDate")) {
            datePicker.setMaxDate(j10);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (bundle.containsKey("firstDayOfWeek")) {
            datePicker.setFirstDayOfWeek(bundle.getInt("firstDayOfWeek"));
        }
        if (i10 >= 26 && (bundle.containsKey("maximumDate") || bundle.containsKey("minimumDate"))) {
            datePicker.setOnDateChangedListener(new h(bundle, k10, j10, datePicker));
        }
        if (bundle.containsKey("testID")) {
            datePicker.setTag(bundle.getString("testID"));
        }
        return W10;
    }

    static DatePickerDialog W(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        j jVar;
        f fVar = new f(bundle);
        int e10 = fVar.e();
        int d10 = fVar.d();
        int a10 = fVar.a();
        j f10 = b.f(bundle);
        if (bundle == null || bundle.getString("display", (String) null) == null) {
            jVar = f10;
        } else {
            jVar = j.valueOf(bundle.getString("display").toUpperCase(Locale.US));
        }
        if (jVar != j.SPINNER) {
            return new m(context, onDateSetListener, e10, d10, a10, jVar);
        }
        return new m(context, e.f59206a, onDateSetListener, e10, d10, a10, jVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void X(Bundle bundle, long j10, long j11, DatePicker datePicker, DatePicker datePicker2, int i10, int i11, int i12) {
        Calendar instance = Calendar.getInstance(b.h(bundle));
        instance.set(i10, i11, i12, 0, 0, 0);
        long j12 = j10;
        long j13 = j11;
        instance.setTimeInMillis(Math.min(Math.max(instance.getTimeInMillis(), j10), j11));
        if (datePicker.getYear() != instance.get(1) || datePicker.getMonth() != instance.get(2) || datePicker.getDayOfMonth() != instance.get(5)) {
            DatePicker datePicker3 = datePicker;
            datePicker.updateDate(instance.get(1), instance.get(2), instance.get(5));
        }
    }

    public Dialog K(Bundle bundle) {
        DatePickerDialog V10 = V(getArguments());
        this.f59213q = V10;
        return V10;
    }

    /* access modifiers changed from: package-private */
    public void Y(DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f59214r = onDateSetListener;
    }

    /* access modifiers changed from: package-private */
    public void Z(DialogInterface.OnDismissListener onDismissListener) {
        this.f59215s = onDismissListener;
    }

    /* access modifiers changed from: package-private */
    public void a0(DialogInterface.OnClickListener onClickListener) {
        this.f59216t = onClickListener;
    }

    public void b0(Bundle bundle) {
        f fVar = new f(bundle);
        this.f59213q.updateDate(fVar.e(), fVar.d(), fVar.a());
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f59215s;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
