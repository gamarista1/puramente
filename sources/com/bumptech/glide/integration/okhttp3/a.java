package com.bumptech.glide.integration.okhttp3;

import Z4.h;
import android.content.Context;
import com.bumptech.glide.c;
import com.bumptech.glide.integration.okhttp3.b;
import com.bumptech.glide.j;
import j5.C3639c;
import java.io.InputStream;

public final class a extends C3639c {
    public void registerComponents(Context context, c cVar, j jVar) {
        jVar.u(h.class, InputStream.class, new b.a());
    }
}
