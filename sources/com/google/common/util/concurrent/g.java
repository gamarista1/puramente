package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public interface g extends Future {
    void e(Runnable runnable, Executor executor);
}
