package com.bugsnag.android.internal;

import K4.a;
import K4.j;
import android.app.Application;
import android.content.Context;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bugsnag/android/internal/BugsnagContentProvider;", "LK4/a;", "<init>", "()V", "", "onCreate", "()Z", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BugsnagContentProvider extends a {
    public boolean onCreate() {
        Context context;
        Context context2 = getContext();
        Application application = null;
        if (context2 == null) {
            context = null;
        } else {
            context = context2.getApplicationContext();
        }
        if (context instanceof Application) {
            application = (Application) context;
        }
        if (application == null) {
            return true;
        }
        j.i(application);
        return true;
    }
}
