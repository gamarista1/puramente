package io.intercom.android.sdk.carousel.permission;

import io.intercom.android.sdk.carousel.PermissionManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class PermissionRequest30 extends PermissionRequestBefore30 {
    PermissionRequest30(PermissionManager permissionManager) {
        super(permissionManager);
    }

    private boolean askForBackgroundPermission(List<String> list) {
        if (!isLocationPermission(list) || !isBackgroundPermissionInManifest()) {
            return false;
        }
        return true;
    }

    private boolean isBackgroundPermissionDeniedPermanently() {
        if (this.permissionManager.getPermissionStatus("android.permission.ACCESS_BACKGROUND_LOCATION") == 2) {
            return true;
        }
        return false;
    }

    private boolean isBackgroundPermissionInManifest() {
        return !this.permissionManager.permissionsExistInManifest(Collections.singletonList("android.permission.ACCESS_BACKGROUND_LOCATION")).isEmpty();
    }

    private boolean isLocationPermission(List<String> list) {
        if (list.contains("android.permission.ACCESS_COARSE_LOCATION") || list.contains("android.permission.ACCESS_FINE_LOCATION")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void handleGranted(String[] strArr) {
        if (!askForBackgroundPermission(Arrays.asList(strArr))) {
            getListener().showGranted();
        } else if (isBackgroundPermissionDeniedPermanently()) {
            getListener().showDeniedPermanently();
        } else {
            getListener().requestBackgroundLocationPermission();
        }
    }

    /* access modifiers changed from: protected */
    public void handleRequest(List<String> list, int i10) {
        list.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
        super.handleRequest(list, i10);
    }
}
