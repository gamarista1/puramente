package com.facebook.imagepipeline.producers;

import T5.k;
import U5.a;
import W5.i;
import W6.g;
import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import b6.f;
import c7.C3189i;
import i7.C3593b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import m7.C3786f;

public class J extends L implements u0 {

    /* renamed from: d  reason: collision with root package name */
    private static final Class f39837d = J.class;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f39838e = {"_id", "_data"};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f39839f = {"_data"};

    /* renamed from: g  reason: collision with root package name */
    private static final Rect f39840g = new Rect(0, 0, 512, 384);

    /* renamed from: h  reason: collision with root package name */
    private static final Rect f39841h = new Rect(0, 0, 96, 96);

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f39842c;

    public J(Executor executor, i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        this.f39842c = contentResolver;
    }

    private C3189i g(Uri uri, g gVar) {
        Cursor query;
        C3189i j10;
        if (gVar == null || (query = this.f39842c.query(uri, f39838e, (String) null, (String[]) null, (String) null)) == null) {
            return null;
        }
        try {
            if (!query.moveToFirst() || (j10 = j(gVar, query.getLong(query.getColumnIndex("_id")))) == null) {
                query.close();
                return null;
            }
            int columnIndex = query.getColumnIndex("_data");
            if (columnIndex >= 0) {
                j10.P0(i(query.getString(columnIndex)));
            }
            return j10;
        } finally {
            query.close();
        }
    }

    private static int h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    private static int i(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return C3786f.a(new ExifInterface(str).getAttributeInt("Orientation", 1));
        } catch (IOException e10) {
            a.l(f39837d, e10, "Unable to retrieve thumbnail rotation for %s", str);
            return 0;
        }
    }

    private C3189i j(g gVar, long j10) {
        Cursor queryMiniThumbnail;
        int columnIndex;
        int k10 = k(gVar);
        if (k10 == 0 || (queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f39842c, j10, k10, f39839f)) == null) {
            return null;
        }
        try {
            if (queryMiniThumbnail.moveToFirst() && (columnIndex = queryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String str = (String) k.g(queryMiniThumbnail.getString(columnIndex));
                if (new File(str).exists()) {
                    return e(new FileInputStream(str), h(str));
                }
            }
            queryMiniThumbnail.close();
            return null;
        } finally {
            queryMiniThumbnail.close();
        }
    }

    private static int k(g gVar) {
        Rect rect = f39841h;
        if (v0.b(rect.width(), rect.height(), gVar)) {
            return 3;
        }
        Rect rect2 = f39840g;
        if (v0.b(rect2.width(), rect2.height(), gVar)) {
            return 1;
        }
        return 0;
    }

    public boolean a(g gVar) {
        Rect rect = f39840g;
        return v0.b(rect.width(), rect.height(), gVar);
    }

    /* access modifiers changed from: protected */
    public C3189i d(C3593b bVar) {
        Uri v10 = bVar.v();
        if (f.i(v10)) {
            return g(v10, bVar.r());
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public String f() {
        return "LocalContentUriThumbnailFetchProducer";
    }
}
