package com.reactcommunity.rndatetimepicker;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TimePicker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class n extends d {
    public n(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i10, int i11, int i12, boolean z10, p pVar) {
        super(context, onTimeSetListener, i10, i11, i12, z10, pVar);
        n(context, i10, i11, z10, pVar);
    }

    private void n(Context context, int i10, int i11, boolean z10, p pVar) {
        Class<TimePicker> cls = TimePicker.class;
        if (Build.VERSION.SDK_INT == 24 && pVar == p.SPINNER) {
            try {
                context.obtainStyledAttributes((AttributeSet) null, (int[]) Class.forName("com.android.internal.R$styleable").getField("TimePicker").get((Object) null), 16843933, 0).recycle();
                TimePicker timePicker = (TimePicker) q.a(TimePickerDialog.class, cls, "mTimePicker").get(this);
                Field a10 = q.a(cls, Class.forName("android.widget.TimePicker$TimePickerDelegate"), "mDelegate");
                Object obj = a10.get(timePicker);
                Class<?> cls2 = Class.forName("android.widget.TimePickerSpinnerDelegate");
                if (obj.getClass() != cls2) {
                    a10.set(timePicker, (Object) null);
                    timePicker.removeAllViews();
                    Class cls3 = Integer.TYPE;
                    Constructor<?> constructor = cls2.getConstructor(new Class[]{cls, Context.class, AttributeSet.class, cls3, cls3});
                    constructor.setAccessible(true);
                    a10.set(timePicker, constructor.newInstance(new Object[]{timePicker, context, null, 16843933, 0}));
                    timePicker.setIs24HourView(Boolean.valueOf(z10));
                    timePicker.setCurrentHour(Integer.valueOf(i10));
                    timePicker.setCurrentMinute(Integer.valueOf(i11));
                    timePicker.setOnTimeChangedListener(this);
                }
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public /* bridge */ /* synthetic */ void onClick(DialogInterface dialogInterface, int i10) {
        super.onClick(dialogInterface, i10);
    }

    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }

    public /* bridge */ /* synthetic */ void onTimeChanged(TimePicker timePicker, int i10, int i11) {
        super.onTimeChanged(timePicker, i10, i11);
    }

    public /* bridge */ /* synthetic */ void updateTime(int i10, int i11) {
        super.updateTime(i10, i11);
    }

    public n(Context context, int i10, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i11, int i12, int i13, boolean z10, p pVar) {
        super(context, i10, onTimeSetListener, i11, i12, i13, z10, pVar);
        n(context, i11, i12, z10, pVar);
    }
}
