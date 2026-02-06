package com.facebook.react.modules.dialog;

import C7.d;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.C1773v;
import androidx.fragment.app.J;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Map;

@Q7.a(name = "DialogManagerAndroid")
public class DialogModule extends NativeDialogManagerAndroidSpec implements LifecycleEventListener {
    static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    static final String ACTION_DISMISSED = "dismissed";
    static final Map<String, Object> CONSTANTS = d.h(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED, "dismissed", "dismissed", KEY_BUTTON_POSITIVE, -1, KEY_BUTTON_NEGATIVE, -2, KEY_BUTTON_NEUTRAL, -3);
    static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    static final String KEY_CANCELABLE = "cancelable";
    static final String KEY_ITEMS = "items";
    static final String KEY_MESSAGE = "message";
    static final String KEY_TITLE = "title";
    /* access modifiers changed from: private */
    public boolean mIsInForeground;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f41044a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bundle f41045b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callback f41046c;

        a(c cVar, Bundle bundle, Callback callback) {
            this.f41044a = cVar;
            this.f41045b = bundle;
            this.f41046c = callback;
        }

        public void run() {
            this.f41044a.b(this.f41045b, this.f41046c);
        }
    }

    class b implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        private final Callback f41048a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f41049b = false;

        public b(Callback callback) {
            this.f41048a = callback;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            if (!this.f41049b && DialogModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                this.f41048a.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i10));
                this.f41049b = true;
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.f41049b && DialogModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                this.f41048a.invoke("dismissed");
                this.f41049b = true;
            }
        }
    }

    private class c {

        /* renamed from: a  reason: collision with root package name */
        private final J f41051a;

        /* renamed from: b  reason: collision with root package name */
        private Object f41052b;

        public c(J j10) {
            this.f41051a = j10;
        }

        private void a() {
            b bVar;
            if (DialogModule.this.mIsInForeground && (bVar = (b) this.f41051a.l0(DialogModule.FRAGMENT_TAG)) != null && bVar.isResumed()) {
                bVar.F();
            }
        }

        public void b(Bundle bundle, Callback callback) {
            b bVar;
            UiThreadUtil.assertOnUiThread();
            a();
            if (callback != null) {
                bVar = new b(callback);
            } else {
                bVar = null;
            }
            b bVar2 = new b(bVar, bundle);
            if (!DialogModule.this.mIsInForeground || this.f41051a.S0()) {
                this.f41052b = bVar2;
                return;
            }
            if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                bVar2.P(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
            }
            bVar2.T(this.f41051a, DialogModule.FRAGMENT_TAG);
        }

        public void c() {
            UiThreadUtil.assertOnUiThread();
            SoftAssertions.assertCondition(DialogModule.this.mIsInForeground, "showPendingAlert() called in background");
            if (this.f41052b != null) {
                a();
                ((b) this.f41052b).T(this.f41051a, DialogModule.FRAGMENT_TAG);
                this.f41052b = null;
            }
        }
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private c getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof C1773v)) {
            return null;
        }
        return new c(((C1773v) currentActivity).getSupportFragmentManager());
    }

    public Map<String, Object> getTypedExportedConstants() {
        return CONSTANTS;
    }

    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.mIsInForeground = false;
    }

    public void onHostResume() {
        this.mIsInForeground = true;
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.c();
        } else {
            U5.a.E(DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    public void showAlert(ReadableMap readableMap, Callback callback, Callback callback2) {
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("title")) {
            bundle.putString("title", readableMap.getString("title"));
        }
        if (readableMap.hasKey("message")) {
            bundle.putString("message", readableMap.getString("message"));
        }
        if (readableMap.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", readableMap.getString(KEY_BUTTON_POSITIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", readableMap.getString(KEY_BUTTON_NEGATIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", readableMap.getString(KEY_BUTTON_NEUTRAL));
        }
        if (readableMap.hasKey(KEY_ITEMS)) {
            ReadableArray array = readableMap.getArray(KEY_ITEMS);
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i10 = 0; i10 < array.size(); i10++) {
                charSequenceArr[i10] = array.getString(i10);
            }
            bundle.putCharSequenceArray(KEY_ITEMS, charSequenceArr);
        }
        if (readableMap.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, readableMap.getBoolean(KEY_CANCELABLE));
        }
        UiThreadUtil.runOnUiThread(new a(fragmentManagerHelper, bundle, callback2));
    }
}
