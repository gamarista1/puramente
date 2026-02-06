package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

public final class n implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final FileOutputStream f42542a;

    /* renamed from: b  reason: collision with root package name */
    private final FileLock f42543b;

    private n(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f42542a = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
                fileOutputStream.close();
            }
            this.f42543b = lock;
        } catch (Throwable th2) {
            this.f42542a.close();
            throw th2;
        }
    }

    public static n a(File file) {
        return new n(file);
    }

    public void close() {
        try {
            FileLock fileLock = this.f42543b;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f42542a.close();
        }
    }
}
