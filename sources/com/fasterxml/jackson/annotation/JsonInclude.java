package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@JacksonAnnotation
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonInclude {

    public enum Include {
        ALWAYS,
        NON_NULL,
        NON_ABSENT,
        NON_EMPTY,
        NON_DEFAULT,
        USE_DEFAULTS
    }

    public static class Value implements JacksonAnnotationValue<JsonInclude>, Serializable {
        protected static final Value EMPTY;
        private static final long serialVersionUID = 1;
        protected final Include _contentInclusion;
        protected final Include _valueInclusion;

        static {
            Include include = Include.USE_DEFAULTS;
            EMPTY = new Value(include, include);
        }

        public Value(JsonInclude jsonInclude) {
            this(jsonInclude.value(), jsonInclude.content());
        }

        public static Value construct(Include include, Include include2) {
            Include include3 = Include.USE_DEFAULTS;
            if ((include == include3 || include == null) && (include2 == include3 || include2 == null)) {
                return EMPTY;
            }
            return new Value(include, include2);
        }

        public static Value empty() {
            return EMPTY;
        }

        public static Value from(JsonInclude jsonInclude) {
            if (jsonInclude == null) {
                return null;
            }
            Include value = jsonInclude.value();
            Include content = jsonInclude.content();
            Include include = Include.USE_DEFAULTS;
            if (value == include && content == include) {
                return EMPTY;
            }
            return new Value(value, content);
        }

        public static Value merge(Value value, Value value2) {
            if (value == null) {
                return value2;
            }
            return value.withOverrides(value2);
        }

        public static Value mergeAll(Value... valueArr) {
            Value value = null;
            for (Value value2 : valueArr) {
                if (value2 != null) {
                    if (value != null) {
                        value2 = value.withOverrides(value2);
                    }
                    value = value2;
                }
            }
            return value;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            if (value._valueInclusion == this._valueInclusion && value._contentInclusion == this._contentInclusion) {
                return true;
            }
            return false;
        }

        public Include getContentInclusion() {
            return this._contentInclusion;
        }

        public Include getValueInclusion() {
            return this._valueInclusion;
        }

        public int hashCode() {
            return (this._valueInclusion.hashCode() << 2) + this._contentInclusion.hashCode();
        }

        /* access modifiers changed from: protected */
        public Object readResolve() {
            Include include = this._valueInclusion;
            Include include2 = Include.USE_DEFAULTS;
            if (include == include2 && this._contentInclusion == include2) {
                return EMPTY;
            }
            return this;
        }

        public String toString() {
            return String.format("[value=%s,content=%s]", new Object[]{this._valueInclusion, this._contentInclusion});
        }

        public Class<JsonInclude> valueFor() {
            return JsonInclude.class;
        }

        public Value withContentInclusion(Include include) {
            if (include == this._contentInclusion) {
                return this;
            }
            return new Value(this._valueInclusion, include);
        }

        public Value withOverrides(Value value) {
            boolean z10;
            if (!(value == null || value == EMPTY)) {
                Include include = value._valueInclusion;
                Include include2 = value._contentInclusion;
                Include include3 = this._valueInclusion;
                boolean z11 = false;
                if (include == include3 || include == Include.USE_DEFAULTS) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                Include include4 = this._contentInclusion;
                if (!(include2 == include4 || include2 == Include.USE_DEFAULTS)) {
                    z11 = true;
                }
                if (z10) {
                    if (z11) {
                        return new Value(include, include2);
                    }
                    return new Value(include, include4);
                } else if (z11) {
                    return new Value(include3, include2);
                }
            }
            return this;
        }

        public Value withValueInclusion(Include include) {
            if (include == this._valueInclusion) {
                return this;
            }
            return new Value(include, this._contentInclusion);
        }

        protected Value(Include include, Include include2) {
            this._valueInclusion = include == null ? Include.USE_DEFAULTS : include;
            this._contentInclusion = include2 == null ? Include.USE_DEFAULTS : include2;
        }
    }

    Include content() default Include.ALWAYS;

    Include value() default Include.ALWAYS;
}
