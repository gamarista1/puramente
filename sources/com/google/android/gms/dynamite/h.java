package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class h implements DynamiteModule.b {
    h() {
    }

    public final DynamiteModule.b.C0823b a(Context context, String str, DynamiteModule.b.a aVar) {
        int i10;
        DynamiteModule.b.C0823b bVar = new DynamiteModule.b.C0823b();
        int b10 = aVar.b(context, str);
        bVar.f54309a = b10;
        int i11 = 1;
        int i12 = 0;
        if (b10 != 0) {
            i10 = aVar.a(context, str, false);
            bVar.f54310b = i10;
        } else {
            i10 = aVar.a(context, str, true);
            bVar.f54310b = i10;
        }
        int i13 = bVar.f54309a;
        if (i13 != 0) {
            i12 = i13;
        } else if (i10 == 0) {
            i11 = 0;
            bVar.f54311c = i11;
            return bVar;
        }
        if (i12 >= i10) {
            i11 = -1;
        }
        bVar.f54311c = i11;
        return bVar;
    }
}
