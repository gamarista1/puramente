package com.facebook.imagepipeline.producers;

import R5.a;
import T5.k;
import W5.i;
import android.net.Uri;
import android.util.Base64;
import c7.C3189i;
import i7.C3593b;
import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.imagepipeline.producers.o  reason: case insensitive filesystem */
public class C3309o extends L {
    public C3309o(i iVar) {
        super(a.a(), iVar);
    }

    static byte[] g(String str) {
        k.b(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        if (h(str.substring(0, indexOf))) {
            return Base64.decode(substring, 0);
        }
        String decode = Uri.decode(substring);
        k.g(decode);
        return decode.getBytes();
    }

    static boolean h(String str) {
        if (!str.contains(";")) {
            return false;
        }
        String[] split = str.split(";");
        return split[split.length - 1].equals("base64");
    }

    /* access modifiers changed from: protected */
    public C3189i d(C3593b bVar) {
        byte[] g10 = g(bVar.v().toString());
        return c(new ByteArrayInputStream(g10), g10.length);
    }

    /* access modifiers changed from: protected */
    public String f() {
        return "DataFetchProducer";
    }
}
