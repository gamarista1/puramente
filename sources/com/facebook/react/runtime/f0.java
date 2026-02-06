package com.facebook.react.runtime;

import android.app.Activity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;

class f0 {

    /* renamed from: a  reason: collision with root package name */
    LifecycleState f41304a = LifecycleState.BEFORE_CREATE;

    /* renamed from: b  reason: collision with root package name */
    private final C3374c f41305b;

    f0(C3374c cVar) {
        this.f41305b = cVar;
    }

    public LifecycleState a() {
        return this.f41304a;
    }

    public void b(ReactContext reactContext) {
        if (reactContext != null) {
            LifecycleState lifecycleState = this.f41304a;
            if (lifecycleState == LifecycleState.BEFORE_RESUME) {
                this.f41305b.a("ReactContext.onHostDestroy()");
                reactContext.onHostDestroy();
            } else if (lifecycleState == LifecycleState.RESUMED) {
                this.f41305b.a("ReactContext.onHostPause()");
                reactContext.onHostPause();
                this.f41305b.a("ReactContext.onHostDestroy()");
                reactContext.onHostDestroy();
            }
        }
        this.f41304a = LifecycleState.BEFORE_CREATE;
    }

    public void c(ReactContext reactContext, Activity activity) {
        if (reactContext != null) {
            LifecycleState lifecycleState = this.f41304a;
            if (lifecycleState == LifecycleState.BEFORE_CREATE) {
                this.f41305b.a("ReactContext.onHostResume()");
                reactContext.onHostResume(activity);
                this.f41305b.a("ReactContext.onHostPause()");
                reactContext.onHostPause();
            } else if (lifecycleState == LifecycleState.RESUMED) {
                this.f41305b.a("ReactContext.onHostPause()");
                reactContext.onHostPause();
            }
        }
        this.f41304a = LifecycleState.BEFORE_RESUME;
    }

    public void d(ReactContext reactContext, Activity activity) {
        LifecycleState lifecycleState = this.f41304a;
        LifecycleState lifecycleState2 = LifecycleState.RESUMED;
        if (lifecycleState != lifecycleState2) {
            if (reactContext != null) {
                this.f41305b.a("ReactContext.onHostResume()");
                reactContext.onHostResume(activity);
            }
            this.f41304a = lifecycleState2;
        }
    }

    public void e(ReactContext reactContext, Activity activity) {
        if (this.f41304a == LifecycleState.RESUMED) {
            this.f41305b.a("ReactContext.onHostResume()");
            reactContext.onHostResume(activity);
        }
    }
}
