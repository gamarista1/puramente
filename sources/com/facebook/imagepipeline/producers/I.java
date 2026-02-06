package com.facebook.imagepipeline.producers;

import Sg.p;
import W5.i;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import b6.f;
import c7.C3189i;
import i7.C3593b;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class I extends L {

    /* renamed from: d  reason: collision with root package name */
    public static final a f39834d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f39835e = {"_id", "_data"};

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f39836c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public I(Executor executor, i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        C6496s.h(executor, "executor");
        C6496s.h(iVar, "pooledByteBufferFactory");
        C6496s.h(contentResolver, "contentResolver");
        this.f39836c = contentResolver;
    }

    private final C3189i g(Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = this.f39836c.openFileDescriptor(uri, "r");
            if (openFileDescriptor != null) {
                C3189i e10 = e(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int) openFileDescriptor.getStatSize());
                C6496s.g(e10, "getEncodedImage(...)");
                openFileDescriptor.close();
                return e10;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public C3189i d(C3593b bVar) {
        C3189i g10;
        InputStream inputStream;
        C6496s.h(bVar, "imageRequest");
        Uri v10 = bVar.v();
        C6496s.g(v10, "getSourceUri(...)");
        if (f.j(v10)) {
            String uri = v10.toString();
            C6496s.g(uri, "toString(...)");
            if (p.u(uri, "/photo", false, 2, (Object) null)) {
                inputStream = this.f39836c.openInputStream(v10);
            } else {
                String uri2 = v10.toString();
                C6496s.g(uri2, "toString(...)");
                if (p.u(uri2, "/display_photo", false, 2, (Object) null)) {
                    try {
                        AssetFileDescriptor openAssetFileDescriptor = this.f39836c.openAssetFileDescriptor(v10, "r");
                        if (openAssetFileDescriptor != null) {
                            inputStream = openAssetFileDescriptor.createInputStream();
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } catch (IOException unused) {
                        throw new IOException("Contact photo does not exist: " + v10);
                    }
                } else {
                    InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f39836c, v10);
                    if (openContactPhotoInputStream != null) {
                        inputStream = openContactPhotoInputStream;
                    } else {
                        throw new IOException("Contact photo does not exist: " + v10);
                    }
                }
            }
            if (inputStream != null) {
                return e(inputStream, -1);
            }
            throw new IllegalStateException("Required value was null.");
        } else if (f.i(v10) && (g10 = g(v10)) != null) {
            return g10;
        } else {
            InputStream openInputStream = this.f39836c.openInputStream(v10);
            if (openInputStream != null) {
                return e(openInputStream, -1);
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* access modifiers changed from: protected */
    public String f() {
        return "LocalContentUriFetchProducer";
    }
}
