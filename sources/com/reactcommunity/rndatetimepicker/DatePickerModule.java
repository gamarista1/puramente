package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.C1773v;
import androidx.fragment.app.J;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Calendar;

@Q7.a(name = "RNCDatePicker")
public class DatePickerModule extends NativeModuleDatePickerSpec {
    public static final String NAME = "RNCDatePicker";

    private class a implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final Promise f59179a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f59180b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f59181c = false;

        public a(Promise promise, Bundle bundle) {
            this.f59179a = promise;
            this.f59180b = bundle;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            if (!this.f59181c && DatePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", "neutralButtonAction");
                this.f59179a.resolve(writableNativeMap);
                this.f59181c = true;
            }
        }

        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            if (!this.f59181c && DatePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                f fVar = new f(this.f59180b);
                Calendar instance = Calendar.getInstance(b.h(this.f59180b));
                instance.set(i10, i11, i12, fVar.b(), fVar.c(), 0);
                instance.set(14, 0);
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", "dateSetAction");
                writableNativeMap.putDouble(DiagnosticsEntry.TIMESTAMP_KEY, (double) instance.getTimeInMillis());
                writableNativeMap.putDouble("utcOffset", (double) ((instance.getTimeZone().getOffset(instance.getTimeInMillis()) / 1000) / 60));
                this.f59179a.resolve(writableNativeMap);
                this.f59181c = true;
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.f59181c && DatePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", "dismissedAction");
                this.f59179a.resolve(writableNativeMap);
                this.f59181c = true;
            }
        }
    }

    public DatePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle b10 = b.b(readableMap);
        if (readableMap.hasKey("minimumDate") && !readableMap.isNull("minimumDate")) {
            b10.putLong("minimumDate", (long) readableMap.getDouble("minimumDate"));
        }
        if (readableMap.hasKey("maximumDate") && !readableMap.isNull("maximumDate")) {
            b10.putLong("maximumDate", (long) readableMap.getDouble("maximumDate"));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            b10.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey("dialogButtons") && !readableMap.isNull("dialogButtons")) {
            b10.putBundle("dialogButtons", Arguments.toBundle(readableMap.getMap("dialogButtons")));
        }
        if (readableMap.hasKey("timeZoneOffsetInMinutes") && !readableMap.isNull("timeZoneOffsetInMinutes")) {
            b10.putLong("timeZoneOffsetInMinutes", (long) readableMap.getDouble("timeZoneOffsetInMinutes"));
        }
        if (readableMap.hasKey("testID") && !readableMap.isNull("testID")) {
            b10.putString("testID", readableMap.getString("testID"));
        }
        if (readableMap.hasKey("firstDayOfWeek") && !readableMap.isNull("firstDayOfWeek")) {
            b10.putInt("firstDayOfWeek", readableMap.getInt("firstDayOfWeek") + 1);
        }
        return b10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$open$0(J j10, ReadableMap readableMap, Promise promise) {
        i iVar = (i) j10.l0("RNCDatePicker");
        Bundle createFragmentArguments = createFragmentArguments(readableMap);
        if (iVar != null) {
            iVar.b0(createFragmentArguments);
            return;
        }
        i iVar2 = new i();
        iVar2.setArguments(createFragmentArguments);
        a aVar = new a(promise, createFragmentArguments);
        iVar2.Z(aVar);
        iVar2.Y(aVar);
        iVar2.a0(aVar);
        iVar2.T(j10, "RNCDatePicker");
    }

    @ReactMethod
    public void dismiss(Promise promise) {
        b.c((C1773v) getCurrentActivity(), "RNCDatePicker", promise);
    }

    public String getName() {
        return "RNCDatePicker";
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        C1773v vVar = (C1773v) getCurrentActivity();
        if (vVar == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a DatePicker dialog while not attached to an Activity");
        } else {
            UiThreadUtil.runOnUiThread(new c(this, vVar.getSupportFragmentManager(), readableMap, promise));
        }
    }
}
