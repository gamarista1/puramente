package com.reactcommunity.rndatetimepicker;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import java.util.ArrayList;

abstract class d extends TimePickerDialog {

    /* renamed from: a  reason: collision with root package name */
    private TimePicker f59195a;

    /* renamed from: b  reason: collision with root package name */
    private int f59196b;

    /* renamed from: c  reason: collision with root package name */
    private p f59197c;

    /* renamed from: d  reason: collision with root package name */
    private final TimePickerDialog.OnTimeSetListener f59198d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f59199e = new Handler();

    /* renamed from: f  reason: collision with root package name */
    private Runnable f59200f;

    /* renamed from: g  reason: collision with root package name */
    private Context f59201g;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f59202a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TimePicker f59203b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59204c;

        a(int i10, TimePicker timePicker, int i11) {
            this.f59202a = i10;
            this.f59203b = timePicker;
            this.f59204c = i11;
        }

        private void a() {
            this.f59203b.setHour(this.f59204c);
            this.f59203b.setMinute(this.f59202a);
        }

        private void b() {
            View findFocus = this.f59203b.findFocus();
            if (findFocus instanceof EditText) {
                EditText editText = (EditText) findFocus;
                editText.setSelection(editText.getText().length());
                return;
            }
            Log.e("RN-datetimepicker", "could not set selection on time picker, this is a known issue on some Huawei devices");
        }

        public void run() {
            if (!d.this.i()) {
                a();
            } else if (this.f59202a > 5) {
                a();
                b();
            }
        }
    }

    public d(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i10, int i11, int i12, boolean z10, p pVar) {
        super(context, onTimeSetListener, i10, i11, z10);
        this.f59196b = i12;
        this.f59198d = onTimeSetListener;
        this.f59197c = pVar;
        this.f59201g = context;
    }

    private void b(String str) {
        if (f()) {
            throw new RuntimeException(str);
        }
    }

    private void c(TimePicker timePicker, int i10, int i11) {
        b("spinner never needs to be corrected because wrong values are not offered to user (both in scrolling and textInput mode)!");
        a aVar = new a(i11, timePicker, i10);
        this.f59200f = aVar;
        this.f59199e.postDelayed(aVar, 500);
    }

    private int d() {
        return e(this.f59195a.getCurrentMinute().intValue());
    }

    private int e(int i10) {
        if (f()) {
            return i10 * this.f59196b;
        }
        return i10;
    }

    private boolean f() {
        if (this.f59197c == p.SPINNER) {
            return true;
        }
        return false;
    }

    public static boolean g(int i10) {
        if (i10 < 1 || i10 > 30 || 60 % i10 != 0) {
            return false;
        }
        return true;
    }

    private boolean h(int i10) {
        b("minutesNeedCorrection is not intended to be used with spinner, spinner won't allow picking invalid values");
        if (!m() || i10 == l(i10)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public boolean i() {
        View findViewById = findViewById(this.f59201g.getResources().getIdentifier("input_mode", "id", "android"));
        if (findViewById == null || !findViewById.hasFocus()) {
            return false;
        }
        return true;
    }

    private void j() {
        NumberPicker numberPicker = (NumberPicker) findViewById(this.f59201g.getResources().getIdentifier("minute", "id", "android"));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue((60 / this.f59196b) - 1);
        ArrayList arrayList = new ArrayList(60 / this.f59196b);
        int i10 = 0;
        while (i10 < 60) {
            arrayList.add(String.format("%02d", new Object[]{Integer.valueOf(i10)}));
            i10 += this.f59196b;
        }
        numberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
    }

    private void k() {
        TimePicker timePicker = this.f59195a;
        if (timePicker == null) {
            Log.e("RN-datetimepicker", "time picker was null");
            return;
        }
        int intValue = timePicker.getCurrentMinute().intValue();
        if (f()) {
            j();
            this.f59195a.setCurrentMinute(Integer.valueOf(l(intValue) / this.f59196b));
            return;
        }
        this.f59195a.setCurrentMinute(Integer.valueOf(l(intValue)));
    }

    private int l(int i10) {
        int round = Math.round(((float) i10) / ((float) this.f59196b));
        int i11 = this.f59196b;
        int i12 = round * i11;
        if (i12 == 60) {
            return i12 - i11;
        }
        return i12;
    }

    private boolean m() {
        if (this.f59196b != 1) {
            return true;
        }
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59195a = (TimePicker) findViewById(this.f59201g.getResources().getIdentifier("timePicker", "id", "android"));
        if (m()) {
            k();
        }
    }

    public void onClick(DialogInterface dialogInterface, int i10) {
        boolean z10;
        if (m() || f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        TimePicker timePicker = this.f59195a;
        if (timePicker == null || i10 != -1 || !z10) {
            super.onClick(dialogInterface, i10);
            return;
        }
        timePicker.clearFocus();
        int intValue = this.f59195a.getCurrentHour().intValue();
        int d10 = d();
        if (m()) {
            d10 = l(d10);
        }
        TimePickerDialog.OnTimeSetListener onTimeSetListener = this.f59198d;
        if (onTimeSetListener != null) {
            onTimeSetListener.onTimeSet(this.f59195a, intValue, d10);
        }
    }

    public void onDetachedFromWindow() {
        this.f59199e.removeCallbacks(this.f59200f);
        super.onDetachedFromWindow();
    }

    public void onTimeChanged(TimePicker timePicker, int i10, int i11) {
        int e10 = e(i11);
        this.f59199e.removeCallbacks(this.f59200f);
        if (f() || !h(e10)) {
            super.onTimeChanged(timePicker, i10, i11);
        } else {
            c(timePicker, i10, l(e10));
        }
    }

    public void updateTime(int i10, int i11) {
        if (!m()) {
            super.updateTime(i10, i11);
        } else if (f()) {
            super.updateTime(i10, l(d()) / this.f59196b);
        } else {
            super.updateTime(i10, l(i11));
        }
    }

    public d(Context context, int i10, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i11, int i12, int i13, boolean z10, p pVar) {
        super(context, i10, onTimeSetListener, i11, i12, z10);
        this.f59196b = i13;
        this.f59198d = onTimeSetListener;
        this.f59197c = pVar;
        this.f59201g = context;
    }
}
