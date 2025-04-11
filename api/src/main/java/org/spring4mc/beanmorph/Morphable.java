package org.spring4mc.beanmorph;

import java.util.Optional;

public interface Morphable {

    default <T> Optional<T> as(Class<T> type) {
        return type.isAssignableFrom(this.getClass()) ? Optional.of((T) this) : Optional.empty();
    }
}
