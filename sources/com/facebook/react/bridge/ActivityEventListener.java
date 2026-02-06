package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Intent;

public interface ActivityEventListener {
    void onActivityResult(Activity activity, int i10, int i11, Intent intent);

    void onNewIntent(Intent intent);

    void onUserLeaveHint(Activity activity) {
    }
}
