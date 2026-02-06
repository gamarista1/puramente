package com.reactnativegooglesignin;

import android.view.View;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.SimpleViewManager;
import e8.C3500a;
import ya.i;

public class RNGoogleSigninButtonViewManager extends SimpleViewManager<i> {

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C3415h0 f59419a;

        a(C3415h0 h0Var) {
            this.f59419a = h0Var;
        }

        public void onClick(View view) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f59419a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNGoogleSigninButtonClicked", (Object) null);
        }
    }

    public String getName() {
        return "RNGoogleSigninButton";
    }

    @C3500a(name = "color")
    public void setColor(i iVar, int i10) {
        iVar.setColorScheme(i10);
    }

    @C3500a(name = "disabled")
    public void setDisabled(i iVar, boolean z10) {
        iVar.setEnabled(!z10);
    }

    @C3500a(name = "size")
    public void setSize(i iVar, int i10) {
        iVar.setSize(i10);
    }

    /* access modifiers changed from: protected */
    public i createViewInstance(C3415h0 h0Var) {
        i iVar = new i(h0Var);
        iVar.setSize(0);
        iVar.setColorScheme(2);
        iVar.setOnClickListener(new a(h0Var));
        return iVar;
    }
}
