package com.reactcommunity.rndatetimepicker;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TimePicker;
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

@Q7.a(name = "RNCTimePicker")
public class TimePickerModule extends NativeModuleTimePickerSpec {
    public static final String NAME = "RNCTimePicker";

    private class a implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final Promise f59183a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f59184b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f59185c = false;

        public a(Promise promise, Bundle bundle) {
            this.f59183a = promise;
            this.f59184b = bundle;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            if (!this.f59185c && TimePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", "neutralButtonAction");
                this.f59183a.resolve(writableNativeMap);
                this.f59185c = true;
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.f59185c && TimePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", "dismissedAction");
                this.f59183a.resolve(writableNativeMap);
                this.f59185c = true;
            }
        }

        public void onTimeSet(TimePicker timePicker, int i10, int i11) {
            if (!this.f59185c && TimePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                f fVar = new f(this.f59184b);
                Calendar instance = Calendar.getInstance(b.h(this.f59184b));
                instance.set(fVar.e(), fVar.d(), fVar.a(), i10, i11, 0);
                instance.set(14, 0);
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", "timeSetAction");
                writableNativeMap.putDouble(DiagnosticsEntry.TIMESTAMP_KEY, (double) instance.getTimeInMillis());
                writableNativeMap.putDouble("utcOffset", (double) ((instance.getTimeZone().getOffset(instance.getTimeInMillis()) / 1000) / 60));
                this.f59183a.resolve(writableNativeMap);
                this.f59185c = true;
            }
        }
    }

    public TimePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle b10 = b.b(readableMap);
        if (readableMap.hasKey("is24Hour") && !readableMap.isNull("is24Hour")) {
            b10.putBoolean("is24Hour", readableMap.getBoolean("is24Hour"));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            b10.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey("dialogButtons") && !readableMap.isNull("dialogButtons")) {
            b10.putBundle("dialogButtons", Arguments.toBundle(readableMap.getMap("dialogButtons")));
        }
        if (readableMap.hasKey("minuteInterval") && !readableMap.isNull("minuteInterval")) {
            b10.putInt("minuteInterval", readableMap.getInt("minuteInterval"));
        }
        if (readableMap.hasKey("timeZoneOffsetInMinutes") && !readableMap.isNull("timeZoneOffsetInMinutes")) {
            b10.putLong("timeZoneOffsetInMinutes", (long) readableMap.getDouble("timeZoneOffsetInMinutes"));
        }
        return b10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$open$0(J j10, ReadableMap readableMap, Promise promise) {
        o oVar = (o) j10.l0("RNCTimePicker");
        Bundle createFragmentArguments = createFragmentArguments(readableMap);
        if (oVar != null) {
            oVar.Z(createFragmentArguments);
            return;
        }
        o oVar2 = new o();
        oVar2.setArguments(createFragmentArguments);
        a aVar = new a(promise, createFragmentArguments);
        oVar2.W(aVar);
        oVar2.Y(aVar);
        oVar2.X(aVar);
        oVar2.T(j10, "RNCTimePicker");
    }

    @ReactMethod
    public void dismiss(Promise promise) {
        b.c((C1773v) getCurrentActivity(), "RNCTimePicker", promise);
    }

    public String getName() {
        return "RNCTimePicker";
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        C1773v vVar = (C1773v) getCurrentActivity();
        if (vVar == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a TimePicker dialog while not attached to an Activity");
        } else {
            UiThreadUtil.runOnUiThread(new r(this, vVar.getSupportFragmentManager(), readableMap, promise));
        }
    }
}
