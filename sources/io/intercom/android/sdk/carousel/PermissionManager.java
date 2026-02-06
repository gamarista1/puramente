package io.intercom.android.sdk.carousel;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.app.b;
import androidx.core.content.c;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermissionManager {
    private static final String BACKGROUND_LOCATION_PERMISSION = "android.permission.ACCESS_BACKGROUND_LOCATION";
    private static final Twig twig = LumberMill.getLogger();
    private final Activity activity;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PermissionStatus {
        public static final int DENIED_TEMPORARILY = 1;
        public static final int GRANTED = 0;
        public static final int NEVER_ASKED_OR_DENIED_PERMANENTLY = 2;
    }

    public PermissionManager(Activity activity2) {
        this.activity = activity2;
    }

    public boolean anyPermissionPermanentlyDeniedInResult(String[] strArr, int[] iArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (iArr[i10] == -1 && !b.k(this.activity, strArr[i10])) {
                return true;
            }
        }
        return false;
    }

    public int getPermissionStatus(String str) {
        if (c.checkSelfPermission(this.activity, str) == 0) {
            return 0;
        }
        if (b.k(this.activity, str)) {
            return 1;
        }
        return 2;
    }

    public List<String> permissionsExistInManifest(List<String> list) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        List<String> permissionsInManifest = permissionsInManifest();
        for (String next : list) {
            if (permissionsInManifest.contains(next)) {
                boolean equals = BACKGROUND_LOCATION_PERMISSION.equals(next);
                if (Build.VERSION.SDK_INT < 29) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!equals || !z10) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public boolean permissionsGranted(List<String> list) {
        for (String permissionStatus : list) {
            if (getPermissionStatus(permissionStatus) != 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public List<String> permissionsInManifest() {
        try {
            return Arrays.asList(this.activity.getPackageManager().getPackageInfo(this.activity.getPackageName(), 4096).requestedPermissions);
        } catch (PackageManager.NameNotFoundException e10) {
            Twig twig2 = twig;
            twig2.internal("Package name is unknown, error: " + e10.getMessage());
            return new ArrayList();
        }
    }

    public void requestPermissions(String[] strArr, int i10) {
        b.h(this.activity, strArr, i10);
    }
}
