package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;
import android.view.View;

public abstract class c {

    private static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private final ActivityOptions f15746a;

        a(ActivityOptions activityOptions) {
            this.f15746a = activityOptions;
        }

        public Bundle b() {
            return this.f15746a.toBundle();
        }
    }

    protected c() {
    }

    public static c a(Activity activity, View view, String str) {
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    public abstract Bundle b();
}
