package com.facebook.imagepipeline.memory;

import T5.d;
import f7.E;
import f7.F;

@d
public class NativeMemoryChunkPool extends f {
    @d
    public NativeMemoryChunkPool(W5.d dVar, E e10, F f10) {
        super(dVar, e10, f10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public NativeMemoryChunk h(int i10) {
        return new NativeMemoryChunk(i10);
    }
}
