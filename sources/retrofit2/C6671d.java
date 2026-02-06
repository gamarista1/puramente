package retrofit2;

import Gh.X;
import rh.C;

/* renamed from: retrofit2.d  reason: case insensitive filesystem */
public interface C6671d<T> extends Cloneable {
    void cancel();

    C6671d clone();

    void enqueue(C6673f fVar);

    boolean isCanceled();

    boolean isExecuted();

    C request();

    X timeout();
}
