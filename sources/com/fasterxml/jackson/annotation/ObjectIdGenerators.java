package com.fasterxml.jackson.annotation;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import java.util.UUID;

public class ObjectIdGenerators {

    private static abstract class Base<T> extends ObjectIdGenerator<T> {
        protected final Class<?> _scope;

        protected Base(Class<?> cls) {
            this._scope = cls;
        }

        public boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator) {
            if (objectIdGenerator.getClass() == getClass() && objectIdGenerator.getScope() == this._scope) {
                return true;
            }
            return false;
        }

        public abstract T generateId(Object obj);

        public Class<?> getScope() {
            return this._scope;
        }
    }

    public static final class IntSequenceGenerator extends Base<Integer> {
        private static final long serialVersionUID = 1;
        protected transient int _nextValue;

        public IntSequenceGenerator() {
            this(Object.class, -1);
        }

        public /* bridge */ /* synthetic */ boolean canUseFor(ObjectIdGenerator objectIdGenerator) {
            return super.canUseFor(objectIdGenerator);
        }

        public ObjectIdGenerator<Integer> forScope(Class<?> cls) {
            if (this._scope == cls) {
                return this;
            }
            return new IntSequenceGenerator(cls, this._nextValue);
        }

        /* access modifiers changed from: protected */
        public int initialValue() {
            return 1;
        }

        public ObjectIdGenerator.IdKey key(Object obj) {
            if (obj == null) {
                return null;
            }
            return new ObjectIdGenerator.IdKey(IntSequenceGenerator.class, this._scope, obj);
        }

        public ObjectIdGenerator<Integer> newForSerialization(Object obj) {
            return new IntSequenceGenerator(this._scope, initialValue());
        }

        public IntSequenceGenerator(Class<?> cls, int i10) {
            super(cls);
            this._nextValue = i10;
        }

        public Integer generateId(Object obj) {
            if (obj == null) {
                return null;
            }
            int i10 = this._nextValue;
            this._nextValue = i10 + 1;
            return Integer.valueOf(i10);
        }
    }

    public static abstract class None extends ObjectIdGenerator<Object> {
    }

    public static abstract class PropertyGenerator extends Base<Object> {
        private static final long serialVersionUID = 1;

        protected PropertyGenerator(Class<?> cls) {
            super(cls);
        }

        public /* bridge */ /* synthetic */ boolean canUseFor(ObjectIdGenerator objectIdGenerator) {
            return super.canUseFor(objectIdGenerator);
        }
    }

    public static final class StringIdGenerator extends Base<String> {
        private static final long serialVersionUID = 1;

        public StringIdGenerator() {
            this(Object.class);
        }

        public boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator) {
            return objectIdGenerator instanceof StringIdGenerator;
        }

        public ObjectIdGenerator<String> forScope(Class<?> cls) {
            return this;
        }

        public ObjectIdGenerator.IdKey key(Object obj) {
            if (obj == null) {
                return null;
            }
            return new ObjectIdGenerator.IdKey(StringIdGenerator.class, (Class<?>) null, obj);
        }

        public ObjectIdGenerator<String> newForSerialization(Object obj) {
            return this;
        }

        private StringIdGenerator(Class<?> cls) {
            super(Object.class);
        }

        public String generateId(Object obj) {
            return UUID.randomUUID().toString();
        }
    }

    public static final class UUIDGenerator extends Base<UUID> {
        private static final long serialVersionUID = 1;

        public UUIDGenerator() {
            this(Object.class);
        }

        public boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator) {
            if (objectIdGenerator.getClass() == UUIDGenerator.class) {
                return true;
            }
            return false;
        }

        public ObjectIdGenerator<UUID> forScope(Class<?> cls) {
            return this;
        }

        public ObjectIdGenerator.IdKey key(Object obj) {
            if (obj == null) {
                return null;
            }
            return new ObjectIdGenerator.IdKey(UUIDGenerator.class, (Class<?>) null, obj);
        }

        public ObjectIdGenerator<UUID> newForSerialization(Object obj) {
            return this;
        }

        private UUIDGenerator(Class<?> cls) {
            super(Object.class);
        }

        public UUID generateId(Object obj) {
            return UUID.randomUUID();
        }
    }
}
