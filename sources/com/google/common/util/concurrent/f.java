package com.google.common.util.concurrent;

import java.util.logging.Logger;

final class f {

    /* renamed from: a  reason: collision with root package name */
    private final String f56834a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Logger f56835b;

    f(Class cls) {
        this.f56834a = cls.getName();
    }

    /* access modifiers changed from: package-private */
    public Logger a() {
        Logger logger = this.f56835b;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = this.f56835b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f56834a);
                this.f56835b = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
