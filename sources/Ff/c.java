package Ff;

import java.util.List;
import java.util.Map;

public interface c extends b {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    p getReturnType();

    List getTypeParameters();

    t getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
