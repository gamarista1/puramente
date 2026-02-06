package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.DatePicker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class m extends DatePickerDialog {
    public m(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i10, int i11, int i12, j jVar) {
        super(context, onDateSetListener, i10, i11, i12);
        a(context, i10, i11, i12, jVar);
    }

    private void a(Context context, int i10, int i11, int i12, j jVar) {
        Class<DatePicker> cls = DatePicker.class;
        if (Build.VERSION.SDK_INT == 24 && jVar == j.SPINNER) {
            try {
                context.obtainStyledAttributes((AttributeSet) null, (int[]) Class.forName("com.android.internal.R$styleable").getField("DatePicker").get((Object) null), 16843612, 0).recycle();
                DatePicker datePicker = (DatePicker) q.a(DatePickerDialog.class, cls, "mDatePicker").get(this);
                Field a10 = q.a(cls, Class.forName("android.widget.DatePickerSpinnerDelegate"), "mDelegate");
                Object obj = a10.get(datePicker);
                if (obj.getClass() != Class.forName("android.widget.DatePickerSpinnerDelegate")) {
                    a10.set(datePicker, (Object) null);
                    datePicker.removeAllViews();
                    Class cls2 = Integer.TYPE;
                    Method declaredMethod = cls.getDeclaredMethod("createSpinnerUIDelegate", new Class[]{Context.class, AttributeSet.class, cls2, cls2});
                    declaredMethod.setAccessible(true);
                    a10.set(datePicker, declaredMethod.invoke(datePicker, new Object[]{context, null, 16843612, 0}));
                    datePicker.setCalendarViewShown(false);
                    datePicker.init(i10, i11, i12, this);
                }
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
        if (jVar == j.SPINNER && getDatePicker() != null) {
            getDatePicker().setCalendarViewShown(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }

    public m(Context context, int i10, DatePickerDialog.OnDateSetListener onDateSetListener, int i11, int i12, int i13, j jVar) {
        super(context, i10, onDateSetListener, i11, i12, i13);
        a(context, i11, i12, i13, jVar);
    }
}
