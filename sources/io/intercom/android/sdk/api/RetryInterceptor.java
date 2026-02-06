package io.intercom.android.sdk.api;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import rh.E;
import rh.w;

class RetryInterceptor implements w {
    private static final int MAX_RETRIES = 3;
    private final Sleeper sleeper;

    public static class Sleeper {
        public void sleep(int i10) {
            try {
                TimeUnit.SECONDS.sleep((long) i10);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public RetryInterceptor(Sleeper sleeper2) {
        this.sleeper = sleeper2;
    }

    static int getRetryTimer(int i10) {
        return (int) Math.pow(2.0d, (double) i10);
    }

    public E intercept(w.a aVar) {
        int i10 = 0;
        while (i10 <= 3) {
            try {
                return aVar.a(aVar.request());
            } catch (IOException e10) {
                if (i10 != 3) {
                    i10++;
                    this.sleeper.sleep(getRetryTimer(i10));
                } else {
                    throw e10;
                }
            }
        }
        throw new IOException("request failed due to network errors");
    }
}
