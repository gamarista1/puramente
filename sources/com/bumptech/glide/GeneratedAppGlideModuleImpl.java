package com.bumptech.glide;

import M8.e;
import Q4.b;
import android.content.Context;
import android.util.Log;
import com.bumptech.glide.integration.okhttp3.a;
import com.dylanvann.fastimage.FastImageGlideModule;
import com.dylanvann.fastimage.FastImageOkHttpProgressGlideModule;
import java.util.Collections;
import java.util.Set;

final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a  reason: collision with root package name */
    private final FastImageGlideModule f39008a = new FastImageGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.dylanvann.fastimage.FastImageGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.avif.AvifGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.webp.WebpGlideLibraryModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.dylanvann.fastimage.FastImageOkHttpProgressGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.github.penfeizhou.animation.glide.GlideAnimationModule");
        }
    }

    public Set a() {
        return Collections.emptySet();
    }

    public void applyOptions(Context context, d dVar) {
        this.f39008a.applyOptions(context, dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public a b() {
        return new a();
    }

    public boolean isManifestParsingEnabled() {
        return this.f39008a.isManifestParsingEnabled();
    }

    public void registerComponents(Context context, c cVar, j jVar) {
        new b().registerComponents(context, cVar, jVar);
        new a().registerComponents(context, cVar, jVar);
        new com.bumptech.glide.integration.webp.b().registerComponents(context, cVar, jVar);
        new FastImageOkHttpProgressGlideModule().registerComponents(context, cVar, jVar);
        new e().registerComponents(context, cVar, jVar);
        this.f39008a.registerComponents(context, cVar, jVar);
    }
}
