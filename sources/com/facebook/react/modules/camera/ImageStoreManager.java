package com.facebook.react.modules.camera;

import android.net.Uri;
import android.util.Base64OutputStream;
import com.facebook.fbreact.specs.NativeImageStoreAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import io.branch.rnbranch.RNBranchModule;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Q7.a(name = "ImageStoreManager")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/modules/camera/ImageStoreManager;", "Lcom/facebook/fbreact/specs/NativeImageStoreAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "uri", "Lcom/facebook/react/bridge/Callback;", "success", "error", "Llf/M;", "getBase64ForTag", "(Ljava/lang/String;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImageStoreManager extends NativeImageStoreAndroidSpec {
    private static final int BUFFER_SIZE = 8192;
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String NAME = "ImageStoreManager";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final void b(Closeable closeable) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }

        /* JADX INFO: finally extract failed */
        public final String c(InputStream inputStream) {
            C6496s.h(inputStream, "inputStream");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
            byte[] bArr = new byte[ImageStoreManager.BUFFER_SIZE];
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read > -1) {
                        base64OutputStream.write(bArr, 0, read);
                    } else {
                        b(base64OutputStream);
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                        C6496s.g(byteArrayOutputStream2, "toString(...)");
                        return byteArrayOutputStream2;
                    }
                } catch (Throwable th2) {
                    b(base64OutputStream);
                    throw th2;
                }
            }
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageStoreManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C6496s.h(reactApplicationContext, "reactContext");
    }

    /* access modifiers changed from: private */
    public static final void getBase64ForTag$lambda$0(ImageStoreManager imageStoreManager, String str, Callback callback, Callback callback2) {
        InputStream openInputStream;
        a aVar;
        try {
            openInputStream = imageStoreManager.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(str));
            C6496s.f(openInputStream, "null cannot be cast to non-null type java.io.InputStream");
            try {
                aVar = Companion;
                callback.invoke(aVar.c(openInputStream));
            } catch (IOException e10) {
                callback2.invoke(e10.getMessage());
                aVar = Companion;
            }
            aVar.b(openInputStream);
        } catch (FileNotFoundException e11) {
            callback2.invoke(e11.getMessage());
        } catch (Throwable th2) {
            Companion.b(openInputStream);
            throw th2;
        }
    }

    public void getBase64ForTag(String str, Callback callback, Callback callback2) {
        C6496s.h(str, "uri");
        C6496s.h(callback, com.amazon.device.simplesignin.a.a.a.f38020s);
        C6496s.h(callback2, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        Executors.newSingleThreadExecutor().execute(new T7.a(this, str, callback, callback2));
    }
}
