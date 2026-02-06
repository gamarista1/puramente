package nf;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.O;

/* renamed from: nf.i  reason: case insensitive filesystem */
final class C6617i implements Externalizable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f72270b = new a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 0;

    /* renamed from: a  reason: collision with root package name */
    private Map f72271a;

    /* renamed from: nf.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6617i(Map map) {
        C6496s.h(map, "map");
        this.f72271a = map;
    }

    private final Object readResolve() {
        return this.f72271a;
    }

    public void readExternal(ObjectInput objectInput) {
        C6496s.h(objectInput, MetricTracker.Object.INPUT);
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                Map d10 = O.d(readInt);
                for (int i10 = 0; i10 < readInt; i10++) {
                    d10.put(objectInput.readObject(), objectInput.readObject());
                }
                this.f72271a = O.b(d10);
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        C6496s.h(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f72271a.size());
        for (Map.Entry entry : this.f72271a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
