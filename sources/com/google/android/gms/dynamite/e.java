package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class e implements DynamiteModule.b {
    e() {
    }

    public final DynamiteModule.b.C0823b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0823b bVar = new DynamiteModule.b.C0823b();
        int b10 = aVar.b(context, str);
        bVar.f54309a = b10;
        if (b10 != 0) {
            bVar.f54311c = -1;
        } else {
            int a10 = aVar.a(context, str, true);
            bVar.f54310b = a10;
            if (a10 != 0) {
                bVar.f54311c = 1;
            }
        }
        return bVar;
    }
}
