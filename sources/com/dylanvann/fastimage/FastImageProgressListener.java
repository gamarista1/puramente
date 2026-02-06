package com.dylanvann.fastimage;

public interface FastImageProgressListener {
    float getGranularityPercentage();

    void onProgress(String str, long j10, long j11);
}
