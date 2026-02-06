package io.intercom.android.sdk.carousel.permission;

import io.intercom.android.sdk.carousel.PermissionManager;
import io.intercom.android.sdk.models.carousel.ScreenAction;
import java.util.Arrays;
import java.util.List;

class PermissionRequestBefore30 implements PermissionRequest {
    private final PermissionResultListener nullListener = new NullPermissionResultListener();
    protected final PermissionManager permissionManager;
    private PermissionResultListener permissionResultListener;

    private static final class NullPermissionResultListener implements PermissionResultListener {
        private NullPermissionResultListener() {
        }

        public void requestBackgroundLocationPermission() {
        }

        public void showDeniedPermanently() {
        }

        public void showDeniedTemporarily() {
        }

        public void showGranted() {
        }
    }

    PermissionRequestBefore30(PermissionManager permissionManager2) {
        this.permissionManager = permissionManager2;
    }

    private void handleRequestResult(String[] strArr, int[] iArr) {
        if (this.permissionManager.anyPermissionPermanentlyDeniedInResult(strArr, iArr)) {
            getListener().showDeniedPermanently();
        } else if (this.permissionManager.permissionsGranted(Arrays.asList(strArr))) {
            handleGranted(strArr);
        } else {
            getListener().showDeniedTemporarily();
        }
    }

    public void attach(PermissionResultListener permissionResultListener2) {
        this.permissionResultListener = permissionResultListener2;
    }

    public void detach() {
        this.permissionResultListener = null;
    }

    /* access modifiers changed from: package-private */
    public PermissionResultListener getListener() {
        PermissionResultListener permissionResultListener2 = this.permissionResultListener;
        if (permissionResultListener2 == null) {
            return this.nullListener;
        }
        return permissionResultListener2;
    }

    /* access modifiers changed from: protected */
    public void handleGranted(String[] strArr) {
        getListener().showGranted();
    }

    /* access modifiers changed from: protected */
    public void handleRequest(List<String> list, int i10) {
        this.permissionManager.requestPermissions((String[]) list.toArray(new String[0]), i10);
    }

    public void handleResult(String[] strArr, int[] iArr) {
        handleRequestResult(strArr, iArr);
    }

    public void request(ScreenAction screenAction, int i10) {
        List<String> validPermissions = screenAction.getValidPermissions(this.permissionManager);
        if (!validPermissions.isEmpty()) {
            handleRequest(validPermissions, i10);
        }
    }
}
