package com.imagepicker;

import Q7.a;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;
import java.util.Collections;
import java.util.List;

@a(name = "ImagePickerManager")
public class ImagePickerModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    static final String NAME = "ImagePickerManager";
    public static final int REQUEST_LAUNCH_IMAGE_CAPTURE = 13001;
    public static final int REQUEST_LAUNCH_LIBRARY = 13003;
    public static final int REQUEST_LAUNCH_VIDEO_CAPTURE = 13002;
    Callback callback;
    Uri cameraCaptureURI;
    private Uri fileUri;
    e options;
    final ReactApplicationContext reactContext;

    public ImagePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void launchCamera(ReadableMap readableMap, Callback callback2) {
        Intent intent;
        int i10;
        File file;
        if (!f.v(this.reactContext)) {
            callback2.invoke(f.j(f.f59125b, (String) null));
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback2.invoke(f.j(f.f59127d, "Activity error"));
        } else if (!f.w(this.reactContext, currentActivity)) {
            callback2.invoke(f.j(f.f59127d, f.f59130g));
        } else {
            this.callback = callback2;
            e eVar = new e(readableMap);
            this.options = eVar;
            if (!eVar.f59120h.booleanValue() || Build.VERSION.SDK_INT > 28 || f.u(currentActivity)) {
                if (this.options.f59123k.equals(f.f59129f)) {
                    intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    intent.putExtra("android.intent.extra.videoQuality", this.options.f59116d);
                    int i11 = this.options.f59121i;
                    if (i11 > 0) {
                        intent.putExtra("android.intent.extra.durationLimit", i11);
                    }
                    file = f.c(this.reactContext, "mp4");
                    this.cameraCaptureURI = f.d(file, this.reactContext);
                    i10 = REQUEST_LAUNCH_VIDEO_CAPTURE;
                } else {
                    intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    file = f.c(this.reactContext, "jpg");
                    this.cameraCaptureURI = f.d(file, this.reactContext);
                    i10 = REQUEST_LAUNCH_IMAGE_CAPTURE;
                }
                if (this.options.f59122j.booleanValue()) {
                    f.D(intent);
                }
                this.fileUri = Uri.fromFile(file);
                intent.putExtra("output", this.cameraCaptureURI);
                intent.addFlags(3);
                try {
                    currentActivity.startActivityForResult(intent, i10);
                } catch (ActivityNotFoundException e10) {
                    callback2.invoke(f.j(f.f59127d, e10.getMessage()));
                    this.callback = null;
                }
            } else {
                callback2.invoke(f.j(f.f59126c, (String) null));
            }
        }
    }

    @ReactMethod
    public void launchImageLibrary(ReadableMap readableMap, Callback callback2) {
        boolean z10;
        Intent intent;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback2.invoke(f.j(f.f59127d, "Activity error"));
            return;
        }
        this.callback = callback2;
        e eVar = new e(readableMap);
        this.options = eVar;
        int i10 = eVar.f59113a;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean equals = eVar.f59123k.equals(f.f59128e);
        boolean equals2 = this.options.f59123k.equals(f.f59129f);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            intent = new Intent("android.provider.action.PICK_IMAGES");
        } else if (!z10 || (!equals && !equals2)) {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
        } else {
            intent = new Intent("android.intent.action.PICK");
        }
        if (!z10) {
            if (i11 < 33) {
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            } else if (i10 != 1) {
                if (i10 == 0) {
                    i10 = MediaStore.getPickImagesMaxLimit();
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", i10);
            }
        }
        if (equals) {
            intent.setType("image/*");
        } else if (equals2) {
            intent.setType("video/*");
        } else if (i11 < 33) {
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        }
        try {
            currentActivity.startActivityForResult(intent, REQUEST_LAUNCH_LIBRARY);
        } catch (ActivityNotFoundException e10) {
            callback2.invoke(f.j(f.f59127d, e10.getMessage()));
            this.callback = null;
        }
    }

    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        if (f.z(i10) && this.callback != null) {
            if (i11 != -1) {
                if (i10 == 13001) {
                    f.e(this.fileUri);
                }
                try {
                    this.callback.invoke(f.i());
                    return;
                } catch (RuntimeException e10) {
                    this.callback.invoke(f.j(f.f59127d, e10.getMessage()));
                } finally {
                    this.callback = null;
                }
            }
            switch (i10) {
                case REQUEST_LAUNCH_IMAGE_CAPTURE /*13001*/:
                    if (this.options.f59120h.booleanValue()) {
                        f.C(this.cameraCaptureURI, this.reactContext, "photo");
                    }
                    onAssetsObtained(Collections.singletonList(this.fileUri));
                    return;
                case REQUEST_LAUNCH_VIDEO_CAPTURE /*13002*/:
                    if (this.options.f59120h.booleanValue()) {
                        f.C(this.cameraCaptureURI, this.reactContext, "video");
                    }
                    onAssetsObtained(Collections.singletonList(this.fileUri));
                    return;
                case REQUEST_LAUNCH_LIBRARY /*13003*/:
                    onAssetsObtained(f.a(intent));
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onAssetsObtained(List<Uri> list) {
        try {
            this.callback.invoke(f.s(list, this.options, this.reactContext));
        } catch (RuntimeException e10) {
            this.callback.invoke(f.j(f.f59127d, e10.getMessage()));
        } catch (Throwable th2) {
            this.callback = null;
            throw th2;
        }
        this.callback = null;
    }

    public void onNewIntent(Intent intent) {
    }
}
