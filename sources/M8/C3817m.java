package m8;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;

/* renamed from: m8.m  reason: case insensitive filesystem */
public class C3817m extends C3404c {
    public C3817m(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    public void a(View view, String str, Object obj) {
        float f10;
        double d10;
        str.hashCode();
        boolean z10 = false;
        String str2 = null;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1931191604:
                if (str.equals("imageAssetsFolder")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1698420908:
                if (str.equals("sourceURL")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1620771041:
                if (str.equals("textFiltersIOS")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1111735389:
                if (str.equals("sourceJson")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1111633594:
                if (str.equals("sourceName")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1073046328:
                if (str.equals("cacheComposition")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals(ReactProgressBarViewManager.PROP_PROGRESS)) {
                    c10 = 6;
                    break;
                }
                break;
            case -413415295:
                if (str.equals("textFiltersAndroid")) {
                    c10 = 7;
                    break;
                }
                break;
            case -204076609:
                if (str.equals("sourceDotLottieURI")) {
                    c10 = 8;
                    break;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    c10 = 9;
                    break;
                }
                break;
            case 95945896:
                if (str.equals("dummy")) {
                    c10 = 10;
                    break;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    c10 = 11;
                    break;
                }
                break;
            case 399078087:
                if (str.equals("hardwareAccelerationAndroid")) {
                    c10 = 12;
                    break;
                }
                break;
            case 1192042876:
                if (str.equals("enableSafeModeAndroid")) {
                    c10 = 13;
                    break;
                }
                break;
            case 1193882713:
                if (str.equals("renderMode")) {
                    c10 = 14;
                    break;
                }
                break;
            case 1410565912:
                if (str.equals("colorFilters")) {
                    c10 = 15;
                    break;
                }
                break;
            case 1438608771:
                if (str.equals("autoPlay")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2049757303:
                if (str.equals("resizeMode")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2111299681:
                if (str.equals("enableMergePathsAndroidForKitKatAndAbove")) {
                    c10 = 18;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                C3819n nVar = (C3819n) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                nVar.setImageAssetsFolder(view, str2);
                return;
            case 1:
                C3819n nVar2 = (C3819n) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                nVar2.setSourceURL(view, str2);
                return;
            case 2:
                ((C3819n) this.f41564a).setTextFiltersIOS(view, (ReadableArray) obj);
                return;
            case 3:
                C3819n nVar3 = (C3819n) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                nVar3.setSourceJson(view, str2);
                return;
            case 4:
                C3819n nVar4 = (C3819n) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                nVar4.setSourceName(view, str2);
                return;
            case 5:
                C3819n nVar5 = (C3819n) this.f41564a;
                if (obj != null) {
                    z10 = ((Boolean) obj).booleanValue();
                }
                nVar5.setCacheComposition(view, z10);
                return;
            case 6:
                C3819n nVar6 = (C3819n) this.f41564a;
                if (obj == null) {
                    f10 = 0.0f;
                } else {
                    f10 = ((Double) obj).floatValue();
                }
                nVar6.setProgress(view, f10);
                return;
            case 7:
                ((C3819n) this.f41564a).setTextFiltersAndroid(view, (ReadableArray) obj);
                return;
            case 8:
                C3819n nVar7 = (C3819n) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                nVar7.setSourceDotLottieURI(view, str2);
                return;
            case 9:
                C3819n nVar8 = (C3819n) this.f41564a;
                if (obj != null) {
                    z10 = ((Boolean) obj).booleanValue();
                }
                nVar8.setLoop(view, z10);
                return;
            case 10:
                ((C3819n) this.f41564a).setDummy(view, (ReadableMap) obj);
                return;
            case 11:
                C3819n nVar9 = (C3819n) this.f41564a;
                if (obj == null) {
                    d10 = 0.0d;
                } else {
                    d10 = ((Double) obj).doubleValue();
                }
                nVar9.setSpeed(view, d10);
                return;
            case 12:
                C3819n nVar10 = (C3819n) this.f41564a;
                if (obj != null) {
                    z10 = ((Boolean) obj).booleanValue();
                }
                nVar10.setHardwareAccelerationAndroid(view, z10);
                return;
            case 13:
                C3819n nVar11 = (C3819n) this.f41564a;
                if (obj != null) {
                    z10 = ((Boolean) obj).booleanValue();
                }
                nVar11.setEnableSafeModeAndroid(view, z10);
                return;
            case StdKeyDeserializer.TYPE_URL:
                C3819n nVar12 = (C3819n) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                nVar12.setRenderMode(view, str2);
                return;
            case StdKeyDeserializer.TYPE_CLASS:
                ((C3819n) this.f41564a).setColorFilters(view, (ReadableArray) obj);
                return;
            case 16:
                C3819n nVar13 = (C3819n) this.f41564a;
                if (obj != null) {
                    z10 = ((Boolean) obj).booleanValue();
                }
                nVar13.setAutoPlay(view, z10);
                return;
            case 17:
                C3819n nVar14 = (C3819n) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                nVar14.setResizeMode(view, str2);
                return;
            case 18:
                C3819n nVar15 = (C3819n) this.f41564a;
                if (obj != null) {
                    z10 = ((Boolean) obj).booleanValue();
                }
                nVar15.setEnableMergePathsAndroidForKitKatAndAbove(view, z10);
                return;
            default:
                super.a(view, str, obj);
                return;
        }
    }

    public void b(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -934426579:
                if (str.equals("resume")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3443508:
                if (str.equals("play")) {
                    c10 = 1;
                    break;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    c10 = 2;
                    break;
                }
                break;
            case 108404047:
                if (str.equals("reset")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((C3819n) this.f41564a).resume(view);
                return;
            case 1:
                ((C3819n) this.f41564a).play(view, readableArray.getInt(0), readableArray.getInt(1));
                return;
            case 2:
                ((C3819n) this.f41564a).pause(view);
                return;
            case 3:
                ((C3819n) this.f41564a).reset(view);
                return;
            default:
                return;
        }
    }
}
