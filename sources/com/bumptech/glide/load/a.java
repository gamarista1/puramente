package com.bumptech.glide.load;

import c5.C;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o5.C3882a;

public abstract class a {

    /* renamed from: com.bumptech.glide.load.a$a  reason: collision with other inner class name */
    class C0620a implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputStream f39110a;

        C0620a(InputStream inputStream) {
            this.f39110a = inputStream;
        }

        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.d(this.f39110a);
            } finally {
                this.f39110a.reset();
            }
        }
    }

    class b implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ByteBuffer f39111a;

        b(ByteBuffer byteBuffer) {
            this.f39111a = byteBuffer;
        }

        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.f39111a);
            } finally {
                C3882a.d(this.f39111a);
            }
        }
    }

    class c implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f39112a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ W4.b f39113b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, W4.b bVar) {
            this.f39112a = parcelFileDescriptorRewinder;
            this.f39113b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType a(com.bumptech.glide.load.ImageHeaderParser r5) {
            /*
                r4 = this;
                r0 = 0
                c5.C r1 = new c5.C     // Catch:{ all -> 0x0027 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f39112a     // Catch:{ all -> 0x0027 }
                android.os.ParcelFileDescriptor r3 = r3.a()     // Catch:{ all -> 0x0027 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
                r2.<init>(r3)     // Catch:{ all -> 0x0027 }
                W4.b r3 = r4.f39113b     // Catch:{ all -> 0x0027 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.d(r1)     // Catch:{ all -> 0x0024 }
                r1.f()
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f39112a
                r0.a()
                return r5
            L_0x0024:
                r5 = move-exception
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r5 = move-exception
            L_0x0028:
                if (r0 == 0) goto L_0x002d
                r0.f()
            L_0x002d:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f39112a
                r0.a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.c.a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    class d implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ByteBuffer f39114a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ W4.b f39115b;

        d(ByteBuffer byteBuffer, W4.b bVar) {
            this.f39114a = byteBuffer;
            this.f39115b = bVar;
        }

        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.c(this.f39114a, this.f39115b);
            } finally {
                C3882a.d(this.f39114a);
            }
        }
    }

    class e implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputStream f39116a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ W4.b f39117b;

        e(InputStream inputStream, W4.b bVar) {
            this.f39116a = inputStream;
            this.f39117b = bVar;
        }

        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.b(this.f39116a, this.f39117b);
            } finally {
                this.f39116a.reset();
            }
        }
    }

    class f implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f39118a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ W4.b f39119b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, W4.b bVar) {
            this.f39118a = parcelFileDescriptorRewinder;
            this.f39119b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(com.bumptech.glide.load.ImageHeaderParser r5) {
            /*
                r4 = this;
                r0 = 0
                c5.C r1 = new c5.C     // Catch:{ all -> 0x0029 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f39118a     // Catch:{ all -> 0x0029 }
                android.os.ParcelFileDescriptor r3 = r3.a()     // Catch:{ all -> 0x0029 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
                r2.<init>(r3)     // Catch:{ all -> 0x0029 }
                W4.b r3 = r4.f39119b     // Catch:{ all -> 0x0029 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
                W4.b r0 = r4.f39119b     // Catch:{ all -> 0x0026 }
                int r5 = r5.b(r1, r0)     // Catch:{ all -> 0x0026 }
                r1.f()
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f39118a
                r0.a()
                return r5
            L_0x0026:
                r5 = move-exception
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r5 = move-exception
            L_0x002a:
                if (r0 == 0) goto L_0x002f
                r0.f()
            L_0x002f:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f39118a
                r0.a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.f.a(com.bumptech.glide.load.ImageHeaderParser):int");
        }
    }

    private interface g {
        int a(ImageHeaderParser imageHeaderParser);
    }

    private interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, W4.b bVar) {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List list, InputStream inputStream, W4.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(List list, ByteBuffer byteBuffer, W4.b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(List list, g gVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = gVar.a((ImageHeaderParser) list.get(i10));
            if (a10 != -1) {
                return a10;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, W4.b bVar) {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType f(List list, InputStream inputStream, W4.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C0620a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return h(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType h(List list, h hVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType a10 = hVar.a((ImageHeaderParser) list.get(i10));
            if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a10;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
