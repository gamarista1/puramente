package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

public final class ParcelFileDescriptorRewinder implements e {

    /* renamed from: a  reason: collision with root package name */
    private final InternalRewinder f39120a;

    private static final class InternalRewinder {

        /* renamed from: a  reason: collision with root package name */
        private final ParcelFileDescriptor f39121a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f39121a = parcelFileDescriptor;
        }

        /* access modifiers changed from: package-private */
        public ParcelFileDescriptor rewind() {
            try {
                Os.lseek(this.f39121a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f39121a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    public static final class a implements e.a {
        public Class a() {
            return ParcelFileDescriptor.class;
        }

        /* renamed from: c */
        public e b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f39120a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean c() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    public void b() {
    }

    /* renamed from: d */
    public ParcelFileDescriptor a() {
        return this.f39120a.rewind();
    }
}
